package net.joykyo.slimeoverhaul.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static final FoodComponent GLOUP = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100), 1).build();
    public static final FoodComponent ADRENA = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f).alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 100), 1).build();
}
