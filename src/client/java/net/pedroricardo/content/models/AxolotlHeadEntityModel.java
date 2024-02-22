package net.pedroricardo.content.models;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.entity.model.AxolotlEntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import org.joml.Vector3f;

@Environment(EnvType.CLIENT)
public class AxolotlHeadEntityModel extends SkullBlockEntityModel implements HeadedRewrittenModel {

    private final ModelPart head;
    private final ModelPart topGills;
    private final ModelPart leftGills;
    private final ModelPart rightGills;

    public AxolotlHeadEntityModel(ModelPart root) {
        this.head = root.getChild(EntityModelPartNames.BODY).getChild(EntityModelPartNames.HEAD);
        this.topGills = this.head.getChild(EntityModelPartNames.TOP_GILLS);
        this.leftGills = this.head.getChild(EntityModelPartNames.LEFT_GILLS);
        this.rightGills = this.head.getChild(EntityModelPartNames.RIGHT_GILLS);
    }

    public static TexturedModelData getTexturedModelData() {
        return AxolotlEntityModel.getTexturedModelData();
    }

    public Vector3f getHeadSizeInPixels() {
        return new Vector3f(8, 5, 5);
    }

    public void setHeadRotation(float animationProgress, float yaw, float pitch) {
        yaw = yaw * 0.017453292f;
        pitch = pitch * 0.017453292f;
        float offsetZ = 2.5f;
        this.head.setPivot(0.0f, 0.0f, 0.0f);
        this.head.translate(new Vector3f(offsetZ * MathHelper.sin(yaw), 0, offsetZ * MathHelper.cos(yaw)));
        this.head.pitch = pitch;
        this.head.yaw = yaw;
        this.topGills.pitch = 30.0f * 0.017453292f;
        this.leftGills.yaw = -45.0f * 0.017453292f;
        this.rightGills.yaw = 45.0f * 0.017453292f;
    }

    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        matrices.translate(0.0F, -0.125f, 0.0F);
        this.head.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}