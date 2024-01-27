package net.pedroricardo.content.models;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.entity.model.EndermiteEntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.render.entity.model.FrogEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import org.joml.Vector3f;

@Environment(EnvType.CLIENT)
public class FrogHeadEntityModel extends SkullBlockEntityModel implements HeadedRewrittenModel {
    private final ModelPart root;
    private final ModelPart head;

    public FrogHeadEntityModel(ModelPart root) {
        this.root = root.getChild(EntityModelPartNames.ROOT);
        this.head = this.root.getChild(EntityModelPartNames.BODY);
    }

    public static TexturedModelData getTexturedModelData() {
        return FrogEntityModel.getTexturedModelData();
    }

    public void setHeadRotation(float animationProgress, float yaw, float pitch) {
        yaw = yaw * 0.017453292f;
        pitch = pitch * 0.017453292f;
        float offsetZ = 3.5f;
        this.head.setPivot(0.0f, 0.0f, 0.0f);
        this.head.translate(new Vector3f(offsetZ * MathHelper.sin(yaw), 0, offsetZ * MathHelper.cos(yaw)));
        this.head.yaw = yaw;
        this.head.pitch = pitch;
        this.root.getChild(EntityModelPartNames.BODY).getChild(EntityModelPartNames.LEFT_ARM).visible = false;
        this.root.getChild(EntityModelPartNames.BODY).getChild(EntityModelPartNames.RIGHT_ARM).visible = false;
    }

    @Override
    public Vector3f getHeadSizeInPixels() {
        return new Vector3f(7.0f, 5.0f, 9.0f);
    }

    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        matrices.translate(0.0F, -0.06125, 0.0F);
        this.head.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}