from pathlib import Path
from zipfile import ZIP_DEFLATED, ZipFile
import sys


jar_path = Path(sys.argv[1])
bundle_path = Path(sys.argv[2])
bundle_path.parent.mkdir(parents=True, exist_ok=True)

settings = """queuedPaint:off
rotate:off
textureDisableFilter:off
phone:Nokia
dgFormat:4444
sound:on
width:240
fps:0
forceFullscreen:off
fontSize:0
height:320
"""

with ZipFile(bundle_path, "w", ZIP_DEFLATED) as bundle:
    bundle.write(jar_path, "app.jar")
    bundle.writestr("name", "DragonBoy252\n")
    bundle.writestr("config/settings.conf", settings)
    bundle.writestr("config/appproperties.conf", "")
    bundle.writestr("config/systemproperties.conf", "")
