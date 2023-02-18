package gay.iamyew.marijuana.block.custom;

import gay.iamyew.marijuana.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;

import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;


public class MarijuanaCropBlock extends CropBlock{
    public static final IntProperty AGE = IntProperty.of("age", 0, 6);

    public MarijuanaCropBlock(Settings settings) {
        super(settings);
    }

    @Override 
    protected ItemConvertible getSeedsItem() {
        return ModItems.MARIJUANA_SEEDS;
    }

    @Override 
    public int getMaxAge() {
        return 6;
    }

    @Override 
    public IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }

}



