package net.aerochill.bowverhaul.world.entity.projectile;

import net.aerochill.bowverhaul.init.item.ModItems;
import net.minecraft.network.protocol.Packet;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;

public class DiamondTippedArrow extends AbstractArrow
{

    public DiamondTippedArrow(EntityType<DiamondTippedArrow> entityType, Level world)
    {
        super(entityType, world);
    }

    public DiamondTippedArrow(EntityType<DiamondTippedArrow> entityType, double x, double y, double z, Level world)
    {
        super(entityType, x, y, z, world);
    }

    public DiamondTippedArrow(EntityType<DiamondTippedArrow> entityType, LivingEntity shooter, Level world)
    {
        super(entityType, shooter, world);
    }

    @Override
    public ItemStack getPickupItem()
    {
        return new ItemStack(ModItems.DIAMOND_TIPPED_ARROW.get());
    }

    @Override
    public Packet<?> getAddEntityPacket()
    {
        return NetworkHooks.getEntitySpawningPacket(this);
    }
}