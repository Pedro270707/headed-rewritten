package net.pedroricardo.content.features;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.block.entity.SkullBlockEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SkullEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.pedroricardo.content.HeadedEntityModelLayers;
import net.pedroricardo.content.models.EndermanHeadEntityModel;
import net.pedroricardo.content.models.SpiderHeadEntityModel;
import org.jetbrains.annotations.Nullable;

public class SpiderEyesHeadFeatureRenderer extends HeadedFeatureRenderer {
    private final EntityModelLayer modelLayer;
    private final float scale;

    public SpiderEyesHeadFeatureRenderer(EntityModelLayer modelLayer, float scale) {
        this.modelLayer = modelLayer;
        this.scale = scale;
    }

    @Override
    public void render(@Nullable Direction direction, float yaw, float deltaTime, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        RenderLayer renderLayer = this.getEyesTexture();
        SkullBlockEntityModel model = this.getModel();

        SkullBlockEntityRenderer.renderSkull(direction, yaw, deltaTime, matrices, vertexConsumers, 15728640, model, renderLayer);
    }

    public RenderLayer getEyesTexture() {
        return RenderLayer.getEyes(new Identifier("textures/entity/spider_eyes.png"));
    }

    public SkullBlockEntityModel getModel() {
        return new SpiderHeadEntityModel(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(this.modelLayer), this.scale);
    }
}
