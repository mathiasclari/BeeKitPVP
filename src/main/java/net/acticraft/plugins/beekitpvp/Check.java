package net.acticraft.plugins.beekitpvp;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Check {

    public static boolean isEmpty(Player player) {
        int empty = 0;
        int armors = 0;
        for (ItemStack item : player.getInventory().getContents()) {
            if (item == null || item.getType() == Material.AIR) empty++;
        }
        for (ItemStack armor : player.getInventory().getArmorContents()) {
            if (armor == null || armor.getType() == Material.AIR) armors++;
        }
        return empty == player.getInventory().getContents().length && armors == player.getInventory().getArmorContents().length;
    }
}
