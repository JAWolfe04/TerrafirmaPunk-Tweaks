package com.JAWolfe.tfptweaks;

import com.JAWolfe.tfptweaks.blocks.TFPBlocks;
import com.JAWolfe.tfptweaks.handlers.*;
import com.JAWolfe.tfptweaks.minetweaker.TFCTweaker;
import com.JAWolfe.tfptweaks.proxy.CommonProxy;
import com.JAWolfe.tfptweaks.reference.References;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.ExistingSubstitutionException;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = References.ModID, name = References.ModName, version = References.ModVersion, dependencies = References.ModDependencies)
public class TerraFirmaPunkTweaks
{    			
	@Mod.Instance(References.ModID)
	public static TerraFirmaPunkTweaks instance;
			
	@SidedProxy(clientSide = References.CLIENT_PROXY_CLASS, serverSide = References.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
			
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ConfigHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigHandler());
		
    	TFPBlocks.setup();
    	
    	proxy.registerTileEntities();    	
    }
    
    @EventHandler
	public void initialize(FMLInitializationEvent event)
	{    	
    	RecipeTweaks.RecipeFixes();
    	
    	MinecraftForge.EVENT_BUS.register(new PlayerInteractionHandler());
    	MinecraftForge.EVENT_BUS.register(new PlayerDamageHandler());
    	MinecraftForge.EVENT_BUS.register(new SpawnHandler());
    	
    	proxy.registerWAILA();
	}
    
    @EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{    
    	TFCTweaker.postInit();
    	
    	RecipeTweaks.SC2RecipeTweaks();
	}
}