package com.rocker1337.dab.init.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class weed extends ItemFood
{
    public weed(int amount, float saturation, boolean isWolfFood)
    {
        super(amount, saturation, isWolfFood);
        setUnlocalizedName(SetItemNames.DABItems.WEED.getUnlocalizedName());
        setRegistryName(SetItemNames.DABItems.WEED.getRegistryName());

        setAlwaysEdible();
        setMaxStackSize(64);

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced)
    {
        toolTip.add(TextFormatting.DARK_GREEN + "Do not consume if not in Colorado OR NOW CALIFORNIA. We here support prop 64 (JK).");
    }
}
