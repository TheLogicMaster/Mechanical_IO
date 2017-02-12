package com.LogicMaster63.Mechanical_IO;

import com.LogicMaster63.Mechanical_IO.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

/**
 * Created by justi on 2/11/2017.
 */
public class MechanicalRecipes {

    public static void addRecipes() {
        //shaped crafting recipes
        GameRegistry.addRecipe(new ShapedOreRecipe(Items.BUCKET, "I I", " I ", 'I', "ingotCopper"));
        GameRegistry.addShapelessRecipe(new ItemStack(com.LogicMaster63.Mechanical_IO.init.Items.seedCorn), com.LogicMaster63.Mechanical_IO.init.Items.corn);
        //shapeless crafting recipes
        //GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cornSeed), new ItemStack(ModItems.corn));

        //smelting recipes
        GameRegistry.addSmelting(Blocks.oreCopper, new ItemStack(com.LogicMaster63.Mechanical_IO.init.Items.ingotCopper), 1.0f);
    }
}
