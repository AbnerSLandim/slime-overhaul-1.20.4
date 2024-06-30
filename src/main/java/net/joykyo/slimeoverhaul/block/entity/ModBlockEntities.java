package net.joykyo.slimeoverhaul.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityType;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.joykyo.slimeoverhaul.SlimeOverhaul;
import net.joykyo.slimeoverhaul.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {
    public static final BlockEntityType<MailboxBlockEntity> MAILBOX_BLOCK_ENTITY_BLOCK_ENTITY_TYPE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(SlimeOverhaul.MOD_ID, "mailbox.be"),
                    FabricBlockEntityTypeBuilder.create(MailboxBlockEntity::new,
                            ModBlocks.MAILBOX).build());

    public static void registerBlockEntities(){
        SlimeOverhaul.LOGGER.info("Registering Block entities for " + SlimeOverhaul.MOD_ID);
    }
}













