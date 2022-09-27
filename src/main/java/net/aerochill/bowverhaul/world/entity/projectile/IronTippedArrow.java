package net.aerochill.bowverhaul.world.entity.projectile;

import net.aerochill.bowverhaul.item.ModItems;
import net.aerochill.bowverhaul.world.entity.ModEntityType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class IronTippedArrow extends AbstractArrow
{
    private final Item referenceItem;

    public IronTippedArrow(EntityType<? extends AbstractArrow> type, Level level)
    {
        super(type, level);
        this.referenceItem = ModItems.IRON_TIPPED_ARROW.get();
    }

    public IronTippedArrow(LivingEntity shooter, Level level, Item referenceItem)
    {
        super(ModEntityType.IRON_TIPPED_ARROW.get(), shooter, level);
        this.referenceItem = referenceItem;
    }

    @Override
    protected ItemStack getPickupItem() {
        return new ItemStack(this.referenceItem);
    }
}
