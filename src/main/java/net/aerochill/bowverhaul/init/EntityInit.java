package net.aerochill.bowverhaul.init;

import net.aerochill.bowverhaul.Bowverhaul;
import net.aerochill.bowverhaul.world.entity.projectile.DiamondTippedArrow;
import net.aerochill.bowverhaul.world.entity.projectile.EmeraldTippedArrow;
import net.aerochill.bowverhaul.world.entity.projectile.IronTippedArrow;
import net.aerochill.bowverhaul.world.entity.projectile.ObsidianTippedArrow;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EntityInit
{
    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Bowverhaul.MOD_ID);

    public static final RegistryObject<EntityType<IronTippedArrow>> IRON_TIPPED_ARROW = ENTITY_TYPES.register("iron_tipped_arrow",
            () -> EntityType.Builder.of((EntityType.EntityFactory<IronTippedArrow>) IronTippedArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).build("iron_tipped_arrow"));

    public static final RegistryObject<EntityType<DiamondTippedArrow>> DIAMOND_TIPPED_ARROW = ENTITY_TYPES.register("diamond_tipped_arrow",
            () -> EntityType.Builder.of((EntityType.EntityFactory<DiamondTippedArrow>) DiamondTippedArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).build("diamond_tipped_arrow"));

    public static final RegistryObject<EntityType<EmeraldTippedArrow>> EMERALD_TIPPED_ARROW = ENTITY_TYPES.register("emerald_tipped_arrow",
            () -> EntityType.Builder.of((EntityType.EntityFactory<EmeraldTippedArrow>) EmeraldTippedArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).build("emerald_tipped_arrow"));

    public static final RegistryObject<EntityType<ObsidianTippedArrow>> OBSIDIAN_TIPPED_ARROW = ENTITY_TYPES.register("obsidian_tipped_arrow",
            () -> EntityType.Builder.of((EntityType.EntityFactory<ObsidianTippedArrow>) ObsidianTippedArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).build("obsidian_tipped_arrow"));





}
