package net.pedroricardo.content.features;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.pedroricardo.content.HeadedEntityModelLayers;
import net.pedroricardo.content.models.SheepHeadWoolEntityModel;
import org.jetbrains.annotations.Nullable;

public class SheepWoolHeadFeatureRenderer extends HeadedFeatureRenderer {
    private final int color;
    private final boolean jeb_;

    public SheepWoolHeadFeatureRenderer(int color, boolean jeb_) {
        this.color = color;
        this.jeb_ = jeb_;
    }

    @Override
    public void render(@Nullable Direction direction, float yaw, float deltaTime, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        float s;
        float t;
        float u;
        if (this.jeb_) {
            int time;
            if (MinecraftClient.getInstance().world == null) {
                time = 0;
            } else {
                time = (int)MinecraftClient.getInstance().world.getTime();
            }
            int n = time / 25 + 1;
            int o = DyeColor.values().length;
            int p = n % o;
            int q = (n + 1) % o;
            float r = (float)(time % 25) / 25.0F;
            float[] fs = SheepEntity.getRgbColor(DyeColor.byId(p));
            float[] gs = SheepEntity.getRgbColor(DyeColor.byId(q));
            s = fs[0] * (1.0F - r) + gs[0] * r;
            t = fs[1] * (1.0F - r) + gs[1] * r;
            u = fs[2] * (1.0F - r) + gs[2] * r;
        } else {
            float[] hs = SheepEntity.getRgbColor(DyeColor.byId(this.color));
            s = hs[0];
            t = hs[1];
            u = hs[2];
        }
        RenderLayer renderLayer = RenderLayer.getEntityCutoutNoCullZOffset(new Identifier("textures/entity/sheep/sheep_fur.png"));
        SheepHeadWoolEntityModel model = new SheepHeadWoolEntityModel(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(HeadedEntityModelLayers.SHEEP_WOOL));

        matrices.push();
        if (direction == null) {
            matrices.translate(0.5F, 0.0F, 0.5F);
        } else {
            matrices.translate(0.5F - (float)direction.getOffsetX() * (16.0f - model.getHeadSizeInPixels().z) / 32.0f, (16.0f - model.getHeadSizeInPixels().y) / 32.0f, 0.5F - (float)direction.getOffsetZ() * (16.0f - model.getHeadSizeInPixels().z) / 32.0f);
        }

        matrices.scale(-1.0F, -1.0F, 1.0F);
        VertexConsumer vertexConsumer = vertexConsumers.getBuffer(renderLayer);
        model.setHeadRotation(deltaTime, yaw, 0.0F);
        model.render(matrices, vertexConsumer, light, OverlayTexture.DEFAULT_UV, s, t, u, 1.0F); // we can't call SkullBlockEntityRenderer.renderSkull() because it always uses 1.0f, 1.0f, 1.0f as the color
        matrices.pop();
    }
}
