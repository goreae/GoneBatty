package com.goreae.batty;

import com.goreae.batty.blocks.BattyBlock;
import com.goreae.batty.items.BattyItem;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes {

	//declare itemstacks
	
	//Bat items
	private static ItemStack batClaw = new ItemStack(BattyItem.batClaw);
	private static ItemStack batFang = new ItemStack(BattyItem.batFang);
	
	//Bat Stone Blocks
	private static ItemStack batStone = new ItemStack(BattyBlock.batStone);
	private static ItemStack vampStone = new ItemStack(BattyBlock.vampStone);
	private static ItemStack bloodStone = new ItemStack(BattyBlock.bloodStone);
	
	//Bat Brick Blocks
	private static ItemStack batBrick = new ItemStack(BattyBlock.batBrick);
	private static ItemStack vampBrick = new ItemStack(BattyBlock.vampBrick);
	//Bat Sand Blocks
	private static ItemStack batSand = new ItemStack(BattyBlock.batSand);
	private static ItemStack vampSand = new ItemStack(BattyBlock.vampSand);
	private static ItemStack bloodSand = new ItemStack(BattyBlock.bloodSand);
	//Vanilla blocks
	private static ItemStack stone = new ItemStack(Blocks.stone);
	private static ItemStack sand = new ItemStack(Blocks.sand);
	//Vanilla Items
	private static ItemStack bone = new ItemStack(Items.bone);
	
	public static void registerRecipes()
	{
		//Temporary recipes
		GameRegistry.addRecipe(new ItemStack(BattyItem.batFang), "fff", "fbf", "fff", 'f', batClaw, 'b', bone);
		
		//Stone blocks
		GameRegistry.addRecipe(new ItemStack(BattyBlock.batStone, 8), "sss", "scs", "sss", 'c', batClaw, 's', stone);
		GameRegistry.addRecipe(new ItemStack(BattyBlock.vampStone, 8), "sss", "sfs", "sss", 's', stone, 'f', batFang);
		GameRegistry.addRecipe(new ItemStack(BattyBlock.bloodStone, 4), "bv", "vb", 'b', batStone, 'v', vampStone);
		//Brick blocks
		GameRegistry.addRecipe(new ItemStack(BattyBlock.batBrick, 4), "ss", "ss", 's', batStone);
		GameRegistry.addRecipe(new ItemStack(BattyBlock.vampBrick, 4), "ss", "ss", 's', vampStone);
		GameRegistry.addRecipe(new ItemStack(BattyBlock.bloodBrick, 4), "ss", "ss", 's', bloodStone);
		//Sand blocks
		GameRegistry.addRecipe(new ItemStack(BattyBlock.batSand, 8), "sss", "scs", "sss", 'c', batClaw, 's', sand);
		GameRegistry.addRecipe(new ItemStack(BattyBlock.vampSand, 8), "sss", "scs", "sss", 'c', batFang, 's', sand);
		GameRegistry.addRecipe(new ItemStack(BattyBlock.bloodSand, 4), "bv", "vb", 'b', batSand, 'v', vampSand);
		//Glass blocks
		GameRegistry.addSmelting(batSand, new ItemStack(BattyBlock.batGlass), 0.1F);
		GameRegistry.addSmelting(vampSand, new ItemStack(BattyBlock.vampGlass), 0.1F);
		GameRegistry.addSmelting(bloodSand, new ItemStack(BattyBlock.bloodGlass), 0.1F);
		
	}
}
