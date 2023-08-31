package net.karldev.create_warfare.item;

import net.karldev.create_warfare.CreateWarfare;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateWarfare.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CREATE_WARFARE_TAB = CREATIVE_MODE_TABS.register("create_warfare_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STEEL_INGOT.get()))
                    .title(Component.translatable("creativetab.create_warfare_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept((ModItems.STEEL_INGOT.get()));
                        pOutput.accept((ModItems.STEEL_NUGGET.get()));
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
