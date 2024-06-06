package com.AraNeaLux.farmersclimate.entity;

import com.AraNeaLux.farmersclimate.AddFoodInit;

import defeatedcrow.hac.api.material.EntityRenderData;
import defeatedcrow.hac.food.material.entity.StickMeatItem;
import vectorwing.farmersdelight.common.registry.ModItems;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class AddStickMeatItem extends StickMeatItem {

	public AddStickMeatItem(String s, int nut, float sat, TagKey<Item> pair) {
		super(s, nut, sat, pair);
	}

	@Override
	public AddEntityRenderData getRenderData(Item item) {
		//if (item == AddFoodInit.STICK_FISH_RAW.get())
		if (item == AddFoodInit.BARBECUE_STICK.get())
			return (AddEntityRenderData) FISH_RAW;
		if (item == AddFoodInit.STICK_FISH_COOKED.get())
			return (AddEntityRenderData) FISH_COOKED;
		return (AddEntityRenderData) FISH_RAW;
	}

	public static final AddEntityRenderData FISH_RAW = new AddEntityRenderData("stick_fish_raw", 1F, 0F);
	public static final AddEntityRenderData FISH_COOKED = new AddEntityRenderData("stick_fish_cooked", 1F, 0F);

}