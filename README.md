# nro-pro

Repository for the DragonBoy252 browser game.

## Play

[Deploy to Render](https://render.com/deploy?repo=https://github.com/tuananhowo/nro-pro)

GitHub stores the source; Render runs the web client and its WebSocket-to-TCP bridge. After deploying, Render gives you the playable HTTPS link. The browser then loads the bundled game and connects to the game's existing servers.

## Folders and files

- `DragonBoy252-source/` — decompiled Java source and extracted game resources.
- `DragonBoy252-source.zip` — archive of the source folder.
- `DragonBoy252.jar` — original game client.
- `DragonBoy252-web/` — browser emulator integration and network bridge.
- `Dockerfile` and `render.yaml` — deploy the combined project as one Render service.
