package net.pedroricardo.content.models;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.entity.model.SilverfishEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Vector3f;

@Environment(EnvType.CLIENT)
public class SilverfishHeadEntityModel extends SkullBlockEntityModel implements HeadedRewrittenModel {
    private final ModelPart root;
    private final ModelPart head;

    public SilverfishHeadEntityModel(ModelPart root) {
        this.root = root;
        this.head = this.root.getChild("segment0");
    }

    public static TexturedModelData getTexturedModelData() {
        return SilverfishEntityModel.getTexturedModelData();
    }

    public void setHeadRotation(float animationProgress, float yaw, float pitch) {
        this.head.setPivot(0.0f, 0.0f, 0.0f);
        this.head.yaw = yaw * 0.017453292f;
        this.head.pitch = pitch * 0.017453292f;
    }

    @Override
    public Vector3f getHeadSizeInPixels() {
        return new Vector3f(3.0f, 2.0f, 2.0f);
    }

    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        matrices.translate(0.0F, -0.125f, 0.0F);
        this.head.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}