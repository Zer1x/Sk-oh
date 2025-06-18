package net.m0ri13.skoh.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.m0ri13.skoh.SkeletonOverhaul;
import net.m0ri13.skoh.entity.custom.MushroomSkeletonEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities {
    public static final EntityType<MushroomSkeletonEntity> MUSHROOM_SKELETON = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(SkeletonOverhaul.MOD_ID, "mushroom_skeleton"),
            EntityType.Builder.create(MushroomSkeletonEntity::new, SpawnGroup.MONSTER)
                    .dimensions(0.6f, 1.99f).build());


    public static void registerModEntites(){
        SkeletonOverhaul.LOGGER.info("Registering Mod Entities for " + SkeletonOverhaul.MOD_ID);
    }
}