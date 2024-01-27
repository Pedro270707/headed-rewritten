package net.pedroricardo.content.models;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Vector3f;

public class GhastHeadEntityModel extends SkullBlockEntityModel implements HeadedRewrittenModel {
    private final ModelPart root;
    private final ModelPart head;

    public GhastHeadEntityModel(ModelPart root) {
        this.root = root;
        this.head = root.getChild(EntityModelPartNames.HEAD);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        modelPartData.addChild(EntityModelPartNames.HEAD, new ModelPartBuilder().uv(0, 0).cuboid(-8.0f, -14.0f, -8.0f, 16.0f, 16.0f, 16.0f, new Dilation(-2.0f)), ModelTransform.NONE);
        return TexturedModelData.of(modelData, 64, 32);
    }

    @Override
    public Vector3f getHeadSizeInPixels() {
        return new Vector3f(12.0f, 12.0f, 12.0f);
    }

    @Override
    public void setHeadRotation(float animationProgress, float yaw, float pitch) {
        this.head.yaw = yaw * 0.017453292F;
        this.head.pitch = pitch * 0.017453292F;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        this.head.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}
