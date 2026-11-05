from pathlib import Path
import shutil, sys

upstream=Path(sys.argv[1])
files=Path(__file__).parent
connector=upstream/'src/javax/microedition/io/Connector.java'
text=connector.read_text(encoding='utf-8')
text=text.replace('if (name != null && name.startsWith("sms://")) {', '''if (name != null && (name.startsWith("socket://") || name.startsWith("ssl://"))) {
            return new SocketConnectionImpl(name);
        } else if (name != null && (name.startsWith("http://") || name.startsWith("https://"))) {
            return new HttpConnectionImpl(name);
        } else if (name != null && name.startsWith("sms://")) {''')
text=text.replace('public static InputStream openInputStream(String name)','public static InputStream openInputStream(String name) throws IOException')
text=text.replace('public static DataInputStream openDataInputStream(String name)','public static DataInputStream openDataInputStream(String name) throws IOException')
text=text.replace('//System.out.println("Connector: " + name);','if (name.startsWith("socket://") || name.startsWith("ssl://") || name.startsWith("http://") || name.startsWith("https://")) return ((InputConnection)open(name)).openInputStream();')
text=text.replace('System.out.println("Faked DataInputStream: "+name);','if (name.startsWith("socket://") || name.startsWith("ssl://") || name.startsWith("http://") || name.startsWith("https://")) return ((InputConnection)open(name)).openDataInputStream();\n        System.out.println("Faked DataInputStream: "+name);')
text=text.replace('public static DataOutputStream openDataOutputStream(String name) { return new DataOutputStream(new DummyOutputStream()); }','public static DataOutputStream openDataOutputStream(String name) throws IOException { return ((OutputConnection)open(name)).openDataOutputStream(); }')
text=text.replace('public static OutputStream openOutputStream(String name) { return new DummyOutputStream(); }','public static OutputStream openOutputStream(String name) throws IOException { return ((OutputConnection)open(name)).openOutputStream(); }')
assert 'new SocketConnectionImpl' in text
connector.write_text(text,encoding='utf-8')
for name in ['InputConnection.java','OutputConnection.java']:
    interface=connector.parent/name
    source=interface.read_text(encoding='utf-8')
    source=source.replace('();', '() throws java.io.IOException;')
    interface.write_text(source,encoding='utf-8')
for name in ['SocketConnectionImpl.java','HttpConnectionImpl.java']:
    shutil.copy(files/name,connector.parent/name)
bridge=upstream/'src/pl/zb3/freej2me/bridge/network'
bridge.mkdir(parents=True,exist_ok=True)
shutil.copy(files/'NetworkBridge.java',bridge/'NetworkBridge.java')
shutil.copy(files/'network.js',upstream/'web/libjs/network.js')
main=upstream/'web/src/main.js'
text=main.read_text(encoding='utf-8')
text='import networkNatives from "../libjs/network.js";\n'+text
text=text.replace('natives: {','natives: {\n            ...networkNatives,',1)
main.write_text(text,encoding='utf-8')
# Browser physical punctuation keys were absent, so TextBox never received '.'.
key_script=upstream/'web/src/key.js'
text=key_script.read_text(encoding='utf-8')
text=text.replace("export const codeMap = {", """export const codeMap = {
    'Period': 190,
    'Comma': 188,
    'Semicolon': 186,
    'Quote': 222,
    'Slash': 191,
    'Backslash': 220,
    'BracketLeft': 219,
    'BracketRight': 221,
    'Minus': 189,
    'Equal': 187,
    'Backquote': 192,
    'NumpadDecimal': 110,
    'NumpadAdd': 107,
    'NumpadSubtract': 109,
    'NumpadEnter': 13,""")
assert "'Period': 190" in text
key_script.write_text(text,encoding='utf-8')
page=upstream/'web/index.html'
text=page.read_text(encoding='utf-8').replace('<title>freej2me-web</title>','<title>DragonBoy252 Online</title>')
text=text.replace('<h1>freej2me-web</h1>','<h1>DragonBoy252 Online</h1>')
text=text.replace('<div id="loading">Loading...</div>','<div id="loading">Đang chuẩn bị game...</div>')
page.write_text(text,encoding='utf-8')

