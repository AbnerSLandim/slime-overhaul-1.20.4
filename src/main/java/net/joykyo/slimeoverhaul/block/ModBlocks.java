package net.joykyo.slimeoverhaul.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.joykyo.slimeoverhaul.SlimeOverhaul;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block SLIMEINGOTBLOCK = registerBlock("slime_ingot_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block SLIME_ORE = registerBlock("slime_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(2f)));
    public static final Block DEEPSLATE_SLIME_ORE = registerBlock("deepslate_slime_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE).strength(4f)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SlimeOverhaul.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(SlimeOverhaul.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        SlimeOverhaul.LOGGER.info("Registering ModBlocks for " + SlimeOverhaul.MOD_ID);
    }

}