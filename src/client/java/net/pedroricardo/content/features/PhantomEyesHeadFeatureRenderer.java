package net.pedroricardo.content.features;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.SkullBlockEntityModel;
import net.minecraft.util.Identifier;
import net.pedroricardo.content.HeadedEntityModelLayers;
import net.pedroricardo.content.models.EndermanHeadEntityModel;
import net.pedroricardo.content.models.PhantomHeadEntityModel;

public class PhantomEyesHeadFeatureRenderer extends SkullEyesHeadFeatureRenderer {
    @Override
    public RenderLayer getEyesTexture() {
        return RenderLayer.getEyes(new Identifier("textures/entity/phantom_eyes.png"));
    }

    @Override
    public SkullBlockEntityModel getModel() {
        return new PhantomHeadEntityModel(MinecraftClient.getInstance().getEntityModelLoader().getModelPart(HeadedEntityModelLayers.PHANTOM_EYES));
    }
}
