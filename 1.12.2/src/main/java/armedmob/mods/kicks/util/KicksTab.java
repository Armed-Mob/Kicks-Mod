package armedmob.mods.kicks.util;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class KicksTab extends CreativeTabs {

	public KicksTab() {
		super(Reference.MODID);
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.DIAMOND_BOOTS);
	}
}
