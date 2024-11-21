package net.ac.bronzensteel.registry;

import net.ac.bronzensteel.bronzensteel;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {

    // Initializing Deferred Register for ITEMS
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, bronzensteel.MOD_ID);


    // Registering Base Items
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register
            ("steel_ingot", () -> new Item(new Item.Properties()
                    ));

    public static final RegistryObject<Item> STEEL_SHEET = ITEMS.register
            ("steel_sheet", () -> new Item(new Item.Properties()
            ));

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register
            ("raw_tin", () -> new Item(new Item.Properties()
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

    // Registering Base Blocks
    public static final RegistryObject<BlockItem> STEEL_BLOCK__ITEM = ITEMS.register
            ("steel_block", () -> new BlockItem(BlockRegistry.STEEL_BLOCK.get(), new Item.Properties()
            ));

    public static final RegistryObject<BlockItem> TIN_ORE__ITEM = ITEMS.register
            ("tin_ore", ()-> new BlockItem(BlockRegistry.TIN_ORE.get(), new Item.Properties()
            ));




    // Eventbus handler
    public static void register(IEventBus bus){
        ITEMS.register(bus);
    }
}
