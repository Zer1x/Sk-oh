package net.m0ri13.skoh.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.m0ri13.skoh.SkeletonOverhaul;
import net.m0ri13.skoh.entity.ModEntities;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //mushroom_skeleton_spore
    public static final Item MUSHROOM_SKELETON_SPORE = registerItem("mushroom_skeleton_spore", new Item(new Item.Settings()));


    public static void registerModItems(){
        SkeletonOverhaul.LOGGER.info("Registering Mod Items for " + SkeletonOverhaul.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MUSHROOM_SKELETON_SPORE);
        });
    }

    public static final Item MUSHROOM_SKELETON_SPAWN_EGG = registerItem("mushroom_skeleton_spawn_egg",
            new SpawnEggItem(ModEntities.MUSHROOM_SKELETON,
                    0xFF0000,   // основной — ярко‑красный
                    0x8B00FF,   // вторичный — фиолетовый
                    new Item.Settings().maxCount(64)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(SkeletonOverhaul.MOD_ID, name), item);
    }

}
