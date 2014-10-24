package com.goreae.batty.blocks;


import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.List;

import net.minecraft.block.Block;

public class VampSand extends BlockSand {
	public VampSand()
	{
		super();
		setHarvestLevel("shovel", 0);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs tab, List items)
	{
		items.add(new ItemStack(item, 1, 0));
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register)
	{
		this.blockIcon = register.registerIcon("batty:vampSand");
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int id, int meta)
	{
		return this.blockIcon;
	}
	
		
	
}
