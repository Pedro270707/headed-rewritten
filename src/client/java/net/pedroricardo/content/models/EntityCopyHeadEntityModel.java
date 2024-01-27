package net.pedroricardo.content.models;

import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.MathHelper;
import org.joml.Vector3f;

public class EntityCopyHeadEntityModel extends SkullBlockEntityModel implements HeadedRewrittenModel {
    private final ModelPart root;
    private final float offsetX;
    private final float offsetY;
    private final float offsetZ;
    private final Vector3f size;
    private final float yaw;
    private final float pitch;

    public EntityCopyHeadEntityModel(ModelPart root, float offsetY, Vector3f size) {
        this(root, size, 0, offsetY, 0, 0, 0);
    }


    public EntityCopyHeadEntityModel(ModelPart root, Vector3f size, float offsetX, float offsetY, float offsetZ, float yaw, float pitch) {
        this.root = root;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.offsetZ = offsetZ;
        this.size = size;
        this.yaw = yaw;
        this.pitch = pitch;
    }

    @Override
    public void setHeadRotation(float animationProgress, float yaw, float pitch) {
        yaw = (this.yaw + yaw) * 0.017453292f;
        pitch = (this.pitch + pitch) * 0.017453292f;
        this.root.translate(new Vector3f(this.offsetX * 16 * MathHelper.cos(yaw) + this.offsetZ * 16 * MathHelper.sin(yaw), -this.offsetY * 16, this.offsetX * 16 * MathHelper.sin(yaw) + this.offsetZ * 16 * MathHelper.cos(yaw)));
        this.root.yaw = yaw;
        this.root.pitch = pitch;
    }

    @Override
    public Vector3f getHeadSizeInPixels() {
        return this.size;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        this.root.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}
