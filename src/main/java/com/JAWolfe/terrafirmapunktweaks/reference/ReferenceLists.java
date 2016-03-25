package com.JAWolfe.terrafirmapunktweaks.reference;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;

public class ReferenceLists 
{
	private static final ReferenceLists INSTANCE = new ReferenceLists();
	public static final ReferenceLists getInstance()
	{
		return INSTANCE;
	}
	
	public List<ItemStack> anvilIngredList;
	
	private ReferenceLists()
	{
		anvilIngredList = new ArrayList<ItemStack>();
	}
	
	public void addAnvilIngred(ItemStack newIS)
	{
		if(!isAnvilInged(newIS))
		{
			anvilIngredList.add(newIS);
		}
	}
	
	public boolean isAnvilInged(ItemStack is)
	{
		for(int i = 0; i < anvilIngredList.size(); i++)
		{
			ItemStack listIS = anvilIngredList.get(i);
			if(is != null && listIS != null)
			{
				if(is.getItem() == listIS.getItem())
				{
					if(is.getItemDamage() == listIS.getItemDamage())
						return true;
				}
			}
		}
		return false;
	}
}
