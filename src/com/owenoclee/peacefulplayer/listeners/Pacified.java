package com.owenoclee.peacefulplayer.listeners;

import com.owenoclee.peacefulplayer.permissions.Permissions;
import com.owenoclee.peacefulplayer.helper.Mobs;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class Pacified implements Listener {

    //Cancel pacified player attempt to damage hostile mob
    @EventHandler
    public void onAttack(EntityDamageByEntityEvent attackEvent) {
        Entity attacker = attackEvent.getDamager();
        Entity victim = attackEvent.getEntity();
        if(attacker instanceof Player && attacker.hasPermission(Permissions.PACIFIED.getPermission()) && (Mobs.isHostile(victim) || Mobs.isNeutral(victim)) ) {
            attackEvent.setDamage(0);
            attackEvent.setCancelled(true);
        }
    }

}
