package net.pedroricardo.content.features;

import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.block.entity.SkullBlockEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.pedroricardo.content.models.HeadedRewrittenModel;
import org.jetbrains.annotations.Nullable;

public class SimpleModelHeadFeatureRenderer extends HeadedFeatureRenderer {
    private final SkullBlockEntityModel model;
    private final RenderLayer renderLayer;
    private final float alpha;

    public SimpleModelHeadFeatureRenderer(SkullBlockEntityModel model, RenderLayer renderLayer, float alpha) {
        this.model = model;
        this.renderLayer = renderLayer;
        this.alpha = alpha;
    }

    public SimpleModelHeadFeatureRenderer(SkullBlockEntityModel model, RenderLayer renderLayer) {
        this(model, renderLayer, 1.0f);
    }

    @Override
    public void render(@Nullable Direction direction, float yaw, float animationProgress, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        matrices.push();
        if (direction == null) {
            matrices.translate(0.5F, 0.0F, 0.5F);
        } else if (this.model instanceof HeadedRewrittenModel headedModel) {
            matrices.translate(0.5F - (float)direction.getOffsetX() * (16.0f - headedModel.getHeadSizeInPixels().z) / 32.0f, (16.0f - headedModel.getHeadSizeInPixels().y) / 32.0f, 0.5F - (float)direction.getOffsetZ() * (16.0f - headedModel.getHeadSizeInPixels().z) / 32.0f);
        } else {
            matrices.translate(0.5F - (float)direction.getOffsetX() * 0.25F, 0.25F, 0.5F - (float)direction.getOffsetZ() * 0.25F);
        }

        matrices.scale(-1.0F, -1.0F, 1.0F);
        VertexConsumer vertexConsumer = vertexConsumers.getBuffer(this.renderLayer);
        this.model.setHeadRotation(animationProgress, yaw, 0.0F);
        this.model.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV, 1.0F, 1.0F, 1.0F, 1.0F);
        matrices.pop();
    }
}
