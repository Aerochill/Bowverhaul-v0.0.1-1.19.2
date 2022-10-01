package net.aerochill.bowverhaul.client.renderer.entity;

import net.aerochill.bowverhaul.Bowverhaul;
import net.aerochill.bowverhaul.world.entity.projectile.EmeraldTippedArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class EmeraldTippedArrowRenderer extends ArrowRenderer<EmeraldTippedArrow>
{
    public static final ResourceLocation TEXTURE = new ResourceLocation(Bowverhaul.MOD_ID, "textures/entity/emerald_tipped_arrow_entity.png");
    public EmeraldTippedArrowRenderer(EntityRendererProvider.Context context)
    {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(EmeraldTippedArrow arrow)
    {
        return TEXTURE;
    }
}
