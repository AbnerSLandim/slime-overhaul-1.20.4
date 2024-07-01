package net.joykyo.slimeoverhaul.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.joykyo.slimeoverhaul.block.ModBlocks;
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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SLIME_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SLIMEINGOTBLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAILBOX);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModItems.{Nome Item}, Models.GENERATE)
        itemModelGenerator.register(ModItems.SLIME_GOOB, Models.GENERATED);
        itemModelGenerator.register(ModItems.SLIME_INGOT, Models.GENERATED);

        itemModelGenerator.register(ModItems.MOSSY_SLIME_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRIGID_SLIME_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.PETRIFIED_SLIME_BALL, Models.GENERATED);

        itemModelGenerator.register(ModItems.OPEN_LETTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLOSED_LETTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.STAMP_TEMPLATE, Models.GENERATED);
    }
}
