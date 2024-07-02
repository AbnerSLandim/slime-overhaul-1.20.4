package net.joykyo.slimeoverhaul;

import net.joykyo.slimeoverhaul.block.entity.ModBlockEntities;
import net.joykyo.slimeoverhaul.effect.SlimedEffect;
import net.joykyo.slimeoverhaul.effect.StickyHeadEffect;
import net.joykyo.slimeoverhaul.item.ModItemGroups;
import net.joykyo.slimeoverhaul.item.ModItems;
import net.joykyo.slimeoverhaul.block.ModBlocks;
import net.fabricmc.api.ModInitializer;

import net.joykyo.slimeoverhaul.screen.ModScreenHandlers;
import net.joykyo.slimeoverhaul.world.gen.ModWorldGeneration;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlimeOverhaul implements ModInitializer {

	public static final String MOD_ID = "jk_slime_overhaul";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final StatusEffect SLIMED = new SlimedEffect(StatusEffectCategory.HARMFUL, 0x98D982);
	public static final StatusEffect STICKYHEAD = new StickyHeadEffect(StatusEffectCategory.HARMFUL, 0x98D982);


	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		Registry.register(Registries.STATUS_EFFECT, new Identifier("jk_slime_overhaul", "slimed"), SLIMED);
		Registry.register(Registries.STATUS_EFFECT, new Identifier("jk_slime_overhaul", "stickyhead"), STICKYHEAD);


		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();
		LOGGER.info("Hello Fabric world!");
		ModWorldGeneration.generateModWorldGen();
	}
}