package io.github.nedether.btz.items;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import io.github.nedether.btz.reg.itemReg;
public class BronzePickaxe extends PickaxeItem {


    public BronzePickaxe() {

        super(new Tier() {
            public int getUses() {
                return 300;
            }

            public float getSpeed() {
                return 4f;
            }

            public float getAttackDamageBonus() {
                return 2f;
            }

            public int getLevel() {
                return 2;
            }

            public int getEnchantmentValue() {
                return 2;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(itemReg.BRONZE_INGOT.get()));
            }
        }, 1, -2.8f, new Item.Properties());
    }
}
