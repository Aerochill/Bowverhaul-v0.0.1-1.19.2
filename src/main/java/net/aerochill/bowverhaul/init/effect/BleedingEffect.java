package net.aerochill.bowverhaul.init.effect;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;

public class BleedingEffect extends MobEffect
{
    public BleedingEffect(MobEffectCategory mobEffectCategory, int color)
    {
        super(mobEffectCategory, color);
    }

    @Override
    public void applyEffectTick(LivingEntity entity, int amplifier)
    {
        if (!entity.level.isClientSide())
        {
            entity.hurt(DamageSource.MAGIC, 1.0F);
        }

    }

    @Override
    public boolean isDurationEffectTick(int duration, int amplifier)
    {
        int j = 25 >> amplifier;
        if (j > 0)
        {
            return duration % j == 0;
        }
        else
        {
            return true;
        }
    }
}
