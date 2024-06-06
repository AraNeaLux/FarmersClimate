package com.AraNeaLux.farmersclimate.entity;

import defeatedcrow.hac.core.client.EntityClientRegister;
import defeatedcrow.hac.food.client.model.StickChickenModel;
import net.minecraftforge.client.event.EntityRenderersEvent;

public class AddEntityClientRegister extends EntityClientRegister {

	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(AddStickMeatItem.FISH_RAW.getLayerLocation(), StickChickenModel::createBodyLayer);
		event.registerLayerDefinition(AddStickMeatItem.FISH_COOKED.getLayerLocation(), StickChickenModel::createBodyLayer);
	}
	
}