package com.flamebom.ironcoals.datagen;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DirectoryCache;
import net.minecraft.data.IDataProvider;
import net.minecraft.data.LootTableProvider;
import net.minecraft.util.ResourceLocation;
import net.minecraft.loot.functions.CopyNbt;
import net.minecraft.loot.ConstantRange;
import net.minecraft.loot.DynamicLootEntry;
import net.minecraft.loot.ItemLootEntry;
import net.minecraft.loot.LootParameterSets;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTableManager;
import net.minecraft.loot.functions.CopyName;
import net.minecraft.loot.functions.SetContents;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseLootTable extends LootTableProvider {
	  private static final Logger LOGGER = LogManager.getLogger();
	    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
	    protected final Map<Block, LootTable.Builder> lootTables = new HashMap<>();
	    private final DataGenerator generator;
	    public BaseLootTable(DataGenerator dataGeneratorIn) {
	        super(dataGeneratorIn);
	        this.generator = dataGeneratorIn;
	    }
	    protected abstract void addTables();

	    protected LootTable.Builder createStandardTable(String name, Block block) {
	        LootPool.Builder builder = LootPool.builder()
	                .name(name)
	                .rolls(ConstantRange.of(1))
	                .addEntry(ItemLootEntry.builder(block)
	                );
	        return LootTable.builder().addLootPool(builder);
	    }

	    @Override
	    public void act(DirectoryCache cache) {
	        addTables();

	        Map<ResourceLocation, LootTable> tables = new HashMap<>();
	        for (Map.Entry<Block, LootTable.Builder> entry : lootTables.entrySet()) {
	            tables.put(entry.getKey().getLootTable(), entry.getValue().setParameterSet(LootParameterSets.BLOCK).build());
	        }
	        writeTables(cache, tables);
	    }

	    private void writeTables(DirectoryCache cache, Map<ResourceLocation, LootTable> tables) {
	        Path outputFolder = this.generator.getOutputFolder();
	        tables.forEach((key, lootTable) -> {
	            Path path = outputFolder.resolve("data/" + key.getNamespace() + "/loot_tables/" + key.getPath() + ".json");
	            try {
	                IDataProvider.save(GSON, cache, LootTableManager.toJson(lootTable), path);
	            } catch (IOException e) {
	                LOGGER.error("Couldn't write loot table {}", path, e);
	            }
	        });
	    }

	    @Override
	    public String getName() {
	        return "IronCoals LootTables";
	    }
}
