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
public class WitchHeadEntityModel extends SkullBlockEntityModel implements HeadedRewrittenModel {
    private final ModelPart head;

    public WitchHeadEntityModel(ModelPart root) {
        this.head = root.getChild(EntityModelPartNames.HEAD);
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = VillagerLikeHeadEntityModel.getModelData();
        ModelPartData modelPartData = modelData.getRoot().getChild(EntityModelPartNames.HEAD);
        ModelPartData modelPartData2 = modelPartData.addChild(EntityModelPartNames.HAT, ModelPartBuilder.create().uv(0, 64).cuboid(0.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F), ModelTransform.pivot(-5.0F, -10.03125F, -5.0F));
        ModelPartData modelPartData3 = modelPartData2.addChild("hat2", ModelPartBuilder.create().uv(0, 76).cuboid(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F), ModelTransform.of(1.75F, -4.0F, 2.0F, -0.05235988F, 0.0F, 0.02617994F));
        ModelPartData modelPartData4 = modelPartData3.addChild("hat3", ModelPartBuilder.create().uv(0, 87).cuboid(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F), ModelTransform.of(1.75F, -4.0F, 2.0F, -0.10471976F, 0.0F, 0.05235988F));
        modelPartData4.addChild("hat4", ModelPartBuilder.create().uv(0, 95).cuboid(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.25F)), ModelTransform.of(1.75F, -2.0F, 2.0F, -0.20943952F, 0.0F, 0.10471976F));
        ModelPartData modelPartData5 = modelPartData.getChild(EntityModelPartNames.NOSE);
        modelPartData5.addChild("mole", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, 3.0F, -6.75F, 1.0F, 1.0F, 1.0F, new Dilation(-0.25F)), ModelTransform.pivot(0.0F, -2.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 128);
    }

    public Vector3f getHeadSizeInPixels() {
        return new Vector3f(8.0f, 10.0f, 8.0f);
    }

    public void setHeadRotation(float animationProgress, float yaw, float pitch) {
        this.head.yaw = yaw * 0.017453292F;
        this.head.pitch = pitch * 0.017453292F;
    }

    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        this.head.render(matrices, vertices, light, overlay, red, green, blue, alpha);
    }
}