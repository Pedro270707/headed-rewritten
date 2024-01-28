package net.pedroricardo.mixin.client;

import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import net.minecraft.block.AbstractSkullBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SkullBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.item.BuiltinModelItemRenderer;
import net.pedroricardo.HeadedContext;
import net.pedroricardo.content.TextureToHeadMap;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(BuiltinModelItemRenderer.class)
public class RenderHeadedHeadItemMixin {
    @ModifyArg(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/block/entity/SkullBlockEntityRenderer;renderSkull(Lnet/minecraft/util/math/Direction;FFLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/block/entity/SkullBlockEntityModel;Lnet/minecraft/client/render/RenderLayer;)V"), index = 6)
    private SkullBlockEntityModel headedrewritten$replaceItemModel(SkullBlockEntityModel model, @Local(ordinal = 0) SkullBlock.SkullType skullType, @Local(ordinal = 0) GameProfile gameProfile) {
        if (skullType == SkullBlock.Type.PLAYER && gameProfile != null && gameProfile.getProperties().containsKey("textures") && TextureToHeadMap.MAP.containsKey(MinecraftClient.getInstance().getSkinProvider().getTextures(gameProfile).get(MinecraftProfileTexture.Type.SKIN).getUrl())) {
            HeadedContext.currentProfile = gameProfile;
            return TextureToHeadMap.MAP.get(MinecraftClient.getInstance().getSkinProvider().getTextures(gameProfile).get(MinecraftProfileTexture.Type.SKIN).getUrl()).getModel(MinecraftClient.getInstance().getEntityModelLoader());
        }
        return model;
    }
}