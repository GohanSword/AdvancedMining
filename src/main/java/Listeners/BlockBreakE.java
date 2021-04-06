package Listeners;

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
    private final List<ItemStack> items = Arrays.asList(new ItemStack(Material.DIAMOND, 5), new ItemStack(Material.GOLD_INGOT, 4), new ItemStack(Material.IRON_INGOT, 3), new ItemStack(Material.STONE, 2), new ItemStack(Material.DIRT));
    private final List<ItemStack> ore = Arrays.asList(new ItemStack(Material.DIAMOND_ORE, 5), new ItemStack(Material.GOLD_ORE, 4), new ItemStack(Material.IRON_ORE, 3), new ItemStack(Material.EMERALD_ORE, 2), new ItemStack(Material.COAL_ORE), new ItemStack(Material.REDSTONE_ORE), new ItemStack(Material.LAPIS_ORE));


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
            ItemStack loot = items.get(ThreadLocalRandom.current().nextInt(items.size()));
            player.getInventory().addItem(loot);
            player.sendMessage("§cVous avez reçu" + loot);
        }
    }
}