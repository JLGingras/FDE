
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

import net.mcreator.fde.FdeMod;

public class FdeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FdeMod.MODID);
	public static final RegistryObject<Item> INFERNAL_FURNACE = block(FdeModBlocks.INFERNAL_FURNACE);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
