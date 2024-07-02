package net.joykyo.slimeoverhaul.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.joykyo.slimeoverhaul.block.ModBlocks;
import net.joykyo.slimeoverhaul.item.ModItems;

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
    }

}
