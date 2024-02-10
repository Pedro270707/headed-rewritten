package net.pedroricardo.content;

import blue.endless.jankson.Jankson;
import io.wispforest.owo.config.ConfigWrapper;
import io.wispforest.owo.config.Option;
import io.wispforest.owo.util.Observable;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class HeadedRewrittenConfig extends ConfigWrapper<net.pedroricardo.content.HeadedRewrittenConfigModel> {

    public final Keys keys = new Keys();

    private final Option<java.lang.Boolean> chargedCreeperDrops = this.optionForKey(this.keys.chargedCreeperDrops);
    private final Option<java.lang.Boolean> changeHeadCollisions = this.optionForKey(this.keys.changeHeadCollisions);
    private final Option<java.lang.String> headURLs_WHITE_SHEEP = this.optionForKey(this.keys.headURLs_WHITE_SHEEP);
    private final Option<java.lang.String> headURLs_ORANGE_SHEEP = this.optionForKey(this.keys.headURLs_ORANGE_SHEEP);
    private final Option<java.lang.String> headURLs_MAGENTA_SHEEP = this.optionForKey(this.keys.headURLs_MAGENTA_SHEEP);
    private final Option<java.lang.String> headURLs_LIGHT_BLUE_SHEEP = this.optionForKey(this.keys.headURLs_LIGHT_BLUE_SHEEP);
    private final Option<java.lang.String> headURLs_YELLOW_SHEEP = this.optionForKey(this.keys.headURLs_YELLOW_SHEEP);
    private final Option<java.lang.String> headURLs_LIME_SHEEP = this.optionForKey(this.keys.headURLs_LIME_SHEEP);
    private final Option<java.lang.String> headURLs_PINK_SHEEP = this.optionForKey(this.keys.headURLs_PINK_SHEEP);
    private final Option<java.lang.String> headURLs_GRAY_SHEEP = this.optionForKey(this.keys.headURLs_GRAY_SHEEP);
    private final Option<java.lang.String> headURLs_LIGHT_GRAY_SHEEP = this.optionForKey(this.keys.headURLs_LIGHT_GRAY_SHEEP);
    private final Option<java.lang.String> headURLs_CYAN_SHEEP = this.optionForKey(this.keys.headURLs_CYAN_SHEEP);
    private final Option<java.lang.String> headURLs_PURPLE_SHEEP = this.optionForKey(this.keys.headURLs_PURPLE_SHEEP);
    private final Option<java.lang.String> headURLs_BLUE_SHEEP = this.optionForKey(this.keys.headURLs_BLUE_SHEEP);
    private final Option<java.lang.String> headURLs_BROWN_SHEEP = this.optionForKey(this.keys.headURLs_BROWN_SHEEP);
    private final Option<java.lang.String> headURLs_GREEN_SHEEP = this.optionForKey(this.keys.headURLs_GREEN_SHEEP);
    private final Option<java.lang.String> headURLs_RED_SHEEP = this.optionForKey(this.keys.headURLs_RED_SHEEP);
    private final Option<java.lang.String> headURLs_BLACK_SHEEP = this.optionForKey(this.keys.headURLs_BLACK_SHEEP);
    private final Option<java.lang.String> headURLs_JEB_SHEEP = this.optionForKey(this.keys.headURLs_JEB_SHEEP);
    private final Option<java.lang.String> headURLs_ALLAY = this.optionForKey(this.keys.headURLs_ALLAY);
    private final Option<java.lang.String> headURLs_LUCY_AXOLOTL = this.optionForKey(this.keys.headURLs_LUCY_AXOLOTL);
    private final Option<java.lang.String> headURLs_WILD_AXOLOTL = this.optionForKey(this.keys.headURLs_WILD_AXOLOTL);
    private final Option<java.lang.String> headURLs_GOLD_AXOLOTL = this.optionForKey(this.keys.headURLs_GOLD_AXOLOTL);
    private final Option<java.lang.String> headURLs_CYAN_AXOLOTL = this.optionForKey(this.keys.headURLs_CYAN_AXOLOTL);
    private final Option<java.lang.String> headURLs_BLUE_AXOLOTL = this.optionForKey(this.keys.headURLs_BLUE_AXOLOTL);
    private final Option<java.lang.String> headURLs_BAT = this.optionForKey(this.keys.headURLs_BAT);
    private final Option<java.lang.String> headURLs_BEE = this.optionForKey(this.keys.headURLs_BEE);
    private final Option<java.lang.String> headURLs_POLLINATED_BEE = this.optionForKey(this.keys.headURLs_POLLINATED_BEE);
    private final Option<java.lang.String> headURLs_ANGRY_BEE = this.optionForKey(this.keys.headURLs_ANGRY_BEE);
    private final Option<java.lang.String> headURLs_ANGRY_POLLINATED_BEE = this.optionForKey(this.keys.headURLs_ANGRY_POLLINATED_BEE);
    private final Option<java.lang.String> headURLs_BLAZE = this.optionForKey(this.keys.headURLs_BLAZE);
    private final Option<java.lang.String> headURLs_BREEZE = this.optionForKey(this.keys.headURLs_BREEZE);
    private final Option<java.lang.String> headURLs_CAMEL = this.optionForKey(this.keys.headURLs_CAMEL);
    private final Option<java.lang.String> headURLs_ALL_BLACK_CAT = this.optionForKey(this.keys.headURLs_ALL_BLACK_CAT);
    private final Option<java.lang.String> headURLs_BLACK_CAT = this.optionForKey(this.keys.headURLs_BLACK_CAT);
    private final Option<java.lang.String> headURLs_BRITISH_SHORTHAIR_CAT = this.optionForKey(this.keys.headURLs_BRITISH_SHORTHAIR_CAT);
    private final Option<java.lang.String> headURLs_CALICO_CAT = this.optionForKey(this.keys.headURLs_CALICO_CAT);
    private final Option<java.lang.String> headURLs_JELLIE_CAT = this.optionForKey(this.keys.headURLs_JELLIE_CAT);
    private final Option<java.lang.String> headURLs_PERSIAN_CAT = this.optionForKey(this.keys.headURLs_PERSIAN_CAT);
    private final Option<java.lang.String> headURLs_RAGDOLL_CAT = this.optionForKey(this.keys.headURLs_RAGDOLL_CAT);
    private final Option<java.lang.String> headURLs_RED_CAT = this.optionForKey(this.keys.headURLs_RED_CAT);
    private final Option<java.lang.String> headURLs_SIAMESE_CAT = this.optionForKey(this.keys.headURLs_SIAMESE_CAT);
    private final Option<java.lang.String> headURLs_TABBY_CAT = this.optionForKey(this.keys.headURLs_TABBY_CAT);
    private final Option<java.lang.String> headURLs_WHITE_CAT = this.optionForKey(this.keys.headURLs_WHITE_CAT);
    private final Option<java.lang.String> headURLs_CAVE_SPIDER = this.optionForKey(this.keys.headURLs_CAVE_SPIDER);
    private final Option<java.lang.String> headURLs_CHICKEN = this.optionForKey(this.keys.headURLs_CHICKEN);
    private final Option<java.lang.String> headURLs_COD = this.optionForKey(this.keys.headURLs_COD);
    private final Option<java.lang.String> headURLs_COW = this.optionForKey(this.keys.headURLs_COW);
    private final Option<java.lang.String> headURLs_DOLPHIN = this.optionForKey(this.keys.headURLs_DOLPHIN);
    private final Option<java.lang.String> headURLs_DONKEY = this.optionForKey(this.keys.headURLs_DONKEY);
    private final Option<java.lang.String> headURLs_DROWNED = this.optionForKey(this.keys.headURLs_DROWNED);
    private final Option<java.lang.String> headURLs_ELDER_GUARDIAN = this.optionForKey(this.keys.headURLs_ELDER_GUARDIAN);
    private final Option<java.lang.String> headURLs_ENDERMAN = this.optionForKey(this.keys.headURLs_ENDERMAN);
    private final Option<java.lang.String> headURLs_ENDERMITE = this.optionForKey(this.keys.headURLs_ENDERMITE);
    private final Option<java.lang.String> headURLs_EVOKER = this.optionForKey(this.keys.headURLs_EVOKER);
    private final Option<java.lang.String> headURLs_FOX = this.optionForKey(this.keys.headURLs_FOX);
    private final Option<java.lang.String> headURLs_SNOW_FOX = this.optionForKey(this.keys.headURLs_SNOW_FOX);
    private final Option<java.lang.String> headURLs_COLD_FROG = this.optionForKey(this.keys.headURLs_COLD_FROG);
    private final Option<java.lang.String> headURLs_TEMPERATE_FROG = this.optionForKey(this.keys.headURLs_TEMPERATE_FROG);
    private final Option<java.lang.String> headURLs_WARM_FROG = this.optionForKey(this.keys.headURLs_WARM_FROG);
    private final Option<java.lang.String> headURLs_GHAST = this.optionForKey(this.keys.headURLs_GHAST);
    private final Option<java.lang.String> headURLs_GLOW_SQUID = this.optionForKey(this.keys.headURLs_GLOW_SQUID);
    private final Option<java.lang.String> headURLs_GOAT = this.optionForKey(this.keys.headURLs_GOAT);
    private final Option<java.lang.String> headURLs_GUARDIAN = this.optionForKey(this.keys.headURLs_GUARDIAN);
    private final Option<java.lang.String> headURLs_HOGLIN = this.optionForKey(this.keys.headURLs_HOGLIN);
    private final Option<java.lang.String> headURLs_WHITE_HORSE = this.optionForKey(this.keys.headURLs_WHITE_HORSE);
    private final Option<java.lang.String> headURLs_CREAMY_HORSE = this.optionForKey(this.keys.headURLs_CREAMY_HORSE);
    private final Option<java.lang.String> headURLs_CHESTNUT_HORSE = this.optionForKey(this.keys.headURLs_CHESTNUT_HORSE);
    private final Option<java.lang.String> headURLs_BROWN_HORSE = this.optionForKey(this.keys.headURLs_BROWN_HORSE);
    private final Option<java.lang.String> headURLs_BLACK_HORSE = this.optionForKey(this.keys.headURLs_BLACK_HORSE);
    private final Option<java.lang.String> headURLs_GRAY_HORSE = this.optionForKey(this.keys.headURLs_GRAY_HORSE);
    private final Option<java.lang.String> headURLs_DARK_BROWN_HORSE = this.optionForKey(this.keys.headURLs_DARK_BROWN_HORSE);
    private final Option<java.lang.String> headURLs_HUSK = this.optionForKey(this.keys.headURLs_HUSK);
    private final Option<java.lang.String> headURLs_ILLUSIONER = this.optionForKey(this.keys.headURLs_ILLUSIONER);
    private final Option<java.lang.String> headURLs_IRON_GOLEM = this.optionForKey(this.keys.headURLs_IRON_GOLEM);
    private final Option<java.lang.String> headURLs_CREAMY_LLAMA = this.optionForKey(this.keys.headURLs_CREAMY_LLAMA);
    private final Option<java.lang.String> headURLs_WHITE_LLAMA = this.optionForKey(this.keys.headURLs_WHITE_LLAMA);
    private final Option<java.lang.String> headURLs_BROWN_LLAMA = this.optionForKey(this.keys.headURLs_BROWN_LLAMA);
    private final Option<java.lang.String> headURLs_GRAY_LLAMA = this.optionForKey(this.keys.headURLs_GRAY_LLAMA);
    private final Option<java.lang.String> headURLs_MAGMA_CUBE = this.optionForKey(this.keys.headURLs_MAGMA_CUBE);
    private final Option<java.lang.String> headURLs_RED_MOOSHROOM = this.optionForKey(this.keys.headURLs_RED_MOOSHROOM);
    private final Option<java.lang.String> headURLs_BROWN_MOOSHROOM = this.optionForKey(this.keys.headURLs_BROWN_MOOSHROOM);
    private final Option<java.lang.String> headURLs_MULE = this.optionForKey(this.keys.headURLs_MULE);
    private final Option<java.lang.String> headURLs_OCELOT = this.optionForKey(this.keys.headURLs_OCELOT);
    private final Option<java.lang.String> headURLs_AGGRESSIVE_PANDA = this.optionForKey(this.keys.headURLs_AGGRESSIVE_PANDA);
    private final Option<java.lang.String> headURLs_BROWN_PANDA = this.optionForKey(this.keys.headURLs_BROWN_PANDA);
    private final Option<java.lang.String> headURLs_LAZY_PANDA = this.optionForKey(this.keys.headURLs_LAZY_PANDA);
    private final Option<java.lang.String> headURLs_PANDA = this.optionForKey(this.keys.headURLs_PANDA);
    private final Option<java.lang.String> headURLs_PLAYFUL_PANDA = this.optionForKey(this.keys.headURLs_PLAYFUL_PANDA);
    private final Option<java.lang.String> headURLs_WEAK_PANDA = this.optionForKey(this.keys.headURLs_WEAK_PANDA);
    private final Option<java.lang.String> headURLs_WORRIED_PANDA = this.optionForKey(this.keys.headURLs_WORRIED_PANDA);
    private final Option<java.lang.String> headURLs_BLUE_PARROT = this.optionForKey(this.keys.headURLs_BLUE_PARROT);
    private final Option<java.lang.String> headURLs_GREEN_PARROT = this.optionForKey(this.keys.headURLs_GREEN_PARROT);
    private final Option<java.lang.String> headURLs_GRAY_PARROT = this.optionForKey(this.keys.headURLs_GRAY_PARROT);
    private final Option<java.lang.String> headURLs_RED_PARROT = this.optionForKey(this.keys.headURLs_RED_PARROT);
    private final Option<java.lang.String> headURLs_CYAN_PARROT = this.optionForKey(this.keys.headURLs_CYAN_PARROT);
    private final Option<java.lang.String> headURLs_PHANTOM = this.optionForKey(this.keys.headURLs_PHANTOM);
    private final Option<java.lang.String> headURLs_PIG = this.optionForKey(this.keys.headURLs_PIG);
    private final Option<java.lang.String> headURLs_PIGLIN_BRUTE = this.optionForKey(this.keys.headURLs_PIGLIN_BRUTE);
    private final Option<java.lang.String> headURLs_PILLAGER = this.optionForKey(this.keys.headURLs_PILLAGER);
    private final Option<java.lang.String> headURLs_POLAR_BEAR = this.optionForKey(this.keys.headURLs_POLAR_BEAR);
    private final Option<java.lang.String> headURLs_PUFFERFISH = this.optionForKey(this.keys.headURLs_PUFFERFISH);
    private final Option<java.lang.String> headURLs_BLACK_RABBIT = this.optionForKey(this.keys.headURLs_BLACK_RABBIT);
    private final Option<java.lang.String> headURLs_BROWN_RABBIT = this.optionForKey(this.keys.headURLs_BROWN_RABBIT);
    private final Option<java.lang.String> headURLs_KILLER_BUNNY = this.optionForKey(this.keys.headURLs_KILLER_BUNNY);
    private final Option<java.lang.String> headURLs_GOLD_RABBIT = this.optionForKey(this.keys.headURLs_GOLD_RABBIT);
    private final Option<java.lang.String> headURLs_SALT_PEPPER_RABBIT = this.optionForKey(this.keys.headURLs_SALT_PEPPER_RABBIT);
    private final Option<java.lang.String> headURLs_TOAST_RABBIT = this.optionForKey(this.keys.headURLs_TOAST_RABBIT);
    private final Option<java.lang.String> headURLs_WHITE_RABBIT = this.optionForKey(this.keys.headURLs_WHITE_RABBIT);
    private final Option<java.lang.String> headURLs_BLACK_WHITE_RABBIT = this.optionForKey(this.keys.headURLs_BLACK_WHITE_RABBIT);
    private final Option<java.lang.String> headURLs_RAVAGER = this.optionForKey(this.keys.headURLs_RAVAGER);
    private final Option<java.lang.String> headURLs_SALMON = this.optionForKey(this.keys.headURLs_SALMON);
    private final Option<java.lang.String> headURLs_SHULKER = this.optionForKey(this.keys.headURLs_SHULKER);
    private final Option<java.lang.String> headURLs_SILVERFISH = this.optionForKey(this.keys.headURLs_SILVERFISH);
    private final Option<java.lang.String> headURLs_SKELETON_HORSE = this.optionForKey(this.keys.headURLs_SKELETON_HORSE);
    private final Option<java.lang.String> headURLs_SLIME = this.optionForKey(this.keys.headURLs_SLIME);
    private final Option<java.lang.String> headURLs_SNIFFER = this.optionForKey(this.keys.headURLs_SNIFFER);
    private final Option<java.lang.String> headURLs_SNOW_GOLEM = this.optionForKey(this.keys.headURLs_SNOW_GOLEM);
    private final Option<java.lang.String> headURLs_SPIDER = this.optionForKey(this.keys.headURLs_SPIDER);
    private final Option<java.lang.String> headURLs_SQUID = this.optionForKey(this.keys.headURLs_SQUID);
    private final Option<java.lang.String> headURLs_STRAY = this.optionForKey(this.keys.headURLs_STRAY);
    private final Option<java.lang.String> headURLs_STRIDER = this.optionForKey(this.keys.headURLs_STRIDER);
    private final Option<java.lang.String> headURLs_TADPOLE = this.optionForKey(this.keys.headURLs_TADPOLE);
    private final Option<java.lang.String> headURLs_CREAMY_TRADER_LLAMA = this.optionForKey(this.keys.headURLs_CREAMY_TRADER_LLAMA);
    private final Option<java.lang.String> headURLs_WHITE_TRADER_LLAMA = this.optionForKey(this.keys.headURLs_WHITE_TRADER_LLAMA);
    private final Option<java.lang.String> headURLs_BROWN_TRADER_LLAMA = this.optionForKey(this.keys.headURLs_BROWN_TRADER_LLAMA);
    private final Option<java.lang.String> headURLs_GRAY_TRADER_LLAMA = this.optionForKey(this.keys.headURLs_GRAY_TRADER_LLAMA);
    private final Option<java.lang.String> headURLs_TROPICAL_FISH = this.optionForKey(this.keys.headURLs_TROPICAL_FISH);
    private final Option<java.lang.String> headURLs_TURTLE = this.optionForKey(this.keys.headURLs_TURTLE);
    private final Option<java.lang.String> headURLs_VEX = this.optionForKey(this.keys.headURLs_VEX);
    private final Option<java.lang.String> headURLs_CHARGING_VEX = this.optionForKey(this.keys.headURLs_CHARGING_VEX);
    private final Option<java.lang.String> headURLs_VILLAGER = this.optionForKey(this.keys.headURLs_VILLAGER);
    private final Option<java.lang.String> headURLs_ARMORER_VILLAGER = this.optionForKey(this.keys.headURLs_ARMORER_VILLAGER);
    private final Option<java.lang.String> headURLs_BUTCHER_VILLAGER = this.optionForKey(this.keys.headURLs_BUTCHER_VILLAGER);
    private final Option<java.lang.String> headURLs_CARTOGRAPHER_VILLAGER = this.optionForKey(this.keys.headURLs_CARTOGRAPHER_VILLAGER);
    private final Option<java.lang.String> headURLs_CLERIC_VILLAGER = this.optionForKey(this.keys.headURLs_CLERIC_VILLAGER);
    private final Option<java.lang.String> headURLs_FARMER_VILLAGER = this.optionForKey(this.keys.headURLs_FARMER_VILLAGER);
    private final Option<java.lang.String> headURLs_FISHERMAN_VILLAGER = this.optionForKey(this.keys.headURLs_FISHERMAN_VILLAGER);
    private final Option<java.lang.String> headURLs_FLETCHER_VILLAGER = this.optionForKey(this.keys.headURLs_FLETCHER_VILLAGER);
    private final Option<java.lang.String> headURLs_LIBRARIAN_VILLAGER = this.optionForKey(this.keys.headURLs_LIBRARIAN_VILLAGER);
    private final Option<java.lang.String> headURLs_SHEPHERD_VILLAGER = this.optionForKey(this.keys.headURLs_SHEPHERD_VILLAGER);
    private final Option<java.lang.String> headURLs_WEAPONSMITH_VILLAGER = this.optionForKey(this.keys.headURLs_WEAPONSMITH_VILLAGER);
    private final Option<java.lang.String> headURLs_VINDICATOR = this.optionForKey(this.keys.headURLs_VINDICATOR);
    private final Option<java.lang.String> headURLs_WANDERING_TRADER = this.optionForKey(this.keys.headURLs_WANDERING_TRADER);
    private final Option<java.lang.String> headURLs_WARDEN = this.optionForKey(this.keys.headURLs_WARDEN);
    private final Option<java.lang.String> headURLs_WITCH = this.optionForKey(this.keys.headURLs_WITCH);
    private final Option<java.lang.String> headURLs_WITHER = this.optionForKey(this.keys.headURLs_WITHER);
    private final Option<java.lang.String> headURLs_WITHER_PROJECTILE = this.optionForKey(this.keys.headURLs_WITHER_PROJECTILE);
    private final Option<java.lang.String> headURLs_BLUE_WITHER_PROJECTILE = this.optionForKey(this.keys.headURLs_BLUE_WITHER_PROJECTILE);
    private final Option<java.lang.String> headURLs_WOLF = this.optionForKey(this.keys.headURLs_WOLF);
    private final Option<java.lang.String> headURLs_ANGRY_WOLF = this.optionForKey(this.keys.headURLs_ANGRY_WOLF);
    private final Option<java.lang.String> headURLs_ZOGLIN = this.optionForKey(this.keys.headURLs_ZOGLIN);
    private final Option<java.lang.String> headURLs_ZOMBIE_HORSE = this.optionForKey(this.keys.headURLs_ZOMBIE_HORSE);
    private final Option<java.lang.String> headURLs_ZOMBIE_VILLAGER = this.optionForKey(this.keys.headURLs_ZOMBIE_VILLAGER);
    private final Option<java.lang.String> headURLs_ARMORER_ZOMBIE_VILLAGER = this.optionForKey(this.keys.headURLs_ARMORER_ZOMBIE_VILLAGER);
    private final Option<java.lang.String> headURLs_BUTCHER_ZOMBIE_VILLAGER = this.optionForKey(this.keys.headURLs_BUTCHER_ZOMBIE_VILLAGER);
    private final Option<java.lang.String> headURLs_CARTOGRAPHER_ZOMBIE_VILLAGER = this.optionForKey(this.keys.headURLs_CARTOGRAPHER_ZOMBIE_VILLAGER);
    private final Option<java.lang.String> headURLs_CLERIC_ZOMBIE_VILLAGER = this.optionForKey(this.keys.headURLs_CLERIC_ZOMBIE_VILLAGER);
    private final Option<java.lang.String> headURLs_FARMER_ZOMBIE_VILLAGER = this.optionForKey(this.keys.headURLs_FARMER_ZOMBIE_VILLAGER);
    private final Option<java.lang.String> headURLs_FISHERMAN_ZOMBIE_VILLAGER = this.optionForKey(this.keys.headURLs_FISHERMAN_ZOMBIE_VILLAGER);
    private final Option<java.lang.String> headURLs_FLETCHER_ZOMBIE_VILLAGER = this.optionForKey(this.keys.headURLs_FLETCHER_ZOMBIE_VILLAGER);
    private final Option<java.lang.String> headURLs_LIBRARIAN_ZOMBIE_VILLAGER = this.optionForKey(this.keys.headURLs_LIBRARIAN_ZOMBIE_VILLAGER);
    private final Option<java.lang.String> headURLs_SHEPHERD_ZOMBIE_VILLAGER = this.optionForKey(this.keys.headURLs_SHEPHERD_ZOMBIE_VILLAGER);
    private final Option<java.lang.String> headURLs_WEAPONSMITH_ZOMBIE_VILLAGER = this.optionForKey(this.keys.headURLs_WEAPONSMITH_ZOMBIE_VILLAGER);
    private final Option<java.lang.String> headURLs_ZOMBIFIED_PIGLIN = this.optionForKey(this.keys.headURLs_ZOMBIFIED_PIGLIN);

    private HeadedRewrittenConfig() {
        super(net.pedroricardo.content.HeadedRewrittenConfigModel.class);
    }

    private HeadedRewrittenConfig(Consumer<Jankson.Builder> janksonBuilder) {
        super(net.pedroricardo.content.HeadedRewrittenConfigModel.class, janksonBuilder);
    }

    public static HeadedRewrittenConfig createAndLoad() {
        var wrapper = new HeadedRewrittenConfig();
        wrapper.load();
        return wrapper;
    }

    public static HeadedRewrittenConfig createAndLoad(Consumer<Jankson.Builder> janksonBuilder) {
        var wrapper = new HeadedRewrittenConfig(janksonBuilder);
        wrapper.load();
        return wrapper;
    }

    public boolean chargedCreeperDrops() {
        return chargedCreeperDrops.value();
    }

    public void chargedCreeperDrops(boolean value) {
        chargedCreeperDrops.set(value);
    }

    public boolean changeHeadCollisions() {
        return changeHeadCollisions.value();
    }

    public void changeHeadCollisions(boolean value) {
        changeHeadCollisions.set(value);
    }

    public final HeadURLs_ headURLs = new HeadURLs_();
    public class HeadURLs_ implements HeadURLs {
        public java.lang.String WHITE_SHEEP() {
            return headURLs_WHITE_SHEEP.value();
        }

        public void WHITE_SHEEP(java.lang.String value) {
            headURLs_WHITE_SHEEP.set(value);
        }

        public java.lang.String ORANGE_SHEEP() {
            return headURLs_ORANGE_SHEEP.value();
        }

        public void ORANGE_SHEEP(java.lang.String value) {
            headURLs_ORANGE_SHEEP.set(value);
        }

        public java.lang.String MAGENTA_SHEEP() {
            return headURLs_MAGENTA_SHEEP.value();
        }

        public void MAGENTA_SHEEP(java.lang.String value) {
            headURLs_MAGENTA_SHEEP.set(value);
        }

        public java.lang.String LIGHT_BLUE_SHEEP() {
            return headURLs_LIGHT_BLUE_SHEEP.value();
        }

        public void LIGHT_BLUE_SHEEP(java.lang.String value) {
            headURLs_LIGHT_BLUE_SHEEP.set(value);
        }

        public java.lang.String YELLOW_SHEEP() {
            return headURLs_YELLOW_SHEEP.value();
        }

        public void YELLOW_SHEEP(java.lang.String value) {
            headURLs_YELLOW_SHEEP.set(value);
        }

        public java.lang.String LIME_SHEEP() {
            return headURLs_LIME_SHEEP.value();
        }

        public void LIME_SHEEP(java.lang.String value) {
            headURLs_LIME_SHEEP.set(value);
        }

        public java.lang.String PINK_SHEEP() {
            return headURLs_PINK_SHEEP.value();
        }

        public void PINK_SHEEP(java.lang.String value) {
            headURLs_PINK_SHEEP.set(value);
        }

        public java.lang.String GRAY_SHEEP() {
            return headURLs_GRAY_SHEEP.value();
        }

        public void GRAY_SHEEP(java.lang.String value) {
            headURLs_GRAY_SHEEP.set(value);
        }

        public java.lang.String LIGHT_GRAY_SHEEP() {
            return headURLs_LIGHT_GRAY_SHEEP.value();
        }

        public void LIGHT_GRAY_SHEEP(java.lang.String value) {
            headURLs_LIGHT_GRAY_SHEEP.set(value);
        }

        public java.lang.String CYAN_SHEEP() {
            return headURLs_CYAN_SHEEP.value();
        }

        public void CYAN_SHEEP(java.lang.String value) {
            headURLs_CYAN_SHEEP.set(value);
        }

        public java.lang.String PURPLE_SHEEP() {
            return headURLs_PURPLE_SHEEP.value();
        }

        public void PURPLE_SHEEP(java.lang.String value) {
            headURLs_PURPLE_SHEEP.set(value);
        }

        public java.lang.String BLUE_SHEEP() {
            return headURLs_BLUE_SHEEP.value();
        }

        public void BLUE_SHEEP(java.lang.String value) {
            headURLs_BLUE_SHEEP.set(value);
        }

        public java.lang.String BROWN_SHEEP() {
            return headURLs_BROWN_SHEEP.value();
        }

        public void BROWN_SHEEP(java.lang.String value) {
            headURLs_BROWN_SHEEP.set(value);
        }

        public java.lang.String GREEN_SHEEP() {
            return headURLs_GREEN_SHEEP.value();
        }

        public void GREEN_SHEEP(java.lang.String value) {
            headURLs_GREEN_SHEEP.set(value);
        }

        public java.lang.String RED_SHEEP() {
            return headURLs_RED_SHEEP.value();
        }

        public void RED_SHEEP(java.lang.String value) {
            headURLs_RED_SHEEP.set(value);
        }

        public java.lang.String BLACK_SHEEP() {
            return headURLs_BLACK_SHEEP.value();
        }

        public void BLACK_SHEEP(java.lang.String value) {
            headURLs_BLACK_SHEEP.set(value);
        }

        public java.lang.String JEB_SHEEP() {
            return headURLs_JEB_SHEEP.value();
        }

        public void JEB_SHEEP(java.lang.String value) {
            headURLs_JEB_SHEEP.set(value);
        }

        public java.lang.String ALLAY() {
            return headURLs_ALLAY.value();
        }

        public void ALLAY(java.lang.String value) {
            headURLs_ALLAY.set(value);
        }

        public java.lang.String LUCY_AXOLOTL() {
            return headURLs_LUCY_AXOLOTL.value();
        }

        public void LUCY_AXOLOTL(java.lang.String value) {
            headURLs_LUCY_AXOLOTL.set(value);
        }

        public java.lang.String WILD_AXOLOTL() {
            return headURLs_WILD_AXOLOTL.value();
        }

        public void WILD_AXOLOTL(java.lang.String value) {
            headURLs_WILD_AXOLOTL.set(value);
        }

        public java.lang.String GOLD_AXOLOTL() {
            return headURLs_GOLD_AXOLOTL.value();
        }

        public void GOLD_AXOLOTL(java.lang.String value) {
            headURLs_GOLD_AXOLOTL.set(value);
        }

        public java.lang.String CYAN_AXOLOTL() {
            return headURLs_CYAN_AXOLOTL.value();
        }

        public void CYAN_AXOLOTL(java.lang.String value) {
            headURLs_CYAN_AXOLOTL.set(value);
        }

        public java.lang.String BLUE_AXOLOTL() {
            return headURLs_BLUE_AXOLOTL.value();
        }

        public void BLUE_AXOLOTL(java.lang.String value) {
            headURLs_BLUE_AXOLOTL.set(value);
        }

        public java.lang.String BAT() {
            return headURLs_BAT.value();
        }

        public void BAT(java.lang.String value) {
            headURLs_BAT.set(value);
        }

        public java.lang.String BEE() {
            return headURLs_BEE.value();
        }

        public void BEE(java.lang.String value) {
            headURLs_BEE.set(value);
        }

        public java.lang.String POLLINATED_BEE() {
            return headURLs_POLLINATED_BEE.value();
        }

        public void POLLINATED_BEE(java.lang.String value) {
            headURLs_POLLINATED_BEE.set(value);
        }

        public java.lang.String ANGRY_BEE() {
            return headURLs_ANGRY_BEE.value();
        }

        public void ANGRY_BEE(java.lang.String value) {
            headURLs_ANGRY_BEE.set(value);
        }

        public java.lang.String ANGRY_POLLINATED_BEE() {
            return headURLs_ANGRY_POLLINATED_BEE.value();
        }

        public void ANGRY_POLLINATED_BEE(java.lang.String value) {
            headURLs_ANGRY_POLLINATED_BEE.set(value);
        }

        public java.lang.String BLAZE() {
            return headURLs_BLAZE.value();
        }

        public void BLAZE(java.lang.String value) {
            headURLs_BLAZE.set(value);
        }

        public java.lang.String BREEZE() {
            return headURLs_BREEZE.value();
        }

        public void BREEZE(java.lang.String value) {
            headURLs_BREEZE.set(value);
        }

        public java.lang.String CAMEL() {
            return headURLs_CAMEL.value();
        }

        public void CAMEL(java.lang.String value) {
            headURLs_CAMEL.set(value);
        }

        public java.lang.String ALL_BLACK_CAT() {
            return headURLs_ALL_BLACK_CAT.value();
        }

        public void ALL_BLACK_CAT(java.lang.String value) {
            headURLs_ALL_BLACK_CAT.set(value);
        }

        public java.lang.String BLACK_CAT() {
            return headURLs_BLACK_CAT.value();
        }

        public void BLACK_CAT(java.lang.String value) {
            headURLs_BLACK_CAT.set(value);
        }

        public java.lang.String BRITISH_SHORTHAIR_CAT() {
            return headURLs_BRITISH_SHORTHAIR_CAT.value();
        }

        public void BRITISH_SHORTHAIR_CAT(java.lang.String value) {
            headURLs_BRITISH_SHORTHAIR_CAT.set(value);
        }

        public java.lang.String CALICO_CAT() {
            return headURLs_CALICO_CAT.value();
        }

        public void CALICO_CAT(java.lang.String value) {
            headURLs_CALICO_CAT.set(value);
        }

        public java.lang.String JELLIE_CAT() {
            return headURLs_JELLIE_CAT.value();
        }

        public void JELLIE_CAT(java.lang.String value) {
            headURLs_JELLIE_CAT.set(value);
        }

        public java.lang.String PERSIAN_CAT() {
            return headURLs_PERSIAN_CAT.value();
        }

        public void PERSIAN_CAT(java.lang.String value) {
            headURLs_PERSIAN_CAT.set(value);
        }

        public java.lang.String RAGDOLL_CAT() {
            return headURLs_RAGDOLL_CAT.value();
        }

        public void RAGDOLL_CAT(java.lang.String value) {
            headURLs_RAGDOLL_CAT.set(value);
        }

        public java.lang.String RED_CAT() {
            return headURLs_RED_CAT.value();
        }

        public void RED_CAT(java.lang.String value) {
            headURLs_RED_CAT.set(value);
        }

        public java.lang.String SIAMESE_CAT() {
            return headURLs_SIAMESE_CAT.value();
        }

        public void SIAMESE_CAT(java.lang.String value) {
            headURLs_SIAMESE_CAT.set(value);
        }

        public java.lang.String TABBY_CAT() {
            return headURLs_TABBY_CAT.value();
        }

        public void TABBY_CAT(java.lang.String value) {
            headURLs_TABBY_CAT.set(value);
        }

        public java.lang.String WHITE_CAT() {
            return headURLs_WHITE_CAT.value();
        }

        public void WHITE_CAT(java.lang.String value) {
            headURLs_WHITE_CAT.set(value);
        }

        public java.lang.String CAVE_SPIDER() {
            return headURLs_CAVE_SPIDER.value();
        }

        public void CAVE_SPIDER(java.lang.String value) {
            headURLs_CAVE_SPIDER.set(value);
        }

        public java.lang.String CHICKEN() {
            return headURLs_CHICKEN.value();
        }

        public void CHICKEN(java.lang.String value) {
            headURLs_CHICKEN.set(value);
        }

        public java.lang.String COD() {
            return headURLs_COD.value();
        }

        public void COD(java.lang.String value) {
            headURLs_COD.set(value);
        }

        public java.lang.String COW() {
            return headURLs_COW.value();
        }

        public void COW(java.lang.String value) {
            headURLs_COW.set(value);
        }

        public java.lang.String DOLPHIN() {
            return headURLs_DOLPHIN.value();
        }

        public void DOLPHIN(java.lang.String value) {
            headURLs_DOLPHIN.set(value);
        }

        public java.lang.String DONKEY() {
            return headURLs_DONKEY.value();
        }

        public void DONKEY(java.lang.String value) {
            headURLs_DONKEY.set(value);
        }

        public java.lang.String DROWNED() {
            return headURLs_DROWNED.value();
        }

        public void DROWNED(java.lang.String value) {
            headURLs_DROWNED.set(value);
        }

        public java.lang.String ELDER_GUARDIAN() {
            return headURLs_ELDER_GUARDIAN.value();
        }

        public void ELDER_GUARDIAN(java.lang.String value) {
            headURLs_ELDER_GUARDIAN.set(value);
        }

        public java.lang.String ENDERMAN() {
            return headURLs_ENDERMAN.value();
        }

        public void ENDERMAN(java.lang.String value) {
            headURLs_ENDERMAN.set(value);
        }

        public java.lang.String ENDERMITE() {
            return headURLs_ENDERMITE.value();
        }

        public void ENDERMITE(java.lang.String value) {
            headURLs_ENDERMITE.set(value);
        }

        public java.lang.String EVOKER() {
            return headURLs_EVOKER.value();
        }

        public void EVOKER(java.lang.String value) {
            headURLs_EVOKER.set(value);
        }

        public java.lang.String FOX() {
            return headURLs_FOX.value();
        }

        public void FOX(java.lang.String value) {
            headURLs_FOX.set(value);
        }

        public java.lang.String SNOW_FOX() {
            return headURLs_SNOW_FOX.value();
        }

        public void SNOW_FOX(java.lang.String value) {
            headURLs_SNOW_FOX.set(value);
        }

        public java.lang.String COLD_FROG() {
            return headURLs_COLD_FROG.value();
        }

        public void COLD_FROG(java.lang.String value) {
            headURLs_COLD_FROG.set(value);
        }

        public java.lang.String TEMPERATE_FROG() {
            return headURLs_TEMPERATE_FROG.value();
        }

        public void TEMPERATE_FROG(java.lang.String value) {
            headURLs_TEMPERATE_FROG.set(value);
        }

        public java.lang.String WARM_FROG() {
            return headURLs_WARM_FROG.value();
        }

        public void WARM_FROG(java.lang.String value) {
            headURLs_WARM_FROG.set(value);
        }

        public java.lang.String GHAST() {
            return headURLs_GHAST.value();
        }

        public void GHAST(java.lang.String value) {
            headURLs_GHAST.set(value);
        }

        public java.lang.String GLOW_SQUID() {
            return headURLs_GLOW_SQUID.value();
        }

        public void GLOW_SQUID(java.lang.String value) {
            headURLs_GLOW_SQUID.set(value);
        }

        public java.lang.String GOAT() {
            return headURLs_GOAT.value();
        }

        public void GOAT(java.lang.String value) {
            headURLs_GOAT.set(value);
        }

        public java.lang.String GUARDIAN() {
            return headURLs_GUARDIAN.value();
        }

        public void GUARDIAN(java.lang.String value) {
            headURLs_GUARDIAN.set(value);
        }

        public java.lang.String HOGLIN() {
            return headURLs_HOGLIN.value();
        }

        public void HOGLIN(java.lang.String value) {
            headURLs_HOGLIN.set(value);
        }

        public java.lang.String WHITE_HORSE() {
            return headURLs_WHITE_HORSE.value();
        }

        public void WHITE_HORSE(java.lang.String value) {
            headURLs_WHITE_HORSE.set(value);
        }

        public java.lang.String CREAMY_HORSE() {
            return headURLs_CREAMY_HORSE.value();
        }

        public void CREAMY_HORSE(java.lang.String value) {
            headURLs_CREAMY_HORSE.set(value);
        }

        public java.lang.String CHESTNUT_HORSE() {
            return headURLs_CHESTNUT_HORSE.value();
        }

        public void CHESTNUT_HORSE(java.lang.String value) {
            headURLs_CHESTNUT_HORSE.set(value);
        }

        public java.lang.String BROWN_HORSE() {
            return headURLs_BROWN_HORSE.value();
        }

        public void BROWN_HORSE(java.lang.String value) {
            headURLs_BROWN_HORSE.set(value);
        }

        public java.lang.String BLACK_HORSE() {
            return headURLs_BLACK_HORSE.value();
        }

        public void BLACK_HORSE(java.lang.String value) {
            headURLs_BLACK_HORSE.set(value);
        }

        public java.lang.String GRAY_HORSE() {
            return headURLs_GRAY_HORSE.value();
        }

        public void GRAY_HORSE(java.lang.String value) {
            headURLs_GRAY_HORSE.set(value);
        }

        public java.lang.String DARK_BROWN_HORSE() {
            return headURLs_DARK_BROWN_HORSE.value();
        }

        public void DARK_BROWN_HORSE(java.lang.String value) {
            headURLs_DARK_BROWN_HORSE.set(value);
        }

        public java.lang.String HUSK() {
            return headURLs_HUSK.value();
        }

        public void HUSK(java.lang.String value) {
            headURLs_HUSK.set(value);
        }

        public java.lang.String ILLUSIONER() {
            return headURLs_ILLUSIONER.value();
        }

        public void ILLUSIONER(java.lang.String value) {
            headURLs_ILLUSIONER.set(value);
        }

        public java.lang.String IRON_GOLEM() {
            return headURLs_IRON_GOLEM.value();
        }

        public void IRON_GOLEM(java.lang.String value) {
            headURLs_IRON_GOLEM.set(value);
        }

        public java.lang.String CREAMY_LLAMA() {
            return headURLs_CREAMY_LLAMA.value();
        }

        public void CREAMY_LLAMA(java.lang.String value) {
            headURLs_CREAMY_LLAMA.set(value);
        }

        public java.lang.String WHITE_LLAMA() {
            return headURLs_WHITE_LLAMA.value();
        }

        public void WHITE_LLAMA(java.lang.String value) {
            headURLs_WHITE_LLAMA.set(value);
        }

        public java.lang.String BROWN_LLAMA() {
            return headURLs_BROWN_LLAMA.value();
        }

        public void BROWN_LLAMA(java.lang.String value) {
            headURLs_BROWN_LLAMA.set(value);
        }

        public java.lang.String GRAY_LLAMA() {
            return headURLs_GRAY_LLAMA.value();
        }

        public void GRAY_LLAMA(java.lang.String value) {
            headURLs_GRAY_LLAMA.set(value);
        }

        public java.lang.String MAGMA_CUBE() {
            return headURLs_MAGMA_CUBE.value();
        }

        public void MAGMA_CUBE(java.lang.String value) {
            headURLs_MAGMA_CUBE.set(value);
        }

        public java.lang.String RED_MOOSHROOM() {
            return headURLs_RED_MOOSHROOM.value();
        }

        public void RED_MOOSHROOM(java.lang.String value) {
            headURLs_RED_MOOSHROOM.set(value);
        }

        public java.lang.String BROWN_MOOSHROOM() {
            return headURLs_BROWN_MOOSHROOM.value();
        }

        public void BROWN_MOOSHROOM(java.lang.String value) {
            headURLs_BROWN_MOOSHROOM.set(value);
        }

        public java.lang.String MULE() {
            return headURLs_MULE.value();
        }

        public void MULE(java.lang.String value) {
            headURLs_MULE.set(value);
        }

        public java.lang.String OCELOT() {
            return headURLs_OCELOT.value();
        }

        public void OCELOT(java.lang.String value) {
            headURLs_OCELOT.set(value);
        }

        public java.lang.String AGGRESSIVE_PANDA() {
            return headURLs_AGGRESSIVE_PANDA.value();
        }

        public void AGGRESSIVE_PANDA(java.lang.String value) {
            headURLs_AGGRESSIVE_PANDA.set(value);
        }

        public java.lang.String BROWN_PANDA() {
            return headURLs_BROWN_PANDA.value();
        }

        public void BROWN_PANDA(java.lang.String value) {
            headURLs_BROWN_PANDA.set(value);
        }

        public java.lang.String LAZY_PANDA() {
            return headURLs_LAZY_PANDA.value();
        }

        public void LAZY_PANDA(java.lang.String value) {
            headURLs_LAZY_PANDA.set(value);
        }

        public java.lang.String PANDA() {
            return headURLs_PANDA.value();
        }

        public void PANDA(java.lang.String value) {
            headURLs_PANDA.set(value);
        }

        public java.lang.String PLAYFUL_PANDA() {
            return headURLs_PLAYFUL_PANDA.value();
        }

        public void PLAYFUL_PANDA(java.lang.String value) {
            headURLs_PLAYFUL_PANDA.set(value);
        }

        public java.lang.String WEAK_PANDA() {
            return headURLs_WEAK_PANDA.value();
        }

        public void WEAK_PANDA(java.lang.String value) {
            headURLs_WEAK_PANDA.set(value);
        }

        public java.lang.String WORRIED_PANDA() {
            return headURLs_WORRIED_PANDA.value();
        }

        public void WORRIED_PANDA(java.lang.String value) {
            headURLs_WORRIED_PANDA.set(value);
        }

        public java.lang.String BLUE_PARROT() {
            return headURLs_BLUE_PARROT.value();
        }

        public void BLUE_PARROT(java.lang.String value) {
            headURLs_BLUE_PARROT.set(value);
        }

        public java.lang.String GREEN_PARROT() {
            return headURLs_GREEN_PARROT.value();
        }

        public void GREEN_PARROT(java.lang.String value) {
            headURLs_GREEN_PARROT.set(value);
        }

        public java.lang.String GRAY_PARROT() {
            return headURLs_GRAY_PARROT.value();
        }

        public void GRAY_PARROT(java.lang.String value) {
            headURLs_GRAY_PARROT.set(value);
        }

        public java.lang.String RED_PARROT() {
            return headURLs_RED_PARROT.value();
        }

        public void RED_PARROT(java.lang.String value) {
            headURLs_RED_PARROT.set(value);
        }

        public java.lang.String CYAN_PARROT() {
            return headURLs_CYAN_PARROT.value();
        }

        public void CYAN_PARROT(java.lang.String value) {
            headURLs_CYAN_PARROT.set(value);
        }

        public java.lang.String PHANTOM() {
            return headURLs_PHANTOM.value();
        }

        public void PHANTOM(java.lang.String value) {
            headURLs_PHANTOM.set(value);
        }

        public java.lang.String PIG() {
            return headURLs_PIG.value();
        }

        public void PIG(java.lang.String value) {
            headURLs_PIG.set(value);
        }

        public java.lang.String PIGLIN_BRUTE() {
            return headURLs_PIGLIN_BRUTE.value();
        }

        public void PIGLIN_BRUTE(java.lang.String value) {
            headURLs_PIGLIN_BRUTE.set(value);
        }

        public java.lang.String PILLAGER() {
            return headURLs_PILLAGER.value();
        }

        public void PILLAGER(java.lang.String value) {
            headURLs_PILLAGER.set(value);
        }

        public java.lang.String POLAR_BEAR() {
            return headURLs_POLAR_BEAR.value();
        }

        public void POLAR_BEAR(java.lang.String value) {
            headURLs_POLAR_BEAR.set(value);
        }

        public java.lang.String PUFFERFISH() {
            return headURLs_PUFFERFISH.value();
        }

        public void PUFFERFISH(java.lang.String value) {
            headURLs_PUFFERFISH.set(value);
        }

        public java.lang.String BLACK_RABBIT() {
            return headURLs_BLACK_RABBIT.value();
        }

        public void BLACK_RABBIT(java.lang.String value) {
            headURLs_BLACK_RABBIT.set(value);
        }

        public java.lang.String BROWN_RABBIT() {
            return headURLs_BROWN_RABBIT.value();
        }

        public void BROWN_RABBIT(java.lang.String value) {
            headURLs_BROWN_RABBIT.set(value);
        }

        public java.lang.String KILLER_BUNNY() {
            return headURLs_KILLER_BUNNY.value();
        }

        public void KILLER_BUNNY(java.lang.String value) {
            headURLs_KILLER_BUNNY.set(value);
        }

        public java.lang.String GOLD_RABBIT() {
            return headURLs_GOLD_RABBIT.value();
        }

        public void GOLD_RABBIT(java.lang.String value) {
            headURLs_GOLD_RABBIT.set(value);
        }

        public java.lang.String SALT_PEPPER_RABBIT() {
            return headURLs_SALT_PEPPER_RABBIT.value();
        }

        public void SALT_PEPPER_RABBIT(java.lang.String value) {
            headURLs_SALT_PEPPER_RABBIT.set(value);
        }

        public java.lang.String TOAST_RABBIT() {
            return headURLs_TOAST_RABBIT.value();
        }

        public void TOAST_RABBIT(java.lang.String value) {
            headURLs_TOAST_RABBIT.set(value);
        }

        public java.lang.String WHITE_RABBIT() {
            return headURLs_WHITE_RABBIT.value();
        }

        public void WHITE_RABBIT(java.lang.String value) {
            headURLs_WHITE_RABBIT.set(value);
        }

        public java.lang.String BLACK_WHITE_RABBIT() {
            return headURLs_BLACK_WHITE_RABBIT.value();
        }

        public void BLACK_WHITE_RABBIT(java.lang.String value) {
            headURLs_BLACK_WHITE_RABBIT.set(value);
        }

        public java.lang.String RAVAGER() {
            return headURLs_RAVAGER.value();
        }

        public void RAVAGER(java.lang.String value) {
            headURLs_RAVAGER.set(value);
        }

        public java.lang.String SALMON() {
            return headURLs_SALMON.value();
        }

        public void SALMON(java.lang.String value) {
            headURLs_SALMON.set(value);
        }

        public java.lang.String SHULKER() {
            return headURLs_SHULKER.value();
        }

        public void SHULKER(java.lang.String value) {
            headURLs_SHULKER.set(value);
        }

        public java.lang.String SILVERFISH() {
            return headURLs_SILVERFISH.value();
        }

        public void SILVERFISH(java.lang.String value) {
            headURLs_SILVERFISH.set(value);
        }

        public java.lang.String SKELETON_HORSE() {
            return headURLs_SKELETON_HORSE.value();
        }

        public void SKELETON_HORSE(java.lang.String value) {
            headURLs_SKELETON_HORSE.set(value);
        }

        public java.lang.String SLIME() {
            return headURLs_SLIME.value();
        }

        public void SLIME(java.lang.String value) {
            headURLs_SLIME.set(value);
        }

        public java.lang.String SNIFFER() {
            return headURLs_SNIFFER.value();
        }

        public void SNIFFER(java.lang.String value) {
            headURLs_SNIFFER.set(value);
        }

        public java.lang.String SNOW_GOLEM() {
            return headURLs_SNOW_GOLEM.value();
        }

        public void SNOW_GOLEM(java.lang.String value) {
            headURLs_SNOW_GOLEM.set(value);
        }

        public java.lang.String SPIDER() {
            return headURLs_SPIDER.value();
        }

        public void SPIDER(java.lang.String value) {
            headURLs_SPIDER.set(value);
        }

        public java.lang.String SQUID() {
            return headURLs_SQUID.value();
        }

        public void SQUID(java.lang.String value) {
            headURLs_SQUID.set(value);
        }

        public java.lang.String STRAY() {
            return headURLs_STRAY.value();
        }

        public void STRAY(java.lang.String value) {
            headURLs_STRAY.set(value);
        }

        public java.lang.String STRIDER() {
            return headURLs_STRIDER.value();
        }

        public void STRIDER(java.lang.String value) {
            headURLs_STRIDER.set(value);
        }

        public java.lang.String TADPOLE() {
            return headURLs_TADPOLE.value();
        }

        public void TADPOLE(java.lang.String value) {
            headURLs_TADPOLE.set(value);
        }

        public java.lang.String CREAMY_TRADER_LLAMA() {
            return headURLs_CREAMY_TRADER_LLAMA.value();
        }

        public void CREAMY_TRADER_LLAMA(java.lang.String value) {
            headURLs_CREAMY_TRADER_LLAMA.set(value);
        }

        public java.lang.String WHITE_TRADER_LLAMA() {
            return headURLs_WHITE_TRADER_LLAMA.value();
        }

        public void WHITE_TRADER_LLAMA(java.lang.String value) {
            headURLs_WHITE_TRADER_LLAMA.set(value);
        }

        public java.lang.String BROWN_TRADER_LLAMA() {
            return headURLs_BROWN_TRADER_LLAMA.value();
        }

        public void BROWN_TRADER_LLAMA(java.lang.String value) {
            headURLs_BROWN_TRADER_LLAMA.set(value);
        }

        public java.lang.String GRAY_TRADER_LLAMA() {
            return headURLs_GRAY_TRADER_LLAMA.value();
        }

        public void GRAY_TRADER_LLAMA(java.lang.String value) {
            headURLs_GRAY_TRADER_LLAMA.set(value);
        }

        public java.lang.String TROPICAL_FISH() {
            return headURLs_TROPICAL_FISH.value();
        }

        public void TROPICAL_FISH(java.lang.String value) {
            headURLs_TROPICAL_FISH.set(value);
        }

        public java.lang.String TURTLE() {
            return headURLs_TURTLE.value();
        }

        public void TURTLE(java.lang.String value) {
            headURLs_TURTLE.set(value);
        }

        public java.lang.String VEX() {
            return headURLs_VEX.value();
        }

        public void VEX(java.lang.String value) {
            headURLs_VEX.set(value);
        }

        public java.lang.String CHARGING_VEX() {
            return headURLs_CHARGING_VEX.value();
        }

        public void CHARGING_VEX(java.lang.String value) {
            headURLs_CHARGING_VEX.set(value);
        }

        public java.lang.String VILLAGER() {
            return headURLs_VILLAGER.value();
        }

        public void VILLAGER(java.lang.String value) {
            headURLs_VILLAGER.set(value);
        }

        public java.lang.String ARMORER_VILLAGER() {
            return headURLs_ARMORER_VILLAGER.value();
        }

        public void ARMORER_VILLAGER(java.lang.String value) {
            headURLs_ARMORER_VILLAGER.set(value);
        }

        public java.lang.String BUTCHER_VILLAGER() {
            return headURLs_BUTCHER_VILLAGER.value();
        }

        public void BUTCHER_VILLAGER(java.lang.String value) {
            headURLs_BUTCHER_VILLAGER.set(value);
        }

        public java.lang.String CARTOGRAPHER_VILLAGER() {
            return headURLs_CARTOGRAPHER_VILLAGER.value();
        }

        public void CARTOGRAPHER_VILLAGER(java.lang.String value) {
            headURLs_CARTOGRAPHER_VILLAGER.set(value);
        }

        public java.lang.String CLERIC_VILLAGER() {
            return headURLs_CLERIC_VILLAGER.value();
        }

        public void CLERIC_VILLAGER(java.lang.String value) {
            headURLs_CLERIC_VILLAGER.set(value);
        }

        public java.lang.String FARMER_VILLAGER() {
            return headURLs_FARMER_VILLAGER.value();
        }

        public void FARMER_VILLAGER(java.lang.String value) {
            headURLs_FARMER_VILLAGER.set(value);
        }

        public java.lang.String FISHERMAN_VILLAGER() {
            return headURLs_FISHERMAN_VILLAGER.value();
        }

        public void FISHERMAN_VILLAGER(java.lang.String value) {
            headURLs_FISHERMAN_VILLAGER.set(value);
        }

        public java.lang.String FLETCHER_VILLAGER() {
            return headURLs_FLETCHER_VILLAGER.value();
        }

        public void FLETCHER_VILLAGER(java.lang.String value) {
            headURLs_FLETCHER_VILLAGER.set(value);
        }

        public java.lang.String LIBRARIAN_VILLAGER() {
            return headURLs_LIBRARIAN_VILLAGER.value();
        }

        public void LIBRARIAN_VILLAGER(java.lang.String value) {
            headURLs_LIBRARIAN_VILLAGER.set(value);
        }

        public java.lang.String SHEPHERD_VILLAGER() {
            return headURLs_SHEPHERD_VILLAGER.value();
        }

        public void SHEPHERD_VILLAGER(java.lang.String value) {
            headURLs_SHEPHERD_VILLAGER.set(value);
        }

        public java.lang.String WEAPONSMITH_VILLAGER() {
            return headURLs_WEAPONSMITH_VILLAGER.value();
        }

        public void WEAPONSMITH_VILLAGER(java.lang.String value) {
            headURLs_WEAPONSMITH_VILLAGER.set(value);
        }

        public java.lang.String VINDICATOR() {
            return headURLs_VINDICATOR.value();
        }

        public void VINDICATOR(java.lang.String value) {
            headURLs_VINDICATOR.set(value);
        }

        public java.lang.String WANDERING_TRADER() {
            return headURLs_WANDERING_TRADER.value();
        }

        public void WANDERING_TRADER(java.lang.String value) {
            headURLs_WANDERING_TRADER.set(value);
        }

        public java.lang.String WARDEN() {
            return headURLs_WARDEN.value();
        }

        public void WARDEN(java.lang.String value) {
            headURLs_WARDEN.set(value);
        }

        public java.lang.String WITCH() {
            return headURLs_WITCH.value();
        }

        public void WITCH(java.lang.String value) {
            headURLs_WITCH.set(value);
        }

        public java.lang.String WITHER() {
            return headURLs_WITHER.value();
        }

        public void WITHER(java.lang.String value) {
            headURLs_WITHER.set(value);
        }

        public java.lang.String WITHER_PROJECTILE() {
            return headURLs_WITHER_PROJECTILE.value();
        }

        public void WITHER_PROJECTILE(java.lang.String value) {
            headURLs_WITHER_PROJECTILE.set(value);
        }

        public java.lang.String BLUE_WITHER_PROJECTILE() {
            return headURLs_BLUE_WITHER_PROJECTILE.value();
        }

        public void BLUE_WITHER_PROJECTILE(java.lang.String value) {
            headURLs_BLUE_WITHER_PROJECTILE.set(value);
        }

        public java.lang.String WOLF() {
            return headURLs_WOLF.value();
        }

        public void WOLF(java.lang.String value) {
            headURLs_WOLF.set(value);
        }

        public java.lang.String ANGRY_WOLF() {
            return headURLs_ANGRY_WOLF.value();
        }

        public void ANGRY_WOLF(java.lang.String value) {
            headURLs_ANGRY_WOLF.set(value);
        }

        public java.lang.String ZOGLIN() {
            return headURLs_ZOGLIN.value();
        }

        public void ZOGLIN(java.lang.String value) {
            headURLs_ZOGLIN.set(value);
        }

        public java.lang.String ZOMBIE_HORSE() {
            return headURLs_ZOMBIE_HORSE.value();
        }

        public void ZOMBIE_HORSE(java.lang.String value) {
            headURLs_ZOMBIE_HORSE.set(value);
        }

        public java.lang.String ZOMBIE_VILLAGER() {
            return headURLs_ZOMBIE_VILLAGER.value();
        }

        public void ZOMBIE_VILLAGER(java.lang.String value) {
            headURLs_ZOMBIE_VILLAGER.set(value);
        }

        public java.lang.String ARMORER_ZOMBIE_VILLAGER() {
            return headURLs_ARMORER_ZOMBIE_VILLAGER.value();
        }

        public void ARMORER_ZOMBIE_VILLAGER(java.lang.String value) {
            headURLs_ARMORER_ZOMBIE_VILLAGER.set(value);
        }

        public java.lang.String BUTCHER_ZOMBIE_VILLAGER() {
            return headURLs_BUTCHER_ZOMBIE_VILLAGER.value();
        }

        public void BUTCHER_ZOMBIE_VILLAGER(java.lang.String value) {
            headURLs_BUTCHER_ZOMBIE_VILLAGER.set(value);
        }

        public java.lang.String CARTOGRAPHER_ZOMBIE_VILLAGER() {
            return headURLs_CARTOGRAPHER_ZOMBIE_VILLAGER.value();
        }

        public void CARTOGRAPHER_ZOMBIE_VILLAGER(java.lang.String value) {
            headURLs_CARTOGRAPHER_ZOMBIE_VILLAGER.set(value);
        }

        public java.lang.String CLERIC_ZOMBIE_VILLAGER() {
            return headURLs_CLERIC_ZOMBIE_VILLAGER.value();
        }

        public void CLERIC_ZOMBIE_VILLAGER(java.lang.String value) {
            headURLs_CLERIC_ZOMBIE_VILLAGER.set(value);
        }

        public java.lang.String FARMER_ZOMBIE_VILLAGER() {
            return headURLs_FARMER_ZOMBIE_VILLAGER.value();
        }

        public void FARMER_ZOMBIE_VILLAGER(java.lang.String value) {
            headURLs_FARMER_ZOMBIE_VILLAGER.set(value);
        }

        public java.lang.String FISHERMAN_ZOMBIE_VILLAGER() {
            return headURLs_FISHERMAN_ZOMBIE_VILLAGER.value();
        }

        public void FISHERMAN_ZOMBIE_VILLAGER(java.lang.String value) {
            headURLs_FISHERMAN_ZOMBIE_VILLAGER.set(value);
        }

        public java.lang.String FLETCHER_ZOMBIE_VILLAGER() {
            return headURLs_FLETCHER_ZOMBIE_VILLAGER.value();
        }

        public void FLETCHER_ZOMBIE_VILLAGER(java.lang.String value) {
            headURLs_FLETCHER_ZOMBIE_VILLAGER.set(value);
        }

        public java.lang.String LIBRARIAN_ZOMBIE_VILLAGER() {
            return headURLs_LIBRARIAN_ZOMBIE_VILLAGER.value();
        }

        public void LIBRARIAN_ZOMBIE_VILLAGER(java.lang.String value) {
            headURLs_LIBRARIAN_ZOMBIE_VILLAGER.set(value);
        }

        public java.lang.String SHEPHERD_ZOMBIE_VILLAGER() {
            return headURLs_SHEPHERD_ZOMBIE_VILLAGER.value();
        }

        public void SHEPHERD_ZOMBIE_VILLAGER(java.lang.String value) {
            headURLs_SHEPHERD_ZOMBIE_VILLAGER.set(value);
        }

        public java.lang.String WEAPONSMITH_ZOMBIE_VILLAGER() {
            return headURLs_WEAPONSMITH_ZOMBIE_VILLAGER.value();
        }

        public void WEAPONSMITH_ZOMBIE_VILLAGER(java.lang.String value) {
            headURLs_WEAPONSMITH_ZOMBIE_VILLAGER.set(value);
        }

        public java.lang.String ZOMBIFIED_PIGLIN() {
            return headURLs_ZOMBIFIED_PIGLIN.value();
        }

        public void ZOMBIFIED_PIGLIN(java.lang.String value) {
            headURLs_ZOMBIFIED_PIGLIN.set(value);
        }

    }
    public interface HeadURLs {
        java.lang.String WHITE_SHEEP();
        void WHITE_SHEEP(java.lang.String value);
        java.lang.String ORANGE_SHEEP();
        void ORANGE_SHEEP(java.lang.String value);
        java.lang.String MAGENTA_SHEEP();
        void MAGENTA_SHEEP(java.lang.String value);
        java.lang.String LIGHT_BLUE_SHEEP();
        void LIGHT_BLUE_SHEEP(java.lang.String value);
        java.lang.String YELLOW_SHEEP();
        void YELLOW_SHEEP(java.lang.String value);
        java.lang.String LIME_SHEEP();
        void LIME_SHEEP(java.lang.String value);
        java.lang.String PINK_SHEEP();
        void PINK_SHEEP(java.lang.String value);
        java.lang.String GRAY_SHEEP();
        void GRAY_SHEEP(java.lang.String value);
        java.lang.String LIGHT_GRAY_SHEEP();
        void LIGHT_GRAY_SHEEP(java.lang.String value);
        java.lang.String CYAN_SHEEP();
        void CYAN_SHEEP(java.lang.String value);
        java.lang.String PURPLE_SHEEP();
        void PURPLE_SHEEP(java.lang.String value);
        java.lang.String BLUE_SHEEP();
        void BLUE_SHEEP(java.lang.String value);
        java.lang.String BROWN_SHEEP();
        void BROWN_SHEEP(java.lang.String value);
        java.lang.String GREEN_SHEEP();
        void GREEN_SHEEP(java.lang.String value);
        java.lang.String RED_SHEEP();
        void RED_SHEEP(java.lang.String value);
        java.lang.String BLACK_SHEEP();
        void BLACK_SHEEP(java.lang.String value);
        java.lang.String JEB_SHEEP();
        void JEB_SHEEP(java.lang.String value);
        java.lang.String ALLAY();
        void ALLAY(java.lang.String value);
        java.lang.String LUCY_AXOLOTL();
        void LUCY_AXOLOTL(java.lang.String value);
        java.lang.String WILD_AXOLOTL();
        void WILD_AXOLOTL(java.lang.String value);
        java.lang.String GOLD_AXOLOTL();
        void GOLD_AXOLOTL(java.lang.String value);
        java.lang.String CYAN_AXOLOTL();
        void CYAN_AXOLOTL(java.lang.String value);
        java.lang.String BLUE_AXOLOTL();
        void BLUE_AXOLOTL(java.lang.String value);
        java.lang.String BAT();
        void BAT(java.lang.String value);
        java.lang.String BEE();
        void BEE(java.lang.String value);
        java.lang.String POLLINATED_BEE();
        void POLLINATED_BEE(java.lang.String value);
        java.lang.String ANGRY_BEE();
        void ANGRY_BEE(java.lang.String value);
        java.lang.String ANGRY_POLLINATED_BEE();
        void ANGRY_POLLINATED_BEE(java.lang.String value);
        java.lang.String BLAZE();
        void BLAZE(java.lang.String value);
        java.lang.String BREEZE();
        void BREEZE(java.lang.String value);
        java.lang.String CAMEL();
        void CAMEL(java.lang.String value);
        java.lang.String ALL_BLACK_CAT();
        void ALL_BLACK_CAT(java.lang.String value);
        java.lang.String BLACK_CAT();
        void BLACK_CAT(java.lang.String value);
        java.lang.String BRITISH_SHORTHAIR_CAT();
        void BRITISH_SHORTHAIR_CAT(java.lang.String value);
        java.lang.String CALICO_CAT();
        void CALICO_CAT(java.lang.String value);
        java.lang.String JELLIE_CAT();
        void JELLIE_CAT(java.lang.String value);
        java.lang.String PERSIAN_CAT();
        void PERSIAN_CAT(java.lang.String value);
        java.lang.String RAGDOLL_CAT();
        void RAGDOLL_CAT(java.lang.String value);
        java.lang.String RED_CAT();
        void RED_CAT(java.lang.String value);
        java.lang.String SIAMESE_CAT();
        void SIAMESE_CAT(java.lang.String value);
        java.lang.String TABBY_CAT();
        void TABBY_CAT(java.lang.String value);
        java.lang.String WHITE_CAT();
        void WHITE_CAT(java.lang.String value);
        java.lang.String CAVE_SPIDER();
        void CAVE_SPIDER(java.lang.String value);
        java.lang.String CHICKEN();
        void CHICKEN(java.lang.String value);
        java.lang.String COD();
        void COD(java.lang.String value);
        java.lang.String COW();
        void COW(java.lang.String value);
        java.lang.String DOLPHIN();
        void DOLPHIN(java.lang.String value);
        java.lang.String DONKEY();
        void DONKEY(java.lang.String value);
        java.lang.String DROWNED();
        void DROWNED(java.lang.String value);
        java.lang.String ELDER_GUARDIAN();
        void ELDER_GUARDIAN(java.lang.String value);
        java.lang.String ENDERMAN();
        void ENDERMAN(java.lang.String value);
        java.lang.String ENDERMITE();
        void ENDERMITE(java.lang.String value);
        java.lang.String EVOKER();
        void EVOKER(java.lang.String value);
        java.lang.String FOX();
        void FOX(java.lang.String value);
        java.lang.String SNOW_FOX();
        void SNOW_FOX(java.lang.String value);
        java.lang.String COLD_FROG();
        void COLD_FROG(java.lang.String value);
        java.lang.String TEMPERATE_FROG();
        void TEMPERATE_FROG(java.lang.String value);
        java.lang.String WARM_FROG();
        void WARM_FROG(java.lang.String value);
        java.lang.String GHAST();
        void GHAST(java.lang.String value);
        java.lang.String GLOW_SQUID();
        void GLOW_SQUID(java.lang.String value);
        java.lang.String GOAT();
        void GOAT(java.lang.String value);
        java.lang.String GUARDIAN();
        void GUARDIAN(java.lang.String value);
        java.lang.String HOGLIN();
        void HOGLIN(java.lang.String value);
        java.lang.String WHITE_HORSE();
        void WHITE_HORSE(java.lang.String value);
        java.lang.String CREAMY_HORSE();
        void CREAMY_HORSE(java.lang.String value);
        java.lang.String CHESTNUT_HORSE();
        void CHESTNUT_HORSE(java.lang.String value);
        java.lang.String BROWN_HORSE();
        void BROWN_HORSE(java.lang.String value);
        java.lang.String BLACK_HORSE();
        void BLACK_HORSE(java.lang.String value);
        java.lang.String GRAY_HORSE();
        void GRAY_HORSE(java.lang.String value);
        java.lang.String DARK_BROWN_HORSE();
        void DARK_BROWN_HORSE(java.lang.String value);
        java.lang.String HUSK();
        void HUSK(java.lang.String value);
        java.lang.String ILLUSIONER();
        void ILLUSIONER(java.lang.String value);
        java.lang.String IRON_GOLEM();
        void IRON_GOLEM(java.lang.String value);
        java.lang.String CREAMY_LLAMA();
        void CREAMY_LLAMA(java.lang.String value);
        java.lang.String WHITE_LLAMA();
        void WHITE_LLAMA(java.lang.String value);
        java.lang.String BROWN_LLAMA();
        void BROWN_LLAMA(java.lang.String value);
        java.lang.String GRAY_LLAMA();
        void GRAY_LLAMA(java.lang.String value);
        java.lang.String MAGMA_CUBE();
        void MAGMA_CUBE(java.lang.String value);
        java.lang.String RED_MOOSHROOM();
        void RED_MOOSHROOM(java.lang.String value);
        java.lang.String BROWN_MOOSHROOM();
        void BROWN_MOOSHROOM(java.lang.String value);
        java.lang.String MULE();
        void MULE(java.lang.String value);
        java.lang.String OCELOT();
        void OCELOT(java.lang.String value);
        java.lang.String AGGRESSIVE_PANDA();
        void AGGRESSIVE_PANDA(java.lang.String value);
        java.lang.String BROWN_PANDA();
        void BROWN_PANDA(java.lang.String value);
        java.lang.String LAZY_PANDA();
        void LAZY_PANDA(java.lang.String value);
        java.lang.String PANDA();
        void PANDA(java.lang.String value);
        java.lang.String PLAYFUL_PANDA();
        void PLAYFUL_PANDA(java.lang.String value);
        java.lang.String WEAK_PANDA();
        void WEAK_PANDA(java.lang.String value);
        java.lang.String WORRIED_PANDA();
        void WORRIED_PANDA(java.lang.String value);
        java.lang.String BLUE_PARROT();
        void BLUE_PARROT(java.lang.String value);
        java.lang.String GREEN_PARROT();
        void GREEN_PARROT(java.lang.String value);
        java.lang.String GRAY_PARROT();
        void GRAY_PARROT(java.lang.String value);
        java.lang.String RED_PARROT();
        void RED_PARROT(java.lang.String value);
        java.lang.String CYAN_PARROT();
        void CYAN_PARROT(java.lang.String value);
        java.lang.String PHANTOM();
        void PHANTOM(java.lang.String value);
        java.lang.String PIG();
        void PIG(java.lang.String value);
        java.lang.String PIGLIN_BRUTE();
        void PIGLIN_BRUTE(java.lang.String value);
        java.lang.String PILLAGER();
        void PILLAGER(java.lang.String value);
        java.lang.String POLAR_BEAR();
        void POLAR_BEAR(java.lang.String value);
        java.lang.String PUFFERFISH();
        void PUFFERFISH(java.lang.String value);
        java.lang.String BLACK_RABBIT();
        void BLACK_RABBIT(java.lang.String value);
        java.lang.String BROWN_RABBIT();
        void BROWN_RABBIT(java.lang.String value);
        java.lang.String KILLER_BUNNY();
        void KILLER_BUNNY(java.lang.String value);
        java.lang.String GOLD_RABBIT();
        void GOLD_RABBIT(java.lang.String value);
        java.lang.String SALT_PEPPER_RABBIT();
        void SALT_PEPPER_RABBIT(java.lang.String value);
        java.lang.String TOAST_RABBIT();
        void TOAST_RABBIT(java.lang.String value);
        java.lang.String WHITE_RABBIT();
        void WHITE_RABBIT(java.lang.String value);
        java.lang.String BLACK_WHITE_RABBIT();
        void BLACK_WHITE_RABBIT(java.lang.String value);
        java.lang.String RAVAGER();
        void RAVAGER(java.lang.String value);
        java.lang.String SALMON();
        void SALMON(java.lang.String value);
        java.lang.String SHULKER();
        void SHULKER(java.lang.String value);
        java.lang.String SILVERFISH();
        void SILVERFISH(java.lang.String value);
        java.lang.String SKELETON_HORSE();
        void SKELETON_HORSE(java.lang.String value);
        java.lang.String SLIME();
        void SLIME(java.lang.String value);
        java.lang.String SNIFFER();
        void SNIFFER(java.lang.String value);
        java.lang.String SNOW_GOLEM();
        void SNOW_GOLEM(java.lang.String value);
        java.lang.String SPIDER();
        void SPIDER(java.lang.String value);
        java.lang.String SQUID();
        void SQUID(java.lang.String value);
        java.lang.String STRAY();
        void STRAY(java.lang.String value);
        java.lang.String STRIDER();
        void STRIDER(java.lang.String value);
        java.lang.String TADPOLE();
        void TADPOLE(java.lang.String value);
        java.lang.String CREAMY_TRADER_LLAMA();
        void CREAMY_TRADER_LLAMA(java.lang.String value);
        java.lang.String WHITE_TRADER_LLAMA();
        void WHITE_TRADER_LLAMA(java.lang.String value);
        java.lang.String BROWN_TRADER_LLAMA();
        void BROWN_TRADER_LLAMA(java.lang.String value);
        java.lang.String GRAY_TRADER_LLAMA();
        void GRAY_TRADER_LLAMA(java.lang.String value);
        java.lang.String TROPICAL_FISH();
        void TROPICAL_FISH(java.lang.String value);
        java.lang.String TURTLE();
        void TURTLE(java.lang.String value);
        java.lang.String VEX();
        void VEX(java.lang.String value);
        java.lang.String CHARGING_VEX();
        void CHARGING_VEX(java.lang.String value);
        java.lang.String VILLAGER();
        void VILLAGER(java.lang.String value);
        java.lang.String ARMORER_VILLAGER();
        void ARMORER_VILLAGER(java.lang.String value);
        java.lang.String BUTCHER_VILLAGER();
        void BUTCHER_VILLAGER(java.lang.String value);
        java.lang.String CARTOGRAPHER_VILLAGER();
        void CARTOGRAPHER_VILLAGER(java.lang.String value);
        java.lang.String CLERIC_VILLAGER();
        void CLERIC_VILLAGER(java.lang.String value);
        java.lang.String FARMER_VILLAGER();
        void FARMER_VILLAGER(java.lang.String value);
        java.lang.String FISHERMAN_VILLAGER();
        void FISHERMAN_VILLAGER(java.lang.String value);
        java.lang.String FLETCHER_VILLAGER();
        void FLETCHER_VILLAGER(java.lang.String value);
        java.lang.String LIBRARIAN_VILLAGER();
        void LIBRARIAN_VILLAGER(java.lang.String value);
        java.lang.String SHEPHERD_VILLAGER();
        void SHEPHERD_VILLAGER(java.lang.String value);
        java.lang.String WEAPONSMITH_VILLAGER();
        void WEAPONSMITH_VILLAGER(java.lang.String value);
        java.lang.String VINDICATOR();
        void VINDICATOR(java.lang.String value);
        java.lang.String WANDERING_TRADER();
        void WANDERING_TRADER(java.lang.String value);
        java.lang.String WARDEN();
        void WARDEN(java.lang.String value);
        java.lang.String WITCH();
        void WITCH(java.lang.String value);
        java.lang.String WITHER();
        void WITHER(java.lang.String value);
        java.lang.String WITHER_PROJECTILE();
        void WITHER_PROJECTILE(java.lang.String value);
        java.lang.String BLUE_WITHER_PROJECTILE();
        void BLUE_WITHER_PROJECTILE(java.lang.String value);
        java.lang.String WOLF();
        void WOLF(java.lang.String value);
        java.lang.String ANGRY_WOLF();
        void ANGRY_WOLF(java.lang.String value);
        java.lang.String ZOGLIN();
        void ZOGLIN(java.lang.String value);
        java.lang.String ZOMBIE_HORSE();
        void ZOMBIE_HORSE(java.lang.String value);
        java.lang.String ZOMBIE_VILLAGER();
        void ZOMBIE_VILLAGER(java.lang.String value);
        java.lang.String ARMORER_ZOMBIE_VILLAGER();
        void ARMORER_ZOMBIE_VILLAGER(java.lang.String value);
        java.lang.String BUTCHER_ZOMBIE_VILLAGER();
        void BUTCHER_ZOMBIE_VILLAGER(java.lang.String value);
        java.lang.String CARTOGRAPHER_ZOMBIE_VILLAGER();
        void CARTOGRAPHER_ZOMBIE_VILLAGER(java.lang.String value);
        java.lang.String CLERIC_ZOMBIE_VILLAGER();
        void CLERIC_ZOMBIE_VILLAGER(java.lang.String value);
        java.lang.String FARMER_ZOMBIE_VILLAGER();
        void FARMER_ZOMBIE_VILLAGER(java.lang.String value);
        java.lang.String FISHERMAN_ZOMBIE_VILLAGER();
        void FISHERMAN_ZOMBIE_VILLAGER(java.lang.String value);
        java.lang.String FLETCHER_ZOMBIE_VILLAGER();
        void FLETCHER_ZOMBIE_VILLAGER(java.lang.String value);
        java.lang.String LIBRARIAN_ZOMBIE_VILLAGER();
        void LIBRARIAN_ZOMBIE_VILLAGER(java.lang.String value);
        java.lang.String SHEPHERD_ZOMBIE_VILLAGER();
        void SHEPHERD_ZOMBIE_VILLAGER(java.lang.String value);
        java.lang.String WEAPONSMITH_ZOMBIE_VILLAGER();
        void WEAPONSMITH_ZOMBIE_VILLAGER(java.lang.String value);
        java.lang.String ZOMBIFIED_PIGLIN();
        void ZOMBIFIED_PIGLIN(java.lang.String value);
    }
    public static class Keys {
        public final Option.Key chargedCreeperDrops = new Option.Key("chargedCreeperDrops");
        public final Option.Key changeHeadCollisions = new Option.Key("changeHeadCollisions");
        public final Option.Key headURLs_WHITE_SHEEP = new Option.Key("headURLs.WHITE_SHEEP");
        public final Option.Key headURLs_ORANGE_SHEEP = new Option.Key("headURLs.ORANGE_SHEEP");
        public final Option.Key headURLs_MAGENTA_SHEEP = new Option.Key("headURLs.MAGENTA_SHEEP");
        public final Option.Key headURLs_LIGHT_BLUE_SHEEP = new Option.Key("headURLs.LIGHT_BLUE_SHEEP");
        public final Option.Key headURLs_YELLOW_SHEEP = new Option.Key("headURLs.YELLOW_SHEEP");
        public final Option.Key headURLs_LIME_SHEEP = new Option.Key("headURLs.LIME_SHEEP");
        public final Option.Key headURLs_PINK_SHEEP = new Option.Key("headURLs.PINK_SHEEP");
        public final Option.Key headURLs_GRAY_SHEEP = new Option.Key("headURLs.GRAY_SHEEP");
        public final Option.Key headURLs_LIGHT_GRAY_SHEEP = new Option.Key("headURLs.LIGHT_GRAY_SHEEP");
        public final Option.Key headURLs_CYAN_SHEEP = new Option.Key("headURLs.CYAN_SHEEP");
        public final Option.Key headURLs_PURPLE_SHEEP = new Option.Key("headURLs.PURPLE_SHEEP");
        public final Option.Key headURLs_BLUE_SHEEP = new Option.Key("headURLs.BLUE_SHEEP");
        public final Option.Key headURLs_BROWN_SHEEP = new Option.Key("headURLs.BROWN_SHEEP");
        public final Option.Key headURLs_GREEN_SHEEP = new Option.Key("headURLs.GREEN_SHEEP");
        public final Option.Key headURLs_RED_SHEEP = new Option.Key("headURLs.RED_SHEEP");
        public final Option.Key headURLs_BLACK_SHEEP = new Option.Key("headURLs.BLACK_SHEEP");
        public final Option.Key headURLs_JEB_SHEEP = new Option.Key("headURLs.JEB_SHEEP");
        public final Option.Key headURLs_ALLAY = new Option.Key("headURLs.ALLAY");
        public final Option.Key headURLs_LUCY_AXOLOTL = new Option.Key("headURLs.LUCY_AXOLOTL");
        public final Option.Key headURLs_WILD_AXOLOTL = new Option.Key("headURLs.WILD_AXOLOTL");
        public final Option.Key headURLs_GOLD_AXOLOTL = new Option.Key("headURLs.GOLD_AXOLOTL");
        public final Option.Key headURLs_CYAN_AXOLOTL = new Option.Key("headURLs.CYAN_AXOLOTL");
        public final Option.Key headURLs_BLUE_AXOLOTL = new Option.Key("headURLs.BLUE_AXOLOTL");
        public final Option.Key headURLs_BAT = new Option.Key("headURLs.BAT");
        public final Option.Key headURLs_BEE = new Option.Key("headURLs.BEE");
        public final Option.Key headURLs_POLLINATED_BEE = new Option.Key("headURLs.POLLINATED_BEE");
        public final Option.Key headURLs_ANGRY_BEE = new Option.Key("headURLs.ANGRY_BEE");
        public final Option.Key headURLs_ANGRY_POLLINATED_BEE = new Option.Key("headURLs.ANGRY_POLLINATED_BEE");
        public final Option.Key headURLs_BLAZE = new Option.Key("headURLs.BLAZE");
        public final Option.Key headURLs_BREEZE = new Option.Key("headURLs.BREEZE");
        public final Option.Key headURLs_CAMEL = new Option.Key("headURLs.CAMEL");
        public final Option.Key headURLs_ALL_BLACK_CAT = new Option.Key("headURLs.ALL_BLACK_CAT");
        public final Option.Key headURLs_BLACK_CAT = new Option.Key("headURLs.BLACK_CAT");
        public final Option.Key headURLs_BRITISH_SHORTHAIR_CAT = new Option.Key("headURLs.BRITISH_SHORTHAIR_CAT");
        public final Option.Key headURLs_CALICO_CAT = new Option.Key("headURLs.CALICO_CAT");
        public final Option.Key headURLs_JELLIE_CAT = new Option.Key("headURLs.JELLIE_CAT");
        public final Option.Key headURLs_PERSIAN_CAT = new Option.Key("headURLs.PERSIAN_CAT");
        public final Option.Key headURLs_RAGDOLL_CAT = new Option.Key("headURLs.RAGDOLL_CAT");
        public final Option.Key headURLs_RED_CAT = new Option.Key("headURLs.RED_CAT");
        public final Option.Key headURLs_SIAMESE_CAT = new Option.Key("headURLs.SIAMESE_CAT");
        public final Option.Key headURLs_TABBY_CAT = new Option.Key("headURLs.TABBY_CAT");
        public final Option.Key headURLs_WHITE_CAT = new Option.Key("headURLs.WHITE_CAT");
        public final Option.Key headURLs_CAVE_SPIDER = new Option.Key("headURLs.CAVE_SPIDER");
        public final Option.Key headURLs_CHICKEN = new Option.Key("headURLs.CHICKEN");
        public final Option.Key headURLs_COD = new Option.Key("headURLs.COD");
        public final Option.Key headURLs_COW = new Option.Key("headURLs.COW");
        public final Option.Key headURLs_DOLPHIN = new Option.Key("headURLs.DOLPHIN");
        public final Option.Key headURLs_DONKEY = new Option.Key("headURLs.DONKEY");
        public final Option.Key headURLs_DROWNED = new Option.Key("headURLs.DROWNED");
        public final Option.Key headURLs_ELDER_GUARDIAN = new Option.Key("headURLs.ELDER_GUARDIAN");
        public final Option.Key headURLs_ENDERMAN = new Option.Key("headURLs.ENDERMAN");
        public final Option.Key headURLs_ENDERMITE = new Option.Key("headURLs.ENDERMITE");
        public final Option.Key headURLs_EVOKER = new Option.Key("headURLs.EVOKER");
        public final Option.Key headURLs_FOX = new Option.Key("headURLs.FOX");
        public final Option.Key headURLs_SNOW_FOX = new Option.Key("headURLs.SNOW_FOX");
        public final Option.Key headURLs_COLD_FROG = new Option.Key("headURLs.COLD_FROG");
        public final Option.Key headURLs_TEMPERATE_FROG = new Option.Key("headURLs.TEMPERATE_FROG");
        public final Option.Key headURLs_WARM_FROG = new Option.Key("headURLs.WARM_FROG");
        public final Option.Key headURLs_GHAST = new Option.Key("headURLs.GHAST");
        public final Option.Key headURLs_GLOW_SQUID = new Option.Key("headURLs.GLOW_SQUID");
        public final Option.Key headURLs_GOAT = new Option.Key("headURLs.GOAT");
        public final Option.Key headURLs_GUARDIAN = new Option.Key("headURLs.GUARDIAN");
        public final Option.Key headURLs_HOGLIN = new Option.Key("headURLs.HOGLIN");
        public final Option.Key headURLs_WHITE_HORSE = new Option.Key("headURLs.WHITE_HORSE");
        public final Option.Key headURLs_CREAMY_HORSE = new Option.Key("headURLs.CREAMY_HORSE");
        public final Option.Key headURLs_CHESTNUT_HORSE = new Option.Key("headURLs.CHESTNUT_HORSE");
        public final Option.Key headURLs_BROWN_HORSE = new Option.Key("headURLs.BROWN_HORSE");
        public final Option.Key headURLs_BLACK_HORSE = new Option.Key("headURLs.BLACK_HORSE");
        public final Option.Key headURLs_GRAY_HORSE = new Option.Key("headURLs.GRAY_HORSE");
        public final Option.Key headURLs_DARK_BROWN_HORSE = new Option.Key("headURLs.DARK_BROWN_HORSE");
        public final Option.Key headURLs_HUSK = new Option.Key("headURLs.HUSK");
        public final Option.Key headURLs_ILLUSIONER = new Option.Key("headURLs.ILLUSIONER");
        public final Option.Key headURLs_IRON_GOLEM = new Option.Key("headURLs.IRON_GOLEM");
        public final Option.Key headURLs_CREAMY_LLAMA = new Option.Key("headURLs.CREAMY_LLAMA");
        public final Option.Key headURLs_WHITE_LLAMA = new Option.Key("headURLs.WHITE_LLAMA");
        public final Option.Key headURLs_BROWN_LLAMA = new Option.Key("headURLs.BROWN_LLAMA");
        public final Option.Key headURLs_GRAY_LLAMA = new Option.Key("headURLs.GRAY_LLAMA");
        public final Option.Key headURLs_MAGMA_CUBE = new Option.Key("headURLs.MAGMA_CUBE");
        public final Option.Key headURLs_RED_MOOSHROOM = new Option.Key("headURLs.RED_MOOSHROOM");
        public final Option.Key headURLs_BROWN_MOOSHROOM = new Option.Key("headURLs.BROWN_MOOSHROOM");
        public final Option.Key headURLs_MULE = new Option.Key("headURLs.MULE");
        public final Option.Key headURLs_OCELOT = new Option.Key("headURLs.OCELOT");
        public final Option.Key headURLs_AGGRESSIVE_PANDA = new Option.Key("headURLs.AGGRESSIVE_PANDA");
        public final Option.Key headURLs_BROWN_PANDA = new Option.Key("headURLs.BROWN_PANDA");
        public final Option.Key headURLs_LAZY_PANDA = new Option.Key("headURLs.LAZY_PANDA");
        public final Option.Key headURLs_PANDA = new Option.Key("headURLs.PANDA");
        public final Option.Key headURLs_PLAYFUL_PANDA = new Option.Key("headURLs.PLAYFUL_PANDA");
        public final Option.Key headURLs_WEAK_PANDA = new Option.Key("headURLs.WEAK_PANDA");
        public final Option.Key headURLs_WORRIED_PANDA = new Option.Key("headURLs.WORRIED_PANDA");
        public final Option.Key headURLs_BLUE_PARROT = new Option.Key("headURLs.BLUE_PARROT");
        public final Option.Key headURLs_GREEN_PARROT = new Option.Key("headURLs.GREEN_PARROT");
        public final Option.Key headURLs_GRAY_PARROT = new Option.Key("headURLs.GRAY_PARROT");
        public final Option.Key headURLs_RED_PARROT = new Option.Key("headURLs.RED_PARROT");
        public final Option.Key headURLs_CYAN_PARROT = new Option.Key("headURLs.CYAN_PARROT");
        public final Option.Key headURLs_PHANTOM = new Option.Key("headURLs.PHANTOM");
        public final Option.Key headURLs_PIG = new Option.Key("headURLs.PIG");
        public final Option.Key headURLs_PIGLIN_BRUTE = new Option.Key("headURLs.PIGLIN_BRUTE");
        public final Option.Key headURLs_PILLAGER = new Option.Key("headURLs.PILLAGER");
        public final Option.Key headURLs_POLAR_BEAR = new Option.Key("headURLs.POLAR_BEAR");
        public final Option.Key headURLs_PUFFERFISH = new Option.Key("headURLs.PUFFERFISH");
        public final Option.Key headURLs_BLACK_RABBIT = new Option.Key("headURLs.BLACK_RABBIT");
        public final Option.Key headURLs_BROWN_RABBIT = new Option.Key("headURLs.BROWN_RABBIT");
        public final Option.Key headURLs_KILLER_BUNNY = new Option.Key("headURLs.KILLER_BUNNY");
        public final Option.Key headURLs_GOLD_RABBIT = new Option.Key("headURLs.GOLD_RABBIT");
        public final Option.Key headURLs_SALT_PEPPER_RABBIT = new Option.Key("headURLs.SALT_PEPPER_RABBIT");
        public final Option.Key headURLs_TOAST_RABBIT = new Option.Key("headURLs.TOAST_RABBIT");
        public final Option.Key headURLs_WHITE_RABBIT = new Option.Key("headURLs.WHITE_RABBIT");
        public final Option.Key headURLs_BLACK_WHITE_RABBIT = new Option.Key("headURLs.BLACK_WHITE_RABBIT");
        public final Option.Key headURLs_RAVAGER = new Option.Key("headURLs.RAVAGER");
        public final Option.Key headURLs_SALMON = new Option.Key("headURLs.SALMON");
        public final Option.Key headURLs_SHULKER = new Option.Key("headURLs.SHULKER");
        public final Option.Key headURLs_SILVERFISH = new Option.Key("headURLs.SILVERFISH");
        public final Option.Key headURLs_SKELETON_HORSE = new Option.Key("headURLs.SKELETON_HORSE");
        public final Option.Key headURLs_SLIME = new Option.Key("headURLs.SLIME");
        public final Option.Key headURLs_SNIFFER = new Option.Key("headURLs.SNIFFER");
        public final Option.Key headURLs_SNOW_GOLEM = new Option.Key("headURLs.SNOW_GOLEM");
        public final Option.Key headURLs_SPIDER = new Option.Key("headURLs.SPIDER");
        public final Option.Key headURLs_SQUID = new Option.Key("headURLs.SQUID");
        public final Option.Key headURLs_STRAY = new Option.Key("headURLs.STRAY");
        public final Option.Key headURLs_STRIDER = new Option.Key("headURLs.STRIDER");
        public final Option.Key headURLs_TADPOLE = new Option.Key("headURLs.TADPOLE");
        public final Option.Key headURLs_CREAMY_TRADER_LLAMA = new Option.Key("headURLs.CREAMY_TRADER_LLAMA");
        public final Option.Key headURLs_WHITE_TRADER_LLAMA = new Option.Key("headURLs.WHITE_TRADER_LLAMA");
        public final Option.Key headURLs_BROWN_TRADER_LLAMA = new Option.Key("headURLs.BROWN_TRADER_LLAMA");
        public final Option.Key headURLs_GRAY_TRADER_LLAMA = new Option.Key("headURLs.GRAY_TRADER_LLAMA");
        public final Option.Key headURLs_TROPICAL_FISH = new Option.Key("headURLs.TROPICAL_FISH");
        public final Option.Key headURLs_TURTLE = new Option.Key("headURLs.TURTLE");
        public final Option.Key headURLs_VEX = new Option.Key("headURLs.VEX");
        public final Option.Key headURLs_CHARGING_VEX = new Option.Key("headURLs.CHARGING_VEX");
        public final Option.Key headURLs_VILLAGER = new Option.Key("headURLs.VILLAGER");
        public final Option.Key headURLs_ARMORER_VILLAGER = new Option.Key("headURLs.ARMORER_VILLAGER");
        public final Option.Key headURLs_BUTCHER_VILLAGER = new Option.Key("headURLs.BUTCHER_VILLAGER");
        public final Option.Key headURLs_CARTOGRAPHER_VILLAGER = new Option.Key("headURLs.CARTOGRAPHER_VILLAGER");
        public final Option.Key headURLs_CLERIC_VILLAGER = new Option.Key("headURLs.CLERIC_VILLAGER");
        public final Option.Key headURLs_FARMER_VILLAGER = new Option.Key("headURLs.FARMER_VILLAGER");
        public final Option.Key headURLs_FISHERMAN_VILLAGER = new Option.Key("headURLs.FISHERMAN_VILLAGER");
        public final Option.Key headURLs_FLETCHER_VILLAGER = new Option.Key("headURLs.FLETCHER_VILLAGER");
        public final Option.Key headURLs_LIBRARIAN_VILLAGER = new Option.Key("headURLs.LIBRARIAN_VILLAGER");
        public final Option.Key headURLs_SHEPHERD_VILLAGER = new Option.Key("headURLs.SHEPHERD_VILLAGER");
        public final Option.Key headURLs_WEAPONSMITH_VILLAGER = new Option.Key("headURLs.WEAPONSMITH_VILLAGER");
        public final Option.Key headURLs_VINDICATOR = new Option.Key("headURLs.VINDICATOR");
        public final Option.Key headURLs_WANDERING_TRADER = new Option.Key("headURLs.WANDERING_TRADER");
        public final Option.Key headURLs_WARDEN = new Option.Key("headURLs.WARDEN");
        public final Option.Key headURLs_WITCH = new Option.Key("headURLs.WITCH");
        public final Option.Key headURLs_WITHER = new Option.Key("headURLs.WITHER");
        public final Option.Key headURLs_WITHER_PROJECTILE = new Option.Key("headURLs.WITHER_PROJECTILE");
        public final Option.Key headURLs_BLUE_WITHER_PROJECTILE = new Option.Key("headURLs.BLUE_WITHER_PROJECTILE");
        public final Option.Key headURLs_WOLF = new Option.Key("headURLs.WOLF");
        public final Option.Key headURLs_ANGRY_WOLF = new Option.Key("headURLs.ANGRY_WOLF");
        public final Option.Key headURLs_ZOGLIN = new Option.Key("headURLs.ZOGLIN");
        public final Option.Key headURLs_ZOMBIE_HORSE = new Option.Key("headURLs.ZOMBIE_HORSE");
        public final Option.Key headURLs_ZOMBIE_VILLAGER = new Option.Key("headURLs.ZOMBIE_VILLAGER");
        public final Option.Key headURLs_ARMORER_ZOMBIE_VILLAGER = new Option.Key("headURLs.ARMORER_ZOMBIE_VILLAGER");
        public final Option.Key headURLs_BUTCHER_ZOMBIE_VILLAGER = new Option.Key("headURLs.BUTCHER_ZOMBIE_VILLAGER");
        public final Option.Key headURLs_CARTOGRAPHER_ZOMBIE_VILLAGER = new Option.Key("headURLs.CARTOGRAPHER_ZOMBIE_VILLAGER");
        public final Option.Key headURLs_CLERIC_ZOMBIE_VILLAGER = new Option.Key("headURLs.CLERIC_ZOMBIE_VILLAGER");
        public final Option.Key headURLs_FARMER_ZOMBIE_VILLAGER = new Option.Key("headURLs.FARMER_ZOMBIE_VILLAGER");
        public final Option.Key headURLs_FISHERMAN_ZOMBIE_VILLAGER = new Option.Key("headURLs.FISHERMAN_ZOMBIE_VILLAGER");
        public final Option.Key headURLs_FLETCHER_ZOMBIE_VILLAGER = new Option.Key("headURLs.FLETCHER_ZOMBIE_VILLAGER");
        public final Option.Key headURLs_LIBRARIAN_ZOMBIE_VILLAGER = new Option.Key("headURLs.LIBRARIAN_ZOMBIE_VILLAGER");
        public final Option.Key headURLs_SHEPHERD_ZOMBIE_VILLAGER = new Option.Key("headURLs.SHEPHERD_ZOMBIE_VILLAGER");
        public final Option.Key headURLs_WEAPONSMITH_ZOMBIE_VILLAGER = new Option.Key("headURLs.WEAPONSMITH_ZOMBIE_VILLAGER");
        public final Option.Key headURLs_ZOMBIFIED_PIGLIN = new Option.Key("headURLs.ZOMBIFIED_PIGLIN");
    }
}

