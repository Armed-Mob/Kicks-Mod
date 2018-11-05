package armedmob.mods.kicks.objects;

import armedmob.mods.kicks.Main;
import armedmob.mods.kicks.init.ModBlocks;
import armedmob.mods.kicks.init.ModItems;
import armedmob.mods.kicks.util.IHasModel;
import armedmob.mods.kicks.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {

	public BlockBase(String name, Material material) {
		super(material);
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Reference.KICKSTAB);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
	
	

}
