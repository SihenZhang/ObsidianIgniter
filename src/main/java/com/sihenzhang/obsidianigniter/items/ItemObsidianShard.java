package com.sihenzhang.obsidianigniter.items;

import com.sihenzhang.obsidianigniter.ObsidianIgniter;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemObsidianShard extends Item {
    public ItemObsidianShard() {
        setCreativeTab(CreativeTabs.MISC);
        setRegistryName(ObsidianIgniter.MODID, "obsidian_shard");
        setUnlocalizedName(ObsidianIgniter.MODID + ".obsidian_shard");
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(this.getRegistryName(), "inventory"));
    }
}
