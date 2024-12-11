package net.connie.festivemod.block.custom;

import net.connie.festivemod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.storage.loot.LootContext;
import java.util.List;
import java.util.Random;

public class PresentBlock extends Block {
    public PresentBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean canHarvestBlock(BlockState state, BlockGetter level, BlockPos pos, Player player) {
        return true; // Always return true to allow breaking by hand
    }

}
