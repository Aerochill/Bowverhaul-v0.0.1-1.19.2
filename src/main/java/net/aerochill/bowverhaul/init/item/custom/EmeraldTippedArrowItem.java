package net.aerochill.bowverhaul.init.item.custom;

import net.aerochill.bowverhaul.init.EntityInit;
import net.aerochill.bowverhaul.world.entity.projectile.EmeraldTippedArrow;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.Level;

public class EmeraldTippedArrowItem extends ArrowItem
{
    public final float damage;

    private Potion potion = Potions.LUCK;

    public EmeraldTippedArrowItem(Item.Properties properties, float damage)
    {
        super(properties);
        this.damage = damage;
    }

    @Override
    public AbstractArrow createArrow(Level level, ItemStack stack, LivingEntity shooter)
    {
        EmeraldTippedArrow arrow = new EmeraldTippedArrow(EntityInit.EMERALD_TIPPED_ARROW.get(), shooter, level);
        arrow.setBaseDamage(this.damage * 1.65);
        return arrow;
    }

    @Override
    public boolean isInfinite(ItemStack stack, ItemStack bow, net.minecraft.world.entity.player.Player player)
    {
        int enchant = net.minecraft.world.item.enchantment.EnchantmentHelper.getItemEnchantmentLevel(net.minecraft.world.item.enchantment.Enchantments.INFINITY_ARROWS, bow);
        return enchant <= 0 ? false : this.getClass() == EmeraldTippedArrowItem.class;
    }
}
