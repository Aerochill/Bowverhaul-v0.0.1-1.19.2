package net.aerochill.bowverhaul.world.entity.projectile;

import net.aerochill.bowverhaul.init.EntityInit;
import net.aerochill.bowverhaul.init.item.ModItems;
import net.minecraft.network.protocol.Packet;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;


public class EmeraldTippedArrow extends AbstractArrow
{
    public EmeraldTippedArrow(EntityType<EmeraldTippedArrow> entityType, Level world)
    {
        super(entityType, world);
    }

    public EmeraldTippedArrow(EntityType<EmeraldTippedArrow> entityType, double x, double y, double z, Level world)
    {
        super(entityType, x, y, z, world);
    }

    public EmeraldTippedArrow(EntityType<EmeraldTippedArrow> entityType, LivingEntity shooter, Level world)
    {
        super(entityType, shooter, world);
    }

    @Override
    protected void doPostHurtEffects(LivingEntity target)
    {
        target.addEffect(new MobEffectInstance(MobEffects.LUCK, 300));
        super.doPostHurtEffects(target);
    }



    @Override
    public ItemStack getPickupItem()
    {
        return new ItemStack(ModItems.EMERALD_TIPPED_ARROW.get());
    }

    @Override
    public Packet<?> getAddEntityPacket()
    {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}

