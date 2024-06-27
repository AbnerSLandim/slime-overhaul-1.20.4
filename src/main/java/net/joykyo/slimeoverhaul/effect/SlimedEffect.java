package net.joykyo.slimeoverhaul.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class SlimedEffect extends StatusEffect {
    public SlimedEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        World world = entity.getEntityWorld();
        BlockPos pos = entity.getBlockPos();

        // Check if the entity is falling
        if (entity.isFallFlying() || entity.fallDistance > 0.0F) {
            // Simulate slime block behavior
            entity.handleFallDamage(entity.fallDistance, 0.0F, null); // Prevent fall damage
            entity.fallDistance = 0.0F; // Reset fall distance

            // Apply bounce effect: add vertical motion
            Vec3d motion = entity.getVelocity();
            entity.setVelocity(motion.x, 0.8 * motion.y, motion.z); // Adjust the multiplier as needed
        }

        super.applyUpdateEffect(entity, amplifier);
    }
}
