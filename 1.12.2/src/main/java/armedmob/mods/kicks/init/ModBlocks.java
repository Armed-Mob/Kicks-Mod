package armedmob.mods.kicks.init;

import java.util.ArrayList;
import java.util.List;

import armedmob.mods.kicks.objects.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks  {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Ores
	public static final Block ORE_ALUMINUM = new BlockBase("ore_aluminum", Material.ROCK, "pickaxe", 2, 5.0F, 50.0F);
	public static final Block ORE_COPPER = new BlockBase("ore_copper", Material.ROCK, "pickaxe", 2, 5.0F, 50.0F);
	public static final Block ORE_LEAD = new BlockBase("ore_lead", Material.ROCK, "pickaxe", 2, 5.0F, 50.0F);
	public static final Block ORE_NICKEL = new BlockBase("ore_nickel", Material.ROCK, "pickaxe", 2, 5.0F, 50.0F);
	
	//Metal Blocks
	public static final Block BLOCK_ALUMINUM = new BlockBase("block_aluminum", Material.IRON, "pickaxe", 2, 5.0F, 50.0F);
	public static final Block BLOCK_COPPER = new BlockBase("block_copper", Material.IRON, "pickaxe", 2, 5.0F, 50.0F);
	public static final Block BLOCK_LEAD = new BlockBase("block_lead", Material.IRON, "pickaxe", 2, 5.0F, 50.0F);
	public static final Block BLOCK_NICKEL = new BlockBase("block_nickel", Material.IRON, "pickaxe", 2, 5.0F, 50.0F);
	
}
