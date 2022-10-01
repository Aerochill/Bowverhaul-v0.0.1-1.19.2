package net.aerochill.bowverhaul.init.item.custom;

import net.aerochill.bowverhaul.init.EntityInit;
import net.aerochill.bowverhaul.world.entity.projectile.DiamondTippedArrow;
import net.aerochill.bowverhaul.world.entity.projectile.ObsidianTippedArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ObsidianTippedArrowItem extends ArrowItem
{
    public final float damage;

    public ObsidianTippedArrowItem(Properties properties, float damage)
    {
        super(properties);
        this.damage = damage;
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack stack, LivingEntity shooter)
    {
        ObsidianTippedArrow arrow = new ObsidianTippedArrow(EntityInit.OBSIDIAN_TIPPED_ARROW.get(), shooter, level);
        arrow.setBaseDamage(this.damage * 1.8);
        return arrow;
    }

    @Override
    public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.world.entity.player.Player player)
    {
        int enchant = net.minecraft.world.item.enchantment.EnchantmentHelper.getItemEnchantmentLevel(net.minecraft.world.item.enchantment.Enchantments.INFINITY_ARROWS, bow);
        return enchant <= 0 ? false : this.getClass() == ObsidianTippedArrowItem.class;
    }


}