package com.owenoclee.peacefulplayer.helper;

import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

import java.util.Arrays;
import java.util.List;

public final class Mobs {

    private static final List<EntityType> Hostiles = Arrays.asList(
            EntityType.BLAZE,
            EntityType.CAVE_SPIDER,
            EntityType.CREEPER,
            EntityType.ELDER_GUARDIAN,
            EntityType.ENDER_DRAGON,
            EntityType.ENDERMAN,
            EntityType.ENDERMITE,
            EntityType.EVOKER,
            EntityType.GHAST,
            EntityType.GUARDIAN,
            EntityType.HUSK,
            EntityType.MAGMA_CUBE,
            EntityType.PIG_ZOMBIE,
            EntityType.PLAYER,
            EntityType.POLAR_BEAR,
            EntityType.SHULKER,
            EntityType.SILVERFISH,
            EntityType.SKELETON,
            EntityType.SLIME,
            EntityType.SPIDER,
            EntityType.STRAY,
            EntityType.VEX,
            EntityType.VILLAGER,
            EntityType.VINDICATOR,
            EntityType.WITCH,
            EntityType.WITHER,
            EntityType.WITHER_SKELETON,
            EntityType.ZOMBIE,
            EntityType.ZOMBIE_VILLAGER
    );

    private static final List<EntityType> Neutrals = Arrays.asList(
            EntityType.IRON_GOLEM,
            EntityType.LLAMA,
            EntityType.WOLF
    );

    private Mobs() { }

    public static boolean isHostile(EntityType entityType) {
        return Hostiles.contains(entityType);
    }

    public static boolean isHostile(Entity entity) {
        return isHostile(entity.getType());
    }

    public static boolean isNeutral(EntityType entityType) {
        return Neutrals.contains(entityType);
    }

    public static boolean isNeutral(Entity entity) {
        return isNeutral(entity.getType());
    }

}
