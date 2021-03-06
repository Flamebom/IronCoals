package com.flamebom.ironcoals.datagen;

import java.util.function.Consumer;

import com.flamebom.ironcoals.setup.ItemRegistration;

import net.minecraft.advancements.criterion.InventoryChangeTrigger;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraft.item.Items;

public class Recipes extends RecipeProvider {
	public Recipes(DataGenerator generatorIn) {
		super(generatorIn);
	}

	@Override
	    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
	   // Recipes from that create the same item don't work so you have to comment them out  
		 ShapedRecipeBuilder.shapedRecipe(ItemRegistration.IRONCOAL.get(),8)
	         .patternLine("aaa")
	         .patternLine("a#a")
	         .patternLine("aaa")
	         .key('a', ItemTags.COALS)
	         .key('#', Tags.Items.STORAGE_BLOCKS_IRON)
	         .setGroup("IronCoals")
	         .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	         .build(consumer);
	         ShapedRecipeBuilder.shapedRecipe(ItemRegistration.IRONCOALTORCH.get(),4)
	         .patternLine("a")
	         .patternLine("x")
	         .key('a', ItemRegistration.IRONCOALCHUNK.get())
	         .key('x',Items.STICK)
	         .setGroup("IronCoals")
	         .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	         .build(consumer);
	        ShapedRecipeBuilder.shapedRecipe(ItemRegistration.GOLDCOAL.get(),8)
	         .patternLine("aaa")
	         .patternLine("a#a")
	         .patternLine("aaa")
	         .key('a', ItemRegistration.IRONCOAL.get())
	         .key('#', Tags.Items.STORAGE_BLOCKS_GOLD)
	         .setGroup("IronCoals")
	         .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	         .build(consumer);
	 
	        ShapedRecipeBuilder.shapedRecipe(ItemRegistration.DIAMONDCOAL.get(),8)
	         .patternLine("aaa")
	         .patternLine("a#a")
	         .patternLine("aaa")
	         .key('a', ItemRegistration.GOLDCOAL.get())
	         .key('#', Tags.Items.STORAGE_BLOCKS_DIAMOND)
	         .setGroup("IronCoals")
	         .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	         .build(consumer);
	        ShapedRecipeBuilder.shapedRecipe(ItemRegistration.EMERALDCOAL.get(),8)
	         .patternLine("aaa")
	         .patternLine("a#a")
	         .patternLine("aaa")
	         .key('a', ItemRegistration.DIAMONDCOAL.get())
	         .key('#', Tags.Items.STORAGE_BLOCKS_EMERALD)
	         .setGroup("IronCoals")
	         .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	         .build(consumer);
	        
	        ShapedRecipeBuilder.shapedRecipe(ItemRegistration.AEONCOAL.get())
	         .patternLine("aba")
	         .patternLine("x#x")
	         .patternLine("aba")
	         .key('a', ItemRegistration.EMERALDCOAL.get())
	         .key('#', Items.NETHERITE_BRICKS)
	         .key('x', Items.NETHER_STAR)
	         .key('b', Items.HEART_OF_THE_SEA)
	         .setGroup("IronCoals")
	         .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	         .build(consumer);
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.IRONCOALBLOCKITEM.get())
	        .addIngredient(ItemRegistration.IRONCOAL.get(),9)
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.GOLDCOALBLOCKITEM.get())
	        .addIngredient(ItemRegistration.GOLDCOAL.get(),9)
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.DIAMONDCOALBLOCKITEM.get())
	        .addIngredient(ItemRegistration.DIAMONDCOAL.get(),9)
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.EMERALDCOALBLOCKITEM.get())
	        .addIngredient(ItemRegistration.EMERALDCOAL.get(),9)
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.BASECOALCHUNK.get(),8)
	        .addIngredient(ItemTags.COALS)
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);
	        ShapelessRecipeBuilder.shapelessRecipe(Items.COAL.getItem())
	        .addIngredient(ItemRegistration.BASECOALCHUNK.get(),8)
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.CHARCOALCHUNK.get(),8)
	        .addIngredient(Items.CHARCOAL)
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);
	        ShapelessRecipeBuilder.shapelessRecipe(Items.CHARCOAL.getItem())
	        .addIngredient(ItemRegistration.CHARCOALCHUNK.get(),8)
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);
	        
	        
	       /* 
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.DIAMONDCOAL.get())
	        .addIngredient(ItemRegistration.DIAMONDCOALCHUNK.get(),8)
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.DIAMONDCOALCHUNK.get(),8)
	        .addIngredient(ItemRegistration.DIAMONDCOAL.get())
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);	
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.EMERALDCOAL.get())
	        .addIngredient(ItemRegistration.EMERALDCOALCHUNK.get(),8)
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.EMERALDCOALCHUNK.get(),8)
	        .addIngredient(ItemRegistration.EMERALDCOAL.get())
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);	
	       
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.GOLDCOAL.get())
	        .addIngredient(ItemRegistration.GOLDCOALCHUNK.get(),8)
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.GOLDCOALCHUNK.get(),8)
	        .addIngredient(ItemRegistration.GOLDCOAL.get())
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);	
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.IRONCOAL.get())
	        .addIngredient(ItemRegistration.IRONCOALCHUNK.get(),8)
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.IRONCOALCHUNK.get(),8)
	        .addIngredient(ItemRegistration.IRONCOAL.get())
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);	
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.IRONCOAL.get(),9)
	        .addIngredient(ItemRegistration.IRONCOALBLOCKITEM.get())
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.GOLDCOAL.get(),9)
	        .addIngredient(ItemRegistration.GOLDCOALBLOCKITEM.get())
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.DIAMONDCOAL.get(),9)
	        .addIngredient(ItemRegistration.DIAMONDCOALBLOCKITEM.get())
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);
	        ShapelessRecipeBuilder.shapelessRecipe(ItemRegistration.EMERALDCOAL.get(),9)
	        .addIngredient(ItemRegistration.EMERALDCOALBLOCKITEM.get())
	        .setGroup("IronCoals")
	        .addCriterion("stone", InventoryChangeTrigger.Instance.forItems(Blocks.STONE))
	        .build(consumer);*/
	        
}
}
