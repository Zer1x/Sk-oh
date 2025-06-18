package net.m0ri13.skoh.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.CreeperEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.SkeletonEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.TurtleEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.entity.AnimationState;
import net.minecraft.entity.EquipmentSlot;                // ★ new
import net.minecraft.item.ItemStack;                      // ★ new
import net.minecraft.item.Items;                          // ★ new
import net.minecraft.sound.SoundEvents;                   // ★ new

public class MushroomSkeletonEntity extends SkeletonEntity{
    public final AnimationState idleAnimationState = new AnimationState();
    public final AnimationState shootAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;

    private boolean bowSoundPlayed = false;


    @Override
    protected void initGoals() {
      //  this.goalSelector.add(2, new AvoidSunlightGoal(this));
       // this.goalSelector.add(3, new EscapeSunlightGoal(this, 1.0));
        this.goalSelector.add(3, new FleeEntityGoal(this, WolfEntity.class, 6.0F, 1.0, 1.2));
        this.goalSelector.add(5, new WanderAroundFarGoal(this, 1.0));
        this.goalSelector.add(6, new LookAtEntityGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.add(6, new LookAroundGoal(this));
        this.targetSelector.add(1, new RevengeGoal(this));
        this.targetSelector.add(2, new ActiveTargetGoal(this, PlayerEntity.class, true));
        this.targetSelector.add(3, new ActiveTargetGoal(this, IronGolemEntity.class, true));
        this.targetSelector.add(3, new ActiveTargetGoal(this, TurtleEntity.class, 10, true, false, TurtleEntity.BABY_TURTLE_ON_LAND_FILTER));
    }

    public static DefaultAttributeContainer.Builder createAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 35)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.25)
                //  .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 25)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 10);

    }

    private void setupAnimationStates() {
        if(this.idleAnimationTimeout <= 0){
            this.idleAnimationTimeout = 40;
            this.idleAnimationState.start(this.age);
        } else {
            --this.idleAnimationTimeout;
        }


        // -------- SHOOT ----------
        // BowAttackGoal вызывает startUsingItem(), пока моб натягивает лук.
        if (this.isUsingItem()) {                                  // ★ new
            if (!this.shootAnimationState.isRunning()) {
                this.shootAnimationState.start(this.age);         // запускаем
            }
        } else {
            this.shootAnimationState.stop();                      // останавливаем
        }
    }

    @Override
    public void tick() {
        super.tick();
        this.extinguish();
        if(this.getWorld().isClient()) {
            this.setupAnimationStates();
        }
        // сервер: звук натягивания
        if (!this.getWorld().isClient) {
            if (this.isUsingItem()) {
                if (!bowSoundPlayed) {
                    this.getWorld().playSound(
                            null,                    // услышит каждый игрок рядом
                            this.getX(), this.getY(), this.getZ(),
                            SoundEvents.ITEM_CROSSBOW_LOADING_START,
                            this.getSoundCategory(),
                            1.0F, 1.0F);
                    bowSoundPlayed = true;
                }
            } else {
                bowSoundPlayed = false;             // сбрасываем после выстрела/отмены
            }
        }
    }

    public MushroomSkeletonEntity(EntityType<? extends SkeletonEntity> entityType, World world) {
        super(entityType, world);

        //if (!world.isClient) {                             // логика сервера
         //   this.equipStack(EquipmentSlot.MAINHAND, new ItemStack(Items.BOW));   // ★ new
       // }
    }

    @Override
    protected void dropEquipment(ServerWorld world, DamageSource source, boolean causedByPlayer) {
        super.dropEquipment(world, source, causedByPlayer);
        if (source.getAttacker() instanceof CreeperEntity creeperEntity && creeperEntity.shouldDropHead()) {
            creeperEntity.onHeadDropped();
            this.dropItem(Items.SKELETON_SKULL);
        }
    }
}

