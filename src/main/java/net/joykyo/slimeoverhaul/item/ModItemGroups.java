package net.joykyo.slimeoverhaul.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.joykyo.slimeoverhaul.SlimeOverhaul;
import net.joykyo.slimeoverhaul.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SLIME_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(SlimeOverhaul.MOD_ID, "slime"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.slime"))
                    .icon(() -> new ItemStack(ModItems.SLIME_GOOB)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SLIME_GOOB);
                        entries.add(ModItems.SLIME_INGOT);
                        entries.add(ModItems.STAMP_TEMPLATE);
                        entries.add(ModBlocks.SLIMEINGOTBLOCK);
<<<<<<< Updated upstream
                        entries.add(ModItems.OPEN_LETTER);
                        entries.add(ModItems.CLOSED_LETTER);
=======
                        entries.add(ModBlocks.SLIME_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SLIME_ORE);
>>>>>>> Stashed changes
                        entries.add(ModItems.PETRIFIED_SLIME_BALL);
                        entries.add(ModItems.FRIGID_SLIME_BALL);
                        entries.add(ModItems.MOSSY_SLIME_BALL);
                        entries.add(ModItems.SLIME_GAUNTLET);

                    }).build());


    public static void registerItemGroups() {
        SlimeOverhaul.LOGGER.info("Registering Item Groups for " +SlimeOverhaul.MOD_ID);
    }
}
