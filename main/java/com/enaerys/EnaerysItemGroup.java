package com.enaerys;

import com.enaerys.lists.ItemList;
import com.enaerys.util.Reference;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class EnaerysItemGroup extends ItemGroup{
	
	public EnaerysItemGroup() {
		
		super(Reference.NAME);
	}

	@Override
	public ItemStack createIcon() {
		
		return new ItemStack(ItemList.test_item);
	}
}
