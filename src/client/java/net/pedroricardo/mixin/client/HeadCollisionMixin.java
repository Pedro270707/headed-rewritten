package net.pedroricardo.mixin.client;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.SkullBlock;
import net.minecraft.block.entity.SkullBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.pedroricardo.HeadedContext;
import net.pedroricardo.HeadedRewritten;
import net.pedroricardo.content.HeadedRewrittenConfigModel;
import net.pedroricardo.content.TextureToHeadMap;
import net.pedroricardo.content.models.HeadedRewrittenModel;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
@Mixin(SkullBlock.class)
public class HeadCollisionMixin {
    @Inject(method = "getOutlineShape", at = @At("HEAD"), cancellable = true)
    private void headedrewritten$getAccurateOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context, CallbackInfoReturnable<VoxelShape> cir) {
        if (HeadedRewritten.CONFIG.changeHeadCollisions() && world.getBlockEntity(pos) instanceof SkullBlockEntity blockEntity && blockEntity.getOwner() != null && blockEntity.getOwner().getProperties().containsKey("textures") && TextureToHeadMap.MAP.containsKey(MinecraftClient.getInstance().getSkinProvider().getSkinTextures(blockEntity.getOwner()).textureUrl())) {
            SkullBlockEntityModel model = TextureToHeadMap.MAP.get(MinecraftClient.getInstance().getSkinProvider().getSkinTextures(blockEntity.getOwner()).textureUrl()).getModel(MinecraftClient.getInstance().getEntityModelLoader());
            Vector3f boxSize;
            if (model instanceof HeadedRewrittenModel headedRewrittenModel) {
                boxSize = headedRewrittenModel.getHeadSizeInPixels();
            } else {
                 boxSize = new Vector3f(8.0f, 8.0f, 8.0f);
            }
            if (!MinecraftClient.getInstance().isInSingleplayer() && !HeadedContext.isInHeadedServer && boxSize.x < 8.0f) boxSize.x = 8.0f;
            if (!MinecraftClient.getInstance().isInSingleplayer() && !HeadedContext.isInHeadedServer && boxSize.y < 8.0f) boxSize.y = 8.0f;
            if (!MinecraftClient.getInstance().isInSingleplayer() && !HeadedContext.isInHeadedServer && boxSize.z < 8.0f) boxSize.z = 8.0f;
            boxSize.x /= 16.0f;
            boxSize.y /= 16.0f;
            boxSize.z /= 16.0f;
            float side = Math.max(boxSize.x, boxSize.z);
            cir.setReturnValue(VoxelShapes.cuboid((1.0f - side) / 2.0f, 0.0f, (1.0f - side) / 2.0f, (1.0f + side) / 2.0f, boxSize.y, (1.0f + side) / 2.0f));
        }
    }
}
