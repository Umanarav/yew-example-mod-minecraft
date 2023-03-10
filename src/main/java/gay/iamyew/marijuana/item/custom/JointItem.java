package gay.iamyew.marijuana.item.custom;

import gay.iamyew.marijuana.item.ModItems;
import gay.iamyew.marijuana.sound.ModSounds;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class JointItem extends Item {
    public JointItem(Settings settings) {
        super(settings);
    }
    public int getEnchantability() {
        return 21;
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand){
        if(!world.isClient) {
            BlockPos playerPos = playerEntity.getBlockPos();
            world.playSound(
                null,
                playerPos,
                ModSounds.JOINT_SMOKE,
                SoundCategory.PLAYERS,
                1f, 
                1f);
        }
        ItemStack itemStack = playerEntity.getStackInHand(hand);
        itemStack.damage(1, playerEntity, (p) -> {
            p.sendToolBreakStatus(hand);
            p.giveItemStack(new ItemStack(ModItems.JOINT_ROACH));
        });     
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, (20*4), (40)));
        playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, (20*4), (40)));
        playerEntity.addCritParticles(playerEntity);
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
    
}