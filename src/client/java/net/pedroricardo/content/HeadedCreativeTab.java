package net.pedroricardo.content;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.pedroricardo.HeadedRewritten;
import net.pedroricardo.HeadedRewrittenClient;

import java.util.Map;

public class HeadedCreativeTab {
    private static final RegistryKey<ItemGroup> ITEM_GROUP_REGISTRY_KEY = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(HeadedRewritten.MOD_ID, "headed_rewritten"));
    public static final ItemGroup ITEM_GROUP = Registry.register(Registries.ITEM_GROUP, ITEM_GROUP_REGISTRY_KEY, FabricItemGroup.builder().icon(() -> new ItemStack(Items.PLAYER_HEAD))
            .displayName(Text.translatable("itemGroup.headed-rewritten"))
            .entries((ctx, entries) -> {
               for (Map.Entry<String, HeadedHead> entry : TextureToHeadMap.MAP.entrySet()) {
                   if (entry.getValue().addToItemGroup()) entries.add(entry.getValue().toStack());
               }
            })
            .build()
    );

    public static void init() {
        HeadedRewrittenClient.LOGGER.debug("Registering item group");
    }
}
