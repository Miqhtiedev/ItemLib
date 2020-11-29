package me.miqhtie.itemlib;

import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemLib {
    private ArrayList<Item> registeredItems = new ArrayList<>();
    private JavaPlugin pluginInstance;
    private ItemLib libInstance;

    public ItemLib(JavaPlugin plugin){
        this.pluginInstance = plugin;
        this.libInstance = this;
    }

    public JavaPlugin getPluginInstance(){
        return pluginInstance;
    }

    public void registerItem(Item item){
        registeredItems.add(item);
    }
}
