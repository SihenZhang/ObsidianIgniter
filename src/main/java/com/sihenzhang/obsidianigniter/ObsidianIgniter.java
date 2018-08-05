package com.sihenzhang.obsidianigniter;

import com.sihenzhang.obsidianigniter.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ObsidianIgniter.MODID, name = ObsidianIgniter.NAME, version = ObsidianIgniter.VERSION)
public class ObsidianIgniter {
    public static final String MODID = "obsidianigniter";
    public static final String NAME = "Obsidian Igniter";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "com.sihenzhang.obsidianigniter.proxy.ClientProxy", serverSide = "com.sihenzhang.obsidianigniter.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static ObsidianIgniter instance;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }
}
