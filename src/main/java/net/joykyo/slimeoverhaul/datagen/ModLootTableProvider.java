package net.joykyo.slimeoverhaul.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.joykyo.slimeoverhaul.block.ModBlocks;
import net.joykyo.slimeoverhaul.block.custom.AdrenaCropBlock;
import net.joykyo.slimeoverhaul.block.custom.GloupCropBlock;
import net.joykyo.slimeoverhaul.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SLIMEINGOTBLOCK);
        addDrop(ModBlocks.MAILBOX);

        addDrop(ModBlocks.DEEPSLATE_SLIME_ORE, oreDrops(ModBlocks.DEEPSLATE_SLIME_ORE, ModItems.PETRIFIED_SLIME_BALL));
        addDrop(ModBlocks.SLIME_ORE,oreDrops(ModBlocks.SLIME_ORE, ModItems.PETRIFIED_SLIME_BALL) );

        // Loot Table das plantações
        BlockStatePropertyLootCondition.Builder builder0 = BlockStatePropertyLootCondition.builder(ModBlocks.GLOUP_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(GloupCropBlock.AGE, 5));
        addDrop(ModBlocks.GLOUP_CROP, cropDrops(ModBlocks.GLOUP_CROP, ModItems.GLOUP, ModItems.GLOUP_SEEDS, builder0));

        BlockStatePropertyLootCondition.Builder builder1 = BlockStatePropertyLootCondition.builder(ModBlocks.ADRENA_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(AdrenaCropBlock.AGE, 5));
        addDrop(ModBlocks.ADRENA_CROP, cropDrops(ModBlocks.ADRENA_CROP, ModItems.ADRENA, ModItems.ADRENA_SEEDS, builder1));
    }

}
