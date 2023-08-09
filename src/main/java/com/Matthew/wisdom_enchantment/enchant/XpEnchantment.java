package com.Matthew.wisdom_enchantment.enchant;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class XpEnchantment extends Enchantment {
    public XpEnchantment() {
        super(Enchantment.Rarity.RARE, EnchantmentCategory.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
    }
    @Override
    public int getMaxLevel() {
        return 3;
    }
}