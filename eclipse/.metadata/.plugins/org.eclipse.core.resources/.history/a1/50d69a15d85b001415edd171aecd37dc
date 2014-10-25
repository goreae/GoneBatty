package com.goreae.batty;

import com.goreae.batty.Recipes;
import com.goreae.batty.blocks.BlockInit;
import com.goreae.batty.items.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

//version is stageWorld.major.minor First version was A1.0.0
@Mod(modid="batty", name="Gone Batty", version="A1.0.0")
public class Batty 
{
	
	@Instance(value = "batty")
	public static Batty instance;
	
	@SidedProxy(clientSide="com.goreae.batty.client.ClientProxy", serverSide="com.goreae.batty.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		//Stub Method
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) 
	{
		proxy.registerRenderers();
		BlockInit.registerBlocks();
		ItemInit.registerItems();
		Recipes.registerRecipes();
		MinecraftForge.EVENT_BUS.register(new EventHookContainer());
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
		//Stub Method
	}
	
	
}
