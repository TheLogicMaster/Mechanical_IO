package com.LogicMaster63.Mechanical_IO.items;

import com.LogicMaster63.Mechanical_IO.ItemModelProvider;
import com.LogicMaster63.Mechanical_IO.Mechanical_IO;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by justi on 2/11/2017.
 */
public class ItemBase extends Item implements ItemModelProvider {

    protected String name;

    public ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Mechanical_IO.mechanicalTab);
    }

    public void registerItemModel(Item item) {
        Mechanical_IO.proxy.registerItemRenderer(this, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}
