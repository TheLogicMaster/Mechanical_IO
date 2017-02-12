package com.LogicMaster63.Mechanical_IO.blocks.machines;

import com.LogicMaster63.Mechanical_IO.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraftforge.energy.IEnergyStorage;

/**
 * Created by justi on 2/11/2017.
 */
public class CombustionEngine extends BlockBase implements IEnergyStorage{

    @Override
    public boolean canReceive() {
        return false;
    }

    @Override
    public int receiveEnergy(int maxReceive, boolean simulate) {
        return 0;
    }

    @Override
    public int extractEnergy(int maxExtract, boolean simulate) {
        return 0;
    }

    @Override
    public int getEnergyStored() {
        return 0;
    }

    @Override
    public int getMaxEnergyStored() {
        return 0;
    }

    @Override
    public boolean canExtract() {
        return false;
    }

    public CombustionEngine(Material materialIn) {
        super(materialIn, "combustionEngine");
        this.setHardness(10.0f);
        this.setResistance(15.0f);
    }

    @Override
    @Deprecated
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @Override
    @Deprecated
    public boolean isFullCube(IBlockState state) {
        return false;
    }
}
