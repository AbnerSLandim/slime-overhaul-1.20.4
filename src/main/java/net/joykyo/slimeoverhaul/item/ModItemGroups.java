package net.joykyo.slimeoverhaul.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.joykyo.slimeoverhaul.SlimeOverhaul;
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
                    .icon(() -> new ItemStack(Moditems.SLIME_GOOB)).entries((displayContext, entries) -> {
                        entries.add(Moditems.SLIME_GOOB);
                        entries.add(Moditems.SLIME_INGOT);
                        entries.add(Moditems.STAMP_TEMPLATE);
                    }).build());


    public static void registerItemGroups() {
        SlimeOverhaul.LOGGER.info("Registering Item Groups for " +SlimeOverhaul.MOD_ID);
    }
}
