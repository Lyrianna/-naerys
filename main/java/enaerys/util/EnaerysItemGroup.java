package enaerys.util;

import enaerys.init.ModItem;
import enaerys.util.Reference;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class EnaerysItemGroup extends ItemGroup{
	
	public EnaerysItemGroup() {
		
		super(Reference.NAME);
	}

	@Override
	public ItemStack createIcon() {
		
		return new ItemStack(ModItem.TEST_ITEM);
	}
}
