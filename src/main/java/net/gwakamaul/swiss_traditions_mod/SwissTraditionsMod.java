package net.gwakamaul.swiss_traditions_mod;

import net.fabricmc.api.ModInitializer;
import net.gwakamaul.swiss_traditions_mod.item.ModItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SwissTraditionsMod implements ModInitializer {
	public static final String MOD_ID = "swiss_traditions_mod";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
