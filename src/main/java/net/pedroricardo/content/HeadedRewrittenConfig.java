package net.pedroricardo.content;

import dev.isxander.yacl3.config.v2.api.ConfigClassHandler;
import dev.isxander.yacl3.config.v2.api.SerialEntry;
import dev.isxander.yacl3.config.v2.api.serializer.GsonConfigSerializerBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.util.Identifier;
import net.pedroricardo.HeadedRewritten;

public class HeadedRewrittenConfig {
    public static ConfigClassHandler<HeadedRewrittenConfig> HANDLER = ConfigClassHandler.createBuilder(HeadedRewrittenConfig.class)
            .id(new Identifier(HeadedRewritten.MOD_ID, HeadedRewritten.MOD_ID))
            .serializer(config -> GsonConfigSerializerBuilder.create(config)
                    .setPath(FabricLoader.getInstance().getConfigDir().resolve("headed-rewritten.json5"))
                    .setJson5(true)
                    .build())
            .build();

    @SerialEntry(comment = "Requires restarting.")
    public boolean chargedCreeperDrops = false;

    @SerialEntry(comment = "Changes the collisions of the heads if in a Singleplayer world or in a server with Headed Rewritten.")
    public boolean changeHeadCollisions = true;
}
