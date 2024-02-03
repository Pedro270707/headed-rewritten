package net.pedroricardo.mixin.client;

import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import net.minecraft.block.SkullBlock;
import net.minecraft.block.entity.SkullBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.block.entity.SkullBlockEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLoader;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Direction;
import net.pedroricardo.HeadedContext;
import net.pedroricardo.content.features.HeadedFeatureRenderer;
import net.pedroricardo.content.HeadedHead;
import net.pedroricardo.content.TextureToHeadMap;
import net.pedroricardo.content.models.HeadedRewrittenModel;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.function.Function;

@Mixin(SkullBlockEntityRenderer.class)
public class RenderHeadedHeadMixin {
    @ModifyArg(method = "render(Lnet/minecraft/block/entity/SkullBlockEntity;FLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;II)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/render/block/entity/SkullBlockEntityRenderer;renderSkull(Lnet/minecraft/util/math/Direction;FFLnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;ILnet/minecraft/client/render/block/entity/SkullBlockEntityModel;Lnet/minecraft/client/render/RenderLayer;)V"), index = 6)
    private SkullBlockEntityModel headedrewritten$replaceModel(SkullBlockEntityModel model, @Local(ordinal = 0) SkullBlock.SkullType skullType, @Local(ordinal = 0) SkullBlockEntity blockEntity) {
        HeadedContext.currentProfile = blockEntity.getOwner();
        if (skullType == SkullBlock.Type.PLAYER && blockEntity.getOwner() != null && blockEntity.getOwner().getProperties().containsKey("textures") && MinecraftClient.getInstance().getSkinProvider().getTextures(blockEntity.getOwner()).containsKey(MinecraftProfileTexture.Type.SKIN) && TextureToHeadMap.MAP.containsKey(MinecraftClient.getInstance().getSkinProvider().getTextures(blockEntity.getOwner()).get(MinecraftProfileTexture.Type.SKIN).getUrl())) {
            return TextureToHeadMap.MAP.get(MinecraftClient.getInstance().getSkinProvider().getTextures(blockEntity.getOwner()).get(MinecraftProfileTexture.Type.SKIN).getUrl()).getModel(MinecraftClient.getInstance().getEntityModelLoader());
        }
        return model;
    }

    @Inject(method = "getRenderLayer", at = @At(value = "HEAD"), cancellable = true)
    private static void headedrewritten$replaceTexture(SkullBlock.SkullType type, GameProfile profile, CallbackInfoReturnable<RenderLayer> cir) {
        if (type == SkullBlock.Type.PLAYER && profile != null && profile.getProperties().containsKey("textures") && MinecraftClient.getInstance().getSkinProvider().getTextures(profile).containsKey(MinecraftProfileTexture.Type.SKIN) && TextureToHeadMap.MAP.containsKey(MinecraftClient.getInstance().getSkinProvider().getTextures(profile).get(MinecraftProfileTexture.Type.SKIN).getUrl())) {
            cir.setReturnValue(TextureToHeadMap.MAP.get(MinecraftClient.getInstance().getSkinProvider().getTextures(profile).get(MinecraftProfileTexture.Type.SKIN).getUrl()).getRenderLayer());
        }
    }

    @ModifyArg(method = "renderSkull", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/math/MatrixStack;translate(FFF)V", ordinal = 1), index = 0)
    private static float headedrewritten$offsetWallHeadX(float x, @Local(ordinal = 0) SkullBlockEntityModel model, @Local(ordinal = 0) Direction direction) {
        return model instanceof HeadedRewrittenModel headedModel ? 0.5f - direction.getOffsetX() * (16.0f - headedModel.getHeadSizeInPixels().z) / 32.0f : x;
    }

    @ModifyArg(method = "renderSkull", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/math/MatrixStack;translate(FFF)V", ordinal = 1), index = 1)
    private static float headedrewritten$offsetWallHeadY(float y, @Local(ordinal = 0) SkullBlockEntityModel model, @Local(ordinal = 0) Direction direction) {
        return model instanceof HeadedRewrittenModel headedModel ? (16.0f - headedModel.getHeadSizeInPixels().y) / 32.0f : y;
    }

    @ModifyArg(method = "renderSkull", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/math/MatrixStack;translate(FFF)V", ordinal = 1), index = 2)
    private static float headedrewritten$offsetWallHeadZ(float z, @Local(ordinal = 0) SkullBlockEntityModel model, @Local(ordinal = 0) Direction direction) {
        return model instanceof HeadedRewrittenModel headedModel ? 0.5f - direction.getOffsetZ() * (16.0f - headedModel.getHeadSizeInPixels().z) / 32.0f : z;
    }

    @Inject(method = "renderSkull", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/util/math/MatrixStack;pop()V", shift = At.Shift.AFTER))
    private static void headedrewritten$renderFeatures(Direction direction, float yaw, float animationProgress, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, SkullBlockEntityModel model, RenderLayer renderLayer, CallbackInfo ci) {
        if (HeadedContext.currentProfile != null && HeadedContext.currentProfile.getProperties().containsKey("textures") && MinecraftClient.getInstance().getSkinProvider().getTextures(HeadedContext.currentProfile).containsKey(MinecraftProfileTexture.Type.SKIN) && TextureToHeadMap.MAP.containsKey(MinecraftClient.getInstance().getSkinProvider().getTextures(HeadedContext.currentProfile).get(MinecraftProfileTexture.Type.SKIN).getUrl())) {
            HeadedHead head = TextureToHeadMap.MAP.get(MinecraftClient.getInstance().getSkinProvider().getTextures(HeadedContext.currentProfile).get(MinecraftProfileTexture.Type.SKIN).getUrl());
            HeadedContext.currentProfile = null;
            for (Function<EntityModelLoader, HeadedFeatureRenderer> featureRenderer : head.getFeatureRenderers()) {
                featureRenderer.apply(MinecraftClient.getInstance().getEntityModelLoader()).render(direction, yaw, animationProgress, matrices, vertexConsumers, light);
            }
        }
    }
}