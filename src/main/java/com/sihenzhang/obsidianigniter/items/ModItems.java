package com.sihenzhang.obsidianigniter.items;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
    @GameRegistry.ObjectHolder("obsidianigniter:obsidian_igniter")
    public static ItemObsidianIgniter obsidianIgniter;

    @GameRegistry.ObjectHolder("obsidianigniter:obsidian_shard")
    public static ItemObsidianShard obsidianShard;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        obsidianIgniter.initModel();
        obsidianShard.initModel();
    }
}
