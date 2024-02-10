package net.pedroricardo;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.pedroricardo.content.HeadedRewrittenConfig;
import net.pedroricardo.content.TextureToServerHeadMap;
import net.pedroricardo.content.loottable.HeadedLootConditionTypes;
import net.pedroricardo.content.loottable.HeadedLootTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HeadedRewritten implements ModInitializer {
	public static final String MOD_ID = "headed-rewritten";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final HeadedRewrittenConfig CONFIG = HeadedRewrittenConfig.createAndLoad();

	@Override
	public void onInitialize() {
		HeadedLootConditionTypes.init();
		if (CONFIG.chargedCreeperDrops()) {
			HeadedLootTable.init();
		}
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.WHITE_SHEEP(), "White Sheep", SoundEvents.ENTITY_SHEEP_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.ORANGE_SHEEP(), "Orange Sheep", SoundEvents.ENTITY_SHEEP_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.MAGENTA_SHEEP(), "Magenta Sheep", SoundEvents.ENTITY_SHEEP_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.LIGHT_BLUE_SHEEP(), "Light Blue Sheep", SoundEvents.ENTITY_SHEEP_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.YELLOW_SHEEP(), "Yellow Sheep", SoundEvents.ENTITY_SHEEP_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.LIME_SHEEP(), "Lime Sheep", SoundEvents.ENTITY_SHEEP_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.PINK_SHEEP(), "Pink Sheep", SoundEvents.ENTITY_SHEEP_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.GRAY_SHEEP(), "Gray Sheep", SoundEvents.ENTITY_SHEEP_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.LIGHT_GRAY_SHEEP(), "Light Gray Sheep", SoundEvents.ENTITY_SHEEP_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.CYAN_SHEEP(), "Cyan Sheep", SoundEvents.ENTITY_SHEEP_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.PURPLE_SHEEP(), "Purple Sheep", SoundEvents.ENTITY_SHEEP_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.BLUE_SHEEP(), "Blue Sheep", SoundEvents.ENTITY_SHEEP_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.BROWN_SHEEP(), "Brown Sheep", SoundEvents.ENTITY_SHEEP_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.GREEN_SHEEP(), "Green Sheep", SoundEvents.ENTITY_SHEEP_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.RED_SHEEP(), "Red Sheep", SoundEvents.ENTITY_SHEEP_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.BLACK_SHEEP(), "Black Sheep", SoundEvents.ENTITY_SHEEP_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.JEB_SHEEP(), "jeb_ Sheep", SoundEvents.ENTITY_SHEEP_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.ALLAY(), "Allay", SoundEvents.ENTITY_ALLAY_AMBIENT_WITHOUT_ITEM.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.LUCY_AXOLOTL(), "Lucy Axolotl", SoundEvents.ENTITY_AXOLOTL_IDLE_AIR.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.WILD_AXOLOTL(), "Wild Axolotl", SoundEvents.ENTITY_AXOLOTL_IDLE_AIR.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.GOLD_AXOLOTL(), "Gold Axolotl", SoundEvents.ENTITY_AXOLOTL_IDLE_AIR.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.CYAN_AXOLOTL(), "Cyan Axolotl", SoundEvents.ENTITY_AXOLOTL_IDLE_AIR.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.BLUE_AXOLOTL(), "Blue Axolotl", SoundEvents.ENTITY_AXOLOTL_IDLE_AIR.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.BAT(), "Bat", SoundEvents.ENTITY_BAT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.BEE(), "Bee", SoundEvents.ENTITY_BEE_LOOP.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.POLLINATED_BEE(), "Pollinated Bee", SoundEvents.ENTITY_BEE_POLLINATE.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.ANGRY_BEE(), "Angry Bee", SoundEvents.ENTITY_BEE_LOOP_AGGRESSIVE.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.ANGRY_POLLINATED_BEE(), "Angry Pollinated Bee", SoundEvents.ENTITY_BEE_LOOP_AGGRESSIVE.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.BLAZE(), "Blaze", SoundEvents.ENTITY_BLAZE_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.BREEZE(), "Breeze", SoundEvents.ENTITY_BREEZE_IDLE_GROUND.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.CAMEL(), "Camel", SoundEvents.ENTITY_CAMEL_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.ALL_BLACK_CAT(), "Black Cat", SoundEvents.ENTITY_CAT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.BLACK_CAT(), "Tuxedo Cat", SoundEvents.ENTITY_CAT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.BRITISH_SHORTHAIR_CAT(), "British Shorthair", SoundEvents.ENTITY_CAT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.CALICO_CAT(), "Calico Cat", SoundEvents.ENTITY_CAT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.JELLIE_CAT(), "Jellie Cat", SoundEvents.ENTITY_CAT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.PERSIAN_CAT(), "Persian Cat", SoundEvents.ENTITY_CAT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.RAGDOLL_CAT(), "Ragdoll Cat", SoundEvents.ENTITY_CAT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.RED_CAT(), "Red Cat", SoundEvents.ENTITY_CAT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.SIAMESE_CAT(), "Siamese Cat", SoundEvents.ENTITY_CAT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.TABBY_CAT(), "Tabby Cat", SoundEvents.ENTITY_CAT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.WHITE_CAT(), "White Cat", SoundEvents.ENTITY_CAT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.CAVE_SPIDER(), "Cave Spider", SoundEvents.ENTITY_SPIDER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.CHICKEN(), "Chicken", SoundEvents.ENTITY_CHICKEN_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.COD(), "Cod", SoundEvents.ENTITY_COD_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.COW(), "Cow", SoundEvents.ENTITY_COW_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("", "Armor Stand", SoundEvents.ENTITY_GENERIC_EXPLODE.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.DOLPHIN(), "Dolphin", SoundEvents.ENTITY_DOLPHIN_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.DONKEY(), "Donkey", SoundEvents.ENTITY_DONKEY_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.DROWNED(), "Drowned", SoundEvents.ENTITY_DROWNED_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.ELDER_GUARDIAN(), "Elder Guardian", SoundEvents.ENTITY_ELDER_GUARDIAN_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.ENDERMAN(), "Enderman", SoundEvents.ENTITY_ENDERMAN_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.ENDERMITE(), "Endermite", SoundEvents.ENTITY_ENDERMITE_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.EVOKER(), "Evoker", SoundEvents.ENTITY_EVOKER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.FOX(), "Fox", SoundEvents.ENTITY_FOX_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.SNOW_FOX(), "Snow Fox", SoundEvents.ENTITY_FOX_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.COLD_FROG(), "Cold Frog", SoundEvents.ENTITY_FROG_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.TEMPERATE_FROG(), "Temperate Frog", SoundEvents.ENTITY_FROG_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.WARM_FROG(), "Warm Frog", SoundEvents.ENTITY_FROG_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.GHAST(), "Ghast", SoundEvents.ENTITY_GHAST_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.GLOW_SQUID(), "Glow Squid", SoundEvents.ENTITY_GLOW_SQUID_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.GOAT(), "Goat", SoundEvents.ENTITY_GOAT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.GUARDIAN(), "Guardian", SoundEvents.ENTITY_GUARDIAN_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.HOGLIN(), "Hoglin", SoundEvents.ENTITY_HOGLIN_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.WHITE_HORSE(), "White Horse", SoundEvents.ENTITY_HORSE_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.CREAMY_HORSE(), "Creamy Horse", SoundEvents.ENTITY_HORSE_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.CHESTNUT_HORSE(), "Chestnut Horse", SoundEvents.ENTITY_HORSE_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.BROWN_HORSE(), "Brown Horse", SoundEvents.ENTITY_HORSE_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.BLACK_HORSE(), "Black Horse", SoundEvents.ENTITY_HORSE_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.GRAY_HORSE(), "Gray Horse", SoundEvents.ENTITY_HORSE_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.DARK_BROWN_HORSE(), "Dark Brown Horse", SoundEvents.ENTITY_HORSE_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.HUSK(), "Husk", SoundEvents.ENTITY_HUSK_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.ILLUSIONER(), "Illusioner", SoundEvents.ENTITY_ILLUSIONER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.IRON_GOLEM(), "Iron Golem", SoundEvents.ENTITY_IRON_GOLEM_STEP.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.CREAMY_LLAMA(), "Creamy Llama", SoundEvents.ENTITY_LLAMA_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.WHITE_LLAMA(), "White Llama", SoundEvents.ENTITY_LLAMA_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.BROWN_LLAMA(), "Brown Llama", SoundEvents.ENTITY_LLAMA_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.GRAY_LLAMA(), "Gray Llama", SoundEvents.ENTITY_LLAMA_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.MAGMA_CUBE(), "Magma Cube", SoundEvents.ENTITY_MAGMA_CUBE_JUMP.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.RED_MOOSHROOM(), "Red Mooshroom", SoundEvents.ENTITY_COW_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.BROWN_MOOSHROOM(), "Brown Mooshroom", SoundEvents.ENTITY_COW_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.MULE(), "Mule", SoundEvents.ENTITY_MULE_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.OCELOT(), "Ocelot", SoundEvents.ENTITY_OCELOT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.AGGRESSIVE_PANDA(), "Aggressive Panda", SoundEvents.ENTITY_PANDA_AGGRESSIVE_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.BROWN_PANDA(), "Brown Panda", SoundEvents.ENTITY_PANDA_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.LAZY_PANDA(), "Lazy Panda", SoundEvents.ENTITY_PANDA_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.PANDA(), "Panda", SoundEvents.ENTITY_PANDA_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.PLAYFUL_PANDA(), "Playful Panda", SoundEvents.ENTITY_PANDA_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.WEAK_PANDA(), "Weak Panda", SoundEvents.ENTITY_PANDA_SNEEZE.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.WORRIED_PANDA(), "Worried Panda", SoundEvents.ENTITY_PANDA_WORRIED_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.BLUE_PARROT(), "Blue Parrot", SoundEvents.ENTITY_PARROT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.GREEN_PARROT(), "Green Parrot", SoundEvents.ENTITY_PARROT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.GRAY_PARROT(), "Gray Parrot", SoundEvents.ENTITY_PARROT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.RED_PARROT(), "Red Parrot", SoundEvents.ENTITY_PARROT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.CYAN_PARROT(), "Cyan Parrot", SoundEvents.ENTITY_PARROT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.PHANTOM(), "Phantom", SoundEvents.ENTITY_PHANTOM_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.PIG(), "Pig", SoundEvents.ENTITY_PIG_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.PIGLIN_BRUTE(), "Piglin Brute", SoundEvents.ENTITY_PIGLIN_BRUTE_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.PILLAGER(), "Pillager", SoundEvents.ENTITY_PILLAGER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.POLAR_BEAR(), "Polar Bear", SoundEvents.ENTITY_POLAR_BEAR_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.PUFFERFISH(), "Pufferfish", SoundEvents.ENTITY_PUFFER_FISH_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.BLACK_RABBIT(), "Black Rabbit", SoundEvents.ENTITY_RABBIT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.BROWN_RABBIT(), "Brown Rabbit", SoundEvents.ENTITY_RABBIT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.KILLER_BUNNY(), "The Killer Bunny", SoundEvents.ENTITY_RABBIT_ATTACK.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.GOLD_RABBIT(), "Gold Rabbit", SoundEvents.ENTITY_RABBIT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.SALT_PEPPER_RABBIT(), "Salt and Pepper Rabbit", SoundEvents.ENTITY_RABBIT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.TOAST_RABBIT(), "Toast", SoundEvents.ENTITY_RABBIT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.WHITE_RABBIT(), "White Rabbit", SoundEvents.ENTITY_RABBIT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.BLACK_WHITE_RABBIT(), "Black and White Rabbit", SoundEvents.ENTITY_RABBIT_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.RAVAGER(), "Ravager", SoundEvents.ENTITY_RAVAGER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.SALMON(), "Salmon", SoundEvents.ENTITY_SALMON_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.SHULKER(), "Shulker", SoundEvents.ENTITY_SHULKER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.SILVERFISH(), "Silverfish", SoundEvents.ENTITY_SILVERFISH_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.SKELETON_HORSE(), "Skeleton Horse", SoundEvents.ENTITY_SKELETON_HORSE_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.SLIME(), "Slime", SoundEvents.ENTITY_SLIME_JUMP.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.SNIFFER(), "Sniffer", SoundEvents.ENTITY_SNIFFER_SNIFFING.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.SNOW_GOLEM(), "Snow Golem", SoundEvents.ENTITY_SNOW_GOLEM_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.SPIDER(), "Spider", SoundEvents.ENTITY_SPIDER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.SQUID(), "Squid", SoundEvents.ENTITY_SQUID_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.STRAY(), "Stray", SoundEvents.ENTITY_STRAY_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.STRIDER(), "Strider", SoundEvents.ENTITY_STRIDER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.TADPOLE(), "Tadpole", SoundEvents.ENTITY_TADPOLE_FLOP.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.CREAMY_TRADER_LLAMA(), "Creamy Trader Llama", SoundEvents.ENTITY_LLAMA_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.WHITE_TRADER_LLAMA(), "White Trader Llama", SoundEvents.ENTITY_LLAMA_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.BROWN_TRADER_LLAMA(), "Brown Trader Llama", SoundEvents.ENTITY_LLAMA_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.GRAY_TRADER_LLAMA(), "Gray Trader Llama", SoundEvents.ENTITY_LLAMA_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.TROPICAL_FISH(), "Tropical Fish", SoundEvents.ENTITY_TROPICAL_FISH_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.TURTLE(), "Turtle", SoundEvents.ENTITY_TURTLE_AMBIENT_LAND.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.VEX(), "Vex", SoundEvents.ENTITY_VEX_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.CHARGING_VEX(), "Charging Vex", SoundEvents.ENTITY_VEX_CHARGE.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.VILLAGER(), "Villager", SoundEvents.ENTITY_VILLAGER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.ARMORER_VILLAGER(), "Armorer Villager", SoundEvents.ENTITY_VILLAGER_WORK_ARMORER.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.BUTCHER_VILLAGER(), "Butcher Villager", SoundEvents.ENTITY_VILLAGER_WORK_BUTCHER.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.CARTOGRAPHER_VILLAGER(), "Cartographer Villager", SoundEvents.ENTITY_VILLAGER_WORK_CARTOGRAPHER.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.CLERIC_VILLAGER(), "Cleric Villager", SoundEvents.ENTITY_VILLAGER_WORK_CLERIC.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.FARMER_VILLAGER(), "Farmer Villager", SoundEvents.ENTITY_VILLAGER_WORK_FARMER.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.FISHERMAN_VILLAGER(), "Fisherman Villager", SoundEvents.ENTITY_VILLAGER_WORK_FISHERMAN.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.FLETCHER_VILLAGER(), "Fletcher Villager", SoundEvents.ENTITY_VILLAGER_WORK_FLETCHER.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.LIBRARIAN_VILLAGER(), "Librarian Villager", SoundEvents.ENTITY_VILLAGER_WORK_LIBRARIAN.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.SHEPHERD_VILLAGER(), "Shepherd Villager", SoundEvents.ENTITY_VILLAGER_WORK_SHEPHERD.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.WEAPONSMITH_VILLAGER(), "Weaponsmith Villager", SoundEvents.ENTITY_VILLAGER_WORK_WEAPONSMITH.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.VINDICATOR(), "Vindicator", SoundEvents.ENTITY_VINDICATOR_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.WANDERING_TRADER(), "Wandering Trader", SoundEvents.ENTITY_WANDERING_TRADER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.WARDEN(), "Warden", SoundEvents.ENTITY_WARDEN_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.WITCH(), "Witch", SoundEvents.ENTITY_WITCH_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.WITHER(), "Wither", SoundEvents.ENTITY_WITHER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.WITHER_PROJECTILE(), "Wither Projectile", SoundEvents.ENTITY_WITHER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.BLUE_WITHER_PROJECTILE(), "Blue Wither Projectile", SoundEvents.ENTITY_WITHER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.WOLF(), "Wolf", SoundEvents.ENTITY_WOLF_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.ANGRY_WOLF(), "Angry Wolf", SoundEvents.ENTITY_WOLF_GROWL.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.ZOGLIN(), "Zoglin", SoundEvents.ENTITY_ZOGLIN_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.ZOMBIE_HORSE(), "Zombie Horse", SoundEvents.ENTITY_ZOMBIE_HORSE_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.ZOMBIE_VILLAGER(), "Zombie Villager", SoundEvents.ENTITY_ZOMBIE_VILLAGER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.ARMORER_ZOMBIE_VILLAGER(), "Armorer Zombie Villager", SoundEvents.ENTITY_ZOMBIE_VILLAGER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.BUTCHER_ZOMBIE_VILLAGER(), "Butcher Zombie Villager", SoundEvents.ENTITY_ZOMBIE_VILLAGER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.CARTOGRAPHER_ZOMBIE_VILLAGER(), "Cartographer Zombie Villager", SoundEvents.ENTITY_ZOMBIE_VILLAGER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.CLERIC_ZOMBIE_VILLAGER(), "Cleric Zombie Villager", SoundEvents.ENTITY_ZOMBIE_VILLAGER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.FARMER_ZOMBIE_VILLAGER(), "Farmer Zombie Villager", SoundEvents.ENTITY_ZOMBIE_VILLAGER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.FISHERMAN_ZOMBIE_VILLAGER(), "Fisherman Zombie Villager", SoundEvents.ENTITY_ZOMBIE_VILLAGER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.FLETCHER_ZOMBIE_VILLAGER(), "Fletcher Zombie Villager", SoundEvents.ENTITY_ZOMBIE_VILLAGER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.LIBRARIAN_ZOMBIE_VILLAGER(), "Librarian Zombie Villager", SoundEvents.ENTITY_ZOMBIE_VILLAGER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.SHEPHERD_ZOMBIE_VILLAGER(), "Shepherd Zombie Villager", SoundEvents.ENTITY_ZOMBIE_VILLAGER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.WEAPONSMITH_ZOMBIE_VILLAGER(), "Weaponsmith Zombie Villager", SoundEvents.ENTITY_ZOMBIE_VILLAGER_AMBIENT.getId().toString());
		TextureToServerHeadMap.addHead("http://textures.minecraft.net/texture/" + HeadedRewritten.CONFIG.headURLs.ZOMBIFIED_PIGLIN(), "Zombified Piglin", SoundEvents.ENTITY_ZOMBIFIED_PIGLIN_AMBIENT.getId().toString());

		S2CPlayChannelEvents.REGISTER.register(new Identifier(MOD_ID, MOD_ID), (handler, sender, server, channels) ->
			sender.sendPacket(new Identifier(MOD_ID, MOD_ID), PacketByteBufs.empty())
		);
		LOGGER.info("Initializing Headed Rewritten");
	}
}