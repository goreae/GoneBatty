package com.goreae.batty;

import com.goreae.batty.items.BattyItem;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventHookContainer {

	public EventHookContainer()
	{
		
	}
	
	private void addDrops(LivingDropsEvent event, ItemStack dropStack)
	{
		EntityItem entityitem = new EntityItem(event.entityLiving.worldObj, event.entityLiving.posX, event.entityLiving.posY, event.entityLiving.posZ, dropStack);
        entityitem.delayBeforeCanPickup = 10;
        event.drops.add(entityitem);
	}
	
	@SubscribeEvent
	public void onLivingDrop(LivingDropsEvent event)
	{
		if(event.entityLiving == null)
			return;
		
		if(event.entityLiving.getClass() == EntityBat.class)
		{
			ItemStack stack = new ItemStack(BattyItem.batClaw);
			addDrops(event, stack);
		}
	}
}
