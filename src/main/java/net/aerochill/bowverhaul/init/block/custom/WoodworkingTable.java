package net.aerochill.bowverhaul.init.block.custom;

        import net.aerochill.bowverhaul.init.block.entity.ModBlockEntities;
        import net.aerochill.bowverhaul.init.block.entity.WoodworkingTableBlockEntity;
        import net.aerochill.bowverhaul.init.menu.WoodWorkingTableMenu;
        import net.minecraft.core.BlockPos;
        import net.minecraft.server.level.ServerPlayer;
        import net.minecraft.world.InteractionHand;
        import net.minecraft.world.InteractionResult;
        import net.minecraft.world.SimpleMenuProvider;
        import net.minecraft.world.entity.player.Player;
        import net.minecraft.world.inventory.MenuConstructor;
        import net.minecraft.world.level.Level;
        import net.minecraft.world.level.block.*;
        import net.minecraft.world.level.block.entity.BlockEntity;
        import net.minecraft.world.level.block.entity.BlockEntityTicker;
        import net.minecraft.world.level.block.entity.BlockEntityType;
        import net.minecraft.world.level.block.state.BlockState;
        import net.minecraft.world.phys.BlockHitResult;
        import net.minecraftforge.network.NetworkHooks;
        import org.jetbrains.annotations.Nullable;

public class WoodworkingTable extends Block implements EntityBlock
{

    public WoodworkingTable(Properties properties) {
        super(properties);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return ModBlockEntities.WOODWORKING_TABLE.get().create(pos, state);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if(!level.isClientSide())
        {
            if(level.getBlockEntity(pos) instanceof WoodworkingTableBlockEntity woodworking_table)
            {
                MenuConstructor menuConstructor = WoodWorkingTableMenu.getServerMenu(woodworking_table, pos);
                SimpleMenuProvider provider = new SimpleMenuProvider(menuConstructor, WoodworkingTableBlockEntity.TITLE);
                NetworkHooks.openScreen((ServerPlayer) player, provider, pos);
            }
        }

        return InteractionResult.sidedSuccess(!level.isClientSide());
    }

    @Nullable
    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState state,
                                                                  BlockEntityType<T> type) {
        return level.isClientSide() ? null : ($0, $1, $2, blockEntity) -> {
            if(blockEntity instanceof WoodworkingTableBlockEntity woodworking_table) {
                woodworking_table.tick($0, $1, $2, new WoodworkingTableBlockEntity($1, $2));
            }
        };
    }
}
