package com.AraNeaLux.farmersclimate;

import com.AraNeaLux.farmersclimate.entity.AddStickMeatItem;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class AddFoodInit {
	
	//public static final RegistryObject<Item> STICK_FISH_RAW = FoodInit.regItem("stick_fish_raw", () -> new AddStickMeatItem("stick_fish_raw", 0, 0F, null).setRawFood());
	//public static final RegistryObject<Item> STICK_FISH_COOKED = FoodInit.regItem("stick_fish_cooked", () -> new AddStickMeatItem("stick_fish_cooked", 8, 0.3F, null));
	
	public static final DeferredRegister<Item> ITEMS = 
            DeferredRegister.create(ForgeRegistries.ITEMS, FarmersClimate.MODID);
	
	public static final RegistryObject<Item> STICK_FISH_RAW = ITEMS.register("stick_fish_raw",
            () -> new AddStickMeatItem("stick_fish_raw", 0, 0F, null).setRawFood());
	public static final RegistryObject<Item> STICK_FISH_COOKED = ITEMS.register("stick_fish_cooked",
            () -> new AddStickMeatItem("stick_fish_cooked", 0, 0F, null));
	public static final RegistryObject<Item> BARBECUE_STICK = ITEMS.register("barbecue_stick",
            () -> new AddStickMeatItem("barbecue_stick", 0, 0F, null));
	
}

