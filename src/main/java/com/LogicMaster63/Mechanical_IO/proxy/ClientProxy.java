package com.LogicMaster63.Mechanical_IO.proxy;

import com.LogicMaster63.Mechanical_IO.Mechanical_IO;
import com.LogicMaster63.Mechanical_IO.init.Blocks;
import com.LogicMaster63.Mechanical_IO.init.Items;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy extends CommonProxy {

    public void registerItemRenderer(Item item, int meta, String id) {
        //ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Mechanical_IO.MODID + ":" + id, "inventory"));
        Items.registerRenders();
        Blocks.registerRenders();
    }
}