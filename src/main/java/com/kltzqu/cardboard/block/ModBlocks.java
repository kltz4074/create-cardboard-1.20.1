package com.kltzqu.cardboard.block;

import com.kltzqu.cardboard.Createcardboard;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block CARDBOARD_BLOCK = registerBlock("cardboard_block",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));

    public static final Block BOUND_CARDBOARD_BLOCK = registerBlock("bound_cardboard_block",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_WOOL)));

    public static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Createcardboard.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(Createcardboard.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        Createcardboard.LOGGER.info("Registering ModBlocks for " + Createcardboard.MOD_ID);
    }
}
