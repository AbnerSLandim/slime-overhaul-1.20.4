package net.joykyo.slimeoverhaul;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlimeOverhaul implements ModInitializer {

	public static final String MOD_ID = "jk_slime_overhaul";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");

	}
}