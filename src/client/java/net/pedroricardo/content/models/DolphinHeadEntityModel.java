package net.pedroricardo.content.models;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.entity.model.DolphinEntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Vector3f;

@Environment(EnvType.CLIENT)
public class DolphinHeadEntityModel extends SkullBlockEntityModel implements HeadedRewrittenModel {
    protected final ModelPart root;
    protected final ModelPart head;

    public DolphinHeadEntityModel(ModelPart root) {
        this.root = root;
        this.head = root.getChild(EntityModelPartNames.BODY).getChild(EntityModelPartNames.HEAD);
    }

    public static TexturedModelData getTexturedModelData() {
        return DolphinEntityModel.getTexturedModelData();
    }

    public ModelPart getHead() {
        return this.head;
    }

    @Override
    public void setHeadRotation(float animationProgress, float yaw, float pitch) {
        this.head.translate(new Vector3f(0.0f, 0.0f, 3.0f));
        this.head.yaw = yaw * 0.017453292F;
        this.head.pitch = pitch * 0.017453292F;
    }

    @Override
    public Vector3f getHeadSizeInPixels() {
        return new Vector3f(8.0f, 7.0f, 6.0f);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        this.head.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}