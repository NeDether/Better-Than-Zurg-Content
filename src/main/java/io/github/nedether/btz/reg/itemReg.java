package io.github.nedether.btz.reg;

import io.github.nedether.btz.BetterThanZurg;
import io.github.nedether.btz.items.BronzePickaxe;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Rarity;

public class itemReg {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterThanZurg.MODID);

    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register( "tin_ingot", () -> new Item(
            new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.COMMON)
    ));
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register( "raw_tin", () -> new Item(
            new Item.Properties().
                    stacksTo(64)
                    .rarity(Rarity.COMMON)
    ));

    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register( "bronze_ingot", () -> new Item(
            new Item.Properties()
                    .stacksTo(64)
                    .rarity(Rarity.COMMON)
    ));
    public static final RegistryObject<Item> BRONZE_PICKAXE = ITEMS.register( "bronze_pickaxe", () -> new BronzePickaxe());
}
