package io.github.nedether.btz.reg;

import io.github.nedether.btz.BetterThanZurg;
import io.github.nedether.btz.blocks.tinOre;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class blockReg {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BetterThanZurg.MODID);
    public static final RegistryObject<Block> TIN_ORE = BLOCKS.register("tin_ore", () -> new tinOre());

}
