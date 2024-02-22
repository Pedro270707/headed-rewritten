package net.pedroricardo.content.models;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.entity.model.ChickenEntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import org.joml.Vector3f;

@Environment(EnvType.CLIENT)
public class ChickenHeadEntityModel extends SkullBlockEntityModel implements HeadedRewrittenModel {
    private final ModelPart head;
    private final ModelPart beak;
    private final ModelPart wattle;

    public ChickenHeadEntityModel(ModelPart root) {
        this.head = root.getChild(EntityModelPartNames.HEAD);
        this.beak = root.getChild(EntityModelPartNames.BEAK);
        this.wattle = root.getChild(ChickenEntityModel.RED_THING);
    }

    public static TexturedModelData getTexturedModelData() {
        return ChickenEntityModel.getTexturedModelData();
    }

    public Vector3f getHeadSizeInPixels() {
        return new Vector3f(4.0f, 6.0f, 3.0f);
    }

    public void setHeadRotation(float animationProgress, float yaw, float pitch) {
        yaw = yaw * 0.017453292f;
        pitch = pitch * 0.017453292f;
        float offsetZ = 0.5f;
        this.head.setPivot(0.0f, 0.0f, 0.0f);
        this.beak.setPivot(0.0f, 0.0f, 0.0f);
        this.wattle.setPivot(0.0f, 0.0f, 0.0f);
        this.head.translate(new Vector3f(offsetZ * MathHelper.sin(yaw), 0, offsetZ * MathHelper.cos(yaw)));
        this.beak.translate(new Vector3f(offsetZ * MathHelper.sin(yaw), 0, offsetZ * MathHelper.cos(yaw)));
        this.wattle.translate(new Vector3f(offsetZ * MathHelper.sin(yaw), 0, offsetZ * MathHelper.cos(yaw)));
        this.head.yaw = this.beak.yaw = this.wattle.yaw = yaw;
        this.head.pitch = this.beak.pitch = this.wattle.pitch = pitch;
    }

    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        this.head.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        this.beak.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        this.wattle.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}