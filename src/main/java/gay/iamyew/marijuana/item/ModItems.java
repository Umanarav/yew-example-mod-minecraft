package gay.iamyew.marijuana.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import gay.iamyew.marijuana.MarijuanaMod;
import gay.iamyew.marijuana.block.ModBlocks;
import gay.iamyew.marijuana.item.custom.BongItem;
import gay.iamyew.marijuana.item.custom.JointItem;
import gay.iamyew.marijuana.item.custom.ModMusicDiscItem;
import gay.iamyew.marijuana.sound.ModSounds;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems{
    public static final Item RAINBOW_DYE = registerItem("rainbow_dye",
        new Item(new FabricItemSettings()));

    //normal weed items

    public static final Item UNPACKED_BONG = registerItem("unpacked_bong",
        new Item(new FabricItemSettings()));
        
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
        new BongItem(new FabricItemSettings().maxDamage(13).rarity(Rarity.UNCOMMON)));

    public static final Item JOINT_ITEM = registerItem("joint", 
        new JointItem(new FabricItemSettings().maxDamage(5).rarity(Rarity.UNCOMMON)));

    public static final Item MARIJUANA_SEEDS = registerItem("marijuana_seeds",
        new AliasedBlockItem(ModBlocks.MARIJUANA_CROP,
            new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MarijuanaMod.MOD_ID, name), item);
    }

    public static void addItemsToItemsGroup(){
        addToItemGroup(ModItemGroup.CITRINE, RAINBOW_DYE);

        addToItemGroup(ModItemGroup.CITRINE, MARIJUANA_SEEDS);
        addToItemGroup(ModItemGroup.CITRINE, MARIJUANA);
        addToItemGroup(ModItemGroup.CITRINE, JOINT_ROACH);
        addToItemGroup(ModItemGroup.CITRINE, HASH);

        addToItemGroup(ModItemGroup.CITRINE, UNPACKED_BONG);
        addToItemGroup(ModItemGroup.CITRINE, BONG_ITEM);
        addToItemGroup(ModItemGroup.CITRINE, JOINT_ITEM);

        addToItemGroup(ModItemGroup.CITRINE, WEED_MUSIC_DISC);
        addToItemGroup(ModItemGroup.CITRINE, ANARCHY_REIGNS_MUSIC_DISC);
        
    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        MarijuanaMod.LOGGER.info("Registering Mod Items for " + MarijuanaMod.MOD_ID);
        addItemsToItemsGroup();
        
        FuelRegistry.INSTANCE.add(MARIJUANA, 60);
        FuelRegistry.INSTANCE.add(HASH, 240);


    }

}