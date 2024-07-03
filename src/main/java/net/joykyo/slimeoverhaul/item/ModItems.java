package net.joykyo.slimeoverhaul.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.joykyo.slimeoverhaul.SlimeOverhaul;
import net.joykyo.slimeoverhaul.block.ModBlocks;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SLIME_GOO = registerItem("slime_goo", new Item(new FabricItemSettings()));
    public static final Item SUSPECT_GOO = registerItem("suspect_goo", new Item(new FabricItemSettings()));
    public static final Item SLIME_INGOT = registerItem("slime_ingot", new Item(new FabricItemSettings()));
    public static final Item STAMP_TEMPLATE = registerItem("stamp_template", new Item(new FabricItemSettings()));
    public static final Item PETRIFIED_SLIME_BALL = registerItem("petrified_slime_ball", new Item(new FabricItemSettings()));
    public static final Item FRIGID_SLIME_BALL = registerItem("frigid_slime_ball", new Item(new FabricItemSettings()));
    public static final Item MOSSY_SLIME_BALL = registerItem("mossy_slime_ball", new Item(new FabricItemSettings()));
    public static final Item OPEN_LETTER = registerItem("open_letter", new Item(new FabricItemSettings()));
    public static final Item CLOSED_LETTER = registerItem("closed_letter", new Item(new FabricItemSettings()));

    // Sementes
    public static final Item GLOUP_SEEDS = registerItem("gloup_seeds",
            new AliasedBlockItem(ModBlocks.GLOUP_CROP, new FabricItemSettings()));
    public static final Item ADRENA_SEEDS = registerItem("adrena_seeds",
            new AliasedBlockItem(ModBlocks.ADRENA_CROP, new FabricItemSettings()));

    // Comidas
    public static final Item GLOUP = registerItem("gloup", new Item(new FabricItemSettings().food(ModFoodComponents.GLOUP)));
    public static final Item ADRENA = registerItem("adrena", new Item(new FabricItemSettings().food(ModFoodComponents.ADRENA)));

    // Ferramentas
    public static final Item SLIME_GAUNTLET = registerItem("slime_gauntlet_3d",
            new Item(new FabricItemSettings().maxCount(1)));


    // Eu acho que não é necessário
    private static void addItemsToGradientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(SLIME_GOO);
        entries.add(SLIME_INGOT);
        entries.add(STAMP_TEMPLATE);
        entries.add(PETRIFIED_SLIME_BALL);
        entries.add(FRIGID_SLIME_BALL);
        entries.add(MOSSY_SLIME_BALL);
        entries.add(OPEN_LETTER);
        entries.add(CLOSED_LETTER);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(SlimeOverhaul.MOD_ID, name), item);
    }

    public static void registerModItems() {
        SlimeOverhaul.LOGGER.info("Registering Mod Items for " + SlimeOverhaul.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToGradientTabItemGroup);
    }
}
