package com.enaerys.util;

import com.enaerys.Main;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class Reference {
	
	public static final String MOD_ID = "enaerys";
	public static final String NAME = "Enaerys";
	public static final String VERSION = "1.0.0";
	public static final String ACCEPTED_VERSIONS = "[1.14.4]";
	public static final String CLIENT_PROXY_CLASS = "";
	public static final String COMMON_PROXY_CLASS = "";	
	public static Item itemProp(String name) {
		
		return new Item(new Item.Properties().group(Main.itemGroup)).setRegistryName(new ResourceLocation(Main.modid, name));
	}
	
	public static Block blockProp(Material material, float f, float g, int i, SoundType stone, String name) {
		
		return new Block(Block.Properties.create(material).hardnessAndResistance(f, g).lightValue(i).sound(stone)).setRegistryName(new ResourceLocation(Main.modid, name));
	}
}