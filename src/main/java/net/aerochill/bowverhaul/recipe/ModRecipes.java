package net.aerochill.bowverhaul.recipe;

import net.aerochill.bowverhaul.Bowverhaul;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes
{
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Bowverhaul.MOD_ID);

    public static final RegistryObject<RecipeSerializer<WoodworkingTableRecipe>> WOODWORKING_SERIALIZER = SERIALIZERS.register("woodworking", () -> WoodworkingTableRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventbus)
    {
        SERIALIZERS.register(eventbus);
    }
}
