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


    public static class Keys {
        public final Option.Key chargedCreeperDrops = new Option.Key("chargedCreeperDrops");
        public final Option.Key changeHeadCollisions = new Option.Key("changeHeadCollisions");
    }
}

