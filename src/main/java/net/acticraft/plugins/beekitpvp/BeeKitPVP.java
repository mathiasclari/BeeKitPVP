package net.acticraft.plugins.beekitpvp;

import net.acticraft.plugins.beekitpvp.Kits.AxeKit;
import org.bukkit.plugin.java.JavaPlugin;

public final class BeeKitPVP extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("axekit").setExecutor(new AxeKit());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
