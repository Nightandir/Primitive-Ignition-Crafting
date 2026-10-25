package com.nightandir.primitiveignitioncrafting;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class PrimitiveIgnitionCrafting implements ModInitializer {
    public static final String MOD_ID = "primitive_ignition_crafting";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Item PRIMITIVE_FLINT = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "primitive_flint"),
            new Item(new Item.Settings().maxCount(1).maxDamage(16))
    );

    @Override
    public void onInitialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(PRIMITIVE_FLINT));
        LOGGER.info("Primitive Ignition: Crafting initialized.");
    }
}
