package com.LogicMaster63.Mechanical_IO;

import com.LogicMaster63.Mechanical_IO.init.Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by justi on 2/11/2017.
 */
public class MechanicalTab extends CreativeTabs {

    public MechanicalTab() {
        super(Mechanical_IO.MODID);
        setBackgroundImageName("Mechanical_IOTab.png");
    }

    @Override
    public Item getTabIconItem() {
        return Items.ingotCopper; //shown icon on creative tab
    }

    @Override
    public boolean hasSearchBar() {
        return true; // return false if you don't want search bar
    }

}
