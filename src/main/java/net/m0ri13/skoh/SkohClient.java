package net.m0ri13.skoh;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.m0ri13.skoh.entity.ModEntities;
import net.m0ri13.skoh.entity.client.MushroomSkeletonModel;
import net.m0ri13.skoh.entity.client.MushroomSkeletonRenderer;

public class SkohClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(MushroomSkeletonModel.MUSHROOM_SKELETON, MushroomSkeletonModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.MUSHROOM_SKELETON, MushroomSkeletonRenderer::new);
    }
}
