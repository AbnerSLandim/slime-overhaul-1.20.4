package net.joykyo.slimeoverhaul;

import net.fabricmc.api.ClientModInitializer;
import net.joykyo.slimeoverhaul.screen.MailboxScreen;
import net.joykyo.slimeoverhaul.screen.ModScreenHandlers;
import net.minecraft.client.gui.screen.ingame.HandledScreens;

public class SlimeOverhaulClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        HandledScreens.register(ModScreenHandlers.MAILBOX_SCREEN_HANDLER, MailboxScreen::new);
    }
}
