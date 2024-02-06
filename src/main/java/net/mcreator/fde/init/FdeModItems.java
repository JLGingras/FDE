
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fde.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.fde.item.YummyBrainItem;
import net.mcreator.fde.item.SpiderGlandItem;
import net.mcreator.fde.item.ShulkerHeadItem;
import net.mcreator.fde.FdeMod;

public class FdeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FdeMod.MODID);
	public static final RegistryObject<Item> SPIDER_GLAND = REGISTRY.register("spider_gland", () -> new SpiderGlandItem());
	public static final RegistryObject<Item> INFERNAL_FURNACE = block(FdeModBlocks.INFERNAL_FURNACE);
	public static final RegistryObject<Item> SHULKER_HEAD = REGISTRY.register("shulker_head", () -> new ShulkerHeadItem());
	public static final RegistryObject<Item> YUMMY_BRAIN = REGISTRY.register("yummy_brain", () -> new YummyBrainItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
