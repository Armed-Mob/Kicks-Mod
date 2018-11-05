package armedmob.mods.kicks.objects;

import armedmob.mods.kicks.Main;
import armedmob.mods.kicks.init.ModItems;
import armedmob.mods.kicks.util.IHasModel;
import armedmob.mods.kicks.util.Reference;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Reference.KICKSTAB);
		
		ModItems.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
