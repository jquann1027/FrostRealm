package baguchan.frostrealm.data;

import baguchan.frostrealm.registry.FrostBlocks;
import baguchan.frostrealm.registry.FrostItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

public class CraftingGenerator extends CraftingDataHelper {
	public CraftingGenerator(DataGenerator generator) {
		super(generator);
	}

	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		ShapelessRecipeBuilder.shapeless(FrostBlocks.FROSTROOT_PLANKS.get(), 4).requires(FrostBlocks.FROSTROOT_LOG.get())
				.unlockedBy("has_" + FrostBlocks.FROSTROOT_LOG.get().getRegistryName().getPath(), has(FrostBlocks.FROSTROOT_LOG.get())).save(consumer);

		ShapelessRecipeBuilder.shapeless(FrostBlocks.FROZEN_PLANKS.get(), 4).requires(FrostBlocks.FROZEN_LOG.get())
				.unlockedBy("has_" + FrostBlocks.FROZEN_LOG.get().getRegistryName().getPath(), has(FrostBlocks.FROZEN_LOG.get())).save(consumer);


		makeSlab(consumer, FrostBlocks.FRIGID_STONE_SLAB.get(), FrostBlocks.FRIGID_STONE.get());
		makeStairs(consumer, FrostBlocks.FRIGID_STONE_STAIRS.get(), FrostBlocks.FRIGID_STONE.get());

		makeSlab(consumer, FrostBlocks.FRIGID_STONE_MOSSY_SLAB.get(), FrostBlocks.FRIGID_STONE_MOSSY.get());
		makeStairs(consumer, FrostBlocks.FRIGID_STONE_MOSSY_STAIRS.get(), FrostBlocks.FRIGID_STONE_MOSSY.get());

		ShapedRecipeBuilder.shaped(FrostBlocks.FRIGID_STONE_BRICK_MOSSY.get(), 4)
				.pattern("BB")
				.pattern("BB")
				.define('B', FrostBlocks.FRIGID_STONE_MOSSY.get())
				.unlockedBy("has_" + FrostBlocks.FRIGID_STONE_MOSSY.get().getRegistryName().getPath(), has(FrostBlocks.FRIGID_STONE_MOSSY.get())).save(consumer);


		makeSlab(consumer, FrostBlocks.FRIGID_STONE_BRICK_MOSSY_SLAB.get(), FrostBlocks.FRIGID_STONE_BRICK_MOSSY.get());
		makeStairs(consumer, FrostBlocks.FRIGID_STONE_BRICK_MOSSY_STAIRS.get(), FrostBlocks.FRIGID_STONE_BRICK_MOSSY.get());

		ShapedRecipeBuilder.shaped(FrostBlocks.FRIGID_STONE_BRICK.get(), 4)
				.pattern("BB")
				.pattern("BB")
				.define('B', FrostBlocks.FRIGID_STONE.get())
				.unlockedBy("has_" + FrostBlocks.FRIGID_STONE.get().getRegistryName().getPath(), has(FrostBlocks.FRIGID_STONE.get())).save(consumer);

		makeSlab(consumer, FrostBlocks.FRIGID_STONE_BRICK_SLAB.get(), FrostBlocks.FRIGID_STONE_BRICK.get());
		makeStairs(consumer, FrostBlocks.FRIGID_STONE_BRICK_STAIRS.get(), FrostBlocks.FRIGID_STONE_BRICK.get());

		makeSlab(consumer, FrostBlocks.FROSTROOT_PLANKS_SLAB.get(), FrostBlocks.FROSTROOT_PLANKS.get());
		makeStairs(consumer, FrostBlocks.FROSTROOT_PLANKS_STAIRS.get(), FrostBlocks.FROSTROOT_PLANKS.get());
		makeWoodFence(consumer, FrostBlocks.FROSTROOT_FENCE.get(), FrostBlocks.FROSTROOT_PLANKS.get());
		makeFenceGate(consumer, FrostBlocks.FROSTROOT_FENCE_GATE.get(), FrostBlocks.FROSTROOT_PLANKS.get());
		makeDoor(consumer, FrostBlocks.FROSTROOT_DOOR.get(), FrostBlocks.FROSTROOT_PLANKS.get());

