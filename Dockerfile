FROM eclipse-temurin:17-jdk-jammy AS build
RUN apt-get update && apt-get install -y --no-install-recommends curl unzip python3 && rm -rf /var/lib/apt/lists/*
WORKDIR /build
RUN curl --fail --location https://codeload.github.com/zb3/freej2me-web/zip/c19416e75cbc15f9a27f7e967ee81cb108761e30 -o source.zip && unzip -q source.zip && mv freej2me-web-* upstream && rm source.zip
COPY DragonBoy252-web/DragonBoy252.jar DragonBoy252-web/prepare_jar.py DragonBoy252-web/prepare_bundle.py DragonBoy252-web/NetworkBridge.java DragonBoy252-web/SocketConnectionImpl.java DragonBoy252-web/HttpConnectionImpl.java DragonBoy252-web/network.js DragonBoy252-web/patch.py DragonBoy252-web/PatchGameBytecode.java DragonBoy252-source/src/eg.java ./
RUN python3 patch.py upstream && mkdir classes && javac --release 8 -encoding UTF-8 -cp upstream/web/freej2me-web.jar -d classes NetworkBridge.java SocketConnectionImpl.java HttpConnectionImpl.java upstream/src/javax/microedition/io/Connector.java upstream/src/javax/microedition/io/InputConnection.java upstream/src/javax/microedition/io/OutputConnection.java upstream/src/org/recompile/mobile/Mobile.java upstream/src/pl/zb3/freej2me/bridge/shell/Shell.java upstream/src/javax/microedition/lcdui/Display.java upstream/src/javax/microedition/lcdui/TextBox.java && jar uf upstream/web/freej2me-web.jar -C classes .
RUN mkdir game-classes patcher-classes && javac --release 8 -encoding UTF-8 -cp DragonBoy252.jar:upstream/web/freej2me-web.jar -d game-classes eg.java && javac --add-exports java.base/jdk.internal.org.objectweb.asm=ALL-UNNAMED -d patcher-classes PatchGameBytecode.java && unzip -p DragonBoy252.jar cw.class > game-classes/cw.class && java --add-exports java.base/jdk.internal.org.objectweb.asm=ALL-UNNAMED -cp patcher-classes PatchGameBytecode game-classes/cw.class DragonBoy252.jar upstream/web/freej2me-web.jar && jar uf DragonBoy252.jar -C game-classes .
RUN mkdir -p upstream/web/source && cp *.java *.js *.py upstream/web/source/ && cp upstream/src/javax/microedition/io/Connector.java upstream/src/javax/microedition/io/InputConnection.java upstream/src/javax/microedition/io/OutputConnection.java upstream/src/org/recompile/mobile/Mobile.java upstream/src/pl/zb3/freej2me/bridge/shell/Shell.java upstream/src/javax/microedition/lcdui/Display.java upstream/src/javax/microedition/lcdui/TextBox.java upstream/web/source/ && cp upstream/LICENSE upstream/web/source/LICENSE
RUN python3 prepare_jar.py DragonBoy252.jar upstream/web/DragonBoy252.jar && python3 prepare_bundle.py upstream/web/DragonBoy252.jar upstream/web/apps/DragonBoy252.zip
FROM node:22-bookworm-slim
WORKDIR /app
COPY DragonBoy252-web/package.json DragonBoy252-web/package-lock.json ./
RUN npm ci --omit=dev --ignore-scripts
COPY DragonBoy252-web/server.mjs ./
COPY --from=build /build/upstream/web ./web
ENV NODE_ENV=production PORT=10000
USER node
EXPOSE 10000
CMD ["node","server.mjs"]
