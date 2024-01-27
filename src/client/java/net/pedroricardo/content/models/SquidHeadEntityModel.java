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
public class SquidHeadEntityModel extends SkullBlockEntityModel implements HeadedRewrittenModel {
    private final ModelPart root;
    private final ModelPart body;

    public SquidHeadEntityModel(ModelPart root) {
        this.root = root;
        this.body = this.root.getChild(EntityModelPartNames.BODY);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        modelPartData.addChild(EntityModelPartNames.BODY, ModelPartBuilder.create().uv(0, 0).cuboid(-6.0F, -16.0F, -6.0F, 12.0F, 16.0F, 12.0F, Dilation.NONE), ModelTransform.NONE);
        return TexturedModelData.of(modelData, 64, 32);
    }

    public void setHeadRotation(float animationProgress, float yaw, float pitch) {
        this.body.yaw = yaw * 0.017453292F;
        this.body.pitch = pitch * 0.017453292F;
    }

    public Vector3f getHeadSizeInPixels() {
        return new Vector3f(12.0f, 16.0f, 12.0f);
    }

    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        this.body.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}