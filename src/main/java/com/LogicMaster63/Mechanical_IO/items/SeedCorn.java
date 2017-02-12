package com.LogicMaster63.Mechanical_IO.items;

import com.LogicMaster63.Mechanical_IO.ItemModelProvider;
import com.LogicMaster63.Mechanical_IO.Mechanical_IO;
import com.LogicMaster63.Mechanical_IO.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;

/**
 * Created by justi on 2/11/2017.
 */
public class SeedCorn extends ItemSeeds implements ItemModelProvider {

    public SeedCorn() {
        super(Blocks.cropCorn, net.minecraft.init.Blocks.FARMLAND);
        setUnlocalizedName("seedCorn");
        setRegistryName("seedCorn");
        setCreativeTab(Mechanical_IO.mechanicalTab);
    }

    @Override
    public void registerItemModel(Item item) {
        Mechanical_IO.proxy.registerItemRenderer(item, 0, "seedCorn");
    }
}
