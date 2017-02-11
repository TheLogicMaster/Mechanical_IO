package com.LogicMaster63.Mechanical_IO;

import com.LogicMaster63.Mechanical_IO.init.Blocks;
import com.LogicMaster63.Mechanical_IO.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by justi on 2/11/2017.
 */
public class MechanicalRecipes {

    public static void addRecipes() {
        //shaped crafting recipes
        //GameRegistry.addRecipe(new ItemStack(ModBlocks.blockCopper), "###", "###", "###", '#', ModItems.ingotCopper);

        //shapeless crafting recipes
        //GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cornSeed), new ItemStack(ModItems.corn));

        //smelting recipes
        GameRegistry.addSmelting(Blocks.oreCopper, new ItemStack(Items.ingotCopper), 1.0f);
    }
}
