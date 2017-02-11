package com.LogicMaster63.Mechanical_IO.init;

import com.LogicMaster63.Mechanical_IO.Mechanical_IO;
import com.LogicMaster63.Mechanical_IO.blocks.OreCopper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Blocks {

    public static Block oreCopper;

    public static void init() {
        oreCopper = new OreCopper(Material.IRON).setUnlocalizedName("oreCopper").setCreativeTab(Mechanical_IO.mechanicalTab).setRegistryName("oreCopper");
    }

    public static void register() {
        GameRegistry.register(oreCopper);
    }

    public static void registerRenders() {
        registerRender(oreCopper);
    }

    public static void registerRender(Block block) {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Mechanical_IO.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
