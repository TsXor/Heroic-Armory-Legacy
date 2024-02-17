package com.rena.heroic.core.config;

import net.minecraftforge.common.ForgeConfigSpec;

/* loaded from: heroic_armory_legacy-1.5.jar:com/rena/heroic/core/config/HeroicConfig.class */
public class HeroicConfig {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.IntValue WEAPON_DAMAGE;
    public static final ForgeConfigSpec.IntValue RARITY;

    static {
        BUILDER.push("Config for Heroic Armory Legacy");
        WEAPON_DAMAGE = BUILDER.comment("This number adds how much damage every weapon does.")
                .defineInRange("weapon", 0, 0, 20);
        RARITY = BUILDER.comment("This number exponentially multiplies how rare the weapons are relative to each other (0 means any container will have a weapon, 5 means they won't spawn, greater than 1 will decrease spawn, less spawn will increase)")
                .defineInRange("rarity", 1, 0, 5);
        BUILDER.pop();

        SPEC = BUILDER.build();
    }
}
