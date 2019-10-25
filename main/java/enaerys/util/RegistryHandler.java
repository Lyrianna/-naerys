package enaerys.util;

import enaerys.init.ModItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {

	@SubscribeEvent
	public static void itemRegister(RegistryEvent.Register<Item> event) {
		
		event.getRegistry().registerAll(ModItem.ITEMS.toArray(new Item[0]));
	}
}
