package net.pedroricardo.content.features;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.block.entity.SkullBlockEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.Direction;
import org.jetbrains.annotations.Nullable;

public abstract class SkullEyesHeadFeatureRenderer extends HeadedFeatureRenderer {
    @Override
    public void render(@Nullable Direction direction, float yaw, float deltaTime, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        RenderLayer renderLayer = this.getEyesTexture();
        SkullBlockEntityModel model = this.getModel();

        SkullBlockEntityRenderer.renderSkull(direction, yaw, deltaTime, matrices, vertexConsumers, 15728640, model, renderLayer);
    }

    public abstract RenderLayer getEyesTexture();
    public abstract SkullBlockEntityModel getModel();
}