package net.pedroricardo.content;

import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import net.minecraft.util.Identifier;
import net.pedroricardo.content.features.HeadedFeatureRenderer;
import org.apache.commons.codec.binary.Base64;
import org.jetbrains.annotations.Nullable;

import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;

public class HeadedHead {
    private final String originalTexture;
    private final Function<EntityModelLoader, SkullBlockEntityModel> modelFunction;
    private final Identifier texture;
    private final Collection<Function<EntityModelLoader, HeadedFeatureRenderer>> featureRenderers;
    @Nullable
    private final String name;
    @Nullable
    private final String noteBlockSound;

    private final boolean addToItemGroup;

    public HeadedHead(String originalTexture, Function<EntityModelLoader, SkullBlockEntityModel> modelFunction, Identifier texture, @Nullable String name, @Nullable String noteBlockSound, Collection<Function<EntityModelLoader, HeadedFeatureRenderer>> featureRenderers, boolean addToItemGroup) {
        this.originalTexture = originalTexture;
        this.modelFunction = modelFunction;
        this.texture = texture;
        this.name = name;
        this.featureRenderers = featureRenderers;
        this.noteBlockSound = noteBlockSound;
        this.addToItemGroup = addToItemGroup;
    }

    public HeadedHead(String originalTexture, Function<EntityModelLoader, SkullBlockEntityModel> modelFunction, Identifier texture, @Nullable String name, @Nullable String noteBlockSound, Collection<Function<EntityModelLoader, HeadedFeatureRenderer>> featureRenderers) {
        this(originalTexture, modelFunction, texture, name, noteBlockSound, featureRenderers, true);
    }

    public HeadedHead(String originalTexture, Function<EntityModelLoader, SkullBlockEntityModel> modelFunction, Identifier texture, @Nullable String name, @Nullable String noteBlockSound) {
        this(originalTexture, modelFunction, texture, name, noteBlockSound, Collections.emptyList());
    }

    public HeadedHead(String originalTexture, Function<EntityModelLoader, SkullBlockEntityModel> modelFunction, Identifier texture, @Nullable String name, @Nullable String noteBlockSound, boolean addToItemGroup) {
        this(originalTexture, modelFunction, texture, name, noteBlockSound, Collections.emptyList(), addToItemGroup);
    }

    public String getOriginalTexture() {
        return this.originalTexture;
    }

    public SkullBlockEntityModel getModel(EntityModelLoader modelLoader) {
        return this.modelFunction.apply(modelLoader);
    }

    public Identifier getTexture() {
        return this.texture;
    }

    public Collection<Function<EntityModelLoader, HeadedFeatureRenderer>> getFeatureRenderers() {
        return this.featureRenderers;
    }

    public @Nullable String getName() {
        return this.name;
    }
    public @Nullable String getNoteBlockSound() {
        return this.noteBlockSound;
    }
    public boolean addToItemGroup() {
        return this.addToItemGroup;
    }

    public ItemStack toStack() {
        ItemStack itemStack = new ItemStack(Items.PLAYER_HEAD);
        NbtCompound skullOwner = new NbtCompound();
        skullOwner.putString("Name", this.getName() != null ? this.getName() : "Mob");
        NbtCompound propertyTextures = new NbtCompound();
        NbtList list = new NbtList();
        NbtCompound textureValueCompound = new NbtCompound();
        textureValueCompound.putString("Value", Base64.encodeBase64String(("{\"textures\":{\"SKIN\":{\"url\":\"" + this.getOriginalTexture() + "\"}}}").getBytes(StandardCharsets.UTF_8)));
        list.add(textureValueCompound);
        propertyTextures.put("textures", list);
        skullOwner.put("Properties", propertyTextures);
        itemStack.setSubNbt("SkullOwner", skullOwner);
        if (this.getNoteBlockSound() != null) {
            NbtCompound noteBlockSound = new NbtCompound();
            noteBlockSound.putString("note_block_sound", this.getNoteBlockSound());
            itemStack.setSubNbt("BlockEntityTag", noteBlockSound);
        }
        return itemStack;
    }
}