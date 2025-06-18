package net.m0ri13.skoh.entity.client;

import net.m0ri13.skoh.SkeletonOverhaul;
import net.m0ri13.skoh.entity.custom.MushroomSkeletonEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class MushroomSkeletonModel<T extends MushroomSkeletonEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer MUSHROOM_SKELETON = new EntityModelLayer(Identifier.of(SkeletonOverhaul.MOD_ID, "mushroom_skeleton"), "main");

    private final ModelPart waist;
    private final ModelPart body;
    private final ModelPart head;
    private final ModelPart mushroom_cap;
    private final ModelPart left_arm;
    private final ModelPart leftItem;
    private final ModelPart Bow;
    private final ModelPart pixels;
    private final ModelPart again;
    private final ModelPart pix;
    private final ModelPart els;
    private final ModelPart rarrr;
    private final ModelPart grib;
    private final ModelPart lmao;
    private final ModelPart xxxd;
    private final ModelPart arrow;
    private final ModelPart kek;
    private final ModelPart cvh;
    private final ModelPart right_arm;
    public final ModelPart rightItem;
    private final ModelPart left_leg;
    private final ModelPart right_leg;
    public MushroomSkeletonModel(ModelPart root) {
        this.waist = root.getChild("waist");
        this.body = this.waist.getChild("body");
        this.head = this.waist.getChild("head");
        this.mushroom_cap = this.head.getChild("mushroom_cap");
        this.left_arm = this.waist.getChild("left_arm");
        this.leftItem = this.left_arm.getChild("leftItem");
        this.Bow = this.leftItem.getChild("Bow");
        this.pixels = this.Bow.getChild("pixels");
        this.again = this.Bow.getChild("again");
        this.pix = this.Bow.getChild("pix");
        this.els = this.Bow.getChild("els");
        this.rarrr = this.Bow.getChild("rarrr");
        this.grib = this.rarrr.getChild("grib");
        this.lmao = this.Bow.getChild("lmao");
        this.xxxd = this.Bow.getChild("xxxd");
        this.arrow = this.Bow.getChild("arrow");
        this.kek = this.arrow.getChild("kek");
        this.cvh = this.arrow.getChild("cvh");
        this.right_arm = this.waist.getChild("right_arm");
        this.rightItem = this.right_arm.getChild("rightItem");
        this.left_leg = this.waist.getChild("left_leg");
        this.right_leg = this.waist.getChild("right_leg");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData waist = modelPartData.addChild("waist", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 12.0F, 0.0F));

        ModelPartData body = waist.addChild("body", ModelPartBuilder.create().uv(8, 36).cuboid(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -12.0F, 0.0F));

        ModelPartData head = waist.addChild("head", ModelPartBuilder.create().uv(0, 20).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -12.0F, 0.0F));

        ModelPartData mushroom_cap = head.addChild("mushroom_cap", ModelPartBuilder.create().uv(0, 0).cuboid(-7.0F, -11.0F, -7.0F, 14.0F, 6.0F, 14.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData left_arm = waist.addChild("left_arm", ModelPartBuilder.create().uv(0, 36).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, -10.0F, 0.0F));

        ModelPartData mushroom_r1 = left_arm.addChild("mushroom_r1", ModelPartBuilder.create().uv(0, 10).cuboid(-1.0F, -3.0F, 1.0F, 3.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, 0.0F, 1.0F, 0.0F, 3.1416F, 0.0F));

        ModelPartData leftItem = left_arm.addChild("leftItem", ModelPartBuilder.create(), ModelTransform.pivot(1.0F, 7.0F, 1.0F));

        ModelPartData Bow = leftItem.addChild("Bow", ModelPartBuilder.create(), ModelTransform.of(-2.0F, 1.0F, -1.0F, 2.3562F, 0.0F, 0.0F));

        ModelPartData pixels = Bow.addChild("pixels", ModelPartBuilder.create().uv(34, 57).cuboid(-7.5F, 23.0F, -13.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 57).cuboid(-7.5F, 26.0F, -13.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 57).cuboid(-7.5F, 22.0F, -12.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 57).cuboid(-7.5F, 20.0F, -12.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 57).cuboid(-7.5F, 15.0F, -7.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(17, 57).cuboid(-7.5F, 14.0F, -4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(17, 57).cuboid(-8.5F, 14.0F, -4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(17, 57).cuboid(-6.5F, 14.0F, -4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 57).cuboid(-7.5F, 14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, -19.0F, 8.0F));

        ModelPartData again = Bow.addChild("again", ModelPartBuilder.create().uv(43, 57).cuboid(-7.5F, 17.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(43, 57).cuboid(-7.5F, 16.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(43, 57).cuboid(-7.5F, 15.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(43, 57).cuboid(-7.5F, 16.0F, -3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(43, 57).cuboid(-7.5F, 15.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(43, 57).cuboid(-7.5F, 14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, -17.0F, 0.0F));

        ModelPartData pix = Bow.addChild("pix", ModelPartBuilder.create().uv(52, 55).cuboid(-7.5F, 13.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(52, 55).cuboid(-7.5F, 14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, -15.0F, -1.0F));

        ModelPartData els = Bow.addChild("els", ModelPartBuilder.create().uv(49, 47).cuboid(-7.5F, 1.0F, 12.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(49, 47).cuboid(-7.5F, 1.0F, 11.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(49, 47).cuboid(-7.5F, 1.0F, 10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(49, 47).cuboid(-7.5F, 2.0F, 6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(49, 47).cuboid(-7.5F, 3.0F, 5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(49, 47).cuboid(-7.5F, 3.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(49, 47).cuboid(-7.5F, 4.0F, 3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(49, 47).cuboid(-7.5F, 5.0F, 2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(49, 47).cuboid(-7.5F, 6.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(49, 47).cuboid(-7.5F, 7.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(49, 47).cuboid(-7.5F, 8.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(49, 47).cuboid(-7.5F, 9.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(49, 47).cuboid(-7.5F, 10.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(49, 47).cuboid(-7.5F, 11.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(49, 47).cuboid(-7.5F, 12.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(49, 47).cuboid(-7.5F, 13.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(49, 47).cuboid(-7.5F, 14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(49, 47).cuboid(-7.5F, 1.0F, 9.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, -7.0F, -5.0F));

        ModelPartData rarrr = Bow.addChild("rarrr", ModelPartBuilder.create().uv(33, 23).cuboid(-7.5F, 1.0F, 12.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(33, 23).cuboid(-7.5F, 2.0F, 11.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(33, 23).cuboid(-7.5F, 2.0F, 10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(33, 23).cuboid(-7.5F, 2.0F, 9.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(33, 23).cuboid(-7.5F, 3.0F, 6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(33, 23).cuboid(-7.5F, 3.0F, 5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(33, 23).cuboid(-7.5F, 7.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(33, 23).cuboid(-7.5F, 8.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(33, 23).cuboid(-7.5F, 9.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(33, 23).cuboid(-7.5F, 10.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(33, 23).cuboid(-7.5F, 11.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(33, 23).cuboid(-7.5F, 12.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(33, 23).cuboid(-7.5F, 13.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(33, 23).cuboid(-7.5F, 14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, -6.0F, -4.0F));

        ModelPartData grib = rarrr.addChild("grib", ModelPartBuilder.create().uv(55, 23).cuboid(-7.5F, 14.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(55, 23).cuboid(-7.5F, 15.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(55, 23).cuboid(-7.5F, 14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(55, 23).cuboid(-7.5F, 13.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(55, 23).cuboid(-7.5F, 12.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(55, 23).cuboid(-6.5F, 13.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(55, 23).cuboid(-6.5F, 14.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(55, 23).cuboid(-6.5F, 14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(55, 23).cuboid(-6.5F, 13.0F, -3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(55, 23).cuboid(-8.5F, 13.0F, -3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(55, 23).cuboid(-8.5F, 13.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(55, 23).cuboid(-8.5F, 14.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(55, 23).cuboid(-7.5F, 13.0F, -3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(55, 23).cuboid(-7.5F, 12.0F, -3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -12.0F, 9.0F));

        ModelPartData lmao = Bow.addChild("lmao", ModelPartBuilder.create().uv(27, 57).cuboid(-7.5F, 3.0F, 10.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(27, 57).cuboid(-7.5F, 3.0F, 9.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(27, 60).cuboid(-7.5F, 4.0F, 6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(27, 60).cuboid(-8.5F, 4.0F, 6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(27, 60).cuboid(-6.5F, 4.0F, 6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(27, 57).cuboid(-7.5F, 5.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(27, 57).cuboid(-7.5F, 8.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(27, 57).cuboid(-7.5F, 10.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(27, 57).cuboid(-7.5F, 13.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(27, 57).cuboid(-7.5F, 14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, -8.0F, -4.0F));

        ModelPartData xxxd = Bow.addChild("xxxd", ModelPartBuilder.create().uv(34, 31).cuboid(-7.5F, 5.0F, 8.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 31).cuboid(-7.5F, 6.0F, 7.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 31).cuboid(-7.5F, 7.0F, 6.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 31).cuboid(-7.5F, 8.0F, 5.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 31).cuboid(-7.5F, 9.0F, 4.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 31).cuboid(-7.5F, 10.0F, 3.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 31).cuboid(-7.5F, 11.0F, 2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 31).cuboid(-7.5F, 12.0F, 1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 31).cuboid(-7.5F, 13.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F))
                .uv(34, 31).cuboid(-7.5F, 14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, -8.0F, -2.0F));

        ModelPartData arrow = Bow.addChild("arrow", ModelPartBuilder.create().uv(9, 59).cuboid(0.3F, -5.0F, -6.0F, 1.0F, 1.0F, -1.0F, new Dilation(0.0F))
                .uv(36, 62).cuboid(0.3F, -5.0F, -7.0F, 1.0F, 1.0F, -1.0F, new Dilation(0.0F))
                .uv(36, 62).cuboid(0.3F, -6.0F, -6.0F, 1.0F, 1.0F, -1.0F, new Dilation(0.0F))
                .uv(19, 59).cuboid(0.3F, -6.0F, -7.0F, 1.0F, 1.0F, -1.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, -1.4142F, 1.4142F));

        ModelPartData kek = arrow.addChild("kek", ModelPartBuilder.create().uv(36, 59).cuboid(0.3F, -2.0F, -3.0F, 1.0F, 1.0F, -1.0F, new Dilation(0.0F))
                .uv(36, 59).cuboid(0.3F, -3.0F, -4.0F, 1.0F, 1.0F, -1.0F, new Dilation(0.0F))
                .uv(36, 59).cuboid(0.3F, -4.0F, -5.0F, 1.0F, 1.0F, -1.0F, new Dilation(0.0F))
                .uv(36, 59).cuboid(0.3F, -1.0F, -2.0F, 1.0F, 1.0F, -1.0F, new Dilation(0.0F))
                .uv(36, 59).cuboid(0.3F, 0.0F, -1.0F, 1.0F, 1.0F, -1.0F, new Dilation(0.0F))
                .uv(36, 59).cuboid(0.3F, 1.0F, 0.0F, 1.0F, 1.0F, -1.0F, new Dilation(0.0F))
                .uv(36, 59).cuboid(0.3F, 2.0F, 1.0F, 1.0F, 1.0F, -1.0F, new Dilation(0.0F))
                .uv(36, 59).cuboid(0.3F, 3.0F, 2.0F, 1.0F, 1.0F, -1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData cvh = arrow.addChild("cvh", ModelPartBuilder.create().uv(35, 25).cuboid(0.3F, 3.0F, 1.0F, 1.0F, 1.0F, -1.0F, new Dilation(0.0F))
                .uv(35, 25).cuboid(0.3F, 2.0F, 0.0F, 1.0F, 1.0F, -1.0F, new Dilation(0.0F))
                .uv(35, 25).cuboid(0.3F, 1.0F, -1.0F, 1.0F, 1.0F, -1.0F, new Dilation(0.0F))
                .uv(35, 25).cuboid(0.3F, 0.0F, -2.0F, 1.0F, 1.0F, -1.0F, new Dilation(0.0F))
                .uv(35, 25).cuboid(0.3F, -1.0F, -3.0F, 1.0F, 1.0F, -1.0F, new Dilation(0.0F))
                .uv(35, 25).cuboid(0.3F, -2.0F, -4.0F, 1.0F, 1.0F, -1.0F, new Dilation(0.0F))
                .uv(35, 25).cuboid(0.3F, -3.0F, -5.0F, 1.0F, 1.0F, -1.0F, new Dilation(0.0F))
                .uv(35, 25).cuboid(0.3F, -4.0F, -6.0F, 1.0F, 1.0F, -1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData right_arm = waist.addChild("right_arm", ModelPartBuilder.create().uv(0, 36).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, -10.0F, 0.0F));

        ModelPartData mushroom_r2 = right_arm.addChild("mushroom_r2", ModelPartBuilder.create().uv(1, 5).cuboid(0.0F, -4.0F, 1.0F, 3.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 6.0F, 1.0F, 0.0F, 3.1416F, 0.0F));

        ModelPartData rightItem = right_arm.addChild("rightItem", ModelPartBuilder.create(), ModelTransform.pivot(-1.0F, 7.0F, 1.0F));

        ModelPartData left_leg = waist.addChild("left_leg", ModelPartBuilder.create().uv(0, 36).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, 0.0F, 0.0F));

        ModelPartData mushroom_r3 = left_leg.addChild("mushroom_r3", ModelPartBuilder.create().uv(0, 0).cuboid(0.0F, -4.0F, 1.0F, 3.0F, 4.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 6.0F, 1.0F, 0.0F, 3.1416F, 1.5708F));

        ModelPartData right_leg = waist.addChild("right_leg", ModelPartBuilder.create().uv(0, 36).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(MushroomSkeletonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);
        /* --- ходьба только если не используем лук --- */
        if (!entity.isUsingItem()) {                                  // ★ new
            this.animateMovement(MushroomSkeletonAnimations.WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
        }
        //this.animateMovement(MushroomSkeletonAnimations.WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.updateAnimation(entity.idleAnimationState, MushroomSkeletonAnimations.IDLE, ageInTicks, 1f);
        this.updateAnimation(entity.shootAnimationState, MushroomSkeletonAnimations.ATTACK, ageInTicks, 1f);
    }

    private void setHeadAngles(float headYaw, float headPitch){
        headYaw = MathHelper.clamp(headYaw, -30f, 30f);
        headPitch = MathHelper.clamp(headPitch, -25f,45f);

        this.head.yaw = headYaw * 0.017453292F;
        this.head.pitch = headPitch * 0.017453292F;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        waist.render(matrices, vertexConsumer, light, overlay, color);
    }

    @Override
    public ModelPart getPart() {
        return waist;
    }
}
