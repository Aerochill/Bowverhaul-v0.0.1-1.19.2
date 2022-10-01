package net.aerochill.bowverhaul.init.item.custom;

import net.aerochill.bowverhaul.init.EntityInit;
import net.aerochill.bowverhaul.world.entity.projectile.IronTippedArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class IronTippedArrowItem extends ArrowItem
{
    public final float damage;

    public IronTippedArrowItem(Properties properties, float damage)
    {
        super(properties);
        this.damage = damage;
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack stack, LivingEntity shooter)
    {
        IronTippedArrow arrow = new IronTippedArrow(EntityInit.IRON_TIPPED_ARROW.get(), shooter, level);
        arrow.setBaseDamage(this.damage * 1.5);
        return arrow;
    }

    @Override
    public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.world.entity.player.Player player)
    {
        int enchant = net.minecraft.world.item.enchantment.EnchantmentHelper.getItemEnchantmentLevel(net.minecraft.world.item.enchantment.Enchantments.INFINITY_ARROWS, bow);
        return enchant <= 0 ? false : this.getClass() == IronTippedArrowItem.class;
    }


}