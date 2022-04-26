package net.acticraft.plugins.beekitpvp.Kits;

import net.acticraft.plugins.beekitpvp.Check;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BowKit implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if(!Check.isEmpty(p)) {

                p.getInventory().clear();
            } if(Check.isEmpty(p)) {
                ItemStack sword = new ItemStack(Material.WOODEN_SWORD, 1);
                ItemStack bow = new ItemStack(Material.BOW, 1);
                ItemStack arrow = new ItemStack(Material.ARROW, 1);
                ItemStack helmet = new ItemStack(Material.CHAINMAIL_HELMET, 1);
                ItemStack leggings = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
                ItemStack chestplate = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
                ItemStack boots = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
                ItemStack food = new ItemStack(Material.COOKED_BEEF, 16);

                ItemMeta axeMeta = sword.getItemMeta();
                axeMeta.setDisplayName(ChatColor.RED + "Sword");
                sword.setItemMeta(axeMeta);

                ItemMeta bowmeta = bow.getItemMeta();
                axeMeta.setDisplayName(ChatColor.RED + "Bow");
                bowmeta.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
                bow.setItemMeta(bowmeta);

                ItemMeta helmetMeta = helmet.getItemMeta();
                helmetMeta.setDisplayName(ChatColor.RED + "Leather Helmet");
                helmet.setItemMeta(helmetMeta);

                ItemMeta leggingsMeta = leggings.getItemMeta();
                leggingsMeta.setDisplayName(ChatColor.RED + "Chainmail Leggings");
                leggings.setItemMeta(leggingsMeta);

                ItemMeta chestplateMeta = chestplate.getItemMeta();
                chestplateMeta.setDisplayName(ChatColor.RED + "Leather Chestplate");
                chestplate.setItemMeta(chestplateMeta);

                ItemMeta bootsMeta = boots.getItemMeta();
                bootsMeta.setDisplayName(ChatColor.RED + "Leather Boots");
                boots.setItemMeta(bootsMeta);

                p.getInventory().addItem(sword);
                p.getInventory().addItem(bow);
                p.getInventory().addItem(arrow);
                p.getEquipment().setHelmet(helmet);
                p.getEquipment().setChestplate(chestplate);
                p.getEquipment().setLeggings(leggings);
                p.getEquipment().setBoots(boots);
                p.getInventory().addItem(food);



            }
        }
        return false;}

}