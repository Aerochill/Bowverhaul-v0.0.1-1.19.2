package net.aerochill.bowverhaul.init.block;

import net.aerochill.bowverhaul.Bowverhaul;
import net.aerochill.bowverhaul.init.block.custom.WoodworkingTable;
import net.aerochill.bowverhaul.init.item.ModCreativeModeTab;
import net.aerochill.bowverhaul.init.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Bowverhaul.MOD_ID);

    public static final RegistryObject<Block> INFUSION_TABLE = registerBlock("infusion_table", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(6f).requiresCorrectToolForDrops()), ModCreativeModeTab.BOWVERHAUL_TAB);

    public static final RegistryObject<Block> WOODWORKING_TABLE = registerBlock("woodworking_table", () -> new WoodworkingTable(BlockBehaviour.Properties.of(Material.WOOD).strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.BOWVERHAUL_TAB);

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab)
    {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
