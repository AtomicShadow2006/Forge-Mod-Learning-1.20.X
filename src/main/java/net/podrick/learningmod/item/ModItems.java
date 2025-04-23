package net.podrick.learningmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.podrick.learningmod.LearningMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LearningMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> ZAIN = ITEMS.register("zain",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MECHA = ITEMS.register("mecha",
            () -> new Item(new Item.Properties()));
}
