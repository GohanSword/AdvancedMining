package fr.gohansword.advancedmining;

import Gui.OreGui;
import Listeners.BlockBreakE;
import Utils.ItemsManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class AdvancedMining extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new BlockBreakE(), this);
        ItemsManager.init();
        getCommand("oremenu").setExecutor(new OreGui());


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
