package net.joykyo.slimeoverhaul.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.joykyo.slimeoverhaul.block.ModBlocks;
import net.joykyo.slimeoverhaul.block.custom.AdrenaCropBlock;
import net.joykyo.slimeoverhaul.block.custom.GloupCropBlock;
import net.joykyo.slimeoverhaul.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;


public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SLIME_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PETRIFIED_SLIME_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SLIME_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SLIMEINGOTBLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.PETRIFIED_SLIME_BLOCK);

        blockStateModelGenerator.registerSimpleState(ModBlocks.MAILBOX);

        // Registrar Plantação na geração de mundo
        blockStateModelGenerator.registerCrop(ModBlocks.GLOUP_CROP, GloupCropBlock.AGE, 0, 1, 2, 3, 4, 5);
        blockStateModelGenerator.registerCrop(ModBlocks.ADRENA_CROP, AdrenaCropBlock.AGE, 0, 1, 2, 3, 4, 5);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModItems.{Nome Item}, Models.GENERATE)
        itemModelGenerator.register(ModItems.SLIME_GOO, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUSPECT_GOO, Models.GENERATED);
        itemModelGenerator.register(ModItems.SLIME_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.ADRENA, Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOUP, Models.GENERATED);

        itemModelGenerator.register(ModItems.MOSSY_SLIME_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRIGID_SLIME_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.PETRIFIED_SLIME_BALL, Models.GENERATED);

        itemModelGenerator.register(ModItems.OPEN_LETTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLOSED_LETTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.STAMP_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ModItems.ADRENA,Models.GENERATED);
        itemModelGenerator.register(ModItems.GLOUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUSPECT_GOO,Models.GENERATED);
    }
}
