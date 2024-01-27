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
public class PolarBearHeadEntityModel extends SkullBlockEntityModel implements HeadedRewrittenModel {
    private final ModelPart head;

    public PolarBearHeadEntityModel(ModelPart root) {
        this.head = root.getChild(EntityModelPartNames.HEAD);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        modelPartData.addChild(EntityModelPartNames.HEAD, ModelPartBuilder.create().uv(0, 0).cuboid(-3.5F, -7.0F, -3.5F, 7.0F, 7.0F, 7.0F).uv(0, 44).cuboid(EntityModelPartNames.MOUTH, -2.5F, -3.0F, -6.5F, 5.0F, 3.0F, 3.0F).uv(26, 0).cuboid(EntityModelPartNames.RIGHT_EAR, -4.5F, -8.0F, -1.5F, 2.0F, 2.0F, 1.0F).uv(26, 0).mirrored().cuboid(EntityModelPartNames.LEFT_EAR, 2.5F, -8.0F, -1.5F, 2.0F, 2.0F, 1.0F), ModelTransform.NONE);
        return TexturedModelData.of(modelData, 128, 64);
    }

    public Vector3f getHeadSizeInPixels() {
        return new Vector3f(7.0f, 7.0f, 7.0f);
    }
    public void setHeadRotation(float animationProgress, float yaw, float pitch) {
        this.head.yaw = yaw * 0.017453292F;
        this.head.pitch = pitch * 0.017453292F;
    }

    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        this.head.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}