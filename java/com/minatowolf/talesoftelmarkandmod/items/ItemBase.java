package com.minatowolf.talesoftelmarkandmod.items;

import com.minatowolf.talesoftelmarkandmod.Main;
import com.minatowolf.talesoftelmarkandmod.init.ModItems;
import com.minatowolf.talesoftelmarkandmod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MISC);
		
		ModItems.ITEMS.add(this);		
	}
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
