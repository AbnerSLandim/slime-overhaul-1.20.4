package net.joykyo.slimeoverhaul.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.joykyo.slimeoverhaul.SlimeOverhaul;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SLIME_GOOB = registerItem("slime_goob", new Item(new FabricItemSettings()));
    public static final Item SLIME_INGOT = registerItem("slime_ingot", new Item(new FabricItemSettings()));

    private static void addItemsToGradientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(SLIME_GOOB);
        entries.add(SLIME_INGOT);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SlimeOverhaul.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SlimeOverhaul.LOGGER.info("Registering Mod Items for " + SlimeOverhaul.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToGradientTabItemGroup);
    }
}
