package net.m0ri13.skoh.entity.client;

import net.m0ri13.skoh.SkeletonOverhaul;
import net.m0ri13.skoh.entity.custom.MushroomSkeletonEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.animation.Animation;
import net.minecraft.client.render.entity.animation.AnimationHelper;
import net.minecraft.client.render.entity.animation.Keyframe;
import net.minecraft.client.render.entity.animation.Transformation;
import net.minecraft.util.Identifier;

public class MushroomSkeletonRenderer extends MobEntityRenderer<MushroomSkeletonEntity, MushroomSkeletonModel<MushroomSkeletonEntity>> {

    public MushroomSkeletonRenderer(EntityRendererFactory.Context context) {
        super(context,
                new MushroomSkeletonModel<>(context.getPart(MushroomSkeletonModel.MUSHROOM_SKELETON)),
                0.45f );

        //this.addFeature(new MushroomSkeletonBowFeatureRenderer(this));
    }

    @Override
    public Identifier getTexture(MushroomSkeletonEntity entity) {
        return Identifier.of(SkeletonOverhaul.MOD_ID, "textures/entity/mushroom_skeleton/mushroom_skeleton.png");
    }
}
