package net.ac.bronzensteel.registry;

import net.ac.bronzensteel.bronzensteel;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.event.level.NoteBlockEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockRegistry {

    // Initializing Deferred Register for BLOCKS
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, bronzensteel.MOD_ID);


    // Registering Material Blocks
    public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register
            ("steel_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)
                    .mapColor(MapColor.COLOR_GRAY)
                    .explosionResistance(15.0f)
                    ));

    public static final RegistryObject<DropExperienceBlock> CASSITERITE = BLOCKS.register
            ("cassiterite", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE),UniformInt.of(1,3)
            ));

    public static final RegistryObject<Block> TIN_BLOCK = BLOCKS.register
            ("tin_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIORITE)
                    .mapColor(MapColor.COLOR_LIGHT_BLUE)
            ));

    // Eventbus handler
    public static void register(IEventBus bus){
        BLOCKS.register(bus);
    }
}
