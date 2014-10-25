package com.goreae.batty.items;

import com.goreae.batty.blocks.BattyBlock;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class BattyItem extends Item {

	public BattyItem()
	{
		
	}
	
	public static Item batFang = new BattyItem().setUnlocalizedName("batFang")
			.setCreativeTab(BattyBlock.batTab).setMaxStackSize(64).setTextureName("batty:batFang");
	
	public static Item batClaw = new BattyItem().setUnlocalizedName("batClaw")
			.setCreativeTab(BattyBlock.batTab).setMaxStackSize(64).setTextureName("batty:batClaw");
	
}
