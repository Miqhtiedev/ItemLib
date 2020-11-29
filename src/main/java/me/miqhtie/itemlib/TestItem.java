package me.miqhtie.itemlib;

import org.bukkit.ChatColor;
import org.bukkit.Material;

import java.util.ArrayList;

public class TestItem extends Item {
    @Override
    public String getItemName() {
        return ChatColor.YELLOW + "Test";
    }

    @Override
    public ArrayList<String> getItemLore() {
        ArrayList<String> list = new ArrayList<>();
        list.add(ChatColor.GRAY + "Test Lore");
        return list;
    }

    @Override
    public Material getItemMaterial() {
        return Material.STICK;
    }
}
