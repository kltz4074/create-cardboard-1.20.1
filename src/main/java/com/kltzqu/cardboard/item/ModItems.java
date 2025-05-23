package com.kltzqu.cardboard.item;

import com.kltzqu.cardboard.Createcardboard;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item CARDBOARD = registerItem("cardboard", new Item(new FabricItemSettings()));

    public static final Item PULP = registerItem("pulp", new Item(new FabricItemSettings()));

    private static void addItemsToEngridientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(CARDBOARD);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Createcardboard.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Createcardboard.LOGGER.info("Registering Mod Items for " + Createcardboard.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToEngridientTabItemGroup);
    }

}
