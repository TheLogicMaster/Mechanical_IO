package com.LogicMaster63.Mechanical_IO.init;

import com.LogicMaster63.Mechanical_IO.Mechanical_IO;
import com.LogicMaster63.Mechanical_IO.items.IngotCopper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class Items {

    public static Item ingotCopper;

    public static void init() {
        ingotCopper = new IngotCopper().setUnlocalizedName("ingotCopper").setCreativeTab(Mechanical_IO.mechanicalTab).setRegistryName("ingotCopper");
    }

    public static void register() {
        GameRegistry.register(ingotCopper);
        OreDictionary.registerOre("ingotCopper", ingotCopper);
    }

    public static void registerRenders() {
        registerRender(ingotCopper);
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Mechanical_IO.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}