![Peaceful Player banner image](https://i.imgur.com/VUWbwXm.png)

Simple permission based plugin to provide peace to **specific** players that would rather play without monsters. With
this plugin you can prevent monsters from attacking a certain player, prevent a player attacking monsters, or make a
player immune from damage with three simple permissions. No commands or configuration needed.

## Motive
I run a small server with friends and one or two players prefer to mine and build without monsters. Unfortunately,
existing solutions like creative mode take away the fun of exploring and mining, and disabling monsters spoils the fun
for everyone else. This is a very simple plugin that aims to fix that.

## Usage
Compiled artifact is available [here](https://dev.bukkit.org/projects/peacefulplayer). You can also compile the source
code yourself and place the JAR file into your server's plugins folder. Use one or more of the permissions below.

## Permissions
* peacefulplayer.pacifier
    - make hostile mobs act as if the permission holder is not there
* peacefulplayer.pacified
    - prevent permission holder from attacking neutral/hostile mobs (incl. other players)
* peacefulplayer.god
    - primitive 'god mode', prevents permission holder from damage (if you truly hate dying!)

## Planned Features
* Configuration file for adjusting individual mob behaviour