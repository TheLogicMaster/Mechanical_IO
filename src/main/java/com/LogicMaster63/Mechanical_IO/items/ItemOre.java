package com.LogicMaster63.Mechanical_IO.items;

import com.LogicMaster63.Mechanical_IO.ItemOreDict;
import net.minecraftforge.oredict.OreDictionary;

/**
 * Created by justi on 2/11/2017.
 */
public class ItemOre extends ItemBase implements ItemOreDict {

    private String oreName;

    public ItemOre(String name, String oreName) {
        super(name);

        this.oreName = oreName;
    }

    @Override
    public void initOreDict() {
        OreDictionary.registerOre(oreName, this);
    }

}