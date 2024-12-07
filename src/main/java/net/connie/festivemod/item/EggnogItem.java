package net.connie.festivemod.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.effect.MobEffectInstance;

public class EggnogItem extends Item {
    public EggnogItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Player player = context.getPlayer();
        if (player != null) {
            // Trigger drinking sound
            player.playSound(SoundEvents.BOTTLE_FILL, 1.0F, 1.0F);

            // Start drinking animation
            player.startUsingItem(InteractionHand.MAIN_HAND);  // This triggers the drinking animation

            // Apply effects (e.g., Speed boost)
            player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 1));  // Speed boost for 10 seconds with amplifier 1

            return InteractionResult.SUCCESS;
        }
        return InteractionResult.PASS;
    }

}
