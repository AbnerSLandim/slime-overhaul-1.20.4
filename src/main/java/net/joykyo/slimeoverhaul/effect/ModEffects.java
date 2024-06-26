package net.joykyo.slimeoverhaul.effect;

import net.joykyo.slimeoverhaul.SlimeOverhaul;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static StatusEffect SLIMED;
    public static StatusEffect STICKY_HEAD;

    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(SlimeOverhaul.MOD_ID, name),
                new SlimedEffect(StatusEffectCategory.HARMFUL, 3124687));
    }


    public static void registerEffects() {
        SLIMED = registerStatusEffect("slimed");
        STICKY_HEAD = registerStatusEffect("stickyhead");
    }
}
