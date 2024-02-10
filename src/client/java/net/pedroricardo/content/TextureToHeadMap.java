package net.pedroricardo.content;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.pedroricardo.content.features.HeadedFeatureRenderer;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

public class TextureToHeadMap {
    public static final LinkedHashMap<Supplier<String>, HeadedHead> MAP = new LinkedHashMap<>();

    public static HeadedHead addHead(Supplier<String> originalTexture, Function<EntityModelLoader, SkullBlockEntityModel> modelFunction, RenderLayer renderLayer, String name, String noteBlockSound) {
        return MAP.put(originalTexture, new HeadedHead(originalTexture, modelFunction, renderLayer, name, noteBlockSound));
    }

    @SafeVarargs
    public static HeadedHead addHead(Supplier<String> originalTexture, Function<EntityModelLoader, SkullBlockEntityModel> modelFunction, RenderLayer renderLayer, String name, String noteBlockSound, Function<EntityModelLoader, HeadedFeatureRenderer>... featureRenderers) {
        return MAP.put(originalTexture, new HeadedHead(originalTexture, modelFunction, renderLayer, name, noteBlockSound, Arrays.asList(featureRenderers)));
    }

    public static HeadedHead addHeadNotInGroup(Supplier<String> originalTexture, Function<EntityModelLoader, SkullBlockEntityModel> modelFunction, RenderLayer renderLayer, String name, String noteBlockSound) {
        return MAP.put(originalTexture, new HeadedHead(originalTexture, modelFunction, renderLayer, name, noteBlockSound, false));
    }

    @SafeVarargs
    public static HeadedHead addHeadNotInGroup(Supplier<String> originalTexture, Function<EntityModelLoader, SkullBlockEntityModel> modelFunction, RenderLayer renderLayer, String name, String noteBlockSound, Function<EntityModelLoader, HeadedFeatureRenderer>... featureRenderers) {
        return MAP.put(originalTexture, new HeadedHead(originalTexture, modelFunction, renderLayer, name, noteBlockSound, Arrays.asList(featureRenderers), false));
    }

    public static boolean contains(String texture) {
        for (Supplier<String> supplier : MAP.keySet()) {
            if (supplier.get().equals(texture)) return true;
        }
        return false;
    }

    @Nullable
    public static HeadedHead get(String texture) {
        for (Map.Entry<Supplier<String>, HeadedHead> entry : MAP.entrySet()) {
            if (entry.getKey().get().equals(texture)) return entry.getValue();
        }
        return null;
    }
}