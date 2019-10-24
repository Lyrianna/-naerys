package com.enaerys;

import com.enaerys.lists.ModItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class EnaerysItemGroup extends ItemGroup{
	
	public EnaerysItemGroup() {
		
		super("Enaerys");
	}

	@Override
	public ItemStack createIcon() {
		
		return new ItemStack(ModItems.test_item);
	}
}
