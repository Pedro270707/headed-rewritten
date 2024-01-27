package net.pedroricardo.content;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.pedroricardo.content.features.HeadedFeatureRenderer;

import java.util.*;
import java.util.function.Function;

public class TextureToHeadMap {
    public static final LinkedHashMap<String, HeadedHead> MAP = new LinkedHashMap<>();

    public static HeadedHead addHead(String originalTexture, Function<EntityModelLoader, SkullBlockEntityModel> modelFunction, RenderLayer renderLayer, String name, String noteBlockSound) {
        return MAP.put(originalTexture, new HeadedHead(originalTexture, modelFunction, renderLayer, name, noteBlockSound));
    }

    @SafeVarargs
    public static HeadedHead addHead(String originalTexture, Function<EntityModelLoader, SkullBlockEntityModel> modelFunction, RenderLayer renderLayer, String name, String noteBlockSound, Function<EntityModelLoader, HeadedFeatureRenderer>... featureRenderers) {
        return MAP.put(originalTexture, new HeadedHead(originalTexture, modelFunction, renderLayer, name, noteBlockSound, Arrays.asList(featureRenderers)));
    }

    public static HeadedHead addHeadNotInGroup(String originalTexture, Function<EntityModelLoader, SkullBlockEntityModel> modelFunction, RenderLayer renderLayer, String name, String noteBlockSound) {
        return MAP.put(originalTexture, new HeadedHead(originalTexture, modelFunction, renderLayer, name, noteBlockSound, false));
    }

    @SafeVarargs
    public static HeadedHead addHeadNotInGroup(String originalTexture, Function<EntityModelLoader, SkullBlockEntityModel> modelFunction, RenderLayer renderLayer, String name, String noteBlockSound, Function<EntityModelLoader, HeadedFeatureRenderer>... featureRenderers) {
        return MAP.put(originalTexture, new HeadedHead(originalTexture, modelFunction, renderLayer, name, noteBlockSound, Arrays.asList(featureRenderers), false));
    }
}