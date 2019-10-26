package enaerys.util;

import enaerys.Main;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class BasePropetries {

public static Item itemProp(String name) {
		
		return new Item(new Item.Properties().group(Main.itemGroup)).setRegistryName(new ResourceLocation(Main.modid, name));
	}
}
