package net.joykyo.slimeoverhaul.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.joykyo.slimeoverhaul.SlimeOverhaul;
import net.joykyo.slimeoverhaul.block.custom.AdrenaCropBlock;
import net.joykyo.slimeoverhaul.block.custom.GloupCropBlock;
import net.joykyo.slimeoverhaul.block.custom.Mailbox;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    // Blocos
    public static final Block SLIMEINGOTBLOCK = registerBlock("slime_ingot_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block PETRIFIED_SLIME_BLOCK = registerBlock("petrified_slime_block", new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block SLIME_ORE = registerBlock("slime_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(2f)));
    public static final Block DEEPSLATE_SLIME_ORE = registerBlock("deepslate_slime_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE).strength(4f)));

    // Caixa de Correio
    public static final Block MAILBOX = registerBlock("mailbox",
            new Mailbox(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    // Plantação
    public static final Block GLOUP_CROP = Registry.register(Registries.BLOCK, new Identifier(SlimeOverhaul.MOD_ID, "gloup_crop"),
            new GloupCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block ADRENA_CROP = Registry.register(Registries.BLOCK, new Identifier(SlimeOverhaul.MOD_ID, "adrena_crop"),
            new AdrenaCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

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