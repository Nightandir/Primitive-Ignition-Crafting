package com.nightandir.primitiveignitioncrafting;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class PrimitiveIgnitionCrafting implements ModInitializer {
    public static final String MOD_ID = "primitive_ignition_crafting";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Primitive Ignition: Crafting initialized. Item registration and recipe are pending verified 1.21.11 APIs and Survivalist Essentials item IDs.");
    }
}
