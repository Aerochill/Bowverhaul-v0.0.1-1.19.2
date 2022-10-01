package net.aerochill.bowverhaul.init.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab
{
    public static final CreativeModeTab BOWVERHAUL_TAB = new CreativeModeTab("bowverhaultab")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(ModItems.DIAMOND_TIPPED_ARROW.get());
        }
    };
}
