package com.owenoclee.peacefulplayer.permissions;

import com.owenoclee.peacefulplayer.listeners.God;
import com.owenoclee.peacefulplayer.listeners.Pacified;
import com.owenoclee.peacefulplayer.listeners.Pacifier;
import org.bukkit.event.Listener;
import org.bukkit.permissions.Permission;

public enum Permissions {

    GOD(new Permission("peacefulplayer.god"), new God()),
    PACIFIED(new Permission("peacefulplayer.pacified"), new Pacified()),
    PACIFIER(new Permission("peacefulplayer.pacifier"), new Pacifier());

    private final Permission permission;
    private final Listener listener;

    Permissions(Permission permission, Listener listener) {
        this.permission = permission;
        this.listener = listener;
    }

    public Permission getPermission() { return permission; }

    public Listener getListener() { return listener; }

}