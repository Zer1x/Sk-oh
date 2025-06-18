package net.m0ri13.skoh;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.m0ri13.skoh.entity.ModEntities;
import net.m0ri13.skoh.entity.custom.MushroomSkeletonEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class SkeletonOverhaul implements ModInitializer {
	public static final String MOD_ID = "skoh";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModEntities.registerModEntites();
		FabricDefaultAttributeRegistry.register(ModEntities.MUSHROOM_SKELETON, MushroomSkeletonEntity.createAttributes());
	}
}