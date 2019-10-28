package enaerys.util;

import enaerys.Main;
//import enaerys.init.BlockList;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
//import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class BasePropetries {

	public static Item itemProp(String name) {
		
		return new Item(new Item.Properties().group(Main.itemGroup)).setRegistryName(new ResourceLocation(Main.modid, name));
	}
	
	public static Block blockProp(String name) {
		
		return new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(0f, 0f).lightValue(8).sound(SoundType.STONE)).setRegistryName(new ResourceLocation(Main.modid, name));
	}
	
	/*
	public static BlockItem biProp(String name) {
		
		return new BlockItem(BlockList.this, new Item.Properties().group(Main.itemGroup)).setRegistryName(name);
	}*/
}