		makeSlab(consumer, FrostBlocks.FROZEN_PLANKS_SLAB.get(), FrostBlocks.FROZEN_PLANKS.get());
		makeStairs(consumer, FrostBlocks.FROZEN_PLANKS_STAIRS.get(), FrostBlocks.FROZEN_PLANKS.get());
		makeWoodFence(consumer, FrostBlocks.FROZEN_FENCE.get(), FrostBlocks.FROZEN_PLANKS.get());
		makeFenceGate(consumer, FrostBlocks.FROZEN_FENCE_GATE.get(), FrostBlocks.FROZEN_PLANKS.get());
		foodCooking(FrostItems.FROZEN_FRUIT.get(), FrostItems.MELTED_FRUIT.get(), 0.1F, consumer);
		foodCooking(FrostItems.BEARBERRY.get(), FrostItems.COOKED_BEARBERRY.get(), 0.1F, consumer);
		foodCooking(FrostBlocks.SNOWPILE_QUAIL_EGG.get().asItem(), FrostItems.COOKED_SNOWPILE_QUAIL_EGG.get(), 0.2F, consumer);
		foodCooking(FrostItems.SNOWPILE_QUAIL_MEAT.get(), FrostItems.COOKED_SNOWPILE_QUAIL_MEAT.get(), 0.15F, consumer);

		helmetItem(consumer, "yeti_fur_helmet", FrostItems.YETI_FUR_HELMET.get(), FrostItems.YETI_FUR.get());
		chestplateItem(consumer, "yeti_fur_chestplate", FrostItems.YETI_FUR_CHESTPLATE.get(), FrostItems.YETI_FUR.get());
		leggingsItem(consumer, "yeti_fur_leggings", FrostItems.YETI_FUR_LEGGINGS.get(), FrostItems.YETI_FUR.get());
		bootsItem(consumer, "yeti_fur_boots", FrostItems.YETI_FUR_BOOTS.get(), FrostItems.YETI_FUR.get());

		makeFrostTorch(consumer, FrostBlocks.FROST_TORCH.get().asItem());

		ShapedRecipeBuilder.shaped(FrostBlocks.FRIGID_STOVE.get(), 1)
				.pattern("SSS")
				.pattern("SGS")
				.pattern("SSS")
				.define('S', ItemTags.STONE_CRAFTING_MATERIALS)
				.define('G', FrostItems.GLIMMERROCK.get())
				.unlockedBy("has_" + FrostItems.GLIMMERROCK.get().getRegistryName().getPath(), has(FrostItems.GLIMMERROCK.get())).save(consumer);

		ShapedRecipeBuilder.shaped(FrostBlocks.FROSTROOT_CHEST.get(), 1)
				.pattern("SSS")
				.pattern("S S")
				.pattern("SSS")
				.define('S', FrostBlocks.FROSTROOT_PLANKS.get())
				.unlockedBy("has_" + FrostBlocks.FROSTROOT_PLANKS.get().getRegistryName().getPath(), has(FrostBlocks.FROSTROOT_PLANKS.get())).save(consumer);


		ShapedRecipeBuilder.shaped(FrostItems.FROST_CATALYST.get(), 1)
				.pattern(" S ")
				.pattern("SBS")
				.pattern(" S ")
				.define('S', FrostItems.STRAY_NECKLACE_PART.get())
				.define('B', Items.SNOWBALL)
				.unlockedBy("has_" + FrostItems.STRAY_NECKLACE_PART.get().getRegistryName().getPath(), has(FrostItems.STRAY_NECKLACE_PART.get())).save(consumer);

		smeltOre(FrostItems.ASTRIUM_RAW.get(), FrostItems.ASTRIUM_INGOT.get(), 0.2F, consumer);
	}
}