# Fetch the small emulator JAR once instead of issuing many remote range reads.
# /str is CheerpJ's transient, read-only Java filesystem.
library_loader = '''
async function loadEmulatorLibrary() {
    try {
    const response = await fetch("/freej2me-web.jar", {signal: AbortSignal.timeout(60000)});
    if (!response.ok) throw new Error("Could not download emulator: HTTP " + response.status);
    cheerpOSAddStringFile("/str/freej2me-web.jar", new Uint8Array(await response.arrayBuffer()));
    return cheerpjRunLibrary("/str/freej2me-web.jar");
    } catch (error) {
        console.warn("Direct emulator download failed; trying Java filesystem", error.message);
        return cheerpjRunLibrary(cheerpjWebRoot + "/freej2me-web.jar");
    }
}
'''
for name in ['launcher.js', 'main.js']:
    script = upstream/'web/src'/name
    text = script.read_text(encoding='utf-8')
    text = text.replace('cheerpjRunLibrary(cheerpjWebRoot+"/freej2me-web.jar")', 'loadEmulatorLibrary()')
    text += library_loader
    if name == 'launcher.js':
        text = text.replace('    lib = await loadEmulatorLibrary();', '    document.getElementById("loading").textContent = "Đang tải bộ giả lập...";\n    lib = await loadEmulatorLibrary();')
        start_marker = '    await reloadUI();'
        end_marker = '    document.getElementById("export-data-btn").onclick = doExportData;\n}'
        auto_launch = '''    await reloadUI();

    let savedAppId = null;
    try { savedAppId = localStorage.getItem("dragonboy252.appId"); } catch {}
    const installed = state.games.find(game => game.appId === savedAppId || game.appId === "DragonBoy252" || game.name === "DragonBoy252");
    if (installed) {
        try { localStorage.setItem("dragonboy252.appId", installed.appId); } catch {}
        launchDragonBoy(installed.appId);
        return;
    }

    document.getElementById("loading").textContent = "Đang cài game lần đầu...";
    const gameResponse = await fetch("/DragonBoy252.jar", {cache: "no-store"});
    if (!gameResponse.ok) throw new Error("Không tải được DragonBoy252.jar");
    await processGameFile(await gameResponse.arrayBuffer(), "DragonBoy252.jar");
    if (!state.currentGame || !state.lastLoader) {
        throw new Error("Không thể mở JAR bằng bộ giả lập.");
    }

    // Let CheerpJ finish the Java work started while analyzing the uploaded JAR.
    await new Promise(resolve => setTimeout(resolve, 250));
    let appId = await state.lastLoader.getAppId();
    if (!appId) {
        await launcherUtil.ensureAppId(state.lastLoader, "DragonBoy252.jar");
        if (!state.lastLoader.className) state.lastLoader.className = "main.GameMidlet";
        if (!state.lastLoader.name) state.lastLoader.name = "DragonBoy252";
        appId = "DragonBoy252_jar";
    }
    state.currentGame.appId = appId;
    state.currentGame.name = state.lastLoader.name || "DragonBoy252";

    readUI(state.currentGame);
    const settings = await kvToJava(state.currentGame.settings);
    const appProperties = await kvToJava(state.currentGame.appProperties);
    const systemProperties = await kvToJava(state.currentGame.systemProperties);
    await launcherUtil.initApp(state.currentGame.jarFile, state.lastLoader, settings, appProperties, systemProperties);
    try { localStorage.setItem("dragonboy252.appId", appId); } catch {}
    launchDragonBoy(appId);
}'''
        start = text.index(start_marker)
        end = text.index(end_marker, start) + len(end_marker)
        text = text[:start] + auto_launch + text[end:]
        text = text.replace('async function main() {', '''function launchDragonBoy(appId) {
    const mobile = matchMedia("(pointer: coarse)").matches ? "&mobile=1" : "";
    location.replace("run?app=" + encodeURIComponent(appId) + mobile);
}

async function main() {''', 1)
        text = text.replace('main();', '''main().catch(error => {
    console.error(error);
    document.getElementById("loading").textContent = "Không tải được giả lập: " + (error && error.message ? error.message : String(error));
});''')
    else:
        text = text.replace('function setListeners() {', '''function pointerPosition(point) {
    const bounds = display.getBoundingClientRect();
    return {
        x: ((point.clientX - bounds.left) * display.width / bounds.width) | 0,
        y: ((point.clientY - bounds.top) * display.height / bounds.height) | 0,
    };
}

function setListeners() {''')
        text = text.replace('''x: e.offsetX / display.currentCSSZoom | 0,
            y: e.offsetY / display.currentCSSZoom | 0,''', '...pointerPosition(e),')
        text = text.replace('''x: (e.pageX - display.offsetLeft) / display.currentCSSZoom | 0,
            y: (e.pageY - display.offsetTop) / display.currentCSSZoom | 0,''', '...pointerPosition(e),')
        text = text.replace('''x: (e.changedTouches[0].pageX - display.offsetLeft) / display.currentCSSZoom | 0,
            y: (e.changedTouches[0].pageY - display.offsetTop) / display.currentCSSZoom | 0,''', '...pointerPosition(e.changedTouches[0]),')
        assert 'display.currentCSSZoom' not in text

        # Fit the canvas to the actual area left after toolbars and mobile controls.
        text = text.replace("let isMobile = sp.get('mobile');", "let isMobile = sp.get('mobile') === '1' || matchMedia('(pointer: coarse)').matches || navigator.maxTouchPoints > 0;")
        text = text.replace('''let fractionScale = sp.get('fractionScale') || (localStorage && localStorage.getItem("pl.zb3.freej2me.fractionScale") === "true");''', '''const storedScaleMode = (() => { try { return localStorage.getItem("pl.zb3.freej2me.fractionScale"); } catch { return null; } })();
let fractionScale = sp.has('fractionScale')
    ? !['0', 'false', 'integer'].includes(sp.get('fractionScale'))
    : storedScaleMode !== 'false';''')

        autoscale_start = text.index('function autoscale() {')
        pointer_start = text.index('function pointerPosition(point) {', autoscale_start)
        autoscale = '''function autoscale() {
    if (!scaleSet) return;

    document.body.classList.toggle('kbd-enabled', Boolean(isMobile));
    if (isMobile) {
        if (window.innerWidth > window.innerHeight) {
            document.body.classList.add('kbd-landscape');
            document.body.classList.remove('kbd-portrait');
        } else {
            document.body.classList.add('kbd-portrait');
            document.body.classList.remove('kbd-landscape');
        }
    } else {
        document.body.classList.remove('kbd-portrait', 'kbd-landscape');
    }

    const area = document.getElementById('screen-area');
    const width = area.clientWidth || window.innerWidth;
    const height = area.clientHeight || window.innerHeight;
    let scale = Math.min(width / screenCtx.canvas.width, height / screenCtx.canvas.height);
    if (!fractionScale && scale >= 1) scale = Math.floor(scale);
    display.style.zoom = Math.max(0.1, scale);

    const scaleButton = document.getElementById('scale-mode');
    if (scaleButton) {
        scaleButton.textContent = fractionScale ? 'Vừa màn hình' : 'Pixel chuẩn';
        scaleButton.setAttribute('aria-pressed', String(fractionScale));
    }
}

'''
        text = text[:autoscale_start] + autoscale + text[pointer_start:]

        listeners_start = text.index('function setListeners() {')
        favicon_start = text.index('function setFaviconFromBuffer', listeners_start)
        listeners = '''async function toggleFullscreen() {
    try {
        if (document.fullscreenElement) {
            await document.exitFullscreen();
        } else if (document.documentElement.requestFullscreen) {
            await document.documentElement.requestFullscreen();
        } else if (document.documentElement.webkitRequestFullscreen) {
            document.documentElement.webkitRequestFullscreen();
        }
    } catch (error) {
        console.warn('Fullscreen unavailable:', error && error.message ? error.message : error);
    }
    autoscale();
}

function toggleScaleMode() {
    fractionScale = !fractionScale;
    try { localStorage.setItem("pl.zb3.freej2me.fractionScale", String(fractionScale)); } catch {}
    autoscale();
}

function setListeners() {
    let activePointerId = null;
    let lastPointerPosition = {x: 0, y: 0};

    setKbdHandler((isDown, key) => {
        if (isDown) display.focus({preventScroll: true});
        const symbols = {Period: '.', At: '@', Backspace: '\\b', Space: ' '};
        const symbol = key.startsWith('Digit') ? key.substring(5) : (symbols[key] || '');
        keyRepeatManager.post(isDown, key, {
            symbol: symbol ? symbol.charCodeAt(0) : 0,
            ctrlKey: false,
            shiftKey: false
        });
    });

    function handleKeyEvent(event) {
        if (!codeMap[event.code]) return;
        const isDown = event.type === 'keydown';
        keyRepeatManager.post(isDown, event.code, {
            symbol: event.key.length === 1 ? event.key.charCodeAt(0) : 0,
            ctrlKey: event.ctrlKey,
            shiftKey: event.shiftKey
        });
        if (!event.ctrlKey && !event.metaKey && !event.altKey) event.preventDefault();
    }

    display.addEventListener('keydown', handleKeyEvent);
    display.addEventListener('keyup', handleKeyEvent);

    keyRepeatManager.register((kind, key, args) => {
        if (kind === 'click' && (key === 'Fullscreen' || key === 'Maximize')) {
            toggleFullscreen();
        } else if (kind === 'click' && key === 'ScaleMode') {
            toggleScaleMode();
        } else if (codeMap[key]) {
            evtQueue.queueEvent({
                kind: kind === 'up' ? 'keyup' : 'keydown',
                args: [codeMap[key], args.symbol, args.ctrlKey, args.shiftKey]
            });
        }
    });

    display.addEventListener('pointerdown', event => {
        if (event.button !== 0 || activePointerId !== null) return;
        activePointerId = event.pointerId;
        display.focus({preventScroll: true});
        try { display.setPointerCapture(event.pointerId); } catch {}
        lastPointerPosition = pointerPosition(event);
        evtQueue.queueEvent({kind: 'pointerpressed', ...lastPointerPosition});
        event.preventDefault();
    });

    display.addEventListener('pointermove', event => {
        if (event.pointerId !== activePointerId) return;
        lastPointerPosition = pointerPosition(event);
        evtQueue.queueEvent({kind: 'pointerdragged', ...lastPointerPosition});
        event.preventDefault();
    });

    function releasePointer(event) {
        if (event.pointerId !== activePointerId) return;
        lastPointerPosition = pointerPosition(event);
        evtQueue.queueEvent({kind: 'pointerreleased', ...lastPointerPosition});
        activePointerId = null;
        event.preventDefault();
    }
    display.addEventListener('pointerup', releasePointer);
    display.addEventListener('pointercancel', releasePointer);
    display.addEventListener('lostpointercapture', releasePointer);
    display.addEventListener('contextmenu', event => event.preventDefault());

    document.getElementById('scale-mode')?.addEventListener('click', toggleScaleMode);
    document.getElementById('fullscreen-toggle')?.addEventListener('click', toggleFullscreen);
    const help = document.getElementById('game-help');
    const helpButton = document.getElementById('help-toggle');
    const closeHelp = document.getElementById('help-close');
    const setHelp = visible => {
        help.hidden = !visible;
        helpButton.setAttribute('aria-expanded', String(visible));
        if (visible) closeHelp.focus();
        else helpButton.focus();
    };
    helpButton?.addEventListener('click', () => setHelp(help.hidden));
    closeHelp?.addEventListener('click', () => setHelp(false));
    help?.addEventListener('click', event => { if (event.target === help) setHelp(false); });

    document.addEventListener('fullscreenchange', autoscale);
    window.addEventListener('resize', autoscale);
    window.addEventListener('orientationchange', autoscale);
    window.visualViewport?.addEventListener('resize', autoscale);
    initKbdListeners();
}

'''
        text = text[:listeners_start] + listeners + text[favicon_start:]
        assert "pointercancel" in text and "scale-mode" in text and "navigator.maxTouchPoints" in text
    script.write_text(text, encoding='utf-8')

