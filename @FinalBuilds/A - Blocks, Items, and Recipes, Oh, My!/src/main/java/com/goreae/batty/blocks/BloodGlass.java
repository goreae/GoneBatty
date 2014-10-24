package com.goreae.batty.blocks;


import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.List;
import java.util.Random;

import com.sun.xml.internal.stream.Entity;

import net.minecraft.block.Block;

public class BloodGlass extends BlockGlass {
	public BloodGlass(Material material, boolean bool)
	{
		super(material, bool);
		setHarvestLevel("pickaxe", 0);
	}
	
	@Override
	public int quantityDropped(Random p_149745_1_)
    {
        return 1;
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register)
	{
		this.blockIcon = register.registerIcon("batty:bloodGlass");
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int id, int meta)
	{
		return this.blockIcon;
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        return null;
    }
	
	
	
	
	
}
