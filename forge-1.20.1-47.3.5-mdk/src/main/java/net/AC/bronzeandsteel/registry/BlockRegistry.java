package net.AC.bronzeandsteel.registry;

import net.AC.bronzeandsteel.BronzeAndSteel;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {

    // Initializing Deferred Register for BLOCKS
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BronzeAndSteel.MOD_ID);


    // Registering Material Blocks
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register
            ("steel_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .mapColor(MapColor.COLOR_GRAY)
                    .explosionResistance(10.0f)
                    ));

    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register
            ("tin_ore", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE)
            ));

    // Eventbus handler
    public static void register(IEventBus bus){
        BLOCKS.register(bus);
    }
}
