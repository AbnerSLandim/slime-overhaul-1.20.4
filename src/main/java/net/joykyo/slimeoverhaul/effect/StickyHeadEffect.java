package net.joykyo.slimeoverhaul.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;

public class StickyHeadEffect extends StatusEffect {
    public StickyHeadEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity player) {
            World world = player.getWorld();

            // Check if there is a block directly above the player
            BlockPos pos = player.getBlockPos();
            BlockPos abovePos = pos.down();

            boolean isSolidBlockAbove = world.getBlockState(abovePos).isSolidBlock(world, abovePos);

            if (isSolidBlockAbove && !player.isSneaking()) {
                // Player is touching a solid block above and not sneaking, make them stuck
                player.setVelocity(0, 0, 0); // Stop player movement
                player.setOnGround(true); // Pretend player is on ground to prevent falling
            } else {
                // No solid block above or player is sneaking, allow player to fall or jump
                player.setOnGround(false);
            }
        }
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
