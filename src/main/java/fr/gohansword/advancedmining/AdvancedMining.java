package fr.gohansword.advancedmining;

import Listeners.BlockBreakE;
import org.bukkit.plugin.java.JavaPlugin;

public final class AdvancedMining extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new BlockBreakE(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
