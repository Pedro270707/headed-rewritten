package net.pedroricardo.content.models;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.render.entity.model.VillagerResemblingModel;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Vector3f;

@Environment(EnvType.CLIENT)
public class VillagerHeadEntityModel extends SkullBlockEntityModel implements HeadedRewrittenModel {
    private final ModelPart head;
    private final ModelPart nose;
    private final ModelPart hat;
    private final ModelPart hatRim;

    public VillagerHeadEntityModel(ModelPart root) {
        this.head = root.getChild(EntityModelPartNames.HEAD);
        this.nose = this.head.getChild(EntityModelPartNames.NOSE);
        this.hat = this.head.getChild(EntityModelPartNames.HAT);
        this.hatRim = this.hat.getChild(EntityModelPartNames.HAT_RIM);
    }

    public static ModelData getModelData() {
        return VillagerResemblingModel.getModelData();
    }

    public static TexturedModelData getTexturedModelData() {
        return TexturedModelData.of(VillagerResemblingModel.getModelData(), 64, 64);
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