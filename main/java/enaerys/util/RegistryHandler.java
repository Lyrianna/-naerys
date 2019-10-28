package enaerys.util;

import enaerys.Main;
import enaerys.blocks.FireFurnace;
import enaerys.blocks.FireFurnaceTile;
import enaerys.blocks.ModBlock;
import enaerys.init.ItemList;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class RegistryHandler {

	@SubscribeEvent
	public static void onBlockRegistry(final RegistryEvent.Register<Block> event) {
		
		event.getRegistry().register(new FireFurnace());
	}
	
	@SubscribeEvent
	public static void onItemRegistry(final RegistryEvent.Register<Item> event) {
		
		event.getRegistry().registerAll(
			ItemList.TEST_ITEM
		);
		event.getRegistry().register(new BlockItem(ModBlock.FIREFURNACE, new Item.Properties().group(Main.itemGroup)).setRegistryName(ModBlock.FIREFURNACE.getRegistryName()));
	}
	
	@SubscribeEvent
    public static void onTileEntityRegistry(final RegistryEvent.Register<TileEntityType<?>> event) {
        event.getRegistry().register(TileEntityType.Builder.create(FireFurnaceTile::new, ModBlock.FIREFURNACE_TILE).build(null).setRegistryName(ModBlock.FIREFURNACE.getRegistryName()));
    }
}
