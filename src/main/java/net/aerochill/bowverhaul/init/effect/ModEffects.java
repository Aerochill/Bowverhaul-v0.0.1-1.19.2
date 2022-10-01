package net.aerochill.bowverhaul.init.effect;

import net.aerochill.bowverhaul.Bowverhaul;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffects
{
    public static final DeferredRegister<MobEffect> MOB_EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, Bowverhaul.MOD_ID);

    public static final RegistryObject<MobEffect> BLEED = MOB_EFFECTS.register("bleed", () -> new BleedingEffect(MobEffectCategory.HARMFUL, 9843220));
    public static void register(IEventBus eventbus)
    {
        MOB_EFFECTS.register(eventbus);
    }
}
