package net.aerochill.bowverhaul.init.item.custom;

import net.aerochill.bowverhaul.init.EntityInit;
import net.aerochill.bowverhaul.world.entity.projectile.DiamondTippedArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class DiamondTippedArrowItem extends ArrowItem
{
    public final float damage;

    public DiamondTippedArrowItem(Properties properties, float damage)
    {
        super(properties);
        this.damage = damage;
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack stack, LivingEntity shooter)
    {
        DiamondTippedArrow arrow = new DiamondTippedArrow(EntityInit.DIAMOND_TIPPED_ARROW.get(), shooter, level);
        arrow.setBaseDamage(this.damage * 1.75);
        return arrow;
    }

    @Override
    public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.world.entity.player.Player player)
    {
        int enchant = net.minecraft.world.item.enchantment.EnchantmentHelper.getItemEnchantmentLevel(net.minecraft.world.item.enchantment.Enchantments.INFINITY_ARROWS, bow);
        return enchant <= 0 ? false : this.getClass() == DiamondTippedArrowItem.class;
    }


}