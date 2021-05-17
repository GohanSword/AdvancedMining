package Listeners;

import Utils.ItemsManager;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class BlockBreakE implements Listener {
    private final List<ItemStack> items = Arrays.asList(new ItemsManager().diamant, new ItemsManager().or, new ItemsManager().emeraude, new ItemsManager().fer, new ItemsManager().charbon);

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        if (!event.getBlock().getType().name().contains("ORE"))
            return;
        Player player = event.getPlayer();
        Block block = event.getBlock();
        Material material = block.getType();
        if (player.getGameMode().equals(GameMode.CREATIVE))
            return;
        if (event.isCancelled())
            return;
        if (material.equals(Material.DIAMOND_ORE)) {
            int min = 1;
            int max = 100;
            int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);
            player.sendMessage("§c" + random_int);

            if (random_int > 95) {
                ItemStack loot = new ItemsManager().diamant;
                // ItemStack loot = items.get(ThreadLocalRandom.current().nextInt());

                player.getInventory().addItem(loot);
                player.sendMessage("§cVous avez reçu un diamant raffiné");
                return;
            }

            if (random_int > 85) {
                ItemStack loot = new ItemsManager().emeraude;
                // ItemStack loot = items.get(ThreadLocalRandom.current().nextInt());


                player.getInventory().addItem(loot);
                player.sendMessage("§cVous avez reçu un emeraude raffiné");
                return;
            }
        }
    }
}
