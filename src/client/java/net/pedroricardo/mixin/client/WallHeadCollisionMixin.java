package net.pedroricardo.mixin.client;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.WallSkullBlock;
import net.minecraft.block.entity.SkullBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
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
@Mixin(WallSkullBlock.class)
public class WallHeadCollisionMixin {
    @Inject(method = "getOutlineShape", at = @At("HEAD"), cancellable = true)
    private void headedrewritten$getAccurateWallOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context, CallbackInfoReturnable<VoxelShape> cir) {
        if (HeadedRewritten.CONFIG.changeHeadCollisions() && world.getBlockEntity(pos) instanceof SkullBlockEntity blockEntity && blockEntity.getOwner() != null && blockEntity.getOwner().getProperties().containsKey("textures") && TextureToHeadMap.contains(MinecraftClient.getInstance().getSkinProvider().getSkinTextures(blockEntity.getOwner()).textureUrl())) {
            SkullBlockEntityModel model = TextureToHeadMap.get(MinecraftClient.getInstance().getSkinProvider().getSkinTextures(blockEntity.getOwner()).textureUrl()).getModel(MinecraftClient.getInstance().getEntityModelLoader());
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
            cir.setReturnValue(Maps.newEnumMap(ImmutableMap.of(
                    Direction.NORTH, VoxelShapes.cuboid((1.0f - boxSize.x) / 2.0f, (1.0f - boxSize.y) / 2.0f, 1.0f - boxSize.z, (1.0f + boxSize.x) / 2.0f, (1.0f + boxSize.y) / 2.0f, 1.0f),
                    Direction.SOUTH, VoxelShapes.cuboid((1.0f - boxSize.x) / 2.0f, (1.0f - boxSize.y) / 2.0f, 0, (1.0f + boxSize.x) / 2.0f, (1.0f + boxSize.y) / 2.0f, boxSize.z),
                    Direction.EAST, VoxelShapes.cuboid(0, (1.0f - boxSize.y) / 2.0f, (1.0f - boxSize.x) / 2.0f, boxSize.z, (1.0f + boxSize.y) / 2.0f, (1.0f + boxSize.x) / 2.0f),
                    Direction.WEST, VoxelShapes.cuboid(1.0f - boxSize.z, (1.0f - boxSize.y) / 2.0f, (1.0f - boxSize.x) / 2.0f, 1.0f, (1.0f + boxSize.y) / 2.0f, (1.0f + boxSize.x) / 2.0f)
            )).get(state.get(WallSkullBlock.FACING)));
        }
    }
}
