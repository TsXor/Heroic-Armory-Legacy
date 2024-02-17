package com.rena.heroic;

import com.rena.heroic.core.config.HeroicConfig;
import com.rena.heroic.core.init.ConditionInit;
import com.rena.heroic.core.init.ItemInit;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(HeroicArmoryLegacy.MOD_ID)
/* loaded from: heroic_armory_legacy-1.5.jar:com/rena/heroic/HeroicArmoryLegacy.class */
public class HeroicArmoryLegacy {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "heroic";

    public HeroicArmoryLegacy() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, HeroicConfig.SPEC, "heroicarmory-common.toml");
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        ItemInit.ITEMS.register(bus);
        bus.addGenericListener(GlobalLootModifierSerializer.class, ConditionInit::register);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(FMLCommonSetupEvent event) {}
}
