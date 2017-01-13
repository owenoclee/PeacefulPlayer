# PeacefulPlayer
Simple permission based plugin to provide peace to players that would rather play without monsters.

## Motive
I run a small server with friends and one or two players prefer to mine and build without monsters. Unfortunately,
existing solutions like creative mode take away the fun of exploring and mining, and disabling monsters spoils the fun
for everyone else. This is a very simple plugin that aims to fix that.

## Usage
Currently a compiled artifact is not available to download, but will soon be on `dev.bukkit.org`. For now, you can
compile the source code yourself and place the JAR file into your server's plugins folder.

## Permissions
```
peacefulplayer.pacified - prevent permission holder from attacking neutral/hostile mobs (incl. other players)
peacefulplayer.pacifier - make hostile mobs act as if the permission holder is not there
peacefulplayer.god      - primitive 'god mode', prevents permission holder from damage (if you truly hate dying!)
```

## Known Issues
* Pacified players can still deal damage using projectiles
* God mode probably lets you fall out of the map forever

## Planned Features
* Configuration file for adjusting individual mob behaviour