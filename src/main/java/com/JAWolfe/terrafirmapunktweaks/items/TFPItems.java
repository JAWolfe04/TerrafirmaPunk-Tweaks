package com.JAWolfe.terrafirmapunktweaks.items;

import com.JAWolfe.terrafirmapunktweaks.reference.Globals;
import com.bioxx.tfc.api.Metal;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class TFPItems 
{
	public static Item CustomBucketOil;
	public static Item CustomBucketBlood;
	public static Item CustomBucketOliveOil;
	public static Item CustomBucketWhaleOil;
	public static Item BlockMold;
	public static Item FenceMold;
	public static Item HalfSlabMold;
	public static Item MechCompMold;
	public static Item PistonMold;
	public static Item WireCoilMold;
	public static Item BearingMold;
	public static Item BoltMold;
	public static Item NailMold;
	public static Item NutMold;
	public static Item WasherMold;
	public static Item HopperMold;
	public static Item TFPNecronomicon;
	
	public static Item tungstenIngot;
	public static Item tungstenIngot2x;
	public static Item tungstenUnshaped;
	
	public static Item oreChunk;
	
	public static void initialise()
	{
		CustomBucketOliveOil = new TFPCustomBucket().setUnlocalizedName("Wooden Bucket Olive Oil");
		GameRegistry.registerItem(CustomBucketOliveOil, CustomBucketOliveOil.getUnlocalizedName());
		
		Globals.TUNGSTEN = new Metal("Tungsten", tungstenUnshaped, tungstenIngot);
		
		oreChunk = new ItemTFPOre().setFolder("ore/").setUnlocalizedName("Ore");
		GameRegistry.registerItem(oreChunk, oreChunk.getUnlocalizedName());
		
		if(Loader.isModLoaded("BuildCraft|Core"))
		{
			CustomBucketOil = new TFPCustomBucket().setUnlocalizedName("Wooden Bucket Oil");
			
			GameRegistry.registerItem(CustomBucketOil, CustomBucketOil.getUnlocalizedName());
		}
		
		if(Loader.isModLoaded("necromancy"))
		{
			CustomBucketBlood = new TFPCustomBucket().setUnlocalizedName("Wooden Bucket Blood");
			GameRegistry.registerItem(CustomBucketBlood, CustomBucketBlood.getUnlocalizedName());
			
			TFPNecronomicon = new TFPNecronomicon().setUnlocalizedName("TFPNecronomicon");
			GameRegistry.registerItem(TFPNecronomicon, TFPNecronomicon.getUnlocalizedName());
		}
		
		if(Loader.isModLoaded("ImmersiveEngineering"))
		{
			BlockMold = new MetalMold().setUnlocalizedName("Block Mold");
			FenceMold = new MetalMold().setUnlocalizedName("Fence Mold");
			HalfSlabMold = new MetalMold().setUnlocalizedName("Half Slab Mold");
			MechCompMold = new MetalMold().setUnlocalizedName("Mechanical Component Mold");
			PistonMold = new MetalMold().setUnlocalizedName("Piston Mold");
			WireCoilMold = new MetalMold().setUnlocalizedName("Wire Coil Mold");
			BearingMold = new MetalMold().setUnlocalizedName("Bearing Mold");
			BoltMold = new MetalMold().setUnlocalizedName("Bolt Mold");
			NailMold = new MetalMold().setUnlocalizedName("Nail Mold");
			NutMold = new MetalMold().setUnlocalizedName("Nut Mold");
			WasherMold = new MetalMold().setUnlocalizedName("Washer Mold");
			HopperMold = new MetalMold().setUnlocalizedName("Hopper Mold");
			
			GameRegistry.registerItem(BlockMold, BlockMold.getUnlocalizedName());
			GameRegistry.registerItem(FenceMold, FenceMold.getUnlocalizedName());
			GameRegistry.registerItem(HalfSlabMold, HalfSlabMold.getUnlocalizedName());
			GameRegistry.registerItem(MechCompMold, MechCompMold.getUnlocalizedName());
			GameRegistry.registerItem(PistonMold, PistonMold.getUnlocalizedName());
			GameRegistry.registerItem(WireCoilMold, WireCoilMold.getUnlocalizedName());
			GameRegistry.registerItem(BearingMold, BearingMold.getUnlocalizedName());
			GameRegistry.registerItem(BoltMold, BoltMold.getUnlocalizedName());
			GameRegistry.registerItem(NailMold, NailMold.getUnlocalizedName());
			GameRegistry.registerItem(NutMold, NutMold.getUnlocalizedName());
			GameRegistry.registerItem(WasherMold, WasherMold.getUnlocalizedName());
			GameRegistry.registerItem(HopperMold, HopperMold.getUnlocalizedName());
		}
		
		if(Loader.isModLoaded("steamcraft2"))
		{
			CustomBucketWhaleOil = new TFPCustomBucket().setUnlocalizedName("Wooden Bucket Whale Oil");
			GameRegistry.registerItem(CustomBucketWhaleOil, CustomBucketWhaleOil.getUnlocalizedName());
		}
	}
}
