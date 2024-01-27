package net.pedroricardo.content.features;

import net.minecraft.block.Block;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.RotationAxis;
import net.pedroricardo.content.models.HeadedRewrittenModel;
import org.jetbrains.annotations.Nullable;

public class MooshroomMushroomHeadFeatureRenderer extends HeadedFeatureRenderer {
    private final Block mushroom;
    private final HeadedRewrittenModel model;

    public MooshroomMushroomHeadFeatureRenderer(Block mushroom, HeadedRewrittenModel model) {
        this.mushroom = mushroom;
        this.model = model;
    }

    @Override
    public void render(@Nullable Direction direction, float yaw, float deltaTime, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        float dislocationX;
        float dislocationY;
        dislocationX = (16 - model.getHeadSizeInPixels().z)/32;
        dislocationY = (16 - model.getHeadSizeInPixels().z)/32;
        if (direction == null) {
            matrices.translate(0.5f, 0.0f, 0.5f);
            matrices.multiply(RotationAxis.NEGATIVE_Y.rotationDegrees(yaw));
            matrices.translate(-0.5f, 0.0f, -0.5f);
        } else {
            matrices.translate(- (float)direction.getOffsetX() * dislocationX, dislocationY, - (float)direction.getOffsetZ() * dislocationX);
        }
        matrices.translate(0.0F, 0.45F, 0.0F);
        MinecraftClient.getInstance().getBlockRenderManager().renderBlockAsEntity(this.mushroom.getDefaultState(), matrices, vertexConsumers, light, OverlayTexture.DEFAULT_UV);
    }
}
