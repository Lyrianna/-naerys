package enaerys.util;

import enaerys.init.ItemList;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {

	@SubscribeEvent
	public static void itemRegister(final RegistryEvent.Register<Item> event) {
		
		event.getRegistry().registerAll(
			ItemList.TEST_ITEM
		);
	}
}
