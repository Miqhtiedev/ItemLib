package me.miqhtie.itemlib;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

abstract class Item{
    abstract public String getItemName();
    abstract public ArrayList<String> getItemLore();
    abstract public Material getItemMaterial();

    public ItemStack item(){
        ItemStack item = new ItemStack(getItemMaterial());
        ItemMeta itemMeta = item.getItemMeta();
        itemMeta.setLore(getItemLore());
        item.setItemMeta(itemMeta);


        return item;
    }

    public boolean isItem(ItemStack i){
        if(i == null || !i.hasItemMeta()){
            return false;
        }

        ItemMeta meta = i.getItemMeta();
        if(!meta.hasDisplayName() || !meta.hasLore()){
            return false;
        }

        return meta.getDisplayName().equals(getItemName());
    }
}