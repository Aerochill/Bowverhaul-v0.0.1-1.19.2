package net.aerochill.bowverhaul.init.item;

import net.aerochill.bowverhaul.Bowverhaul;
import net.aerochill.bowverhaul.init.item.custom.DiamondTippedArrowItem;
import net.aerochill.bowverhaul.init.item.custom.EmeraldTippedArrowItem;
import net.aerochill.bowverhaul.init.item.custom.IronTippedArrowItem;
import net.aerochill.bowverhaul.init.item.custom.ObsidianTippedArrowItem;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Bowverhaul.MOD_ID);

    public static final RegistryObject<Item> DIAMOND_DUST = ITEMS.register("diamond_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB)));

    public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB)));

    public static final RegistryObject<Item> GOLD_DUST = ITEMS.register("gold_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB)));

    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB)));

    public static final RegistryObject<Item> COAL_DUST = ITEMS.register("coal_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB)));

    public static final RegistryObject<Item> LAPIS_LAZULI_DUST = ITEMS.register("lapis_lazuli_dust", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB)));


    public static final RegistryObject<Item> WHITTLING_KNIFE = ITEMS.register("whittling_knife", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB)));


    public static final RegistryObject<Item> OAK_BOW_LIMBS = ITEMS.register("oak_bow_limbs", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB)));

    public static final RegistryObject<Item> SPRUCE_BOW_LIMBS = ITEMS.register("spruce_bow_limbs", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB)));

    public static final RegistryObject<Item> BIRCH_BOW_LIMBS = ITEMS.register("birch_bow_limbs", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB)));

    public static final RegistryObject<Item> JUNGLE_BOW_LIMBS = ITEMS.register("jungle_bow_limbs", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB)));

    public static final RegistryObject<Item> ACACIA_BOW_LIMBS = ITEMS.register("acacia_bow_limbs", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB)));

    public static final RegistryObject<Item> DARK_OAK_BOW_LIMBS = ITEMS.register("dark_oak_bow_limbs", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB)));

    public static final RegistryObject<Item> CRIMSON_BOW_LIMBS = ITEMS.register("crimson_bow_limbs", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB)));

    public static final RegistryObject<Item> WARPED_BOW_LIMBS = ITEMS.register("warped_bow_limbs", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB)));

    public static final RegistryObject<Item> MANGROVE_BOW_LIMBS = ITEMS.register("mangrove_bow_limbs", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB)));

    public static final RegistryObject<Item> DIAMOND_TIPPED_ARROW = ITEMS.register("diamond_tipped_arrow", () -> new DiamondTippedArrowItem(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB), 2f));
    public static final RegistryObject<Item> IRON_TIPPED_ARROW = ITEMS.register("iron_tipped_arrow", () -> new IronTippedArrowItem(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB), 2f));
    public static final RegistryObject<Item> EMERALD_TIPPED_ARROW = ITEMS.register("emerald_tipped_arrow", () -> new EmeraldTippedArrowItem(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB), 2f));
    public static final RegistryObject<Item> OBSIDIAN_TIPPED_ARROW = ITEMS.register("obsidian_tipped_arrow", () -> new ObsidianTippedArrowItem(new Item.Properties().tab(ModCreativeModeTab.BOWVERHAUL_TAB), 2f));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

}
