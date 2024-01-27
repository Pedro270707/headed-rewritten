package net.pedroricardo.content.models;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Vector3f;

@Environment(EnvType.CLIENT)
public class RabbitHeadEntityModel extends SkullBlockEntityModel implements HeadedRewrittenModel {
    private final ModelPart head;
    private final ModelPart rightEar;
    private final ModelPart leftEar;
    private final ModelPart nose;

    public RabbitHeadEntityModel(ModelPart root) {
        this.head = root.getChild(EntityModelPartNames.HEAD);

        this.rightEar = this.head.getChild(EntityModelPartNames.RIGHT_EAR);
        this.leftEar = this.head.getChild(EntityModelPartNames.LEFT_EAR);

        this.nose = this.head.getChild(EntityModelPartNames.NOSE);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData modelPartData2 = modelPartData.addChild(EntityModelPartNames.HEAD, ModelPartBuilder.create().uv(32, 0).cuboid(-2.5F, -4.0F, -2.5F, 5.0F, 4.0F, 5.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        modelPartData2.addChild(EntityModelPartNames.RIGHT_EAR, ModelPartBuilder.create().uv(52, 0).cuboid(-2.0F, -9.0F, 1.5F, 2.0F, 5.0F, 1.0F), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -0.2617994F, 0.0F));
        modelPartData2.addChild(EntityModelPartNames.LEFT_EAR, ModelPartBuilder.create().uv(58, 0).cuboid(0.0F, -9.0F, 1.5F, 2.0F, 5.0F, 1.0F), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 0.2617994F, 0.0F));
        modelPartData2.addChild(EntityModelPartNames.NOSE, ModelPartBuilder.create().uv(32, 9).cuboid(-0.5F, -2.5F, -3.0F, 1.0F, 1.0F, 1.0F), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 32);
    }

    public Vector3f getHeadSizeInPixels() {
        return new Vector3f(5.0f, 4.0f, 5.0f);
    }

    public void setHeadRotation(float animationProgress, float yaw, float pitch) {
        this.head.yaw = yaw * 0.017453292F;
        this.head.pitch = pitch * 0.017453292F;
        this.rightEar.pitch = pitch * 0.017453292F;
        this.leftEar.pitch = pitch * 0.017453292F;
    }

    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        this.head.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}