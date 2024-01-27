package net.pedroricardo.content.features;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.client.render.block.entity.SkullBlockEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.registry.Registries;
import net.minecraft.util.math.Direction;
import net.minecraft.village.VillagerProfession;
import net.pedroricardo.content.HeadedEntityModelLayers;
import net.pedroricardo.content.models.VillagerHeadEntityModel;
import org.jetbrains.annotations.Nullable;

public class VillagerProfessionHeadFeatureRenderer extends HeadedFeatureRenderer {
    private final VillagerProfession profession;
    private final String path;

    public VillagerProfessionHeadFeatureRenderer(VillagerProfession profession) {
        this.profession = profession;
        this.path = "villager";
    }

    public VillagerProfessionHeadFeatureRenderer(VillagerProfession profession, String path) {
        this.profession = profession;
        this.path = path;
    }

    @Override
    public void render(@Nullable Direction direction, float yaw, float deltaTime, MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light) {
        RenderLayer renderLayer = RenderLayer.getEntityCutoutNoCull(Registries.VILLAGER_PROFESSION.getId(this.profession).withPath(path -> "textures/entity/" + this.path + "/profession/" + path + ".png"));
        SkullBlockEntityModel model = new VillagerHeadEntityModel(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(HeadedEntityModelLayers.VILLAGER_HAT));

        SkullBlockEntityRenderer.renderSkull(direction, yaw, deltaTime, matrices, vertexConsumers, light, model, renderLayer);
    }
}
