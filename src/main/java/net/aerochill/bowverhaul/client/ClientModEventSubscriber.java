package net.aerochill.bowverhaul.client;

import net.aerochill.bowverhaul.Bowverhaul;
import net.aerochill.bowverhaul.client.renderer.entity.DiamondTippedArrowRenderer;
import net.aerochill.bowverhaul.client.renderer.entity.EmeraldTippedArrowRenderer;
import net.aerochill.bowverhaul.client.renderer.entity.IronTippedArrowRenderer;
import net.aerochill.bowverhaul.client.renderer.entity.ObsidianTippedArrowRenderer;
import net.aerochill.bowverhaul.init.EntityInit;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Bowverhaul.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)

class ClientSetup
{

    @SubscribeEvent
    public static void doSetup(FMLClientSetupEvent event)
    {
        EntityRenderers.register(EntityInit.IRON_TIPPED_ARROW.get(), IronTippedArrowRenderer::new);
        EntityRenderers.register(EntityInit.DIAMOND_TIPPED_ARROW.get(), DiamondTippedArrowRenderer::new);
        EntityRenderers.register(EntityInit.EMERALD_TIPPED_ARROW.get(), EmeraldTippedArrowRenderer::new);
        EntityRenderers.register(EntityInit.OBSIDIAN_TIPPED_ARROW.get(), ObsidianTippedArrowRenderer::new);

    }
}
