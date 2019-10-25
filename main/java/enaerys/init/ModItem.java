package enaerys.init;

import java.util.ArrayList;
import java.util.List;

import enaerys.Main;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class ModItem {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	public static final Item TEST_ITEM = new Item(new Item.Properties().group(Main.itemGroup)).setRegistryName(new ResourceLocation(Main.modid, "test_item"));
}
