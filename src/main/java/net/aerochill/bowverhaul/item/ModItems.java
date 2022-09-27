package net.aerochill.bowverhaul.item;

import net.aerochill.bowverhaul.Bowverhaul;
import net.aerochill.bowverhaul.item.custom.IronTippedArrowItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Bowverhaul.MOD_ID);

    public static final RegistryObject<Item> DIAMOND_TIPPED_ARROW = ITEMS.register("diamond_tipped_arrow", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB)));

    public static final RegistryObject<Item> DIAMOND_DUST = ITEMS.register("diamond_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB)));

    public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB)));

    public static final RegistryObject<Item> GOLD_DUST = ITEMS.register("gold_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB)));

    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB)));

    public static final RegistryObject<Item> COAL_DUST = ITEMS.register("coal_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB)));

    public static final RegistryObject<Item> LAPIS_LAZULI_DUST = ITEMS.register("lapis_lazuli_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB)));

    public static final RegistryObject<Item> IRON_TIPPED_ARROW = ITEMS.register("iron_tipped_arrow", () -> new IronTippedArrowItem(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB), 1.5f));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
