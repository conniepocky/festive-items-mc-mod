package net.connie.festivemod.item;

import net.connie.festivemod.FestiveMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FestiveMod.MOD_ID);

    public static final DeferredItem<Item> CANDY_CANE = ITEMS.register("candy_cane",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CANDY_CANE)));

    public static final DeferredItem<Item> MINCE_PIE = ITEMS.register("mince_pie",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MINCE_PIE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}