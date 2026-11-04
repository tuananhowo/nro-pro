# DragonBoy252 Web

A browser build for the supplied DragonBoy252 J2ME client. The page loads the bundled JAR, starts it in a J2ME emulator, and relays its TCP connections over WebSocket to the game's existing servers. The game server and game protocol are not reimplemented.

[Deploy the game on Render](https://render.com/deploy?repo=https://github.com/tuananhowo/dragonboy252-web)

## Deploy

The repository root contains the Render Blueprint and Dockerfile. Deploy from the root README; the service listens on port `10000` and exposes `/healthz` for its health check. After deployment, open the Render HTTPS URL; the game starts automatically. Touch devices get on-screen controls. Desktop browsers use keyboard and pointer input.

The first visit downloads the game and emulator. The emulator stores its installed JAR and game saves in that browser. Login details are entered in the game; the bridge forwards game packets to the existing game server without recording packet contents.

## Network

The WebSocket bridge is restricted to the server hostnames and IP/port pairs found in the supplied client. It forwards binary packets without interpreting or storing them. Server restarts can interrupt an active session.

## Source and licenses

The browser emulator is based on [freej2me-web](https://github.com/zb3/freej2me-web) at commit `c19416e75cbc15f9a27f7e967ee81cb108761e30`. The WebSocket bridge and Render setup are adapted from [j2me-render-online](https://github.com/ngoking/j2me-render-online). These projects use GPL-3.0-or-later; the build serves the modified emulator sources at `/source/`. CheerpJ is loaded from its vendor and is subject to its own non-commercial license. The supplied game JAR remains the game author's work.
