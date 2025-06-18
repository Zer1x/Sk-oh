package net.m0ri13.skoh.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.m0ri13.skoh.SkeletonOverhaul;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SKELETON_OVERHAUL_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(SkeletonOverhaul.MOD_ID, "skeleton_overhaul_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.MUSHROOM_SKELETON_SPORE))
                    .displayName(Text.translatable("itemgroup.skoh.skeleton_overhaul_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.MUSHROOM_SKELETON_SPORE);
                        entries.add(ModItems.MUSHROOM_SKELETON_SPAWN_EGG);
                    })

                    .build());


    public static void registerItemGroups() {
        SkeletonOverhaul.LOGGER.info("Registering Item Groups for " + SkeletonOverhaul.MOD_ID);
    }

}
