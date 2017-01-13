package com.owenoclee.peacefulplayer;

import com.owenoclee.peacefulplayer.permissions.Permissions;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class PeacefulPlayer extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager pluginManager = getServer().getPluginManager();
        for(Permissions perm : Permissions.values()) {
            pluginManager.addPermission(perm.getPermission());
            pluginManager.registerEvents(perm.getListener(), this);
        }
    }

}
