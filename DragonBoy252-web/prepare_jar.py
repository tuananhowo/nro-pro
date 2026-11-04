from pathlib import Path
from zipfile import ZIP_DEFLATED, ZipFile
import sys


source = Path(sys.argv[1])
destination = Path(sys.argv[2])
manifest_path = "META-INF/MANIFEST.MF"
manifest = (
    "Manifest-Version: 1.0\r\n"
    "MIDlet-Name: DragonBoy252\r\n"
    "MIDlet-Version: 2.5.2\r\n"
    "MIDlet-Vendor: DragonBoy252\r\n"
    "MIDlet-1: DragonBoy252, /icon.png, main.GameMidlet\r\n"
    "MicroEdition-Configuration: CLDC-1.1\r\n"
    "MicroEdition-Profile: MIDP-2.0\r\n"
    "\r\n"
).encode("ascii")

destination.parent.mkdir(parents=True, exist_ok=True)
with ZipFile(source, "r") as original, ZipFile(destination, "w", ZIP_DEFLATED) as output:
    if any(item.filename.upper() == manifest_path for item in original.infolist()):
        raise SystemExit(f"{source} already contains a manifest")
    for item in original.infolist():
        output.writestr(item, original.read(item.filename))
    output.writestr(manifest_path, manifest)
