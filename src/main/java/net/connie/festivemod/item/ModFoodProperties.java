package net.connie.festivemod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties MINCE_PIE = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.HEALTH_BOOST, 600, 2), 1.0f) // Health Boost for 30 seconds with amplifier 2
            .build();

    public static final FoodProperties CANDY_CANE = new FoodProperties.Builder()
            .nutrition(1) // You can change this value based on how much you want the candy cane to restore.
            .saturationModifier(0.1f) // Adjust saturation as needed.
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0), 1.0f) // Speed effect for 10 seconds
            .build();
}
