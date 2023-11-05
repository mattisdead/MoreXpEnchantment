package com.Chuhaister.wisdom_enchantment.event;

import com.Chuhaister.wisdom_enchantment.WisdomEnchantmentMod;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraftforge.event.entity.living.LivingExperienceDropEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Map;

public class ModEvents {
    @Mod.EventBusSubscriber(modid = WisdomEnchantmentMod.MODID)
    public static class ForgeEvents {
        @SubscribeEvent
        public static void onLivingExperienceDrop(LivingExperienceDropEvent event){
            try{
                if(event.getAttackingPlayer().getMainHandItem().getItem() != null){
                    if(event.getAttackingPlayer().getMainHandItem().getItem() instanceof SwordItem
                            || event.getAttackingPlayer().getMainHandItem().getItem() instanceof AxeItem
                            || event.getAttackingPlayer().getMainHandItem().getItem() instanceof BowItem
                            || event.getAttackingPlayer().getMainHandItem().getItem() instanceof CrossbowItem){
                        Map<Enchantment, Integer> enchants = EnchantmentHelper.getEnchantments(event.getAttackingPlayer().getMainHandItem());
                        for (Enchantment key : enchants.keySet()) {
                            if (key.getFullname(1).toString().contains(WisdomEnchantmentMod.MODID + ".wisdom")){
                                int level = EnchantmentHelper.getTagEnchantmentLevel(key, event.getAttackingPlayer().getMainHandItem());
                                if(level == 1){
                                    event.setDroppedExperience((int) Math.round(event.getEntity().getExperienceReward() * 1.2));
                                }
                                else if(level == 2){
                                    event.setDroppedExperience((int) Math.round(event.getEntity().getExperienceReward() * 1.5));
                                }
                                else if(level == 3){
                                    event.setDroppedExperience((int) Math.round(event.getEntity().getExperienceReward() * 1.7));
                                }
                                break;
                            }
                        }
                    }
                }
            }
            catch(Exception e){}

        }
    }
}

