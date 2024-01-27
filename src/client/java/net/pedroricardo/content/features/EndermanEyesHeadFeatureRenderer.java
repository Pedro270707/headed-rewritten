package net.pedroricardo.content.features;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.util.Identifier;
import net.pedroricardo.content.HeadedEntityModelLayers;
import net.pedroricardo.content.models.EndermanHeadEntityModel;

public class EndermanEyesHeadFeatureRenderer extends SkullEyesHeadFeatureRenderer {
    @Override
    public RenderLayer getEyesTexture() {
        return RenderLayer.getEyes(new Identifier("textures/entity/enderman/enderman_eyes.png"));
    }

    @Override
    public SkullBlockEntityModel getModel() {
        return new EndermanHeadEntityModel(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(HeadedEntityModelLayers.ENDERMAN_HEAD));
    }
}
