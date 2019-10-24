package com.enaerys;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.enaerys.lists.ModItems;
import com.enaerys.util.Reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Reference.MOD_ID)
public class Main {
	
	public static Main instance;
	public static final String modid = Reference.MOD_ID;
	private static final Logger logger = LogManager.getLogger(modid);
	
	public Main() {
		
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegisteries);
		
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event){
		
	}
	
	private void clientRegisteries(final FMLClientSetupEvent event){
		
	}
	
	@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents{
		
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {

			event.getRegistry().registerAll(
				ModItems.test_item = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(location("test_item"))
				//BaseItem.test_item = new Item(new Item.Properties().group(ItemGroup.MISC)).setRegistryName(new ResourceLocation(modid, "test_item");
			);
			
			logger.info("Items registered.");
		}
		
		private static ResourceLocation location(String name) {
			
			return new ResourceLocation(modid, name);
		}
	}
}
