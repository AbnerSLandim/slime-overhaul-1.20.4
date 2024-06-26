package net.joykyo.slimeoverhaul.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SlimedEffect extends StatusEffect {
    private static final Logger LOGGER = LoggerFactory.getLogger(SlimedEffect.class);

    public SlimedEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;
            if (player.isOnGround() && player.fallDistance > 0) {
                player.setVelocity(player.getVelocity().x, 0.8, player.getVelocity().z); // Ajuste a força do impulso conforme necessário
                player.fallDistance = 0;
                LOGGER.info("Player {} bounced with SlimedEffect", player.getName().getString());
            }
        }
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true; // Isso garante que o efeito seja aplicado a cada tick
    }
}
