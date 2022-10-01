package net.aerochill.bowverhaul.init.menu;

import net.aerochill.bowverhaul.init.block.ModBlocks;
import net.aerochill.bowverhaul.init.block.entity.WoodworkingTableBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.SlotItemHandler;

public class WoodWorkingTableMenu extends AbstractContainerMenu {
    private final ContainerLevelAccess levelAccess;
    private final ContainerData data;

    public WoodWorkingTableMenu(int id, Inventory inv, IItemHandler slots, BlockPos pos, ContainerData data) {
        super(ModMenuTypes.WOODWORKING_TABLE_MENU.get(), id);
        this.levelAccess = ContainerLevelAccess.create(inv.player.getLevel(), pos);
        this.data = data;

        addSlot(new SlotItemHandler(slots, 0, 22, 34));
        addSlot(new SlotItemHandler(slots, 1, 59, 34));
        addSlot(new SlotWithRestriction(slots, 2, 116, 34));

        final int slotSizePlus2 = 18;
        final int startX = 8;
        final int startY = 84;
        final int hotbarY = 142;

        for (int row = 0; row < 3; ++row) {
            for (int column = 0; column < 9; ++column) {
                addSlot(new Slot(inv, column + row * 9 + 9, startX + column * slotSizePlus2, startY + row * slotSizePlus2));
            }
        }

        for (int column = 0; column < 9; ++column) {
            addSlot(new Slot(inv, column, startX + column * slotSizePlus2, hotbarY));
        }

        this.addDataSlots(this.data);
    }

    public static WoodWorkingTableMenu getClientMenu(int id, Inventory playerInv) {
        return new WoodWorkingTableMenu(id, playerInv, new ItemStackHandler(3), BlockPos.ZERO, new SimpleContainerData(3));
    }

    public static MenuConstructor getServerMenu(WoodworkingTableBlockEntity blockEntity, BlockPos pos) {
        return (IdMap, playerInv, player) -> new WoodWorkingTableMenu(IdMap, playerInv, blockEntity.getInventory(), pos, blockEntity.getContainerData());
    }

    public ItemStack quickMoveStack(Player player, int index)
    {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);
        if (slot.hasItem())
        {
            ItemStack current = slot.getItem();
            itemstack = current.copy();
            if (index < 3)
            {
                if (!this.moveItemStackTo(current, 3, this.slots.size(), true))
                {
                    return ItemStack.EMPTY;
                }
            } else if (!this.moveItemStackTo(current, 0, 3,false))
            {
                return ItemStack.EMPTY;
            }

            if(current.isEmpty())
            {
                slot.set(ItemStack.EMPTY);
            } else
            {
                slot.setChanged();
            }
        }

        return itemstack;
    }

    @Override
    public boolean stillValid(Player player)
    {
        return stillValid(this.levelAccess, player, ModBlocks.WOODWORKING_TABLE.get());
    }

    public ContainerData getData()
    {
        return data;
    }
}


