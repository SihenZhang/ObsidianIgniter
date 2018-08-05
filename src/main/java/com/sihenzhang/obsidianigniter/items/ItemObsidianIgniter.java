package com.sihenzhang.obsidianigniter.items;

import com.sihenzhang.obsidianigniter.ObsidianIgniter;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemFlintAndSteel;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class ItemObsidianIgniter extends ItemFlintAndSteel {
    public ItemObsidianIgniter() {
        maxStackSize = 1;
        setMaxDamage(16);
        setCreativeTab(CreativeTabs.TOOLS);
        setRegistryName(ObsidianIgniter.MODID, "obsidian_igniter");
        setUnlocalizedName(ObsidianIgniter.MODID + ".obsidian_igniter");
    }

    public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (worldIn.isRemote) {
            worldIn.playSound(player, pos, SoundEvents.ITEM_FLINTANDSTEEL_USE, SoundCategory.BLOCKS, 1.0F, itemRand.nextFloat() * 0.4F + 0.8F);
            return EnumActionResult.SUCCESS;
        }
        Random r = new java.util.Random();
        if (r.nextDouble() < 0.05) {
            return super.onItemUse(player, worldIn, pos, hand, facing, hitX, hitY, hitZ);
        }
        player.getHeldItem(hand).damageItem(1, player);
        return EnumActionResult.SUCCESS;
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