# The emulator page is the user's entry point, so brand and size that page itself.
run_page = upstream/'web/run.html'
text = run_page.read_text(encoding='utf-8')
text = text.replace('<html lang="en">', '<html lang="vi">')
text = text.replace('<meta name="viewport" content="width=device-width, initial-scale=1.0">', '<meta name="viewport" content="width=device-width, initial-scale=1, viewport-fit=cover">')
text = text.replace('<title>freej2me-web</title>', '<title>DragonBoy252 Online</title>')
text = text.replace('<div id="loading">Loading...</div>', '<div id="loading">Đang khởi động game...</div>')
text = text.replace('''            <button data-key="NumpadDivide" class="key">#</button>''', '''            <button data-key="NumpadDivide" class="key">#</button>
            <button data-key="At" class="key" aria-label="Dấu @">@</button>
            <button data-key="Period" class="key" aria-label="Dấu chấm">.</button>
            <button data-key="Backspace" class="key" aria-label="Xóa ký tự">⌫</button>''')
text = text.replace('<button data-key="Maximize" class="key small-key small-key-right" aria-label="Maximize">⛶</button>', '<button data-key="Fullscreen" class="key small-key small-key-right" aria-label="Toàn màn hình">⛶</button>')

toolbar = '''<body>
    <header id="game-toolbar" aria-label="Điều khiển game">
        <a class="brand" href="/" aria-label="DragonBoy252">DragonBoy252</a>
        <div class="toolbar-actions">
            <button id="scale-mode" type="button" aria-pressed="true" title="Chuyển chế độ hiển thị">Vừa màn hình</button>
            <button id="fullscreen-toggle" type="button" aria-label="Toàn màn hình">⛶ <span>Toàn màn hình</span></button>
            <button id="help-toggle" type="button" aria-expanded="false" aria-controls="game-help">Điều khiển</button>
        </div>
    </header>
    <section id="game-help" role="dialog" aria-modal="true" aria-labelledby="help-title" hidden>
        <div class="help-card">
            <button id="help-close" type="button" aria-label="Đóng hướng dẫn">Đóng</button>
            <h1 id="help-title">Điều khiển</h1>
            <p><b>Di chuyển:</b> phím mũi tên hoặc WASD. Nhấn Enter để chọn, Esc để quay lại.</p>
            <p><b>Thao tác trong game:</b> F1 / F2 hoặc L / R. Có thể chạm hay nhấn trực tiếp lên màn hình game.</p>
            <p><b>Nhập liệu trên điện thoại:</b> bàn phím số ở dưới có thêm @, dấu chấm và phím xóa.</p>
        </div>
    </section>'''
