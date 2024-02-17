package com.rena.heroic.common.loot;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.rena.heroic.core.config.HeroicConfig;
import com.rena.heroic.core.init.ConditionInit;
import net.minecraft.loot.ILootSerializer;
import net.minecraft.loot.LootConditionType;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.JSONUtils;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

/* loaded from: heroic_armory_legacy-1.5.jar:com/rena/heroic/common/loot/ConfigurableRandomChance.class */
@ParametersAreNonnullByDefault
public class ConfigurableRandomChance implements ILootCondition {
    private final float defaultProbability;

    private ConfigurableRandomChance(float defaultProbability) {
        this.defaultProbability = defaultProbability;
    }

    @Nonnull
    public LootConditionType getType() {
        return ConditionInit.CONFIGURABLE_ITEM_CHANCE;
    }

    public boolean test(LootContext lootContext) {
        if (HeroicConfig.RARITY.get() >= 4.99d) {
            return false;
        }
        return lootContext.getRandom().nextFloat() < this.defaultProbability;
    }

    public static ILootCondition.IBuilder configurableRandomChance(float probability) {
        return () -> new ConfigurableRandomChance(probability);
    }

    /* loaded from: heroic_armory_legacy-1.5.jar:com/rena/heroic/common/loot/ConfigurableRandomChance$Serializer.class */
    public static class Serializer implements ILootSerializer<ConfigurableRandomChance> {
        /* renamed from: serialize */
        public void serialize(JsonObject object, ConfigurableRandomChance condition, JsonSerializationContext context) {
            object.addProperty("default_probability", condition.defaultProbability);
        }

        /* renamed from: deserialize */
        @Nonnull
        public ConfigurableRandomChance deserialize(JsonObject object, JsonDeserializationContext context) {
            return new ConfigurableRandomChance(JSONUtils.getAsFloat(object, "default_probability"));
        }
    }
}
