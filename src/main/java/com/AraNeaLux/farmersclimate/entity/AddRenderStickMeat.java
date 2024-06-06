package com.AraNeaLux.farmersclimate.entity;

import defeatedcrow.hac.food.client.entity.RenderStickMeat;
import defeatedcrow.hac.food.client.model.StickChickenModel;
import defeatedcrow.hac.food.material.entity.FoodEntityBase;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;

public class AddRenderStickMeat<T extends FoodEntityBase> extends RenderStickMeat<T> {

	public AddRenderStickMeat(Context ctx) {
		super(ctx);
		this.model = new StickChickenModel<>(ctx.bakeLayer(AddStickMeatItem.FISH_RAW.getLayerLocation()));
	}

	@Override
	public ResourceLocation getTextureLocation(FoodEntityBase entity) {
		return AddStickMeatItem.FISH_RAW.getTextureLocation();
	}

}