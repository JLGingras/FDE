
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.fde.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.fde.block.InfernalFurnaceBlock;
import net.mcreator.fde.FdeMod;

public class FdeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FdeMod.MODID);
	public static final RegistryObject<Block> INFERNAL_FURNACE = REGISTRY.register("infernal_furnace", () -> new InfernalFurnaceBlock());
}
