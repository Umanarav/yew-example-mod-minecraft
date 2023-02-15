package net.fabricmc.example.item;

import net.fabricmc.example.item.custom.BongItem;
import net.fabricmc.example.item.custom.JointItem;
import net.fabricmc.example.item.custom.ModMusicDiscItem;
import net.fabricmc.example.sound.ModSounds;
import net.fabricmc.example.ExampleMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems{
    public static final Item CITRINE = registerItem("citrine",
     new Item(new FabricItemSettings()));

    public static final Item RAW_CITRINE = registerItem("raw_citrine",
     new Item(new FabricItemSettings()));
    
        //normal weed items
        
        public static final Item MARIJUANA = registerItem("marijuana",
        new Item(new FabricItemSettings()));

        public static final Item HASH = registerItem("hash",
        new Item(new FabricItemSettings()));

        public static final Item JOINT_ROACH = registerItem("joint_roach",
        new Item(new FabricItemSettings()));

        public static final Item WEED_MUSIC_DISC = registerItem("weed_music_disc",
        new ModMusicDiscItem(13, ModSounds.WEED_MUSIC_DISC, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));

        public static final Item ANARCHY_REIGNS_MUSIC_DISC = registerItem("anarchy_reigns_music_disc",
        new ModMusicDiscItem(13, ModSounds.ANARCHY_REIGNS_MUSIC_DISC, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE)));

        //'advanced' weed items

        public static final Item BONG_ITEM = registerItem("bong", 
        new BongItem(new FabricItemSettings().maxDamage(69).rarity(Rarity.UNCOMMON)));

        public static final Item JOINT_ITEM = registerItem("joint", 
        new JointItem(new FabricItemSettings().maxDamage(5).rarity(Rarity.UNCOMMON)));

    //

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ExampleMod.MOD_ID, name), item);
    }

    public static void addItemsToItemsGroup(){
        addToItemGroup(ItemGroups.INGREDIENTS, CITRINE);
        addToItemGroup(ItemGroups.INGREDIENTS, RAW_CITRINE);
        addToItemGroup(ModItemGroup.CITRINE, CITRINE);
        addToItemGroup(ModItemGroup.CITRINE, RAW_CITRINE);

        addToItemGroup(ModItemGroup.CITRINE, MARIJUANA);
        addToItemGroup(ModItemGroup.CITRINE, JOINT_ROACH);
        addToItemGroup(ModItemGroup.CITRINE, HASH);

        addToItemGroup(ModItemGroup.CITRINE, BONG_ITEM);
        addToItemGroup(ModItemGroup.CITRINE, JOINT_ITEM);

        addToItemGroup(ModItemGroup.CITRINE, WEED_MUSIC_DISC);
        addToItemGroup(ModItemGroup.CITRINE, ANARCHY_REIGNS_MUSIC_DISC);
        
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        ExampleMod.LOGGER.info("Registering Mod Items for " + ExampleMod.MOD_ID);
        addItemsToItemsGroup();
        
        FuelRegistry.INSTANCE.add(MARIJUANA, 60);
        FuelRegistry.INSTANCE.add(HASH, 240);


    }

}