text = text.replace('<body>', toolbar, 1)

responsive_css = '''
<style id="dragonboy-responsive">
    :root {
        color-scheme: dark;
        --toolbar-h: 44px;
        --safe-top: env(safe-area-inset-top, 0px);
        --safe-right: env(safe-area-inset-right, 0px);
        --safe-bottom: env(safe-area-inset-bottom, 0px);
        --safe-left: env(safe-area-inset-left, 0px);
        --keypad-h: clamp(150px, 30dvh, 220px);
        --side-key-w: clamp(104px, 19vw, 156px);
    }
    html, body { width: 100%; height: 100%; height: 100dvh; overflow: hidden; overscroll-behavior: none; }
    body { background: #111; color: #f5f5f5; font-family: system-ui, sans-serif; }
    #game-toolbar {
        position: fixed; z-index: 10; inset: var(--safe-top) 0 auto 0; height: var(--toolbar-h);
        box-sizing: border-box; display: flex; align-items: center; justify-content: space-between;
        gap: 8px; padding: 4px max(10px, var(--safe-right)) 4px max(10px, var(--safe-left));
        background: #191919; border-bottom: 1px solid #414141;
    }
    #game-toolbar .brand { color: #f6ca55; text-decoration: none; font-weight: 750; white-space: nowrap; }
    .toolbar-actions { display: flex; align-items: center; gap: 6px; }
    #game-toolbar button, #game-help button {
        min-height: 34px; padding: 5px 10px; border: 1px solid #565656; border-radius: 7px;
        background: #292929; color: inherit; font: inherit; cursor: pointer; touch-action: manipulation;
    }
    #game-toolbar button:hover, #game-toolbar button:focus-visible, #game-help button:focus-visible { background: #414141; outline: 2px solid #f6ca55; outline-offset: 1px; }
    #screen-area { position: fixed; display: block; inset: calc(var(--safe-top) + var(--toolbar-h)) var(--safe-right) var(--safe-bottom) var(--safe-left); overflow: hidden; background: #080808; }
    #display { position: absolute; left: 50%; top: 50%; margin: 0; transform: translate(-50%, -50%); display: block; max-width: none; max-height: none; touch-action: none; -webkit-user-select: none; user-select: none; }
    #display:focus-visible { outline: 2px solid #f6ca55; }
    #loading { color: #fff; font: 600 16px system-ui, sans-serif; text-align: center; }
    .keypad-part { z-index: 5; padding: 6px; background: #181818; touch-action: none; }
    .key-grid { gap: clamp(2px, .7vw, 6px); }
    .left-grid { grid-template-rows: repeat(5, 1fr); }
    .key { min-width: 0; min-height: 0; padding: 0; border-radius: 8px; font-size: clamp(13px, 3.3vmin, 22px); touch-action: none; -webkit-user-select: none; user-select: none; }
    .key.active { background: #796022; border-color: #f6ca55; }
    .arrow-key { font-size: clamp(18px, 5vmin, 30px); }
    .small-key { min-height: 30px; font-size: 13px; }
    body.kbd-portrait #left-keys, body.kbd-portrait #right-keys {
        display: flex; top: auto; bottom: var(--safe-bottom); width: 50%; height: var(--keypad-h);
    }
    body.kbd-portrait #left-keys { left: var(--safe-left); }
    body.kbd-portrait #right-keys { right: var(--safe-right); }
    body.kbd-portrait #screen-area { bottom: calc(var(--keypad-h) + var(--safe-bottom)); }
    body.kbd-landscape #left-keys, body.kbd-landscape #right-keys {
        display: flex; top: calc(var(--safe-top) + var(--toolbar-h)); bottom: var(--safe-bottom);
        width: var(--side-key-w); height: auto;
    }
    body.kbd-landscape #left-keys { left: var(--safe-left); }
    body.kbd-landscape #right-keys { right: var(--safe-right); }
    body.kbd-landscape #screen-area { left: calc(var(--side-key-w) + var(--safe-left)); right: calc(var(--side-key-w) + var(--safe-right)); }
    #game-help[hidden] { display: none; }
    #game-help { position: fixed; z-index: 20; inset: 0; display: grid; place-items: center; padding: 18px; background: #000b; }
    .help-card { width: min(560px, 100%); box-sizing: border-box; padding: 20px; border: 1px solid #555; border-radius: 12px; background: #202020; line-height: 1.5; }
    .help-card h1 { margin: 0 0 14px; font-size: 1.25rem; }
    .help-card p { margin: 10px 0; }
    #help-close { float: right; }
    @media (max-width: 420px) {
        :root { --toolbar-h: 42px; }
        #game-toolbar { padding-inline: max(6px, var(--safe-left)) max(6px, var(--safe-right)); gap: 4px; }
        #game-toolbar .brand { font-size: 13px; }
        .toolbar-actions { gap: 3px; }
        #game-toolbar button { min-height: 32px; padding: 4px 6px; font-size: 12px; }
        #fullscreen-toggle span { display: none; }
    }
    @media (max-height: 380px) and (orientation: landscape) {
        :root { --toolbar-h: 38px; }
        .keypad-part { padding: 4px; }
        .small-key { width: 90%; height: 90%; min-height: 25px; }
    }
    @media (max-width: 480px) and (orientation: landscape) {
        :root { --side-key-w: 84px; }
    }
</style>
'''
text = text.replace('<body>', responsive_css + '<body>', 1)
assert '<header id="game-toolbar"' in text and 'viewport-fit=cover' in text and 'data-key="At"' in text
run_page.write_text(text, encoding='utf-8')

