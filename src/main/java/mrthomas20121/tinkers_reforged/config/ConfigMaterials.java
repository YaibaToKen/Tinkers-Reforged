package mrthomas20121.tinkers_reforged.config;

import mrthomas20121.biolib.config.ConfigBase;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

public class ConfigMaterials extends ConfigBase {

    public static boolean lavium = true;
    public static boolean qivium = true;
    public static boolean invar = true;
    public static boolean aluminium = true;
    public static boolean iridium = true;
    public static boolean platinum = true;
    public static boolean titanium = true;
    public static boolean zinc = true;
    public static boolean ruby = true;
    public static boolean sapphire = true;
    public static boolean amethyst = true;
    public static boolean peridot = true;
    public static boolean blackquartz = true;
    public static boolean diamantine = true;
    public static boolean emeradic = true;
    public static boolean enori = true;
    public static boolean palis = true;
    public static boolean void_crystal = true;
    public static boolean redstonia = true;
    public static boolean silicon = true;
    public static boolean certus_quartz = true;
    public static boolean fluix_crystal = true;
    public static boolean starmetal = true;
    public static boolean khnumite = true;
    public static boolean limestone = true;
    public static boolean tanzanite = true;
    public static boolean topaz = true;
    public static boolean malachite = true;
    public static boolean amber = true;
    public static boolean charoite = true;
    public static boolean diopside = true;
    public static boolean horizonite = true;
    public static boolean pyrope = true;
    public static boolean ventium = true;
    public static boolean dragonstone = true;
    public static boolean dreamwood = true;
    public static boolean elementium = true;
    public static boolean gaia_spirit = true;
    public static boolean red_string = true;
    public static boolean manasteel = true;
    public static boolean terrasteel = true;
    public static boolean mana_diamond = true;
    public static boolean livingwood = true;
    public static boolean livingrock = true;
    public static boolean aquamarine = true;
    public static boolean magnite = true;
    public static boolean hexcite = true;
    public static boolean yellorium = true;
    public static boolean cyanite = true;
    public static boolean blutonium = true;
    public static boolean ludicrite = true;
    public static boolean osmium = true;
    public static boolean refined_obsidian = true;
    public static boolean refined_glowstone = true;
    public static boolean red_alloy = true;
    public static boolean electrotine = true;
    public static boolean electrotine_alloy = true;
    public static boolean ender_biotite = true;
    public static boolean quartz_enriched_iron = true;
    public static boolean enderium = true;
    public static boolean signalum = true;
    public static boolean lumium = true;
    public static boolean material_of_the_sky = true;
    public static boolean infused_iron = true;
    public static boolean ancient_wood = true;
    public static boolean runestone = true;

    public static ConfigBase getInstance() {
        return new ConfigMaterials();
    }

    public ConfigMaterials()
    {
        super("materials.cfg", Configuration.CATEGORY_GENERAL);
    }

    @Override
    public void preInit(FMLPreInitializationEvent event) {
        File reforged_folder = new File(event.getModConfigurationDirectory(), "tinkers_reforged");
        this.config = new Configuration(new File(reforged_folder, this.getName()));
    }

