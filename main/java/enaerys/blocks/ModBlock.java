package enaerys.blocks;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlock {

	@ObjectHolder("enaerys:fire_furnace1")
	public static FireFurnace FIREFURNACE;
	
	@ObjectHolder("enaerys:fire_furnace1")
	public static TileEntityType<FireFurnaceTile> FIREFURNACE_TILE;
}
