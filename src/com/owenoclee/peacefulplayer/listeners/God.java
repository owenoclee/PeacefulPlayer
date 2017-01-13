package com.owenoclee.peacefulplayer.listeners;

import com.owenoclee.peacefulplayer.permissions.Permissions;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class God implements Listener {

    //Cancel damage to a god player
    @EventHandler
    public void onDamage(EntityDamageEvent damageEvent) {
        Entity victim = damageEvent.getEntity();
        if(victim instanceof Player && victim.hasPermission(Permissions.GOD.getPermission())) {
            damageEvent.setDamage(0);
            damageEvent.setCancelled(true);
        }
    }

}
