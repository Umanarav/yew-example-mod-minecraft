package gay.iamyew.marijuana.armor;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import gay.iamyew.marijuana.MarijuanaMod;
import gay.iamyew.marijuana.item.ModItemGroup;
import gay.iamyew.marijuana.materials.MarijuanaArmorMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModArmor {
    public static final ArmorMaterial MARIJUANA_ARMOR_MATERIAL = new MarijuanaArmorMaterial();
    //public static final Item MARIJUANA_MATERIAL = new Item(new Item.Settings());
    public static final Item MARIJUANA_MATERIAL_HELMET = new ArmorItem(MARIJUANA_ARMOR_MATERIAL, EquipmentSlot.HEAD, new Item.Settings());
    public static final Item MARIJUANA_MATERIAL_CHESTPLATE = new ArmorItem(MARIJUANA_ARMOR_MATERIAL, EquipmentSlot.CHEST, new Item.Settings());
    public static final Item MARIJUANA_MATERIAL_LEGGINGS = new ArmorItem(MARIJUANA_ARMOR_MATERIAL, EquipmentSlot.LEGS, new Item.Settings());
    public static final Item MARIJUANA_MATERIAL_BOOTS = new ArmorItem(MARIJUANA_ARMOR_MATERIAL, EquipmentSlot.FEET, new Item.Settings());

    public static void registerArmorItems() {
        Registry.register(Registries.ITEM, new Identifier(MarijuanaMod.MOD_ID, "marijuana_material_helmet"), MARIJUANA_MATERIAL_HELMET);
        Registry.register(Registries.ITEM, new Identifier(MarijuanaMod.MOD_ID, "marijuana_material_chestplate"), MARIJUANA_MATERIAL_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier(MarijuanaMod.MOD_ID, "marijuana_material_leggings"), MARIJUANA_MATERIAL_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier(MarijuanaMod.MOD_ID, "marijuana_material_boots"), MARIJUANA_MATERIAL_BOOTS);

        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.CITRINE).register(entries -> entries.add(MARIJUANA_MATERIAL_HELMET));
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.CITRINE).register(entries -> entries.add(MARIJUANA_MATERIAL_CHESTPLATE));
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.CITRINE).register(entries -> entries.add(MARIJUANA_MATERIAL_LEGGINGS));
        ItemGroupEvents.modifyEntriesEvent(ModItemGroup.CITRINE).register(entries -> entries.add(MARIJUANA_MATERIAL_BOOTS));
    }
}

