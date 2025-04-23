package net.podrick.learningmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.podrick.learningmod.LearningMod;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LearningMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> LEARNING_TAB = CREATIVE_MODE_TABS.register("learning_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack((ModItems.ZAIN.get())))
                    .title(Component.translatable("creativetab.learning_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ZAIN.get());
                        output.accept(ModItems.MECHA.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