# Pointer events work for touch, stylus, trackpad, and mouse; key counts keep
# simultaneous touches from releasing the same key too early.
(upstream/'web/src/screenKbd.js').write_text('''export const kbdWidth = 220, kbdHeight = 220;

const pointerKeyMap = new Map();
const keyPointerMap = new Map();
let handleKey = null;

function getKeyAtPoint(x, y) {
    return document.elementFromPoint(x, y)?.closest('.key');
}

function addPointerToKey(pointerId, key) {
    if (!key) return;
    let pointers = keyPointerMap.get(key);
    if (!pointers) {
        pointers = new Set();
        keyPointerMap.set(key, pointers);
        key.classList.add('active');
        handleKey?.(true, key.dataset.key);
    }
    pointers.add(pointerId);
}

function removePointerFromKey(pointerId, key) {
    if (!key) return;
    const pointers = keyPointerMap.get(key);
    if (!pointers) return;
    pointers.delete(pointerId);
    if (pointers.size === 0) {
        keyPointerMap.delete(key);
        key.classList.remove('active');
        handleKey?.(false, key.dataset.key);
    }
}

function movePointerToKey(pointerId, key) {
    if (pointerKeyMap.get(pointerId) === key) return;
    removePointerFromKey(pointerId, pointerKeyMap.get(pointerId));
    pointerKeyMap.set(pointerId, key || null);
    addPointerToKey(pointerId, key);
}

function onPointerDown(event) {
    if (event.pointerType === 'mouse' && event.button !== 0) return;
    const key = getKeyAtPoint(event.clientX, event.clientY);
    if (!key) return;
    event.preventDefault();
    try { event.currentTarget.setPointerCapture(event.pointerId); } catch {}
    pointerKeyMap.set(event.pointerId, null);
    movePointerToKey(event.pointerId, key);
}

function onPointerMove(event) {
    if (!pointerKeyMap.has(event.pointerId)) return;
    event.preventDefault();
    movePointerToKey(event.pointerId, getKeyAtPoint(event.clientX, event.clientY));
}

function onPointerEnd(event) {
    if (!pointerKeyMap.has(event.pointerId)) return;
    event.preventDefault();
    removePointerFromKey(event.pointerId, pointerKeyMap.get(event.pointerId));
    pointerKeyMap.delete(event.pointerId);
}

export function initKbdListeners() {
    document.querySelectorAll('.keypad-part').forEach(keypad => {
        keypad.addEventListener('pointerdown', onPointerDown, {passive: false});
        keypad.addEventListener('pointermove', onPointerMove, {passive: false});
        keypad.addEventListener('pointerup', onPointerEnd, {passive: false});
        keypad.addEventListener('pointercancel', onPointerEnd, {passive: false});
        keypad.addEventListener('lostpointercapture', onPointerEnd, {passive: false});
        keypad.addEventListener('contextmenu', event => event.preventDefault());
    });
}

export function setKbdHandler(handler) {
    handleKey = handler;
}
''', encoding='utf-8')

