package net.joykyo.slimeoverhaul.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.joykyo.slimeoverhaul.block.ModBlocks;
import net.joykyo.slimeoverhaul.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OPEN_LETTER,1 )
                .pattern("")
                .pattern("###")
                .pattern("###")
                .input('#' ,Items.PAPER)
                .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OPEN_LETTER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CLOSED_LETTER, 1)
                .input(ModItems.OPEN_LETTER)
                .input(ModItems.STAMP_TEMPLATE)
                .criterion(hasItem(ModItems.OPEN_LETTER), conditionsFromItem(ModItems.OPEN_LETTER))
                .criterion(hasItem(ModItems.STAMP_TEMPLATE), conditionsFromItem(ModItems.STAMP_TEMPLATE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.CLOSED_LETTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STAMP_TEMPLATE,1)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .input('#', Items.PAPER)
                .input('S', Items.SLIME_BALL)
                .criterion(hasItem(Items.SLIME_BALL), conditionsFromItem(Items.SLIME_BALL))
                .criterion(hasItem(Items.PAPER), conditionsFromItem(Items.PAPER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STAMP_TEMPLATE)));


    }
}
