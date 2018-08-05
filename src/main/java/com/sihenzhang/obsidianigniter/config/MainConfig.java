package com.sihenzhang.obsidianigniter.config;

import com.sihenzhang.obsidianigniter.ObsidianIgniter;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = ObsidianIgniter.MODID, name = "ObsidianIgniter")
public class MainConfig {
    @Config.Name("chance")
    public static double chance = 0.05;

    @Mod.EventBusSubscriber(modid = ObsidianIgniter.MODID)
    public static class ConfigSyncHandler {
        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(ObsidianIgniter.MODID)) {
                ConfigManager.sync(ObsidianIgniter.MODID, Config.Type.INSTANCE);
                ObsidianIgniter.logger.info("The config file has been saved.");
            }
        }
    }
}
