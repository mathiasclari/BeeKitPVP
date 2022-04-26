package net.acticraft.plugins.beekitpvp.Events;

import net.acticraft.plugins.beekitpvp.BeeKitPVP;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public class CombatEvents implements Listener {


    @EventHandler
    public void OnDamage(EntityDeathEvent e) {
        ItemStack heal = new ItemStack(Material.GOLDEN_APPLE);
        if (e.getEntity() instanceof Player) {
            if (e.getEntity().getKiller() instanceof Player) {
                e.getEntity().getKiller().getInventory().addItem(heal);
                e.getDrops().clear();
            }
        }
    }

    @EventHandler
    public void PlayerBackTeleport(PlayerInteractEvent e) {
        Player p = e.getPlayer();
        if(p.getItemInHand().getType() == Material.AMETHYST_SHARD) {
        if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            e.getPlayer().getItemInHand().setAmount(e.getPlayer().getItemInHand().getAmount() - 1);
            p.teleport(p.getWorld().getSpawnLocation());
        }
            p.teleport(p.getWorld().getSpawnLocation());
        }
    }
}