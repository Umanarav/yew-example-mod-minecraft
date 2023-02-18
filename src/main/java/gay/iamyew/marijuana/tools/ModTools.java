package gay.iamyew.marijuana.tools;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import gay.iamyew.marijuana.MarijuanaMod;
import gay.iamyew.marijuana.item.ModItemGroup;
import gay.iamyew.marijuana.materials.MarijuanaToolMaterial;
import gay.iamyew.marijuana.tools.custom.MarijuanaAxeItem;
import gay.iamyew.marijuana.tools.custom.MarijuanaHoeItem;
import gay.iamyew.marijuana.tools.custom.MarijuanaPickaxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModTools {
    public static ToolItem MARIJUANA_SHOVEL = new ShovelItem(MarijuanaToolMaterial.INSTANCE, 1.5F, -3.0F, new Item.Settings());
    public static ToolItem MARIJUANA_SWORD = new SwordItem(MarijuanaToolMaterial.INSTANCE, 3, -2.4F, new Item.Settings());

    public static ToolItem MARIJUANA_PICKAXE = new MarijuanaPickaxeItem(MarijuanaToolMaterial.INSTANCE, 1, -2.8F, new Item.Settings());
    public static ToolItem MARIJUANA_AXE = new MarijuanaAxeItem(MarijuanaToolMaterial.INSTANCE, 1, -2.8F, new Item.Settings());
    public static ToolItem MARIJUANA_HOE = new MarijuanaHoeItem(MarijuanaToolMaterial.INSTANCE, 1, -2.8F, new Item.Settings());

    public static void registerModTools() {
        Registry.register(Registries.ITEM, new Identifier(MarijuanaMod.MOD_ID, "marijuana_shovel"), MARIJUANA_SHOVEL);
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.CITRINE).register(entries -> entries.add(MARIJUANA_SHOVEL));

        Registry.register(Registries.ITEM, new Identifier(MarijuanaMod.MOD_ID, "marijuana_sword"), MARIJUANA_SWORD);
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.CITRINE).register(entries -> entries.add(MARIJUANA_SWORD));
    
        Registry.register(Registries.ITEM, new Identifier(MarijuanaMod.MOD_ID, "marijuana_pickaxe"), MARIJUANA_PICKAXE);
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.CITRINE).register(entries -> entries.add(MARIJUANA_PICKAXE));   
    
        Registry.register(Registries.ITEM, new Identifier(MarijuanaMod.MOD_ID, "marijuana_axe"), MARIJUANA_AXE);
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.CITRINE).register(entries -> entries.add(MARIJUANA_AXE));   
    
        Registry.register(Registries.ITEM, new Identifier(MarijuanaMod.MOD_ID, "marijuana_hoe"), MARIJUANA_HOE);
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.CITRINE).register(entries -> entries.add(MARIJUANA_HOE));   
    
    }
}

