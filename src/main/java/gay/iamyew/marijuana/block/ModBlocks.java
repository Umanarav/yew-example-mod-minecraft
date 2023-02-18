package gay.iamyew.marijuana.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import gay.iamyew.marijuana.MarijuanaMod;
import gay.iamyew.marijuana.block.custom.MarijuanaCropBlock;
import gay.iamyew.marijuana.block.custom.RainbowCarpetBlock;
import gay.iamyew.marijuana.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block MARIJUANA_BLOCK = registerBlock("marijuana_block", 
        new Block(FabricBlockSettings.of(Material.LEAVES).strength(.5f).sounds(BlockSoundGroup.VINE)), ModItemGroup.CITRINE);
    public static final Block HASH_BLOCK = registerBlock("hash_block", 
        new Block(FabricBlockSettings.of(Material.LEAVES).strength(.75f).sounds(BlockSoundGroup.PACKED_MUD)), ModItemGroup.CITRINE);

    public static final RainbowCarpetBlock RAINBOW_CARPET_BLOCK = new RainbowCarpetBlock(FabricBlockSettings.of(Material.CARPET).hardness(.1f).sounds(BlockSoundGroup.WOOL).luminance(15));

    public static final Block MARIJUANA_CROP = registerBlockWithoutItem("marijuana_crop",
        new MarijuanaCropBlock(FabricBlockSettings.copy(Blocks.WHEAT).nonOpaque()));

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(MarijuanaMod.MOD_ID, name), block);
    }

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(MarijuanaMod.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(MarijuanaMod.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        MarijuanaMod.LOGGER.info("Registering ModBlocks for " + MarijuanaMod.MOD_ID);
        
        FuelRegistry.INSTANCE.add(RAINBOW_CARPET_BLOCK, 67);

        FuelRegistry.INSTANCE.add(MARIJUANA_BLOCK, 540);
        FuelRegistry.INSTANCE.add(HASH_BLOCK, 2160);

        Registry.register(Registries.BLOCK, new Identifier(MarijuanaMod.MOD_ID, "rainbow_carpet_block"), RAINBOW_CARPET_BLOCK);
        Registry.register(Registries.ITEM, new Identifier(MarijuanaMod.MOD_ID, "rainbow_carpet_block"), new BlockItem(RAINBOW_CARPET_BLOCK, new Item.Settings()));
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.CITRINE).register(entries -> entries.add(RAINBOW_CARPET_BLOCK));
    }

}


