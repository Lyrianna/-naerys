package enaerys;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import enaerys.util.EnaerysItemGroup;
import enaerys.util.Reference;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Reference.MOD_ID)
public class Main {
	
	public static Main instance;
	public static final String modid = Reference.MOD_ID;
	public static final String name = Reference.NAME;
	public static final String version = Reference.VERSION;
	public static final ItemGroup itemGroup = new EnaerysItemGroup();
	
	private static final Logger logger = LogManager.getLogger(modid);
	
	public Main() {
			instance = this;
			FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegisteries);
			FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
			MinecraftForge.EVENT_BUS.register(this);
	}

	private void clientRegisteries(final FMLClientSetupEvent event){
		logger.info("clientRegisteries method registered.");
	}
	
	private void setup(final FMLCommonSetupEvent event){
		logger.info("setup method registered.");
	}
}
