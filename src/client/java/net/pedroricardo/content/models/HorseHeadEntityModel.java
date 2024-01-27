package net.pedroricardo.content.models;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.entity.model.HorseEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import org.joml.Vector3f;

@Environment(EnvType.CLIENT)
public class HorseHeadEntityModel extends SkullBlockEntityModel implements HeadedRewrittenModel {
    private final ModelPart root;
    private final ModelPart head;

    public HorseHeadEntityModel(ModelPart root) {
        this.root = root;
        this.head = this.root.getChild("head_parts");
    }

    public static TexturedModelData getTexturedModelData() {
        return TexturedModelData.of(HorseEntityModel.getModelData(Dilation.NONE), 64, 64);
    }

    public void setHeadRotation(float animationProgress, float yaw, float pitch) {
        yaw = yaw * 0.017453292f;
        pitch = pitch * 0.017453292f;
        float offsetZ = -1.5f;
        this.head.setPivot(0.0f, 0.0f, 0.0f);
        this.head.translate(new Vector3f(offsetZ * MathHelper.sin(yaw), 0, offsetZ * MathHelper.cos(yaw)));
        this.head.yaw = yaw;
        this.head.pitch = pitch;
    }

    public Vector3f getHeadSizeInPixels() {
        return new Vector3f(4.0f, 16.0f, 7.0f);
    }

    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        matrices.translate(0.0F, -0.3675f, 0.0F);
        this.head.getChild("left_saddle_mouth").visible = false;
        this.head.getChild("right_saddle_mouth").visible = false;
        this.head.getChild("left_saddle_line").visible = false;
        this.head.getChild("right_saddle_line").visible = false;
        this.head.getChild("head_saddle").visible = false;
        this.head.getChild("mouth_saddle_wrap").visible = false;
        this.head.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}