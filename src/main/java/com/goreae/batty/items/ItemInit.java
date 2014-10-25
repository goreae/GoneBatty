package com.goreae.batty.items;

import com.goreae.batty.blocks.BattyBlock;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.entity.passive.EntityBat;

public class ItemInit {

	
	
	
	
	public static void registerItems()
	{
		GameRegistry.registerItem(BattyItem.batFang, "batFang");
		GameRegistry.registerItem(BattyItem.batClaw, "batClaw");
	}
	
	
	
}
