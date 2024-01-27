package net.pedroricardo.content.models;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Vector3f;

public class CamelHeadEntityModel extends SkullBlockEntityModel implements HeadedRewrittenModel {
    private final ModelPart root;
    private final ModelPart head;

    public CamelHeadEntityModel(ModelPart root) {
        this.root = root;
        this.head = this.root.getChild(EntityModelPartNames.HEAD);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData modelPartData2 = modelPartData.addChild(EntityModelPartNames.HEAD, ModelPartBuilder.create().uv(21, 0).cuboid(-3.5F, -14.0F, -3.5F, 7.0F, 14.0F, 7.0F).uv(50, 0).cuboid(-2.5F, -14.0F, -9.5F, 5.0F, 5.0F, 6.0F), ModelTransform.NONE);
        modelPartData2.addChild(EntityModelPartNames.LEFT_EAR, ModelPartBuilder.create().uv(45, 0).cuboid(-0.5F, 7.5F, 10.5F, 3.0F, 1.0F, 2.0F), ModelTransform.pivot(2.5F, -21.0F, -9.5F));
        modelPartData2.addChild(EntityModelPartNames.RIGHT_EAR, ModelPartBuilder.create().uv(67, 0).cuboid(-2.5F, 7.5F, 10.5F, 3.0F, 1.0F, 2.0F), ModelTransform.pivot(-2.5F, -21.0F, -9.5F));
        return TexturedModelData.of(modelData, 128, 128);
    }

    @Override
    public void setHeadRotation(float animationProgress, float yaw, float pitch) {
        this.head.yaw = yaw * 0.017453292F;
        this.head.pitch = pitch * 0.017453292F;
    }

    @Override
    public Vector3f getHeadSizeInPixels() {
        return new Vector3f(7.0f, 14.0f, 7.0f);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        this.head.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}
