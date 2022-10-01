package net.aerochill.bowverhaul.client.renderer.entity;

import net.aerochill.bowverhaul.Bowverhaul;
import net.aerochill.bowverhaul.world.entity.projectile.IronTippedArrow;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class IronTippedArrowRenderer extends ArrowRenderer<IronTippedArrow>
{
    public static final ResourceLocation TEXTURE = new ResourceLocation(Bowverhaul.MOD_ID, "textures/entity/iron_tipped_arrow_entity.png");
    public IronTippedArrowRenderer(EntityRendererProvider.Context context)
    {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(IronTippedArrow arrow)
    {
        return TEXTURE;
    }
}
