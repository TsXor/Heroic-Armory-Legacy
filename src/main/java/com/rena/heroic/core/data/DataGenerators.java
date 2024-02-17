package com.rena.heroic.core.data;

import com.rena.heroic.HeroicArmoryLegacy;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = HeroicArmoryLegacy.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
/* loaded from: heroic_armory_legacy-1.5.jar:com/rena/heroic/core/data/DataGenerators.class */
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        if (event.includeServer()) {
            generator.addProvider(new LootTables(generator, existingFileHelper));
        }
    }
}
