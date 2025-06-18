package net.m0ri13.skoh.entity.client;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.OverlayTexture;          // ★ новая import‑строка
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.feature.FeatureRendererContext;
import net.minecraft.client.render.model.json.ModelTransformationMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.m0ri13.skoh.entity.custom.MushroomSkeletonEntity;
import net.minecraft.util.math.RotationAxis;

public class MushroomSkeletonBowFeatureRenderer
        extends FeatureRenderer<MushroomSkeletonEntity,
        MushroomSkeletonModel<MushroomSkeletonEntity>> {

    public MushroomSkeletonBowFeatureRenderer(
            FeatureRendererContext<MushroomSkeletonEntity,
                    MushroomSkeletonModel<MushroomSkeletonEntity>> ctx) {
        super(ctx);
    }

    @Override
    public void render(MatrixStack matrices,
                       VertexConsumerProvider vertices,
                       int light,
                       MushroomSkeletonEntity entity,
                       float limbSwing, float limbSwingAmount,
                       float tickDelta, float age, float headYaw, float headPitch) {

        ItemStack stack = entity.getMainHandStack();
        if (stack.isEmpty()) return;

        // 1) позиционируемся в кость‑заглушку
        MushroomSkeletonModel<MushroomSkeletonEntity> model = getContextModel();
        matrices.push();
        model.rightItem.rotate(matrices);


       // matrices.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(180));// при необходимости подгоняйте
        matrices.translate(1.0F / 16.0F, 0.125F, -0.625F);
        // 2) корректный вызов renderItem (8 аргументов)
        MinecraftClient.getInstance().getItemRenderer().renderItem(
                stack,
                ModelTransformationMode.THIRD_PERSON_RIGHT_HAND,
                light,
                OverlayTexture.DEFAULT_UV,
                matrices,
                vertices,
                entity.getWorld(),                        // можно передать null, но так безопаснее
                0                                         // seed
        );

        matrices.pop();
    }
}
