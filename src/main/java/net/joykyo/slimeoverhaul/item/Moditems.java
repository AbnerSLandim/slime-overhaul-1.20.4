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
    public static final Item STAMP_TEMPLATE = registerItem("stamp_template", new Item(new FabricItemSettings()));
    public static final Item PETRIFIED_SLIME_BALL = registerItem("petrified_slime_ball", new Item(new FabricItemSettings()));
    public static final Item FRIGID_SLIME_BALL = registerItem("frigid_slime_ball", new Item(new FabricItemSettings()));
    public static final Item MOSSY_SLIME_BALL = registerItem("mossy_slime_ball", new Item(new FabricItemSettings()));

    public static final Item SLIME_GAUNTLET = registerItem("slime_gauntlet",
            new Item(new FabricItemSettings().maxCount(1)));


    private static void addItemsToGradientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(SLIME_GOOB);
        entries.add(SLIME_INGOT);
        entries.add(STAMP_TEMPLATE);
        entries.add(PETRIFIED_SLIME_BALL);
        entries.add(FRIGID_SLIME_BALL);
        entries.add(MOSSY_SLIME_BALL);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SlimeOverhaul.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SlimeOverhaul.LOGGER.info("Registering Mod Items for " + SlimeOverhaul.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToGradientTabItemGroup);
    }
}
