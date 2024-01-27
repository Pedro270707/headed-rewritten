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
public class SpiderHeadEntityModel extends SkullBlockEntityModel implements HeadedRewrittenModel {
    private final ModelPart root;
    protected final ModelPart head;
    private final float scale;

    public SpiderHeadEntityModel(ModelPart root, float scale) {
        this.root = root;
        this.head = root.getChild(EntityModelPartNames.HEAD);
        this.scale = scale;
    }

    public static TexturedModelData getTexturedModelData(float scale) {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        modelPartData.addChild(EntityModelPartNames.HEAD, ModelPartBuilder.create().uv(32, 4).cuboid(-4.0F, -8.0F - scale, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(scale)), ModelTransform.NONE);
        return TexturedModelData.of(modelData, 64, 32);
    }

    public Vector3f getHeadSizeInPixels() {
        return new Vector3f(this.scale * 8.0f, this.scale * 8.0f, this.scale * 8.0f);
    }

    public void setHeadRotation(float animationProgress, float yaw, float pitch) {
        this.head.yaw = yaw * 0.017453292F;
        this.head.pitch = pitch * 0.017453292F;
    }

    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        this.root.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}