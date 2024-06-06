package com.AraNeaLux.farmersclimate.entity;

import com.AraNeaLux.farmersclimate.FarmersClimate;

import defeatedcrow.hac.api.material.EntityRenderData;
import net.minecraft.resources.ResourceLocation;

public class AddEntityRenderData extends EntityRenderData {

	final ResourceLocation texPath;
	final String location;
	final String outer;

	final float scale;
	final float adjustY;
	boolean isOuter;

	public AddEntityRenderData(String name, float s, float a) {
		super(name,s,a);
		texPath = new ResourceLocation(FarmersClimate.MODID, "textures/entity/" + name + ".png");
		location = name;
		outer = "main";
		scale = s;
		adjustY = a;
		isOuter = false;
	}

	public AddEntityRenderData(String name, float s, float a, String outerName) {
		super(name,s,a,outerName);
		texPath = new ResourceLocation(FarmersClimate.MODID, "textures/entity/" + name + ".png");
		location = name;
		outer = outerName;
		scale = s;
		adjustY = a;
		isOuter = true;
	}
	
	@Override
	public ResourceLocation getTextureLocation() {
		return texPath;
	}
}