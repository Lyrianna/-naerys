package enaerys;

import enaerys.util.EnaerysItemGroup;
import enaerys.util.Reference;
import enaerys.util.proxy.ClientProxy;
import enaerys.util.proxy.IProxy;
import enaerys.util.proxy.ServerProxy;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Reference.MOD_ID)
public class Main {
	
	public static Main instance;
	public static final String modid = Reference.MOD_ID;
	
	public static final ItemGroup itemGroup = new EnaerysItemGroup();
	
	public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());
	
	public Main() {
		
		instance = this;
		
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegisteries);
		
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event){
		
		proxy.init();
	}
	
	private void clientRegisteries(final FMLClientSetupEvent event){
	}
}