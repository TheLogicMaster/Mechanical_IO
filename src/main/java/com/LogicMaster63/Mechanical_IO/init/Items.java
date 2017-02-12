package com.LogicMaster63.Mechanical_IO.init;

import com.LogicMaster63.Mechanical_IO.ItemModelProvider;
import com.LogicMaster63.Mechanical_IO.ItemOreDict;
import com.LogicMaster63.Mechanical_IO.Mechanical_IO;
import com.LogicMaster63.Mechanical_IO.items.ItemBase;
import com.LogicMaster63.Mechanical_IO.items.ItemOre;
import com.LogicMaster63.Mechanical_IO.items.SeedCorn;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Items {

    public static ItemBase ingotCopper;
    public static SeedCorn seedCorn;
    public static ItemBase corn;

    public static void init() {
        ingotCopper = register(new ItemOre("ingotCopper", "ingotCopper"));
        seedCorn = register(new SeedCorn());
        corn = register(new ItemOre("corn", "cropCorn"));
    }

    private static <T extends Item> T register(T item) {
        GameRegistry.register(item);

        if (item instanceof ItemModelProvider) {
            ((ItemModelProvider)item).registerItemModel(item);
        }
        if (item instanceof ItemOreDict) {
            ((ItemOreDict)item).initOreDict();
        }

        return item;
    }
}