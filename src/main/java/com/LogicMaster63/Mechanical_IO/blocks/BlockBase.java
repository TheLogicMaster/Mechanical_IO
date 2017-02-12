package com.LogicMaster63.Mechanical_IO.blocks;

import com.LogicMaster63.Mechanical_IO.ItemModelProvider;
import com.LogicMaster63.Mechanical_IO.Mechanical_IO;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

/**
 * Created by justi on 2/11/2017.
 */
public class BlockBase extends Block implements ItemModelProvider {

    protected String name;

    public BlockBase(Material material, String name) {
        super(material);

        this.name = name;
        setCreativeTab(Mechanical_IO.mechanicalTab);
        setUnlocalizedName(name);
        setRegistryName(name);
    }

    @Override
    public void registerItemModel(Item item) {
        Mechanical_IO.proxy.registerItemRenderer(item, 0, name);
    }

    @Override
    public BlockBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}
