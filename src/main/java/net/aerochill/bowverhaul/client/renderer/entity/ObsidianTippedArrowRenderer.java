package net.aerochill.bowverhaul.client.renderer.entity;

import net.aerochill.bowverhaul.Bowverhaul;
import net.aerochill.bowverhaul.world.entity.projectile.ObsidianTippedArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ObsidianTippedArrowRenderer extends ArrowRenderer<ObsidianTippedArrow>
{
    public static final ResourceLocation TEXTURE = new ResourceLocation(Bowverhaul.MOD_ID, "textures/entity/obsidian_tipped_arrow_entity.png");
    public ObsidianTippedArrowRenderer(EntityRendererProvider.Context context)
    {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(ObsidianTippedArrow arrow)
    {
        return TEXTURE;
    }
}
