package com.rena.heroic.core.init;

import com.rena.heroic.HeroicArmoryLegacy;
import com.rena.heroic.common.loot.ConfigurableRandomChance;
import net.minecraft.loot.LootConditionType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;

/* loaded from: heroic_armory_legacy-1.5.jar:com/rena/heroic/core/init/ConditionInit.class */
public class ConditionInit {
    public static final LootConditionType CONFIGURABLE_ITEM_CHANCE = new LootConditionType(new ConfigurableRandomChance.Serializer());

    public static void register(RegistryEvent<GlobalLootModifierSerializer<?>> event) {
        Registry.register(Registry.LOOT_CONDITION_TYPE, new ResourceLocation(HeroicArmoryLegacy.MOD_ID, "configurable_random_chance"), CONFIGURABLE_ITEM_CHANCE);
    }
}
