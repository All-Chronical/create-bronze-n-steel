package net.ac.bronzensteel.registry;

import net.ac.bronzensteel.bronzensteel;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeModeTabs {

    // Initializing Deferred Register for CREATIVE_MODE_TABS
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, bronzensteel.MOD_ID);

    // Registering BNS_CREATIVE_MENU
    public static final RegistryObject<CreativeModeTab> BNS_CREATIVE_MENU = CREATIVE_MODE_TABS.register("bns_creative_menu",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ItemRegistry.STEEL_INGOT.get()))

                    // Translation Key
                    .title(Component.translatable("creativetab.creative_menu"))

                    // Content
                    .displayItems(((itemDisplayParameters, output) ->
                    {
                        output.accept(ItemRegistry.CASSITERITE__ITEM.get());
                        output.accept(ItemRegistry.STEEL_INGOT.get());
                        output.accept(ItemRegistry.STEEL_BLOCK__ITEM.get());
                        output.accept(ItemRegistry.STEEL_SHEET.get());
                        output.accept(ItemRegistry.RAW_TIN.get());
                    }))

                    .build());

    // Eventbus handler
    public static void register(IEventBus bus){
        CREATIVE_MODE_TABS.register(bus);
    }
}

