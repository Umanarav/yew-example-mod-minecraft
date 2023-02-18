package gay.iamyew.marijuana;

import net.fabricmc.api.ModInitializer;
import gay.iamyew.marijuana.armor.ModArmor;
import gay.iamyew.marijuana.block.ModBlocks;
import gay.iamyew.marijuana.item.ModItemGroup;
import gay.iamyew.marijuana.item.ModItems;
import gay.iamyew.marijuana.painting.ModPainting;
import gay.iamyew.marijuana.sound.ModSounds;
import gay.iamyew.marijuana.tools.ModTools;
import gay.iamyew.marijuana.util.ModLootTableModifiers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MarijuanaMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "marijuanamod";
	public static final Logger LOGGER = LoggerFactory.getLogger("marijuanamod");

	
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ModItemGroup.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSounds.registerModSounds();

		ModArmor.registerArmorItems();
		ModTools.registerModTools();
		ModPainting.registerPaintings();

		ModLootTableModifiers.modifyLootTables();

		LOGGER.info("Hello Fabric world!");

	}
}
