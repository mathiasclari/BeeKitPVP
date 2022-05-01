package net.acticraft.plugins.beekitpvp;

import net.acticraft.plugins.beekitpvp.Events.CombatEvents;
import net.acticraft.plugins.beekitpvp.Kits.AxeKit;
import net.acticraft.plugins.beekitpvp.Kits.BowKit;
import net.acticraft.plugins.beekitpvp.Kits.SwordKit;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class BeeKitPVP extends JavaPlugin {
    private static BeeKitPVP instance;

    @Override
    public void onEnable() {
        instance = this;
        getCommand("axekit").setExecutor(new AxeKit());
        getCommand("bowkit").setExecutor(new BowKit());
        getCommand("swordkit").setExecutor(new SwordKit());

        getServer().getPluginManager().registerEvents(new CombatEvents(), this);

        Bukkit.getLogger().info(ChatColor.of("#757B84") + "Plugin has been "+ ChatColor.of("#6AFF78") + "enabled!");


    }

    @Override
    public void onDisable() {

        instance = null;
    }

    public static BeeKitPVP getInstance() {
        return instance;
    }
}
