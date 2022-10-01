package net.aerochill.bowverhaul.init.block.entity;

import net.aerochill.bowverhaul.Bowverhaul;
import net.aerochill.bowverhaul.init.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities
{
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Bowverhaul.MOD_ID);

    public static final RegistryObject<BlockEntityType<WoodworkingTableBlockEntity>> WOODWORKING_TABLE = BLOCK_ENTITIES.register("woodworking_table", () -> BlockEntityType.Builder.of(WoodworkingTableBlockEntity::new, ModBlocks.WOODWORKING_TABLE.get()).build(null));

    public static void register(IEventBus eventbus)
    {
        BLOCK_ENTITIES.register(eventbus);
    }
}