    @Override
    public void init() {
        lavium = this.config.getBoolean("lavium", this.getCategory(), lavium, "Set to false to disable the material lavium");
        qivium = this.config.getBoolean("qivium", this.getCategory(), qivium, "Set to false to disable the material qivium");
        invar = this.config.getBoolean("invar", this.getCategory(), invar, "Set to false to disable the material invar");
        aluminium = this.config.getBoolean("aluminium", this.getCategory(), aluminium, "Set to false to disable the material aluminium");
        iridium = this.config.getBoolean("iridium", this.getCategory(), iridium, "Set to false to disable the material iridium");
        platinum = this.config.getBoolean("platinum", this.getCategory(), platinum, "Set to false to disable the material platinum");
        titanium = this.config.getBoolean("titanium", this.getCategory(), titanium, "Set to false to disable the material titanium");
        zinc = this.config.getBoolean("zinc", this.getCategory(), zinc, "Set to false to disable the material zinc");
        ruby = this.config.getBoolean("ruby", this.getCategory(), ruby, "Set to false to disable the material ruby");
        sapphire = this.config.getBoolean("sapphire", this.getCategory(), sapphire, "Set to false to disable the material sapphire");
        amethyst = this.config.getBoolean("amethyst", this.getCategory(), amethyst, "Set to false to disable the material amethyst");
        peridot = this.config.getBoolean("peridot", this.getCategory(), peridot, "Set to false to disable the material peridot");
        blackquartz = this.config.getBoolean("blackquartz", this.getCategory(), blackquartz, "Set to false to disable the material blackquartz");
        diamantine = this.config.getBoolean("diamantine", this.getCategory(), diamantine, "Set to false to disable the material diamantine");
        emeradic = this.config.getBoolean("emeradic", this.getCategory(), emeradic, "Set to false to disable the material emeradic");
        enori = this.config.getBoolean("enori", this.getCategory(), enori, "Set to false to disable the material enori");
        palis = this.config.getBoolean("palis", this.getCategory(), palis, "Set to false to disable the material palis");
        void_crystal = this.config.getBoolean("void_crystal", this.getCategory(), void_crystal, "Set to false to disable the material void_crystal");
        redstonia = this.config.getBoolean("redstonia", this.getCategory(), redstonia, "Set to false to disable the material redstonia");
        silicon = this.config.getBoolean("silicon", this.getCategory(), silicon, "Set to false to disable the material silicon");
        certus_quartz = this.config.getBoolean("certus_quartz", this.getCategory(), certus_quartz, "Set to false to disable the material certus_quartz");
        fluix_crystal = this.config.getBoolean("fluix_crystal", this.getCategory(), fluix_crystal, "Set to false to disable the material fluix_crystal");
        starmetal = this.config.getBoolean("starmetal", this.getCategory(), starmetal, "Set to false to disable the material starmetal");
        khnumite = this.config.getBoolean("khnumite", this.getCategory(), khnumite, "Set to false to disable the material khnumite");
        limestone = this.config.getBoolean("limestone", this.getCategory(), limestone, "Set to false to disable the material limestone");
        tanzanite = this.config.getBoolean("tanzanite", this.getCategory(), tanzanite, "Set to false to disable the material tanzanite");
        topaz = this.config.getBoolean("topaz", this.getCategory(), topaz, "Set to false to disable the material topaz");
        malachite = this.config.getBoolean("malachite", this.getCategory(), malachite, "Set to false to disable the material malachite");
        amber = this.config.getBoolean("amber", this.getCategory(), amber, "Set to false to disable the material amber");
        charoite = this.config.getBoolean("charoite", this.getCategory(), charoite, "Set to false to disable the material charoite");
        diopside = this.config.getBoolean("diopside", this.getCategory(), diopside, "Set to false to disable the material diopside");
        horizonite = this.config.getBoolean("horizonite", this.getCategory(), horizonite, "Set to false to disable the material horizonite");
        pyrope = this.config.getBoolean("pyrope", this.getCategory(), pyrope, "Set to false to disable the material pyrope");
        ventium = this.config.getBoolean("ventium", this.getCategory(), ventium, "Set to false to disable the material ventium");
        dragonstone = this.config.getBoolean("dragonstone", this.getCategory(), dragonstone, "Set to false to disable the material dragonstone");
        dreamwood = this.config.getBoolean("dreamwood", this.getCategory(), dreamwood, "Set to false to disable the material dreamwood");
        elementium = this.config.getBoolean("elementium", this.getCategory(), elementium, "Set to false to disable the material elementium");
        gaia_spirit = this.config.getBoolean("gaia_spirit", this.getCategory(), gaia_spirit, "Set to false to disable the material gaia_spirit");
        red_string = this.config.getBoolean("red_string", this.getCategory(), red_string, "Set to false to disable the material red_string");
        manasteel = this.config.getBoolean("manasteel", this.getCategory(), manasteel, "Set to false to disable the material manasteel");
        terrasteel = this.config.getBoolean("terrasteel", this.getCategory(), terrasteel, "Set to false to disable the material terrasteel");
        mana_diamond = this.config.getBoolean("mana_diamond", this.getCategory(), mana_diamond, "Set to false to disable the material mana_diamond");
        livingwood = this.config.getBoolean("livingwood", this.getCategory(), livingwood, "Set to false to disable the material livingwood");
        livingrock = this.config.getBoolean("livingrock", this.getCategory(), livingrock, "Set to false to disable the material livingrock");
        aquamarine = this.config.getBoolean("aquamarine", this.getCategory(), aquamarine, "Set to false to disable the material aquamarine");
        magnite = this.config.getBoolean("magnite", this.getCategory(), magnite, "Set to false to disable the material magnite");
        hexcite = this.config.getBoolean("hexcite", this.getCategory(), hexcite, "Set to false to disable the material hexcite");
        yellorium = this.config.getBoolean("yellorium", this.getCategory(), yellorium, "Set to false to disable the material yellorium");
        cyanite = this.config.getBoolean("cyanite", this.getCategory(), cyanite, "Set to false to disable the material cyanite");
        blutonium = this.config.getBoolean("blutonium", this.getCategory(), blutonium, "Set to false to disable the material blutonium");
        ludicrite = this.config.getBoolean("ludicrite", this.getCategory(), ludicrite, "Set to false to disable the material ludicrite");
        osmium = this.config.getBoolean("osmium", this.getCategory(), osmium, "Set to false to disable the material osmium");
        refined_obsidian = this.config.getBoolean("refined_obsidian", this.getCategory(), refined_obsidian, "Set to false to disable the material refined_obsidian");
        refined_glowstone = this.config.getBoolean("refined_glowstone", this.getCategory(), refined_glowstone, "Set to false to disable the material refined_glowstone");
        red_alloy = this.config.getBoolean("red_alloy", this.getCategory(), red_alloy, "Set to false to disable the material red_alloy");
        electrotine = this.config.getBoolean("electrotine", this.getCategory(), electrotine, "Set to false to disable the material electrotine");
        electrotine_alloy = this.config.getBoolean("electrotine_alloy", this.getCategory(), electrotine_alloy, "Set to false to disable the material electrotine_alloy");
        ender_biotite = this.config.getBoolean("ender_biotite", this.getCategory(), ender_biotite, "Set to false to disable the material ender_biotite");
        quartz_enriched_iron = this.config.getBoolean("quartz_enriched_iron", this.getCategory(), quartz_enriched_iron, "Set to false to disable the material quartz_enriched_iron");
        enderium = this.config.getBoolean("enderium", this.getCategory(), enderium, "Set to false to disable the material enderium");
        signalum = this.config.getBoolean("signalum", this.getCategory(), signalum, "Set to false to disable the material signalum");
        lumium = this.config.getBoolean("lumium", this.getCategory(), lumium, "Set to false to disable the material lumium");
        material_of_the_sky = this.config.getBoolean("material_of_the_sky", this.getCategory(), material_of_the_sky, "Set to false to disable the material material_of_the_sky");
        infused_iron = this.config.getBoolean("infusedç_iron", this.getCategory(), infused_iron, "Set to false to disable the material infused_iron");
        ancient_wood = this.config.getBoolean("ancient_wood", this.getCategory(), ancient_wood, "Set to false to disable the material ancient_wood");
        runestone = this.config.getBoolean("runestone", this.getCategory(), runestone, "Set to false to disable the material runestone");
    }

    @Override
    public boolean isLoaded() {
        return true;
    }

    @Override
    public boolean canLoad() {
        return true;
    }
}
