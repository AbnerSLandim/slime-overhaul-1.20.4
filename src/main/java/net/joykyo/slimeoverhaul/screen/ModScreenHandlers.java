package net.joykyo.slimeoverhaul.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.joykyo.slimeoverhaul.SlimeOverhaul;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {

    public static final ScreenHandlerType<MailboxScreenHandler> MAILBOX_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(SlimeOverhaul.MOD_ID, "mailbox"),
                    new ExtendedScreenHandlerType<>(MailboxScreenHandler::new));

    public static void registerScreenHandlers() {
        SlimeOverhaul.LOGGER.info("Registering Screen Handlers for " + SlimeOverhaul.MOD_ID);
    }
}











