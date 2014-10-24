package com.goreae.batty.blocks;

import com.goreae.batty.blocks.BatGlass;
import com.goreae.batty.blocks.BatSand;
import com.goreae.batty.blocks.BloodGlass;
import com.goreae.batty.blocks.BloodSand;
import com.goreae.batty.blocks.VampGlass;
import com.goreae.batty.blocks.VampSand;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

//This class is reserved for 'mundane' blocks, things without special powers and shit.
public class BattyBlock extends Block 
{
	public BattyBlock (Material material)
	{
		super(material);
		
	}
	
	public static CreativeTabs batTab = new CreativeTabs("tabBatBlocks")
	{
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem()
		{
			return Item.getItemFromBlock(batStone);
		}
		
	};
	
	//Stone blocks
	public final static Block batStone = new BattyBlock(Material.rock).setCreativeTab(batTab).setHardness(2F).setStepSound(Block.soundTypeStone)
	        .setBlockName("batStone").setBlockTextureName("batty:batStone").setResistance(10f);
	
	public final static Block vampStone = new BattyBlock(Material.rock).setCreativeTab(batTab).setHardness(2F).setStepSound(Block.soundTypeStone)
	        .setBlockName("vampStone").setBlockTextureName("batty:vampStone").setResistance(10f);
	
	public final static Block bloodStone = new BattyBlock(Material.rock).setCreativeTab(batTab).setHardness(2F).setStepSound(Block.soundTypeStone)
	        .setBlockName("bloodStone").setBlockTextureName("batty:bloodStone").setResistance(10f);
	
	//Brick blocks
	public final static Block batBrick = new BattyBlock(Material.rock).setCreativeTab(batTab).setHardness(2F).setStepSound(Block.soundTypeStone)
	        .setBlockName("batBrick").setBlockTextureName("batty:batBrick").setResistance(10f);
	
	public final static Block vampBrick = new BattyBlock(Material.rock).setCreativeTab(batTab).setHardness(2F).setStepSound(Block.soundTypeStone)
	        .setBlockName("vampBrick").setBlockTextureName("batty:vampBrick").setResistance(10f);
	
	public final static Block bloodBrick = new BattyBlock(Material.rock).setCreativeTab(batTab).setHardness(2F).setStepSound(Block.soundTypeStone)
	        .setBlockName("bloodBrick").setBlockTextureName("batty:bloodBrick").setResistance(10f);
	
	//Sand blocks
	public final static Block batSand = new BatSand().setResistance(30F).setCreativeTab(BattyBlock.batTab).
			setStepSound(soundTypeSand).setHardness(0.5F).setStepSound(soundTypeSand).setBlockName("batSand");
	
	public final static Block vampSand = new VampSand().setResistance(0.5F).setCreativeTab(BattyBlock.batTab).
			setStepSound(soundTypeSand).setHardness(0.5F).setStepSound(soundTypeSand).setBlockName("vampSand").setLightLevel(1.0F);

	public final static Block bloodSand = new BloodSand().setResistance(0.5F).setCreativeTab(BattyBlock.batTab).
			setStepSound(soundTypeSand).setHardness(0.5F).setBlockName("bloodSand").setLightOpacity(0);
	
	//Glass blocks
	public final static Block batGlass = new BatGlass(Material.glass, false).setResistance(20F).setCreativeTab(BattyBlock.batTab).
			setStepSound(soundTypeGlass).setHardness(0.3F).setBlockName("batGlass").setLightOpacity(10);
	
	public final static Block vampGlass = new VampGlass(Material.glass, false).setResistance(0.5F).setCreativeTab(BattyBlock.batTab).
			setStepSound(soundTypeGlass).setHardness(0.3F).setBlockName("vampGlass").setLightLevel(1.0F);
	
	public final static Block bloodGlass = new BloodGlass(Material.glass, false).setResistance(0.5F).setCreativeTab(BattyBlock.batTab).
			setStepSound(soundTypeGlass).setHardness(0.3F).setBlockName("bloodGlass");
	
}

