package com.rena.heroic.core.init;

import com.rena.heroic.HeroicArmoryLegacy;
import net.minecraft.loot.LootEntry;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.TableLootEntry;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Arrays;
import java.util.List;

/* loaded from: heroic_armory_legacy-1.5.jar:com/rena/heroic/core/init/LootTablesInit.class */
public class LootTablesInit {

    @Mod.EventBusSubscriber(modid = HeroicArmoryLegacy.MOD_ID)
    /* loaded from: heroic_armory_legacy-1.5.jar:com/rena/heroic/core/init/LootTablesInit$LootTableEvents.class */
    public static class LootTableEvents {
        public static final List<String> LOOT_TABLE_LOCATIONS = Arrays.asList("chests/village/village_armorer", "chests/village/village_butcher", "chests/village/village_tannery", "chests/village/village_temple", "chests/village/village_toolsmith", "chests/village/village_weaponsmith", "chests/village/village_desert_house", "chests/village/village_plains_house", "chests/village/village_savanna_house", "chests/village/village_snowy_house", "chests/village/village_taiga_house", "chests/abandoned_mineshaft", "chests/bastion_hoglin_stable", "chests/bastion_treasure", "chests/buried_treasure", "chests/desert_pyramid", "chests/end_city_treasure", "chests/jungle_temple", "chests/nether_bridge", "chests/pillager_outpost", "chests/ruined_portal", "chests/shipwreck_treasure", "chests/spawn_bonus_chest", "chests/stronghold_corridor", "chests/underwater_ruin_big", "chests/woodland_mansion");

        @SubscribeEvent
        public static void onLootTableLoad(LootTableLoadEvent event) {
            String name = event.getName().toString();
            if (name.startsWith("minecraft:")) {
                String location = name.substring(name.indexOf("minecraft:") + "minecraft:".length());
                if (LOOT_TABLE_LOCATIONS.contains(location)) {
                    HeroicArmoryLegacy.LOGGER.debug("Adding loot to " + name);
                    event.getTable().addPool(getInjectPool(location));
                }
            }
        }

        public static LootPool getInjectPool(String entryName) {
            return LootPool.lootPool().add(getInjectEntry(entryName)).name("heroic_inject").build();
        }

        private static LootEntry.Builder<?> getInjectEntry(String name) {
            ResourceLocation table = new ResourceLocation(HeroicArmoryLegacy.MOD_ID, "inject/" + name);
            return TableLootEntry.lootTableReference(table).setWeight(1);
        }
    }
}
