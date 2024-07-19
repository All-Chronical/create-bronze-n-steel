package net.AC.bronzeandsteel.registry;

import net.AC.bronzeandsteel.BronzeAndSteel;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {

    // Initializing Deferred Register for ITEMS
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BronzeAndSteel.MOD_ID);


    // Registering Base Items
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register
            ("steel_ingot", () -> new Item(new Item.Properties()
                    ));

/*
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register
            ("tin_ingot", () -> new Item(new Item.Properties()
            ));

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register
            ("bronze_ingot", () -> new Item(new Item.Properties()
                    ));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register
            ("raw_tin", () -> new Item(new Item.Properties()
                    ));
*/




    // Eventbus handler
    public static void register(IEventBus bus){
        ITEMS.register(bus);
    }
}
