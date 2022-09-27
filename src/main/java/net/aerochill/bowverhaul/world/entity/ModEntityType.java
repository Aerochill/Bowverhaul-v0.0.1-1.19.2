package net.aerochill.bowverhaul.world.entity;

import net.aerochill.bowverhaul.Bowverhaul;
import net.aerochill.bowverhaul.world.entity.projectile.IronTippedArrow;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityType
{
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Bowverhaul.MOD_ID);

    public static final RegistryObject <EntityType<IronTippedArrow>> IRON_TIPPED_ARROW = ENTITIES.register("iron_tipped_arrow", () -> EntityType.Builder.<IronTippedArrow>of(IronTippedArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(new ResourceLocation(Bowverhaul.MOD_ID, "iron_tipped_arrow").toString()));

    public static void register(IEventBus eventbus)
    {
        ENTITIES.register(eventbus);
    }
}
