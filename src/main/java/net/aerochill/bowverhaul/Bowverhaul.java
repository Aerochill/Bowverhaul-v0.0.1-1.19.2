package net.aerochill.bowverhaul;

import com.mojang.logging.LogUtils;
import net.aerochill.bowverhaul.init.EntityInit;
import net.aerochill.bowverhaul.init.block.ModBlocks;
import net.aerochill.bowverhaul.init.block.entity.ModBlockEntities;
import net.aerochill.bowverhaul.init.effect.ModEffects;
import net.aerochill.bowverhaul.init.menu.ModMenuTypes;
import net.aerochill.bowverhaul.init.menu.WoodWorkingTableScreen;
import net.aerochill.bowverhaul.init.item.ModItems;
import net.aerochill.bowverhaul.recipe.ModRecipes;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Bowverhaul.MOD_ID)
public class Bowverhaul
{
    public static final String MOD_ID = "bowverhaul";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Bowverhaul()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);
        EntityInit.ENTITY_TYPES.register(modEventBus);
        ModEffects.register(modEventBus);
        ModMenuTypes.register(modEventBus);
        ModRecipes.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            MenuScreens.register(ModMenuTypes.WOODWORKING_TABLE_MENU.get(), WoodWorkingTableScreen::new);
        }
    }
}
