package com.flamebom.ironcoals.items;

import java.util.List;

import com.flamebom.ironcoals.IronCoals;
import com.flamebom.ironcoals.helpers.CoalHelper;
import com.flamebom.ironcoals.setup.Config;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class EmeraldCoalChunk extends Item {
	public EmeraldCoalChunk() {
		super(new Item.Properties().group(IronCoals.ITEM_GROUP));
	}

	@Override
	public ITextComponent getDisplayName(ItemStack stack) {
		return new TranslationTextComponent(this.getTranslationKey(stack)).mergeStyle(TextFormatting.GREEN);
	}
	@Override
	public int getBurnTime(ItemStack itemStack) {
		return (Config.EMERALD_COAL_BURN.get()/8);
	}
@Override
public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
	tooltip.add(new TranslationTextComponent("message.emeraldcoalchunk" , Double.toString(CoalHelper.CoalMultiplier(Config.EMERALD_COAL_BURN.get()/8))).mergeStyle(TextFormatting.GREEN));
}
}
