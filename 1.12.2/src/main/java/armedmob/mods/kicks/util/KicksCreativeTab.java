package armedmob.mods.kicks.util;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class KicksCreativeTab extends CreativeTabs {

	public KicksCreativeTab() {
		super(Reference.MODID);
	}
	
	@Override 
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.DIAMOND_BOOTS);
	}
}
