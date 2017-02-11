package com.LogicMaster63.Mechanical_IO.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by justi on 2/10/2017.
 */
public class OreCopper extends Block {
    public OreCopper(Material materialIn) {
        super(materialIn);
        this.setHardness(10.0f);
        this.setResistance(15.0f);
    }
}
