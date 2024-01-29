package net.pedroricardo.content.models;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.entity.model.BatEntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Vector3f;

@Environment(EnvType.CLIENT)
public class BatHeadEntityModel extends SkullBlockEntityModel implements HeadedRewrittenModel {
    private final ModelPart head;

    public BatHeadEntityModel(ModelPart root) {
        this.head = root.getChild(EntityModelPartNames.HEAD);
    }

    public static TexturedModelData getTexturedModelData() {
        return BatEntityModel.getTexturedModelData();
    }

    public Vector3f getHeadSizeInPixels() {
        return new Vector3f(2.0f, 2.0f, 2.0f);
    }

    public void setHeadRotation(float animationProgress, float yaw, float pitch) {
        this.head.yaw = yaw * 0.017453292F;
        this.head.pitch = pitch * 0.017453292F;
    }

    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        matrices.scale(0.35f, 0.35f, 0.35f);
        matrices.translate(0.0f, -0.1929375f, 0.0f);
        this.head.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}