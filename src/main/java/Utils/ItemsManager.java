package Utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemsManager {
    public static ItemStack diamant;
    public static ItemStack emeraude;
    public static ItemStack or;
    public static ItemStack fer;
    public static ItemStack charbon;

    public static void init() {
        createDiamant();
        createEmeraude();
        createOr();
        createFer();
        createCharbon();

    }
    private static void createDiamant() {
        ItemStack item = new ItemStack(Material.DIAMOND, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Diamant raffiné");
        List<String> lore = new ArrayList<>();
        lore.add("§7Ce diamant peux etre vendu au shop");
        lore.add("§c????");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        diamant = item;
    }
    private static void createEmeraude() {
        ItemStack item = new ItemStack(Material.EMERALD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Emeraude raffiné");
        List<String> lore = new ArrayList<>();
        lore.add("§7Cette emeraude peux etre vendu au shop");
        lore.add("§c????");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        emeraude = item;
    }

    private static void createOr() {
        ItemStack item = new ItemStack(Material.GOLD_INGOT, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Or raffiné");
        List<String> lore = new ArrayList<>();
        lore.add("§7Cette or peux etre vendu au shop");
        lore.add("§c????");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        or = item;
    }


    private static void createFer() {
        ItemStack item = new ItemStack(Material.IRON_INGOT, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Fer raffiné");
        List<String> lore = new ArrayList<>();
        lore.add("§7Ce fer peux etre vendu au shop");
        lore.add("§c????");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        fer = item;
    }
    private static void createCharbon() {
        ItemStack item = new ItemStack(Material.COAL, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Charbon raffiné");
        List<String> lore = new ArrayList<>();
        lore.add("§7Ce charbon peux etre vendu au shop");
        lore.add("§c????");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        charbon = item;
    }
}

