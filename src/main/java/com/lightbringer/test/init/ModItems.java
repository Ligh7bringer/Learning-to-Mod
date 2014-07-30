package com.lightbringer.test.init;

import com.lightbringer.test.item.ItemBeer;
import com.lightbringer.test.item.ItemFancyAxe;
import com.lightbringer.test.item.ItemMapleLeaf;
import com.lightbringer.test.item.ItemT;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Svetlio on 29.7.2014 г..
 */
public class ModItems {
    public static final ItemT mapleLeaf = new ItemMapleLeaf();
    public static final ItemT fancyAxe = new ItemFancyAxe();
    public static final ItemT beer = new ItemBeer();

    public static void init() {
        GameRegistry.registerItem(mapleLeaf, "mapleLeaf" );
        GameRegistry.registerItem(fancyAxe, "fancyAxe");
        GameRegistry.registerItem(beer, "beer");
    }
}
