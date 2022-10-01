package net.aerochill.bowverhaul.world.entity.projectile;

import net.aerochill.bowverhaul.init.effect.ModEffects;
import net.aerochill.bowverhaul.init.item.ModItems;
import net.minecraft.network.protocol.Packet;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;


public class ObsidianTippedArrow extends AbstractArrow
{
    public ObsidianTippedArrow(EntityType<ObsidianTippedArrow> entityType, Level world)
    {
        super(entityType, world);
    }

    public ObsidianTippedArrow(EntityType<ObsidianTippedArrow> entityType, double x, double y, double z, Level world)
    {
        super(entityType, x, y, z, world);
    }

    public ObsidianTippedArrow(EntityType<ObsidianTippedArrow> entityType, LivingEntity shooter, Level world)
    {
        super(entityType, shooter, world);
    }

    @Override
    protected void doPostHurtEffects(LivingEntity target)
    {
        target.addEffect(new MobEffectInstance(ModEffects.BLEED.get(), 60));
        super.doPostHurtEffects(target);
    }

    @Override
    public ItemStack getPickupItem()
    {
        return new ItemStack(ModItems.OBSIDIAN_TIPPED_ARROW.get());
    }

    @Override
    public Packet<?> getAddEntityPacket()
    {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}
