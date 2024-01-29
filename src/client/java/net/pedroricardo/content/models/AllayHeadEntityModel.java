package net.pedroricardo.content.models;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.model.TexturedModelData;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.entity.model.AllayEntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Vector3f;

@Environment(EnvType.CLIENT)
public class AllayHeadEntityModel extends SkullBlockEntityModel implements HeadedRewrittenModel {
    private final ModelPart root;
    private final ModelPart head;
    private final boolean glowy;

    public AllayHeadEntityModel(ModelPart root, boolean glowy) {
        this.root = root.getChild(EntityModelPartNames.ROOT);
        this.head = this.root.getChild(EntityModelPartNames.HEAD);
        this.glowy = glowy;
    }

    public static TexturedModelData getTexturedModelData() {
        return AllayEntityModel.getTexturedModelData();
    }

    public void setHeadRotation(float animationProgress, float yaw, float pitch) {
        this.head.yaw = yaw * 0.017453292F;
        this.head.pitch = pitch * 0.017453292F;
    }

    public Vector3f getHeadSizeInPixels() {
        return new Vector3f(5.0f, 5.0f, 5.0f);
    }

    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        matrices.translate(0.0F, 0.25F, 0.0F);
        this.head.render(matrices, vertices, this.glowy ? LightmapTextureManager.MAX_LIGHT_COORDINATE : light, overlay, red, green, blue, alpha);
    }
}