package net.pedroricardo.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.SERVER)
@Mixin(WallSkullBlock.class)
public class ServerWallHeadCollisionMixin {
    @Inject(method = "getOutlineShape", at = @At("HEAD"), cancellable = true)
    private void getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context, CallbackInfoReturnable<VoxelShape> cir) {
        if (((AbstractSkullBlock)state.getBlock()).getSkullType() == SkullBlock.Type.PLAYER) {
            cir.setReturnValue(VoxelShapes.empty());
        }
    }
}
