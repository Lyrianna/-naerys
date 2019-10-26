package enaerys.util;

import enaerys.init.ItemList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class EnaerysItemGroup extends ItemGroup{

	public EnaerysItemGroup() {
		
		super(Reference.NAME);
	}

	@Override
	public ItemStack createIcon() {
		
		return new ItemStack(ItemList.TEST_ITEM);
	}
}