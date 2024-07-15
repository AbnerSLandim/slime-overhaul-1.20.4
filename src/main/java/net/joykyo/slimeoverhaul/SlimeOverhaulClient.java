package net.joykyo.slimeoverhaul;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.joykyo.slimeoverhaul.block.ModBlocks;
import net.joykyo.slimeoverhaul.entity.ModEntities;
import net.joykyo.slimeoverhaul.entity.client.IceSlimeModel;
import net.joykyo.slimeoverhaul.entity.client.IceSlimeRenderer;
import net.joykyo.slimeoverhaul.entity.client.ModModelLayers;
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

        //iniciar modelos entidades/mobs
        EntityRendererRegistry.register(ModEntities.ICE_SLIME, IceSlimeRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.ICE_SLIME, IceSlimeModel::getTexturedModelData);
    }
}


































