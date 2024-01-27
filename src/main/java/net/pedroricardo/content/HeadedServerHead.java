package net.pedroricardo.content;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.SetNbtLootFunction;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtList;
import org.jetbrains.annotations.Nullable;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class HeadedServerHead {
    private final String originalTexture;
    @Nullable
    private final String name;
    @Nullable
    private final String noteBlockSound;

    public HeadedServerHead(String originalTexture, @Nullable String name, @Nullable String noteBlockSound) {
        this.originalTexture = originalTexture;
        this.name = name;
        this.noteBlockSound = noteBlockSound;
    }

    public String getOriginalTexture() {
        return this.originalTexture;
    }

    public @Nullable String getName() {
        return this.name;
    }

    public @Nullable String getNoteBlockSound() {
        return this.noteBlockSound;
    }

    public ItemStack toStack() {
        ItemStack itemStack = new ItemStack(Items.PLAYER_HEAD);
        NbtCompound skullOwner = new NbtCompound();
        skullOwner.putString("Name", this.getName() != null ? this.getName() : "Mob");
        NbtCompound propertyTextures = new NbtCompound();
        NbtList list = new NbtList();
        NbtCompound textureValueCompound = new NbtCompound();
        textureValueCompound.putString("Value", Base64.getEncoder().encodeToString(("{\"textures\":{\"SKIN\":{\"url\":\"" + this.getOriginalTexture() + "\"}}}").getBytes(StandardCharsets.UTF_8)));
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

    public static ItemStack stack(String texture) {
        if (TextureToServerHeadMap.MAP.containsKey(texture)) return TextureToServerHeadMap.MAP.get(texture).toStack();
        return new ItemStack(Items.PLAYER_HEAD);
    }

    public static LootPoolEntry entry(String texture) {
        return entryBuilder(texture).build();
    }

    public static LeafEntry.Builder<?> entryBuilder(String texture) {
        return ItemEntry.builder(Items.PLAYER_HEAD).apply(SetNbtLootFunction.builder(stack(texture).getNbt()));
    }
}