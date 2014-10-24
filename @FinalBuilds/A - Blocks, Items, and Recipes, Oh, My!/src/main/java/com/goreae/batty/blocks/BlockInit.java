package com.goreae.batty.blocks;

import com.goreae.batty.blocks.BattyBlock;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

//This class creates the blocks and registers them.
public class BlockInit{
	
	
	
	
		
		
		public static void registerBlocks()
		{
			//Stone blocks
			GameRegistry.registerBlock(BattyBlock.batStone, "batStone");
			GameRegistry.registerBlock(BattyBlock.vampStone, "vampStone");
			GameRegistry.registerBlock(BattyBlock.bloodStone, "bloodStone");
			
			//Brick Blocks
			GameRegistry.registerBlock(BattyBlock.batBrick, "batBrick");
			GameRegistry.registerBlock(BattyBlock.vampBrick, "vampBrick");
			GameRegistry.registerBlock(BattyBlock.bloodBrick, "bloodBrick");
			
			//Sand Blocks
			GameRegistry.registerBlock(BattyBlock.batSand, "batSand");
			GameRegistry.registerBlock(BattyBlock.vampSand, "vampSand");
			GameRegistry.registerBlock(BattyBlock.bloodSand, "bloodSand");
			
			//Glass Blocks
			GameRegistry.registerBlock(BattyBlock.batGlass, "batGlass");
			GameRegistry.registerBlock(BattyBlock.vampGlass, "vampGlass");
			GameRegistry.registerBlock(BattyBlock.bloodGlass, "bloodGlass");
			
		}

}
