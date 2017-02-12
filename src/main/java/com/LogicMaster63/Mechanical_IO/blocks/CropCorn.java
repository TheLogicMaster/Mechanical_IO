package com.LogicMaster63.Mechanical_IO.blocks;

import com.LogicMaster63.Mechanical_IO.Mechanical_IO;
import com.LogicMaster63.Mechanical_IO.init.Items;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;

/**
 * Created by justi on 2/11/2017.
 */
public class CropCorn extends BlockCrops {

    public CropCorn() {
        setUnlocalizedName("cropCorn");
        setRegistryName("cropCorn");
        setCreativeTab(Mechanical_IO.mechanicalTab);
    }

    @Override
    protected Item getSeed() {
        return Items.seedCorn;
    }

    @Override
    protected Item getCrop() {
        return Items.corn;
    }

}