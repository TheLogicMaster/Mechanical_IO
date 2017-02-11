package com.LogicMaster63.Mechanical_IO;

import com.LogicMaster63.Mechanical_IO.init.Blocks;
import com.LogicMaster63.Mechanical_IO.init.Items;
import com.LogicMaster63.Mechanical_IO.init.TileEntities;
import com.LogicMaster63.Mechanical_IO.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Mechanical_IO.MODID, version = Mechanical_IO.VERSION)
public class Mechanical_IO
{
    public static final String MODID = "mechanicalio";
    public static final String VERSION = "1.0";
    public static final String name = "Mechanical IO";
    public static final MechanicalTab mechanicalTab = new MechanicalTab();

    @SidedProxy(serverSide = "com.LogicMaster63.Mechanical_IO.proxy.CommonProxy", clientSide = "com.LogicMaster63.Mechanical_IO.proxy.ClientProxy")
    public static CommonProxy proxy;

    @Mod.Instance("mechanicalio")
    public static Mechanical_IO instance;

    @Mod.EventHandler
    public void init(FMLPreInitializationEvent event) {
        Blocks.init();
        Blocks.register();
        Items.init();
        Items.register();
        TileEntities.register();
        MechanicalRecipes.addRecipes();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println(name + " is loading!");
        //proxy.registerItemRenderer();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
