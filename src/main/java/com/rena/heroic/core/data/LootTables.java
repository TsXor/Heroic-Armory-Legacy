package com.rena.heroic.core.data;

import com.google.common.base.Preconditions;
import com.mojang.datafixers.util.Pair;
import com.rena.heroic.HeroicArmoryLegacy;
import com.rena.heroic.common.loot.ConfigurableRandomChance;
import com.rena.heroic.core.init.ItemInit;
import com.rena.heroic.core.init.LootTablesInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.item.Item;
import net.minecraft.loot.*;
import net.minecraft.resources.ResourcePackType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* loaded from: heroic_armory_legacy-1.5.jar:com/rena/heroic/core/data/LootTables.class */
@ParametersAreNonnullByDefault
public class LootTables extends LootTableProvider {
    private final List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> tables;
    private final ExistingFileHelper existingFileHelper;

    public LootTables(DataGenerator dataGeneratorIn, ExistingFileHelper existingFileHelper) {
        super(dataGeneratorIn);
        this.tables = new ArrayList<>();
        this.existingFileHelper = existingFileHelper;
    }

    @Nonnull
    public List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
        this.tables.clear();
        heroicLootTable();
        addChestLootTable();
        return this.tables;
    }

    private void heroicLootTable() {
        addLootTable(HeroicArmoryLegacy.MOD_ID,
                LootTable.lootTable().withPool(LootPool.lootPool().name("main")
                        .setRolls(ConstantRange.exactly(1))
                        .add(createItemEntry(ItemInit.LOTRGIMLIBATTLEAX.get(), 1))
                        .add(createItemEntry(ItemInit.LOTRGIMLILONGAXE.get(), 1))
                        .add(createItemEntry(ItemInit.LOTRMORGULBLADE.get(), 1))
                        .add(createItemEntry(ItemInit.LOTRSTING.get(), 1))
                        .add(createItemEntry(ItemInit.LOTRGLAMDRING.get(), 1))
                        .add(createItemEntry(ItemInit.LOTRANDURIL.get(), 1))
                        .add(createItemEntry(ItemInit.LOTRNARSIL.get(), 1))
                        .add(createItemEntry(ItemInit.LOTRSAURONMACE.get(), 1))
                        .add(createItemEntry(ItemInit.LOTRWITCHKINGSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.LOZMASTERSWORD.get(), 3))
                        .add(createItemEntry(ItemInit.LOZMASTERSWORDII.get(), 2))
                        .add(createItemEntry(ItemInit.LOZTEMPEREDSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.LOZMASTERSWORDIII.get(), 1))
                        .add(createItemEntry(ItemInit.LOZGOLDENSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.LOZFLAMEBLADE.get(), 1))
                        .add(createItemEntry(ItemInit.LOZDARKNUTSWORDTP.get(), 1))
                        .add(createItemEntry(ItemInit.LOZGHIRAHIMSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.LOZFIERCEDIETYSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.LOZZELDASWORD.get(), 1))
                        .add(createItemEntry(ItemInit.LOZBOKOSTICK.get(), 1))
                        .add(createItemEntry(ItemInit.LOZCANEOFBYRNA.get(), 1))
                        .add(createItemEntry(ItemInit.LOZMEGATONHAMMER.get(), 1))
                        .add(createItemEntry(ItemInit.LOZKOKIRISWORDMM.get(), 1))
                        .add(createItemEntry(ItemInit.LOZKOKIRISWORDOOT.get(), 1))
                        .add(createItemEntry(ItemInit.LOZDEMISESWORD.get(), 1))
                        .add(createItemEntry(ItemInit.LOZGIANTKNIFE.get(), 1))
                        .add(createItemEntry(ItemInit.LOZBIGGORONSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.LOZPHANTOMGANONSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.LOZULTIMATESWORD.get(), 1))
                        .add(createItemEntry(ItemInit.LOZROYALGUARDSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.LOZMAGICSWORDCONCEPT.get(), 1))
                        .add(createItemEntry(ItemInit.LOZMAGICSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.LOZWHITESWORD.get(), 1))
                        .add(createItemEntry(ItemInit.LOZWHITESWORDCONCEPT.get(), 1))
                        .add(createItemEntry(ItemInit.LOZPICORIBLADE.get(), 1))
                        .add(createItemEntry(ItemInit.LOZRAZORSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.LOZGREATFAIRYSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.LOZGODDESSWHITESWORD.get(), 3))
                        .add(createItemEntry(ItemInit.LOZGODDESSSWORD.get(), 2))
                        .add(createItemEntry(ItemInit.LOZGILDEDSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.LOZSPIKEDBOKOCLUB.get(), 1))
                        .add(createItemEntry(ItemInit.LOZBOKOCLUBL.get(), 1))
                        .add(createItemEntry(ItemInit.ATJAKESWORD.get(), 1))
                        .add(createItemEntry(ItemInit.ATCRYSTALSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.ATNOTHUNG.get(), 1))
                        .add(createItemEntry(ItemInit.ATFINNSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.ATSWORDOFTHEDEAD.get(), 1))
                        .add(createItemEntry(ItemInit.ATWISHSTARSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.ATFIGHTKINGSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.ATROOTSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.ATSCARLET.get(), 1))
                        .add(createItemEntry(ItemInit.ATGRASSSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.ATDEMONBLOODSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.ATAXEBASS.get(), 1))
                        .add(createItemEntry(ItemInit.FFTHEMASAMUNE.get(), 1))
                        .add(createItemEntry(ItemInit.FFBUSTERSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.FFCALADBOLG.get(), 1))
                        .add(createItemEntry(ItemInit.ROTMGSWORDOFTHECOLOSSUS.get(), 1))
                        .add(createItemEntry(ItemInit.ROTMGCRYSTALSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.ROTMGPIXIEENCHANTEDSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.ROTMGSWORDOFACCLAIM.get(), 1))
                        .add(createItemEntry(ItemInit.ROTMGDEMONBLADE.get(), 1))
                        .add(createItemEntry(ItemInit.ROTMGSWORDOFTHEMADGOD.get(), 1))
                        .add(createItemEntry(ItemInit.ROTMGINDOMPTABLE.get(), 1))
                        .add(createItemEntry(ItemInit.ROTMGPIRATEKINGCUTLASS.get(), 1))
                        .add(createItemEntry(ItemInit.ROTMGSWORDOFSPLENDOR.get(), 3))
                        .add(createItemEntry(ItemInit.ROTMGSKYSPLITTERSWORD.get(), 2))
                        .add(createItemEntry(ItemInit.ROTMGARCHONSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.ROTMGANCIENTSTONESWORD.get(), 1))
                        .add(createItemEntry(ItemInit.ROTMGDRAGONSOULSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.ROTMGRAVENHEARTSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.SCFIRANGI.get(), 1))
                        .add(createItemEntry(ItemInit.SCCOCYTUS.get(), 1))
                        .add(createItemEntry(ItemInit.SCERLANGBLADE.get(), 1))
                        .add(createItemEntry(ItemInit.SCSOULEDGENIGHTMARE.get(), 1))
                        .add(createItemEntry(ItemInit.SCPHLEGATHON.get(), 1))
                        .add(createItemEntry(ItemInit.SCACHERON.get(), 1))
                        .add(createItemEntry(ItemInit.SCLETHE.get(), 1))
                        .add(createItemEntry(ItemInit.SCQUEENGUARD.get(), 1))
                        .add(createItemEntry(ItemInit.SCHOLYANTLER.get(), 1))
                        .add(createItemEntry(ItemInit.SCEPEE.get(), 1))
                        .add(createItemEntry(ItemInit.SCWARHAMMER.get(), 1))
                        .add(createItemEntry(ItemInit.SCKALUTUES.get(), 1))
                        .add(createItemEntry(ItemInit.SCESTOC.get(), 1))
                        .add(createItemEntry(ItemInit.SCFLAMBERT2P.get(), 1))
                        .add(createItemEntry(ItemInit.SCREITERPALLASCH.get(), 1))
                        .add(createItemEntry(ItemInit.SCFLAMBERT.get(), 1))
                        .add(createItemEntry(ItemInit.SCBLUECRYSTALROD.get(), 1))
                        .add(createItemEntry(ItemInit.SCFIREBLADE.get(), 1))
                        .add(createItemEntry(ItemInit.SCXISWORD.get(), 1))
                        .add(createItemEntry(ItemInit.SCOMEGASWORD2P.get(), 1))
                        .add(createItemEntry(ItemInit.SCOMEGASWORD.get(), 1))
                        .add(createItemEntry(ItemInit.SCORICHALCUM.get(), 1))
                        .add(createItemEntry(ItemInit.SCSTILETTO.get(), 3))
                        .add(createItemEntry(ItemInit.SCREQUIEM.get(), 2))
                        .add(createItemEntry(ItemInit.SCFAUST.get(), 1))
                        .add(createItemEntry(ItemInit.SCFLAMBERGE.get(), 1))
                        .add(createItemEntry(ItemInit.SCSTEELPADDLE.get(), 1))
                        .add(createItemEntry(ItemInit.SCGLAM.get(), 1))
                        .add(createItemEntry(ItemInit.SCGREATBLADE.get(), 1))
                        .add(createItemEntry(ItemInit.RSBRONZESWORD.get(), 1))
                        .add(createItemEntry(ItemInit.RSIRONSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.RSWHITESWORD.get(), 1))
                        .add(createItemEntry(ItemInit.RSBLACKSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.RSSTEELSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.RSMITHRILSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.RSADAMANTSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.RSRUNESWORD.get(), 1))
                        .add(createItemEntry(ItemInit.RSDRAGONSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.RSBRONZEBATTLEAXE.get(), 3))
                        .add(createItemEntry(ItemInit.RSIRONBATTLEAXE.get(), 2))
                        .add(createItemEntry(ItemInit.RSSTEELBATTLEAXE.get(), 1))
                        .add(createItemEntry(ItemInit.RSBLACKBATTLEAXE.get(), 1))
                        .add(createItemEntry(ItemInit.RSWHITEBATTLEAXE.get(), 1))
                        .add(createItemEntry(ItemInit.RSMITHRILBATTLEAXE.get(), 1))
                        .add(createItemEntry(ItemInit.RSADAMANTBATTLEAXE.get(), 1))
                        .add(createItemEntry(ItemInit.RSRUNEBATTLEAXE.get(), 1))
                        .add(createItemEntry(ItemInit.RSDRAGONBATTLEAXE.get(), 1))
                        .add(createItemEntry(ItemInit.RSBRONZESCIMITAR.get(), 1))
                        .add(createItemEntry(ItemInit.RSIRONSCIMITAR.get(), 1))
                        .add(createItemEntry(ItemInit.RSBLACKSCIMITAR.get(), 1))
                        .add(createItemEntry(ItemInit.RSWHITESCIMITAR.get(), 1))
                        .add(createItemEntry(ItemInit.RSSTEELSCIMITAR.get(), 1))
                        .add(createItemEntry(ItemInit.RSMITHRILSCIMITAR.get(), 1))
                        .add(createItemEntry(ItemInit.RSADAMANTSCIMITAR.get(), 1))
                        .add(createItemEntry(ItemInit.RSRUNESCIMITAR.get(), 1))
                        .add(createItemEntry(ItemInit.RSDRAGONSCIMITAR.get(), 1))
                        .add(createItemEntry(ItemInit.RSBRONZEWARHAMMER.get(), 1))
                        .add(createItemEntry(ItemInit.RSIRONWARHAMMER.get(), 1))
                        .add(createItemEntry(ItemInit.RSSTEELWARHAMMER.get(), 1))
                        .add(createItemEntry(ItemInit.RSBLACKWARHAMMER.get(), 1))
                        .add(createItemEntry(ItemInit.RSWHITEWARHAMMER.get(), 1))
                        .add(createItemEntry(ItemInit.RSMITHRILWARHAMMER.get(), 1))
                        .add(createItemEntry(ItemInit.RSADAMANTWARHAMMER.get(), 1))
                        .add(createItemEntry(ItemInit.RSRUNEWARHAMMER.get(), 1))
                        .add(createItemEntry(ItemInit.RSBRONZEMACE.get(), 1))
                        .add(createItemEntry(ItemInit.RSIRONMACE.get(), 1))
                        .add(createItemEntry(ItemInit.RSSTEELMACE.get(), 3))
                        .add(createItemEntry(ItemInit.RSBLACKMACE.get(), 2))
                        .add(createItemEntry(ItemInit.RSWHITEMACE.get(), 1))
                        .add(createItemEntry(ItemInit.RSMITHRILMACE.get(), 1))
                        .add(createItemEntry(ItemInit.RSADAMANTMACE.get(), 1))
                        .add(createItemEntry(ItemInit.RSRUNEMACE.get(), 1))
                        .add(createItemEntry(ItemInit.RSGRANITELONGSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.RSGRANITEHAMMER.get(), 1))
                        .add(createItemEntry(ItemInit.RSGRANITEMAUL.get(), 1))
                        .add(createItemEntry(ItemInit.RSELDERMAUL.get(), 1))
                        .add(createItemEntry(ItemInit.RSTOKTZXILAKM.get(), 1))
                        .add(createItemEntry(ItemInit.RSWOLFSBANE.get(), 1))
                        .add(createItemEntry(ItemInit.RSZAMORAKGODSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.RSBANDOSGODSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.RSARMADYLGODSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.RSSARADOMINGODSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.RSBARRELCHESTANCHOR.get(), 1))
                        .add(createItemEntry(ItemInit.DMCREDQUEEN.get(), 1))
                        .add(createItemEntry(ItemInit.DMCREBELLION.get(), 1))
                        .add(createItemEntry(ItemInit.DMCYAMATO.get(), 1))
                        .add(createItemEntry(ItemInit.PKMNHONEDGESHINY.get(), 1))
                        .add(createItemEntry(ItemInit.PKMNHONEDGE.get(), 1))
                        .add(createItemEntry(ItemInit.KIRBYGALAXIA.get(), 1))
                        .add(createItemEntry(ItemInit.KIRBYKIRBYULTRASWORD.get(), 1))
                        .add(createItemEntry(ItemInit.KIRBYKIRBYSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.FECHROMFALCHION.get(), 1))
                        .add(createItemEntry(ItemInit.FEFALCHION.get(), 1))
                        .add(createItemEntry(ItemInit.KHKEYBLADE.get(), 1))
                        .add(createItemEntry(ItemInit.BLEACHZABIMARU.get(), 3))
                        .add(createItemEntry(ItemInit.BLEACHZANGESTSU.get(), 2))
                        .add(createItemEntry(ItemInit.DSGREATSWORDOFARTORIAS.get(), 1))
                        .add(createItemEntry(ItemInit.DSGREATLORDGREATSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.DSASTORAGREATSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.DSZWEILHANDER.get(), 1))
                        .add(createItemEntry(ItemInit.MYTHDEATHSCYTHE.get(), 1))
                        .add(createItemEntry(ItemInit.MYTHTHEDEVILPITCHFORK.get(), 1))
                        .add(createItemEntry(ItemInit.BAYONETTASHURABA.get(), 1))
                        .add(createItemEntry(ItemInit.BAYONETTAANGELSLAYER.get(), 1))
                        .add(createItemEntry(ItemInit.GOWLEVIATHANUPGRADED.get(), 1))
                        .add(createItemEntry(ItemInit.GOWLEVIATHAN.get(), 1))
                        .add(createItemEntry(ItemInit.GOWBLADEOFOLYMPUS.get(), 1))
                        .add(createItemEntry(ItemInit.GOWBLADEOFCHAOS.get(), 1))
                        .add(createItemEntry(ItemInit.SKYRIMIRONSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.SKYRIMIRONWARHAMMER.get(), 1))
                        .add(createItemEntry(ItemInit.SKYRIMSTEELSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.SKYRIMSTEELWARHAMMER.get(), 1))
                        .add(createItemEntry(ItemInit.SKYRIMORCISHSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.SKYRIMORCISHWARHAMMER.get(), 1))
                        .add(createItemEntry(ItemInit.SKYRIMDWARVENSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.SKYRIMDWARVENWARHAMMER.get(), 1))
                        .add(createItemEntry(ItemInit.SKYRIMELVENSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.SKYRIMELVENWARHAMMER.get(), 1))
                        .add(createItemEntry(ItemInit.SKYRIMGLASSSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.SKYRIMGLASSWARHAMMER.get(), 1))
                        .add(createItemEntry(ItemInit.SKYRIMEBONYSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.SKYRIMEBONYWARHAMMER.get(), 1))
                        .add(createItemEntry(ItemInit.SKYRIMDAEDRICSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.SKYRIMDAEDRICWARHAMMER.get(), 1))
                        .add(createItemEntry(ItemInit.SKYRIMDRAGONBONESWORD.get(), 1))
                        .add(createItemEntry(ItemInit.SKYRIMDRAGONBONEWARHAMMER.get(), 1))
                        .add(createItemEntry(ItemInit.SKYRIMIMPERIALSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.SKYRIMDAWNBREAKER.get(), 1))
                        .add(createItemEntry(ItemInit.SKYRIMANCIENTNORDSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.SKYRIMCHILLREND.get(), 1))
                        .add(createItemEntry(ItemInit.SKYRIMEBONYBLADE.get(), 3))
                        .add(createItemEntry(ItemInit.MHCHICKENDECAPITATOR.get(), 2))
                        .add(createItemEntry(ItemInit.MHGOLEMBLADE.get(), 1))
                        .add(createItemEntry(ItemInit.MHDEFENDER.get(), 1))
                        .add(createItemEntry(ItemInit.MHBLACKBELTBLADE.get(), 1))
                        .add(createItemEntry(ItemInit.MHWAILINGCLEAVER.get(), 1))
                        .add(createItemEntry(ItemInit.MHGAELICFLAME.get(), 1))
                        .add(createItemEntry(ItemInit.MHBONEKATANA.get(), 1))
                        .add(createItemEntry(ItemInit.MHHELLISHSLASHER.get(), 1))
                        .add(createItemEntry(ItemInit.MHCENTENARIANDAGGER.get(), 1))
                        .add(createItemEntry(ItemInit.MHWYVERNBLADEBLOOD.get(), 1))
                        .add(createItemEntry(ItemInit.MHWYVERNBLADEHOLLY.get(), 1))
                        .add(createItemEntry(ItemInit.MHWYVERNBLADEPALE.get(), 1))
                        .add(createItemEntry(ItemInit.MHWYVERNBLADEAZURE.get(), 1))
                        .add(createItemEntry(ItemInit.MHWYVERNBLADELEAF.get(), 1))
                        .add(createItemEntry(ItemInit.MHRATHALOSFLAMESWORD.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIAPALMWOODSWORD.get(), 3))
                        .add(createItemEntry(ItemInit.TERRARIABOREALWOODSWORD.get(), 2))
                        .add(createItemEntry(ItemInit.TERRARIASHADEWOODSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIAEBONWOODSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIACOPPERSHORTSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIACOPPERBROADSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIATINSHORTSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIATINBROADSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIALEADSHORTSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIALEADBROADSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIASPEAR.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIAIRONSHORTSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIAIRONBROADSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIASILVERBROADSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIASILVERSHORTSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIAGOLDSHORTSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIAGOLDBROADSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIATUNGSTENBROADSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIATUNGSTENSHORTSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIAPLATINUMSHORTSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIAPLATINUMBROADSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIAMANDIBLEBLADE.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIAKATANA.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIAEXOTICSCIMITAR.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIAMURAMASA.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIAFALCONBLADE.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIABLADEOFGRASS.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIAFIERYGREATSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIABONESWORD.get(), 3))
                        .add(createItemEntry(ItemInit.TERRARIABLOODBUTCHERER.get(), 2))
                        .add(createItemEntry(ItemInit.TERRARIAENCHANTEDSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIASTARFURY.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIABEEKEEPER.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIAICEBLADE.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIANIGHTEDGE.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIAARKHALIS.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIATRIDENT.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIATHEROTTEDFORK.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIAWHITEPHASEBLADE.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIAYELLOWPHASEBLADE.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIAPURPLEPHASEBLADE.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIAGREENPHASEBLADE.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIAREDPHASEBLADE.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIABLUEPHASEBLADE.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIALIGHTBANE.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIADARKLANCE.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIAPURPLECLUBBERFISH.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIACACTUSSWORD.get(), 1))
                        .add(createItemEntry(ItemInit.TERRARIASWORDFISH.get(), 1))
                        .add(createItemEntry(ItemInit.SWYELLOWLIGHTSABER.get(), 1))
                        .add(createItemEntry(ItemInit.SWGREENLIGHTSABER.get(), 1))
                        .add(createItemEntry(ItemInit.SWBLUELIGHTSABER.get(), 1))
                        .add(createItemEntry(ItemInit.SWREDLIGHTSABER.get(), 1))
                        .add(createItemEntry(ItemInit.SWMACEWINDULIGHTSABER.get(), 1))
                        .add(createItemEntry(ItemInit.SWTHEINQUISITORLIGHTSABER.get(), 1))
                        .add(createItemEntry(ItemInit.SWDARTHMAULLIGHTSABER.get(), 1))
                        .add(createItemEntry(ItemInit.SWQUIGONJINNLIGHTSABER.get(), 3))
                        .add(createItemEntry(ItemInit.SWKYLORENLIGHTSABER.get(), 2))
                        .add(createItemEntry(ItemInit.SWCOUNTDOOKULIGHTSABER.get(), 1))
                        .add(createItemEntry(ItemInit.SWDARKSABER.get(), 1))
                        .add(createItemEntry(ItemInit.INTERNETDEMONOIDPITCHFORK.get(), 1))
                        .add(createItemEntry(ItemInit.NHMAGICBANE.get(), 1))
                        .add(createItemEntry(ItemInit.NHATHAME.get(), 1))
                        .add(createItemEntry(ItemInit.NHGRAYSWANDIR.get(), 1))
                        .add(createItemEntry(ItemInit.NHSILVERSABER.get(), 1))
                        .add(createItemEntry(ItemInit.ABCMEXCALIBUR.get(), 1))
                )
        );
    }

    private void addChestLootTable() {
        for (String biome : Arrays.asList("desert", "plains", "savanna", "snowy", "taiga")) {
            addLootTable(String.format("inject/chests/village/village_%s_house", biome),
                    LootTable.lootTable().withPool(LootPool.lootPool().name("main")
                            .setRolls(ConstantRange.exactly(2))
                            .when(ConfigurableRandomChance.configurableRandomChance(1.0f))
                            .add(createHeroicEntry(3))
                    )
            );
        }
        addLootTable("inject/chests/spawn_bonus_chest",
                LootTable.lootTable().withPool(LootPool.lootPool().name("main")
                        .when(ConfigurableRandomChance.configurableRandomChance(1.0f))
                        .setRolls(ConstantRange.exactly(2))
                        .add(createHeroicEntry(3))
                )
        );
        addLootTable("inject/chests/village/village_armorer",
                LootTable.lootTable().withPool(LootPool.lootPool().name("main")
                        .setRolls(ConstantRange.exactly(2))
                        .when(ConfigurableRandomChance.configurableRandomChance(0.1f))
                        .add(createHeroicEntry(3))
                )
        );
        addLootTable("inject/chests/village/village_butcher",
                LootTable.lootTable().withPool(LootPool.lootPool().name("main")
                        .setRolls(ConstantRange.exactly(2))
                        .when(ConfigurableRandomChance.configurableRandomChance(0.02f))
                        .add(createHeroicEntry(3))
                )
        );
        addLootTable("inject/chests/village/village_tannery",
                LootTable.lootTable().withPool(LootPool.lootPool()
                        .name("main")
                        .setRolls(ConstantRange.exactly(2))
                        .when(ConfigurableRandomChance.configurableRandomChance(0.2f))
                        .add(createHeroicEntry(3))
                )
        );
        addLootTable("inject/chests/village/village_temple",
                LootTable.lootTable().withPool(LootPool.lootPool()
                        .name("main")
                        .setRolls(ConstantRange.exactly(2))
                        .when(ConfigurableRandomChance.configurableRandomChance(0.2f))
                        .add(createHeroicEntry(3))
                )
        );
        addLootTable("inject/chests/village/village_toolsmith",
                LootTable.lootTable().withPool(LootPool.lootPool().name("main")
                        .setRolls(ConstantRange.exactly(2))
                        .when(ConfigurableRandomChance.configurableRandomChance(0.15f))
                        .add(createHeroicEntry(3))
                )
        );
        addLootTable("inject/chests/village/village_weaponsmith",
                LootTable.lootTable().withPool(LootPool.lootPool().name("main")
                        .setRolls(ConstantRange.exactly(2))
                        .when(ConfigurableRandomChance.configurableRandomChance(0.1f))
                        .add(createHeroicEntry(3))
                )
        );
        addLootTable("inject/chests/abandoned_mineshaft",
                LootTable.lootTable().withPool(LootPool.lootPool().name("main")
                        .setRolls(ConstantRange.exactly(2))
                        .when(ConfigurableRandomChance.configurableRandomChance(0.3f))
                        .add(createHeroicEntry(3))
                )
        );
        addLootTable("inject/chests/bastion_hoglin_stable",
                LootTable.lootTable().withPool(LootPool.lootPool().name("main")
                        .setRolls(ConstantRange.exactly(2))
                        .when(ConfigurableRandomChance.configurableRandomChance(0.2f))
                        .add(createHeroicEntry(3))
                )
        );
        addLootTable("inject/chests/bastion_treasure",
                LootTable.lootTable().withPool(LootPool.lootPool().name("main")
                        .setRolls(ConstantRange.exactly(2))
                        .when(ConfigurableRandomChance.configurableRandomChance(0.65f))
                        .add(createHeroicEntry(6))
                )
        );
        addLootTable("inject/chests/buried_treasure",
                LootTable.lootTable().withPool(LootPool.lootPool().name("main")
                        .setRolls(ConstantRange.exactly(2))
                        .when(ConfigurableRandomChance.configurableRandomChance(0.25f))
                        .add(createHeroicEntry(3))
                )
        );
        addLootTable("inject/chests/desert_pyramid",
                LootTable.lootTable().withPool(LootPool.lootPool().name("main")
                        .setRolls(ConstantRange.exactly(2))
                        .when(ConfigurableRandomChance.configurableRandomChance(0.2f))
                        .add(createHeroicEntry(3))
                )
        );
        addLootTable("inject/chests/end_city_treasure",
                LootTable.lootTable().withPool(LootPool.lootPool().name("main")
                        .setRolls(ConstantRange.exactly(2))
                        .when(ConfigurableRandomChance.configurableRandomChance(0.3f))
                        .add(createHeroicEntry(3))
                )
        );
        addLootTable("inject/chests/jungle_temple",
                LootTable.lootTable().withPool(LootPool.lootPool().name("main")
                        .setRolls(ConstantRange.exactly(2))
                        .when(ConfigurableRandomChance.configurableRandomChance(0.3f))
                        .add(createHeroicEntry(3))
                )
        );
        addLootTable("inject/chests/nether_bridge",
                LootTable.lootTable().withPool(LootPool.lootPool().name("main")
                        .setRolls(ConstantRange.exactly(2))
                        .when(ConfigurableRandomChance.configurableRandomChance(0.15f))
                        .add(createHeroicEntry(3))
                )
        );
        addLootTable("inject/chests/pillager_outpost",
                LootTable.lootTable().withPool(LootPool.lootPool().name("main")
                        .setRolls(ConstantRange.exactly(2))
                        .when(ConfigurableRandomChance.configurableRandomChance(0.25f))
                        .add(createHeroicEntry(3))
                )
        );
        addLootTable("inject/chests/ruined_portal",
                LootTable.lootTable().withPool(LootPool.lootPool().name("main")
                        .setRolls(ConstantRange.exactly(2))
                        .when(ConfigurableRandomChance.configurableRandomChance(0.15f))
                        .add(createHeroicEntry(3))
                )
        );
        addLootTable("inject/chests/shipwreck_treasure",
                LootTable.lootTable().withPool(LootPool.lootPool().name("main")
                        .setRolls(ConstantRange.exactly(2))
                        .when(ConfigurableRandomChance.configurableRandomChance(0.15f))
                        .add(createHeroicEntry(3))
                )
        );
        addLootTable("inject/chests/stronghold_corridor",
                LootTable.lootTable().withPool(LootPool.lootPool().name("main")
                        .setRolls(ConstantRange.exactly(2))
                        .when(ConfigurableRandomChance.configurableRandomChance(0.3f))
                        .add(createHeroicEntry(3))
                )
        );
        addLootTable("inject/chests/underwater_ruin_big",
                LootTable.lootTable().withPool(LootPool.lootPool().name("main")
                        .setRolls(ConstantRange.exactly(2))
                        .when(ConfigurableRandomChance.configurableRandomChance(0.45f))
                        .add(createHeroicEntry(3))
                )
        );
        addLootTable("inject/chests/woodland_mansion",
                LootTable.lootTable().withPool(LootPool.lootPool().name("main")
                        .setRolls(ConstantRange.exactly(2))
                        .when(ConfigurableRandomChance.configurableRandomChance(0.25f))
                        .add(createHeroicEntry(1))
                )
        );
    }

    private static StandaloneLootEntry.Builder<?> createItemEntry(Item item, int weight) {
        return ItemLootEntry.lootTableItem(item).setWeight(weight);
    }

    private static LootEntry.Builder<?> createHeroicEntry(int weight) {
        return createLootTableEntry(HeroicArmoryLegacy.MOD_ID, weight);
    }

    private static LootEntry.Builder<?> createLootTableEntry(String lootTable, int weight) {
        return TableLootEntry.lootTableReference(new ResourceLocation(HeroicArmoryLegacy.MOD_ID, lootTable)).setWeight(weight);
    }

    private void addLootTable(String location, LootTable.Builder lootTable, LootParameterSet lootParameterSet) {
        if (location.startsWith("inject/")) {
            String actualLocation = location.replace("inject/", "");
            Preconditions.checkArgument(
                    this.existingFileHelper.exists(new ResourceLocation("loot_tables/" + actualLocation + ".json"), ResourcePackType.SERVER_DATA),
                    "Loot table %s does not exist in any known data pack",
                    actualLocation
            );
            Preconditions.checkArgument(
                    LootTablesInit.LootTableEvents.LOOT_TABLE_LOCATIONS.contains(actualLocation),
                    "Loot table %s does not exist in list of injected loot tables",
                    actualLocation
            );
        }
        this.tables.add(Pair.of(() -> lootBuilder -> lootBuilder.accept(new ResourceLocation(HeroicArmoryLegacy.MOD_ID, location), lootTable), lootParameterSet));
    }

    private void addLootTable(String location, LootTable.Builder lootTable) {
        addLootTable(location, lootTable, LootParameterSets.ALL_PARAMS);
    }

    protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
        map.forEach((loc, table) -> {
            LootTableManager.validate(validationtracker, loc, table);
        });
    }
}
