package com.Matthew.wisdom_enchantment.enchant;

import com.Matthew.wisdom_enchantment.WisdomEnchantmentMod;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, WisdomEnchantmentMod.MODID);
    public static final RegistryObject<Enchantment> WISDOM = ENCHANTMENTS.register("wisdom", XpEnchantment::new);

    public static void register(IEventBus eventBus){
        ENCHANTMENTS.register(eventBus);
    }
}
