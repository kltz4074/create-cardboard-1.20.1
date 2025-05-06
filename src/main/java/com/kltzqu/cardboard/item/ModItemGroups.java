package com.kltzqu.cardboard.item;

import com.kltzqu.cardboard.Createcardboard;
import com.kltzqu.cardboard.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup CARDBOARD_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Createcardboard.MOD_ID, "cardboard"),
            FabricItemGroup.builder().displayName(Text.translatable("item.cardboard.cardboard"))
                    .icon(() -> new ItemStack(ModItems.CARDBOARD)).entries(((displayContext, entries) -> {
                        entries.add(ModItems.CARDBOARD);
                        entries.add(ModBlocks.CARDBOARD_BLOCK);
                        entries.add(ModBlocks.BOUND_CARDBOARD_BLOCK);

                    })).build());
    public static void registerItemGroups() {
        Createcardboard.LOGGER.info("Registering Item Groups for " + Createcardboard.MOD_ID);
    }
}
