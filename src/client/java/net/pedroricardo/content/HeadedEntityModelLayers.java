package net.pedroricardo.content;

import com.google.common.collect.Sets;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.entity.model.*;
import net.minecraft.util.Identifier;
import net.pedroricardo.HeadedRewritten;
import net.pedroricardo.HeadedRewrittenClient;
import net.pedroricardo.content.models.*;

import java.util.Set;
import java.util.stream.Stream;

@Environment(EnvType.CLIENT)
public class HeadedEntityModelLayers {
    private static final Set<EntityModelLayer> LAYERS = Sets.newHashSet();
    public static final EntityModelLayer VILLAGER_HEAD = registerMain("villager_head", VillagerHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer VILLAGER_HAT = register("villager_head", "hat", VillagerHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer EVOKER_HEAD = registerMain("evoker_head", VillagerLikeHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer VINDICATOR_HEAD = registerMain("vindicator_head", VillagerLikeHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer PILLAGER_HEAD = registerMain("pillager_head", VillagerLikeHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer WANDERING_TRADER_HEAD = registerMain("wandering_trader_head", VillagerLikeHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer ILLUSIONER_HEAD = registerMain("illusioner_head", VillagerLikeHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer SHEEP_HEAD = registerMain("sheep_head", SheepHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer SHEEP_WOOL = register("sheep_head", "wool", SheepHeadWoolEntityModel::getTexturedModelData);
    public static final EntityModelLayer ALLAY_HEAD = registerMain("allay_head", AllayHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer VEX_HEAD = registerMain("vex_head", AllayHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer PIGLIN_BRUTE_HEAD = registerMain("piglin_brute_head", () -> TexturedModelData.of(PiglinHeadEntityModel.getModelData(), 64, 64));
    public static final EntityModelLayer ZOMBIFIED_PIGLIN_HEAD = registerMain("zombified_piglin_head", () -> TexturedModelData.of(PiglinHeadEntityModel.getModelData(), 64, 64));
    public static final EntityModelLayer AXOLOTL_HEAD = registerMain("axolotl_head", AxolotlHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer COW_HEAD = registerMain("cow_head", CowHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer ARMOR_STAND_HEAD = registerMain("armor_stand_head", ArmorStandHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer DOLPHIN_HEAD = registerMain("dolphin_head", DolphinHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer DONKEY_HEAD = registerMain("donkey_head", DonkeyHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer POLAR_BEAR_HEAD = registerMain("polar_bear_head", PolarBearHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer OCELOT_HEAD = registerMain("ocelot_head", OcelotHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer ENDERMAN_HEAD = registerMain("enderman_head", EndermanHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer ENDERMITE_HEAD = registerMain("endermite_head", EndermiteHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer FOX_HEAD = registerMain("fox_head", FoxHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer FROG_HEAD = registerMain("frog_head", FrogHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer GHAST_HEAD = registerMain("ghast_head", GhastHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer IRON_GOLEM_HEAD = registerMain("iron_golem_head", IronGolemHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer LLAMA_HEAD = registerMain("llama_head", () -> LlamaHeadEntityModel.getTexturedModelData(Dilation.NONE));
    public static final EntityModelLayer LLAMA_HEAD_DECOR = registerMain("llama_head_decor", () -> LlamaHeadEntityModel.getTexturedModelData(new Dilation(0.5f)));
    public static final EntityModelLayer PANDA_HEAD = registerMain("panda_head", PandaHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer DROWNED_HEAD = registerMain("drowned_head", () -> DrownedHeadEntityModel.getTexturedModelData(Dilation.NONE));
    public static final EntityModelLayer DROWNED_HEAD_OUTER_LAYER = register("drowned_head", "outer", () -> DrownedHeadEntityModel.getTexturedModelData(new Dilation(0.25f)));
    public static final EntityModelLayer GUARDIAN_HEAD = registerMain("guardian_head", GuardianHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer PARROT_HEAD = registerMain("parrot_head", ParrotHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer STRAY_SKULL = registerMain("stray_skull", () -> StraySkullEntityModel.getTexturedModelData(Dilation.NONE));
    public static final EntityModelLayer STRAY_SKULL_OUTER_LAYER = register("stray_skull", "outer", () -> StraySkullEntityModel.getTexturedModelData(new Dilation(0.25f)));
    public static final EntityModelLayer STRIDER_HEAD = registerMain("strider_head", StriderHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer TADPOLE_HEAD = registerMain("tadpole_head", TadpoleHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer SHULKER_HEAD = registerMain("shulker_head", ShulkerHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer SILVERFISH_HEAD = registerMain("silverfish_head", SilverfishHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer SNIFFER_HEAD = registerMain("sniffer_head", SnifferHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer HORSE_HEAD = registerMain("horse_head", HorseHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer HUSK_HEAD = registerMain("husk_head", SkullEntityModel::getHeadTexturedModelData);
    public static final EntityModelLayer PIG_HEAD = registerMain("pig_head", PigHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer SPIDER_HEAD = registerMain("spider_head", () -> SpiderHeadEntityModel.getTexturedModelData(0.0f));
    public static final EntityModelLayer SQUID_HEAD = registerMain("squid_head", SquidHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer GOAT_HEAD = registerMain("goat_head", GoatHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer HOGLIN_HEAD = registerMain("hoglin_head", HoglinHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer SPIDER_EYES = register("spider_head", "eyes", () -> SpiderHeadEntityModel.getTexturedModelData(0.0f));
    public static final EntityModelLayer CAVE_SPIDER_HEAD = registerMain("cave_spider_head", () -> SpiderHeadEntityModel.getTexturedModelData(-1.2f));
    public static final EntityModelLayer CAVE_SPIDER_EYES = register("cave_spider_head", "eyes", () -> SpiderHeadEntityModel.getTexturedModelData(-1.2f));
    public static final EntityModelLayer BLAZE_HEAD = registerMain("blaze_head", SkullEntityModel::getSkullTexturedModelData);
    public static final EntityModelLayer BREEZE_HEAD = registerMain("breeze_head", BreezeHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer BREEZE_EYES = register("breeze_head", "eyes", BreezeHeadEntityModel::getEyesTexturedModelData);
    public static final EntityModelLayer CAMEL_HEAD = registerMain("camel_head", CamelHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer RABBIT_HEAD = registerMain("rabbit_head", RabbitHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer RAVAGER_HEAD = registerMain("ravager_head", RavagerHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer TURTLE_HEAD = registerMain("turtle_head", TurtleHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer WITHER_SKULL = registerMain("wither_skull", () -> WitherSkullEntityModel.getTexturedModelData(false));
    public static final EntityModelLayer WITHER_PROJECTILE = registerMain("wither_projectile", () -> WitherSkullEntityModel.getTexturedModelData(true));
    public static final EntityModelLayer BLUE_WITHER_PROJECTILE = registerMain("blue_wither_projectile", () -> WitherSkullEntityModel.getTexturedModelData(true));
    public static final EntityModelLayer WOLF_HEAD = registerMain("wolf_head", WolfHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer BAT_HEAD = registerMain("bat_head", BatHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer WARDEN_HEAD = registerMain("warden_head", WardenHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer WITCH_HEAD = registerMain("witch_head", WitchHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer CHICKEN_HEAD = registerMain("chicken_head", ChickenHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer PHANTOM_HEAD = registerMain("phantom_head", PhantomHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer PHANTOM_EYES = register("phantom_head", "eyes", PhantomHeadEntityModel::getTexturedModelData);
    public static final EntityModelLayer SNOW_GOLEM_HEAD = registerMain("snow_golem_head", SnowGolemHeadEntityModel::getTexturedModelData);

    private static EntityModelLayer registerMain(String id, EntityModelLayerRegistry.TexturedModelDataProvider texturedModelDataProvider) {
        return register(id, "main", texturedModelDataProvider);
    }

    private static EntityModelLayer register(String id, String layer, EntityModelLayerRegistry.TexturedModelDataProvider texturedModelDataProvider) {
        EntityModelLayer entityModelLayer = create(id, layer);
        if (!LAYERS.add(entityModelLayer)) {
            throw new IllegalStateException("Duplicate registration for " + entityModelLayer);
        } else {
            EntityModelLayerRegistry.registerModelLayer(entityModelLayer, texturedModelDataProvider);
            return entityModelLayer;
        }
    }

    private static EntityModelLayer create(String id, String layer) {
        return new EntityModelLayer(new Identifier(HeadedRewritten.MOD_ID, id), layer);
    }

    public static Stream<EntityModelLayer> getLayers() {
        return LAYERS.stream();
    }

    public static void init() {
        HeadedRewrittenClient.LOGGER.debug("Registering model layers");
    }
}