# The mobile star is the same Java key as the keyboard's asterisk key; '@' is
# needed for email login on touch-only devices.
key_script = upstream/'web/src/key.js'
text = key_script.read_text(encoding='utf-8')
text = text.replace("    'Enter': 13,", "    'Enter': 13,\n    'At': 64,\n    'NumpadAsterisk': 106,")
assert "'At': 64" in text and "'NumpadAsterisk': 106" in text
key_script.write_text(text, encoding='utf-8')

(upstream/'web/diagnostics.html').write_text('''<!doctype html>
<html lang="vi"><meta charset="utf-8"><meta name="viewport" content="width=device-width,initial-scale=1">
<title>Kiểm tra kết nối J2ME</title>
<style>body{font:16px system-ui;max-width:600px;margin:32px auto;padding:16px}button{padding:12px;margin:8px}pre{white-space:pre-wrap;background:#eee;padding:16px}</style>
<h1>Kiểm tra kết nối</h1><p>Thử đường mạng tới web và máy chủ game. Không cần tài khoản.</p>
<label>Máy chủ: <select id="server" aria-label="Máy chủ"><option value="dragon1.teamobi.com">Vũ trụ 1</option><option value="dragon15.teamobi.com" selected>Vũ trụ 15</option></select></label>
<button id="http">Kiểm tra HTTP</button><button id="jar">Kiểm tra tải giả lập</button><button id="ws">Kiểm tra WebSocket</button>
<pre id="result" role="status">Chọn một phép kiểm tra.</pre><a href="/">Về trang game</a>
<script>
const result=document.getElementById('result');
for(const [id,url] of [['http','/healthz'],['jar','/freej2me-web.jar']]) document.getElementById(id).onclick=async()=>{
 result.textContent='Đang kiểm tra '+url;
 try{const r=await fetch(url,{signal:AbortSignal.timeout(20000)});const b=await r.arrayBuffer();result.textContent=url+': HTTP '+r.status+', nhận '+b.byteLength+' byte';}
 catch(e){result.textContent=url+': '+e.name+' - '+e.message;}
};
document.getElementById('ws').onclick=()=>{
 const gameHost=document.getElementById('server').value;
 result.textContent='Đang mở WebSocket tới '+gameHost+':14445';
 const w=new WebSocket((location.protocol==='https:'?'wss:':'ws:')+'//'+location.host+'/socket?host='+encodeURIComponent(gameHost)+'&port=14445&secure=0');
 const timer=setTimeout(()=>{result.textContent='WebSocket quá thời gian';w.close()},15000);
 w.onmessage=e=>{if(typeof e.data==='string'){clearTimeout(timer);result.textContent='WebSocket: '+e.data;w.close()}};
 w.onerror=()=>{clearTimeout(timer);result.textContent='WebSocket bị lỗi trong trình duyệt'};
};
</script></html>''',encoding='utf-8')
