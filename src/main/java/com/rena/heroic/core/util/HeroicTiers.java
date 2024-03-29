package com.rena.heroic.core.util;

import com.rena.heroic.core.config.HeroicConfig;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

/* loaded from: heroic_armory_legacy-1.5.jar:com/rena/heroic/core/util/HeroicTiers.class */
public enum HeroicTiers implements IItemTier {
    LOTRGIMLIBATTLEAXEMATERIAL(1, 4100, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 8, () -> Ingredient.EMPTY),
    LOTRGIMLILONGAXEMATERIAL(1, 3600, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 8, () -> Ingredient.EMPTY),
    LOTRMORGULBLADEMATERIAL(1, 100, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    LOTRSTINGMATERIAL(1, 2100, 1.0f, (5.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 28, () -> Ingredient.EMPTY),
    LOTRGLAMDRINGMATERIAL(1, 3000, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 30, () -> Ingredient.EMPTY),
    LOTRANDURILMATERIAL(1, 1000, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 12, () -> Ingredient.EMPTY),
    LOTRNARSILMATERIAL(1, 2000, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 12, () -> Ingredient.EMPTY),
    LOTRSAURONMACEMATERIAL(1, 3000, 1.0f, (14.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 8, () -> Ingredient.EMPTY),
    LOTRWITCHKINGSWORDMATERIAL(1, 2500, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    LOZMASTERSWORDMATERIAL(1, 3000, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    LOZMASTERSWORDIIMATERIAL(1, 4500, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 10, () -> Ingredient.EMPTY),
    LOZTEMPEREDSWORDMATERIAL(1, 4500, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 10, () -> Ingredient.EMPTY),
    LOZMASTERSWORDIIIMATERIAL(1, 7000, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 8, () -> Ingredient.EMPTY),
    LOZGOLDENSWORDMATERIAL(1, 7000, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 8, () -> Ingredient.EMPTY),
    LOZFLAMEBLADEMATERIAL(1, 2000, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 10, () -> Ingredient.EMPTY),
    LOZDARKNUTSWORDTPMATERIAL(1, 2800, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 12, () -> Ingredient.EMPTY),
    LOZGHIRAHIMSWORDMATERIAL(1, 3000, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 18, () -> Ingredient.EMPTY),
    LOZFIERCEDIETYSWORDMATERIAL(1, 1600, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 20, () -> Ingredient.EMPTY),
    LOZZELDASWORDMATERIAL(1, 2000, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 18, () -> Ingredient.EMPTY),
    LOZBOKOSTICKMATERIAL(1, 150, 1.0f, (4.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 20, () -> Ingredient.EMPTY),
    LOZCANEOFBYRNAMATERIAL(1, 800, 1.0f, (5.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 32, () -> Ingredient.EMPTY),
    LOZMEGATONHAMMERMATERIAL(1, 3200, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    LOZKOKIRISWORDMMMATERIAL(1, 750, 1.0f, (5.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    LOZKOKIRISWORDOOTMATERIAL(1, 750, 1.0f, (5.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    LOZDEMISESWORDMATERIAL(1, 2000, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 8, () -> Ingredient.EMPTY),
    LOZGIANTKNIFEMATERIAL(1, 40, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 10, () -> Ingredient.EMPTY),
    LOZBIGGORONSWORDMATERIAL(1, 8000, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 10, () -> Ingredient.EMPTY),
    LOZPHANTOMGANONSWORDMATERIAL(1, 3000, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    LOZULTIMATESWORDMATERIAL(1, 1000, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    LOZROYALGUARDSWORDMATERIAL(1, 1500, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    LOZMAGICSWORDCONCEPTMATERIAL(1, 1600, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 38, () -> Ingredient.EMPTY),
    LOZMAGICSWORDMATERIAL(1, 1600, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 38, () -> Ingredient.EMPTY),
    LOZWHITESWORDMATERIAL(1, 2600, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 10, () -> Ingredient.EMPTY),
    LOZWHITESWORDCONCEPTMATERIAL(1, 2600, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 10, () -> Ingredient.EMPTY),
    LOZPICORIBLADEMATERIAL(1, 2000, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    LOZRAZORSWORDMATERIAL(1, 2600, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 12, () -> Ingredient.EMPTY),
    LOZGREATFAIRYSWORDMATERIAL(1, 2800, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 20, () -> Ingredient.EMPTY),
    LOZGODDESSWHITESWORDMATERIAL(1, 1600, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    LOZGODDESSSWORDMATERIAL(1, 1600, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    LOZGILDEDSWORDMATERIAL(1, 2800, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 28, () -> Ingredient.EMPTY),
    LOZSPIKEDBOKOCLUBMATERIAL(1, 900, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    LOZBOKOCLUBMATERIAL(1, 650, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    ATJAKESWORDMATERIAL(1, 2000, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 10, () -> Ingredient.EMPTY),
    ATCRYSTALSWORDMATERIAL(1, 3000, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 10, () -> Ingredient.EMPTY),
    ATNOTHUNGMATERIAL(1, 3000, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 10, () -> Ingredient.EMPTY),
    ATFINNSWORDMATERIAL(1, 2800, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 11, () -> Ingredient.EMPTY),
    ATSWORDOFTHEDEADMATERIAL(1, 2800, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 10, () -> Ingredient.EMPTY),
    ATWISHSTARSWORDMATERIAL(1, 2800, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    ATFIGHTKINGSWORDMATERIAL(1, 400, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 5, () -> Ingredient.EMPTY),
    ATROOTSWORDMATERIAL(1, 1800, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    ATSCARLETMATERIAL(1, 2800, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 28, () -> Ingredient.EMPTY),
    ATGRASSSWORDMATERIAL(1, 600, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 14, () -> Ingredient.EMPTY),
    ATDEMONBLOODSWORDMATERIAL(1, 2800, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 22, () -> Ingredient.EMPTY),
    ATAXEBASSMATERIAL(1, 2000, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    FFTHEMASAMUNEMATERIAL(1, 3000, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    FFBUSTERSWORDMATERIAL(1, 3000, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    FFCALADBOLGMATERIAL(1, 2000, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    ROTMGSWORDOFTHECOLOSSUSMATERIAL(1, 3600, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    ROTMGCRYSTALSWORDMATERIAL(1, 2200, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    ROTMGPIXIEENCHANTEDSWORDMATERIAL(1, 1400, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    ROTMGSWORDOFACCLAIMMATERIAL(1, 2600, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    ROTMGDEMONBLADEMATERIAL(1, 3200, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    ROTMGSWORDOFTHEMADGODMATERIAL(1, 2800, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    ROTMGINDOMPTABLEMATERIAL(1, 600, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    ROTMGPIRATEKINGCUTLASSMATERIAL(1, 600, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    ROTMGSWORDOFSPLENDORMATERIAL(1, 3000, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    ROTMGSKYSPLITTERSWORDMATERIAL(1, 2000, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    ROTMGARCHONSWORDMATERIAL(1, 1400, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    ROTMGANCIENTSTONESWORDMATERIAL(1, 750, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    ROTMGDRAGONSOULSWORDMATERIAL(1, 800, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    ROTMGRAVENHEARTSWORDMATERIAL(1, 400, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SCFIRANGIMATERIAL(1, 1600, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SCCOCYTUSMATERIAL(1, 1600, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SCERLANGBLADEMATERIAL(1, 1800, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SCSOULEDGENIGHTMAREMATERIAL(1, 3200, 1.0f, (11.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 4, () -> Ingredient.EMPTY),
    SCPHLEGATHONMATERIAL(1, 2000, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SCACHERONMATERIAL(1, 2000, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SCLETHEMATERIAL(1, 2200, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SCQUEENGUARDMATERIAL(1, 2000, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SCHOLYANTLERMATERIAL(1, 2000, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SCEPEEMATERIAL(1, 2000, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SCWARHAMMERMATERIAL(1, 1300, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 12, () -> Ingredient.EMPTY),
    SCKALUTUESMATERIAL(1, 1200, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 8, () -> Ingredient.EMPTY),
    SCESTOCMATERIAL(1, 2000, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SCFLAMBERT2PMATERIAL(1, 2000, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SCREITERPALLASCHMATERIAL(1, 2000, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SCFLAMBERTMATERIAL(1, 2000, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SCBLUECRYSTALRODMATERIAL(1, 1800, 1.0f, (4.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 30, () -> Ingredient.EMPTY),
    SCFIREBLADEMATERIAL(1, 1500, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 13, () -> Ingredient.EMPTY),
    SCXISWORDMATERIAL(1, 2000, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SCOMEGASWORD2PMATERIAL(1, 2000, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SCOMEGASWORDMATERIAL(1, 2000, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SCORICHALCUMMATERIAL(1, 2000, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 19, () -> Ingredient.EMPTY),
    SCSTILETTOMATERIAL(1, 1600, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SCREQUIEMMATERIAL(1, 2200, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SCFAUSTMATERIAL(1, 2200, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SCFLAMBERGEMATERIAL(1, 2000, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SCSTEELPADDLEMATERIAL(1, 800, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 8, () -> Ingredient.EMPTY),
    SCGLAMMATERIAL(1, 2000, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SCGREATBLADEMATERIAL(1, 2000, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    RSBRONZESWORDMATERIAL(1, 350, 1.0f, (5.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 16, () -> Ingredient.EMPTY),
    RSIRONSWORDMATERIAL(1, 500, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 14, () -> Ingredient.EMPTY),
    RSWHITESWORDMATERIAL(1, 1600, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 17, () -> Ingredient.EMPTY),
    RSBLACKSWORDMATERIAL(1, 1600, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 17, () -> Ingredient.EMPTY),
    RSSTEELSWORDMATERIAL(1, 1600, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 8, () -> Ingredient.EMPTY),
    RSMITHRILSWORDMATERIAL(1, 2600, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 26, () -> Ingredient.EMPTY),
    RSADAMANTSWORDMATERIAL(1, 3400, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 10, () -> Ingredient.EMPTY),
    RSRUNESWORDMATERIAL(1, 4200, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 32, () -> Ingredient.EMPTY),
    RSDRAGONSWORDMATERIAL(1, 5600, 1.0f, (10.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    RSBRONZEBATTLEAXEMATERIAL(1, 350, 1.0f, (5.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 16, () -> Ingredient.EMPTY),
    RSIRONBATTLEAXEMATERIAL(1, 500, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 14, () -> Ingredient.EMPTY),
    RSSTEELBATTLEAXEMATERIAL(1, 1600, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 17, () -> Ingredient.EMPTY),
    RSBLACKBATTLEAXEMATERIAL(1, 1600, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 17, () -> Ingredient.EMPTY),
    RSWHITEBATTLEAXEMATERIAL(1, 1600, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 8, () -> Ingredient.EMPTY),
    RSMITHRILBATTLEAXEMATERIAL(1, 2600, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 26, () -> Ingredient.EMPTY),
    RSADAMANTBATTLEAXEMATERIAL(1, 3400, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 10, () -> Ingredient.EMPTY),
    RSRUNEBATTLEAXEMATERIAL(1, 4200, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 32, () -> Ingredient.EMPTY),
    RSDRAGONBATTLEAXEMATERIAL(1, 5600, 1.0f, (10.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    RSBRONZESCIMITARMATERIAL(1, 350, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 16, () -> Ingredient.EMPTY),
    RSIRONSCIMITARMATERIAL(1, 500, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 14, () -> Ingredient.EMPTY),
    RSBLACKSCIMITARMATERIAL(1, 1600, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 17, () -> Ingredient.EMPTY),
    RSWHITESCIMITARMATERIAL(1, 1600, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 17, () -> Ingredient.EMPTY),
    RSSTEELSCIMITARMATERIAL(1, 1600, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 8, () -> Ingredient.EMPTY),
    RSMITHRILSCIMITARMATERIAL(1, 2600, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 26, () -> Ingredient.EMPTY),
    RSADAMANTSCIMITARMATERIAL(1, 3400, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 10, () -> Ingredient.EMPTY),
    RSRUNESCIMITARMATERIAL(1, 4200, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 32, () -> Ingredient.EMPTY),
    RSDRAGONSCIMITARMATERIAL(1, 5600, 1.0f, (10.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    RSBRONZEWARHAMMERMATERIAL(1, 2500, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 16, () -> Ingredient.EMPTY),
    RSIRONWARHAMMERMATERIAL(1, 500, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 14, () -> Ingredient.EMPTY),
    RSSTEELWARHAMMERMATERIAL(1, 1600, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 17, () -> Ingredient.EMPTY),
    RSBLACKWARHAMMERMATERIAL(1, 1600, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 17, () -> Ingredient.EMPTY),
    RSWHITEWARHAMMERMATERIAL(1, 1600, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 8, () -> Ingredient.EMPTY),
    RSMITHRILWARHAMMERMATERIAL(1, 2600, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 26, () -> Ingredient.EMPTY),
    RSADAMANTWARHAMMERMATERIAL(1, 3400, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 10, () -> Ingredient.EMPTY),
    RSRUNEWARHAMMERMATERIAL(1, 4200, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 32, () -> Ingredient.EMPTY),
    RSBRONZEMACEMATERIAL(1, 2500, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 16, () -> Ingredient.EMPTY),
    RSIRONMACEMATERIAL(1, 500, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 14, () -> Ingredient.EMPTY),
    RSSTEELMACEMATERIAL(1, 1600, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 17, () -> Ingredient.EMPTY),
    RSBLACKMACEMATERIAL(1, 1600, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 17, () -> Ingredient.EMPTY),
    RSWHITEMACEMATERIAL(1, 1600, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 8, () -> Ingredient.EMPTY),
    RSMITHRILMACEMATERIAL(1, 2600, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 26, () -> Ingredient.EMPTY),
    RSADAMANTMACEMATERIAL(1, 3400, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 10, () -> Ingredient.EMPTY),
    RSRUNEMACEMATERIAL(1, 4200, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 32, () -> Ingredient.EMPTY),
    RSGRANITELONGSWORDMATERIAL(1, 2400, 1.0f, (10.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 5, () -> Ingredient.EMPTY),
    RSGRANITEHAMMERMATERIAL(1, 2000, 1.0f, (10.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 5, () -> Ingredient.EMPTY),
    RSGRANITEMAULMATERIAL(1, 2500, 1.0f, (11.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 5, () -> Ingredient.EMPTY),
    RSELDERMAULMATERIAL(1, 3200, 1.0f, (12.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    RSTOKTZXILAKMATERIAL(1, 3000, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    RSWOLFSBANEMATERIAL(1, 2500, 1.0f, (5.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    RSZAMORAKGODSWORDMATERIAL(1, 2800, 1.0f, (12.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 18, () -> Ingredient.EMPTY),
    RSBANDOSGODSWORDMATERIAL(1, 2800, 1.0f, (12.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 18, () -> Ingredient.EMPTY),
    RSARMADYLGODSWORDMATERIAL(1, 2800, 1.0f, (12.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 18, () -> Ingredient.EMPTY),
    RSSARADOMINGODSWORDMATERIAL(1, 2800, 1.0f, (12.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 18, () -> Ingredient.EMPTY),
    RSBARRELCHESTANCHORMATERIAL(1, 2000, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    DMCREDQUEENMATERIAL(1, 2000, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    DMCREBELLIONMATERIAL(1, 2000, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    DMCYAMATOMATERIAL(1, 2000, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 12, () -> Ingredient.EMPTY),
    PKMNHONEDGESHINYMATERIAL(1, 1600, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    PKMNHONEDGEMATERIAL(1, 1600, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    KIRBYGALAXIAMATERIAL(1, 3500, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    KIRBYKIRBYULTRASWORDMATERIAL(1, 2000, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    KIRBYKIRBYSWORDMATERIAL(1, 1000, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    FECHROMFALCHIONMATERIAL(1, 1900, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 20, () -> Ingredient.EMPTY),
    FEFALCHIONMATERIAL(1, 1900, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 20, () -> Ingredient.EMPTY),
    KHKEYBLADEMATERIAL(1, 1800, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 18, () -> Ingredient.EMPTY),
    BLEACHZABIMARUMATERIAL(1, 2000, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 10, () -> Ingredient.EMPTY),
    BLEACHZANGESTSUMATERIAL(1, 2000, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 8, () -> Ingredient.EMPTY),
    DSGREATSWORDOFARTORIASMATERIAL(1, 2200, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    DSGREATLORDGREATSWORDMATERIAL(1, 1200, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 10, () -> Ingredient.EMPTY),
    DSASTORAGREATSWORDMATERIAL(1, 1800, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    DSZWEILHANDERMATERIAL(1, 2000, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    MYTHDEATHSCYTHEMATERIAL(1, 1600, 1.0f, (10.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 2, () -> Ingredient.EMPTY),
    MYTHTHEDEVILPITCHFORKMATERIAL(1, 2200, 1.0f, (11.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 2, () -> Ingredient.EMPTY),
    BAYONETTASHURABAMATERIAL(1, 2000, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    BAYONETTAANGELSLAYERMATERIAL(1, 2000, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    GOWLEVIATHANUPGRADEDMATERIAL(1, 1800, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    GOWLEVIATHANMATERIAL(1, 1600, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    GOWBLADEOFOLYMPUSMATERIAL(1, 4000, 1.0f, (10.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    GOWBLADEOFCHAOSMATERIAL(1, 2000, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SKYRIMIRONSWORDMATERIAL(1, 500, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 14, () -> Ingredient.EMPTY),
    SKYRIMIRONWARHAMMERMATERIAL(1, 600, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 14, () -> Ingredient.EMPTY),
    SKYRIMSTEELSWORDMATERIAL(1, 1600, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 17, () -> Ingredient.EMPTY),
    SKYRIMSTEELWARHAMMERMATERIAL(1, 1700, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 17, () -> Ingredient.EMPTY),
    SKYRIMORCISHSWORDMATERIAL(1, 2000, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 8, () -> Ingredient.EMPTY),
    SKYRIMORCISHWARHAMMERMATERIAL(1, 2000, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 8, () -> Ingredient.EMPTY),
    SKYRIMDWARVENSWORDMATERIAL(1, 2600, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 12, () -> Ingredient.EMPTY),
    SKYRIMDWARVENWARHAMMERMATERIAL(1, 2700, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 12, () -> Ingredient.EMPTY),
    SKYRIMELVENSWORDMATERIAL(1, 1600, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 18, () -> Ingredient.EMPTY),
    SKYRIMELVENWARHAMMERMATERIAL(1, 1700, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 18, () -> Ingredient.EMPTY),
    SKYRIMGLASSSWORDMATERIAL(1, 1600, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 11, () -> Ingredient.EMPTY),
    SKYRIMGLASSWARHAMMERMATERIAL(1, 1700, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 11, () -> Ingredient.EMPTY),
    SKYRIMEBONYSWORDMATERIAL(1, 1900, 1.0f, (10.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SKYRIMEBONYWARHAMMERMATERIAL(1, 2000, 1.0f, (10.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SKYRIMDAEDRICSWORDMATERIAL(1, 2200, 1.0f, (11.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SKYRIMDAEDRICWARHAMMERMATERIAL(1, 2300, 1.0f, (11.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SKYRIMDRAGONBONESWORDMATERIAL(1, 1300, 1.0f, (12.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 6, () -> Ingredient.EMPTY),
    SKYRIMDRAGONBONEWARHAMMERMATERIAL(1, 1400, 1.0f, (12.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 6, () -> Ingredient.EMPTY),
    SKYRIMIMPERIALSWORDMATERIAL(1, 2000, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SKYRIMDAWNBREAKERMATERIAL(1, 2200, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SKYRIMANCIENTNORDSWORDMATERIAL(1, 1200, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    SKYRIMCHILLRENDMATERIAL(1, 1600, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 12, () -> Ingredient.EMPTY),
    SKYRIMEBONYBLADEMATERIAL(1, 2100, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    MHCHICKENDECAPITATORMATERIAL(1, 1600, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 6, () -> Ingredient.EMPTY),
    MHGOLEMBLADEMATERIAL(1, 1600, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 10, () -> Ingredient.EMPTY),
    MHDEFENDERMATERIAL(1, 2900, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    MHBLACKBELTBLADEMATERIAL(1, 1900, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    MHWAILINGCLEAVERMATERIAL(1, 1700, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    MHGAELICFLAMEMATERIAL(1, 1900, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 11, () -> Ingredient.EMPTY),
    MHBONEKATANAMATERIAL(1, 1700, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 8, () -> Ingredient.EMPTY),
    MHHELLISHSLASHERMATERIAL(1, 2100, 1.0f, (10.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 10, () -> Ingredient.EMPTY),
    MHCENTENARIANDAGGERMATERIAL(1, 1800, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    MHWYVERNBLADEBLOODMATERIAL(1, 1900, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 12, () -> Ingredient.EMPTY),
    MHWYVERNBLADEHOLLYMATERIAL(1, 1900, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 12, () -> Ingredient.EMPTY),
    MHWYVERNBLADEPALEMATERIAL(1, 1900, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 12, () -> Ingredient.EMPTY),
    MHWYVERNBLADEAZUREMATERIAL(1, 1900, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 12, () -> Ingredient.EMPTY),
    MHWYVERNBLADELEAFMATERIAL(1, 1900, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 12, () -> Ingredient.EMPTY),
    MHRATHALOSFLAMESWORDMATERIAL(1, 1900, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 12, () -> Ingredient.EMPTY),
    TERRARIAPALMWOODSWORDMATERIAL(1, 100, 1.0f, (4.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 18, () -> Ingredient.EMPTY),
    TERRARIABOREALWOODSWORDMATERIAL(1, 100, 1.0f, (4.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 18, () -> Ingredient.EMPTY),
    TERRARIASHADEWOODSWORDMATERIAL(1, 350, 1.0f, (5.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 18, () -> Ingredient.EMPTY),
    TERRARIAEBONWOODSWORDMATERIAL(1, 350, 1.0f, (5.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 18, () -> Ingredient.EMPTY),
    TERRARIACOPPERSHORTSWORDMATERIAL(1, 150, 1.0f, (5.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 8, () -> Ingredient.EMPTY),
    TERRARIACOPPERBROADSWORDMATERIAL(1, 180, 1.0f, (5.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 8, () -> Ingredient.EMPTY),
    TERRARIATINSHORTSWORDMATERIAL(1, 150, 1.0f, (5.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 10, () -> Ingredient.EMPTY),
    TERRARIATINBROADSWORDMATERIAL(1, 180, 1.0f, (5.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 10, () -> Ingredient.EMPTY),
    TERRARIALEADSHORTSWORDMATERIAL(1, 150, 1.0f, (5.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 12, () -> Ingredient.EMPTY),
    TERRARIALEADBROADSWORDMATERIAL(1, 180, 1.0f, (5.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 12, () -> Ingredient.EMPTY),
    TERRARIASPEARMATERIAL(1, 200, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    TERRARIAIRONSHORTSWORDMATERIAL(1, 250, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    TERRARIAIRONBROADSWORDMATERIAL(1, 250, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    TERRARIASILVERBROADSWORDMATERIAL(1, 300, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 26, () -> Ingredient.EMPTY),
    TERRARIASILVERSHORTSWORDMATERIAL(1, 300, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 26, () -> Ingredient.EMPTY),
    TERRARIAGOLDSHORTSWORDMATERIAL(1, 300, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 26, () -> Ingredient.EMPTY),
    TERRARIAGOLDBROADSWORDMATERIAL(1, 300, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 26, () -> Ingredient.EMPTY),
    TERRARIATUNGSTENBROADSWORDMATERIAL(1, 600, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 18, () -> Ingredient.EMPTY),
    TERRARIATUNGSTENSHORTSWORDMATERIAL(1, 600, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 18, () -> Ingredient.EMPTY),
    TERRARIAPLATINUMSHORTSWORDMATERIAL(1, 600, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 22, () -> Ingredient.EMPTY),
    TERRARIAPLATINUMBROADSWORDMATERIAL(1, 600, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 22, () -> Ingredient.EMPTY),
    TERRARIAMANDIBLEBLADEMATERIAL(1, 500, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 6, () -> Ingredient.EMPTY),
    TERRARIAKATANAMATERIAL(1, 1100, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 12, () -> Ingredient.EMPTY),
    TERRARIAEXOTICSCIMITARMATERIAL(1, 1200, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 12, () -> Ingredient.EMPTY),
    TERRARIAMURAMASAMATERIAL(1, 1900, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 23, () -> Ingredient.EMPTY),
    TERRARIAFALCONBLADEMATERIAL(1, 1400, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 11, () -> Ingredient.EMPTY),
    TERRARIABLADEOFGRASSMATERIAL(1, 1200, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    TERRARIAFIERYGREATSWORDMATERIAL(1, 1200, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    TERRARIABONESWORDMATERIAL(1, 800, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    TERRARIABLOODBUTCHERERMATERIAL(1, 1300, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 16, () -> Ingredient.EMPTY),
    TERRARIAENCHANTEDSWORDMATERIAL(1, 1200, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 32, () -> Ingredient.EMPTY),
    TERRARIASTARFURYMATERIAL(1, 1800, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 9, () -> Ingredient.EMPTY),
    TERRARIABEEKEEPERMATERIAL(1, 1200, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 8, () -> Ingredient.EMPTY),
    TERRARIAICEBLADEMATERIAL(1, 400, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 4, () -> Ingredient.EMPTY),
    TERRARIANIGHTEDGEMATERIAL(1, 1800, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 18, () -> Ingredient.EMPTY),
    TERRARIAARKHALISMATERIAL(1, 1700, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 16, () -> Ingredient.EMPTY),
    TERRARIATRIDENTMATERIAL(1, 1600, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 12, () -> Ingredient.EMPTY),
    TERRARIATHEROTTEDFORKMATERIAL(1, 2000, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 16, () -> Ingredient.EMPTY),
    TERRARIAWHITEPHASEBLADEMATERIAL(1, 600, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 0, () -> Ingredient.EMPTY),
    TERRARIAYELLOWPHASEBLADEMATERIAL(1, 600, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 0, () -> Ingredient.EMPTY),
    TERRARIAPURPLEPHASEBLADEMATERIAL(1, 600, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 0, () -> Ingredient.EMPTY),
    TERRARIAGREENPHASEBLADEMATERIAL(1, 600, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 0, () -> Ingredient.EMPTY),
    TERRARIAREDPHASEBLADEMATERIAL(1, 600, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 0, () -> Ingredient.EMPTY),
    TERRARIABLUEPHASEBLADEMATERIAL(1, 600, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 0, () -> Ingredient.EMPTY),
    TERRARIALIGHTBANEMATERIAL(1, 1900, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    TERRARIADARKLANCEMATERIAL(1, 1400, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 15, () -> Ingredient.EMPTY),
    TERRARIAPURPLECLUBBERFISHMATERIAL(1, 600, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 0, () -> Ingredient.EMPTY),
    TERRARIACACTUSSWORDMATERIAL(1, 250, 1.0f, (5.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 6, () -> Ingredient.EMPTY),
    TERRARIASWORDFISHMATERIAL(1, 1400, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 0, () -> Ingredient.EMPTY),
    SWYELLOWLIGHTSABERMATERIAL(1, 2300, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 1, () -> Ingredient.EMPTY),
    SWGREENLIGHTSABERMATERIAL(1, 2300, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 1, () -> Ingredient.EMPTY),
    SWBLUELIGHTSABERMATERIAL(1, 2300, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 1, () -> Ingredient.EMPTY),
    SWREDLIGHTSABERMATERIAL(1, 2300, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 1, () -> Ingredient.EMPTY),
    SWMACEWINDULIGHTSABERMATERIAL(1, 2300, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 1, () -> Ingredient.EMPTY),
    SWTHEINQUISITORLIGHTSABERMATERIAL(1, 2300, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 1, () -> Ingredient.EMPTY),
    SWDARTHMAULLIGHTSABERMATERIAL(1, 2100, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 1, () -> Ingredient.EMPTY),
    SWQUIGONJINNLIGHTSABERMATERIAL(1, 2300, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 1, () -> Ingredient.EMPTY),
    SWKYLORENLIGHTSABERMATERIAL(1, 1800, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 1, () -> Ingredient.EMPTY),
    SWCOUNTDOOKULIGHTSABERMATERIAL(1, 2600, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 1, () -> Ingredient.EMPTY),
    SWDARKSABERMATERIAL(1, 2300, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 1, () -> Ingredient.EMPTY),
    INTERNETDEMONOIDPITCHFORKMATERIAL(1, 666, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 6, () -> Ingredient.EMPTY),
    NHMAGICBANEMATERIAL(1, 2400, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 22, () -> Ingredient.EMPTY),
    NHATHAMEMATERIAL(1, 1600, 1.0f, (6.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 18, () -> Ingredient.EMPTY),
    NHGRAYSWANDIRMATERIAL(1, 2000, 1.0f, (9.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 28, () -> Ingredient.EMPTY),
    NHSILVERSABERMATERIAL(1, 2000, 1.0f, (7.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 22, () -> Ingredient.EMPTY),
    ABCMEXCALIBURMATERIAL(1, 3000, 1.0f, (8.0f + HeroicConfig.WEAPON_DAMAGE.get()) - 4.0f, 24, () -> Ingredient.EMPTY);

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    HeroicTiers(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> supplier) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = new LazyValue<>(supplier);
    }

    public int getUses() {
        return this.maxUses;
    }

    public float getSpeed() {
        return this.efficiency;
    }

    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    public int getLevel() {
        return this.harvestLevel;
    }

    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Nonnull
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }
}
