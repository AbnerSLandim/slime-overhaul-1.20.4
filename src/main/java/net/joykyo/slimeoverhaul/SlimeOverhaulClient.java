package net.joykyo.slimeoverhaul;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.joykyo.slimeoverhaul.block.ModBlocks;
import net.joykyo.slimeoverhaul.screen.MailboxScreen;
import net.joykyo.slimeoverhaul.screen.ModScreenHandlers;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;

public class SlimeOverhaulClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        // Plantar Blocos ao iniciar Cliente
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GLOUP_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ADRENA_CROP, RenderLayer.getCutout());

        // Registrar menu novo ao iniciar Cliente
        HandledScreens.register(ModScreenHandlers.MAILBOX_SCREEN_HANDLER, MailboxScreen::new);
    }
}
