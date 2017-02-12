package com.LogicMaster63.Mechanical_IO.init;

import com.LogicMaster63.Mechanical_IO.ItemModelProvider;
import com.LogicMaster63.Mechanical_IO.ItemOreDict;
import com.LogicMaster63.Mechanical_IO.Mechanical_IO;
import com.LogicMaster63.Mechanical_IO.blocks.BlockBase;
import com.LogicMaster63.Mechanical_IO.blocks.BlockOre;
import com.LogicMaster63.Mechanical_IO.blocks.CropCorn;
import com.LogicMaster63.Mechanical_IO.blocks.OreCopper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Blocks {

    public static BlockOre oreCopper;
    public static CropCorn cropCorn;

    public static void init() {
        oreCopper = register(new BlockOre("oreCopper", "oreCopper"));
        cropCorn = register(new CropCorn(), null);
    }

    private static <T extends Block> T register(T block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        if(itemBlock != null)
            GameRegistry.register(itemBlock);

        if (block instanceof ItemModelProvider) {
            ((ItemModelProvider)block).registerItemModel(itemBlock);
        }
        if (block instanceof ItemOreDict) {
            ((ItemOreDict)block).initOreDict();
        }
        if (itemBlock instanceof ItemOreDict) {
            ((ItemOreDict) itemBlock).initOreDict();
        }

        return block;
    }

    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }

}
