package net.pedroricardo.content.models;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import org.joml.Vector3f;

@Environment(EnvType.CLIENT)
public class GuardianHeadEntityModel extends SkullBlockEntityModel implements HeadedRewrittenModel {
    private final ModelPart root;
    private final ModelPart head;

    public GuardianHeadEntityModel(ModelPart root) {
        this.root = root;
        this.head = this.root.getChild(EntityModelPartNames.HEAD);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData modelPartData2 = modelPartData.addChild(EntityModelPartNames.HEAD, ModelPartBuilder.create().uv(0, 0).cuboid(-6.0F, -12.0F, -8.0F, 12.0F, 12.0F, 16.0F).uv(0, 28).cuboid(-8.0F, -12.0F, -6.0F, 2.0F, 12.0F, 12.0F).uv(0, 28).cuboid(6.0F, -12.0F, -6.0F, 2.0F, 12.0F, 12.0F, true).uv(16, 40).cuboid(-6.0F, -14.0F, -6.0F, 12.0F, 2.0F, 12.0F).uv(16, 40).cuboid(-6.0F, 0.0F, -6.0F, 12.0F, 2.0F, 12.0F), ModelTransform.NONE);
        modelPartData2.addChild("eye", ModelPartBuilder.create().uv(8, 0).cuboid(-1.0F, -7.0F, 0.0F, 2.0F, 2.0F, 1.0F), ModelTransform.pivot(0.0F, 0.0F, -8.25F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    public void setHeadRotation(float animationProgress, float yaw, float pitch) {
        yaw = yaw * 0.017453292f;
        pitch = pitch * 0.017453292f;
        float offsetZ = 0.0f;
        this.head.setPivot(0.0f, 0.0f, 0.0f);
        this.head.translate(new Vector3f(offsetZ * MathHelper.sin(yaw), 0, offsetZ * MathHelper.cos(yaw)));
        this.head.yaw = yaw;
        this.head.pitch = pitch;
    }

    public Vector3f getHeadSizeInPixels() {
        return new Vector3f(16.0f, 16.0f, 16.0f);
    }

    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        matrices.translate(0.0f, -0.125f, 0.0f);
        this.head.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}