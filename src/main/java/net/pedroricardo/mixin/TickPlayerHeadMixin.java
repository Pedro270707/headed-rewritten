package net.pedroricardo.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.block.AbstractSkullBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(AbstractSkullBlock.class)
public class TickPlayerHeadMixin {
	@WrapOperation(method = "getTicker", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z", ordinal = 0))
	private boolean init(BlockState instance, Block block, Operation<Boolean> original) {
		return original.call(instance, block) || original.call(instance, Blocks.PLAYER_HEAD) || original.call(instance, Blocks.PLAYER_WALL_HEAD);
	}
}