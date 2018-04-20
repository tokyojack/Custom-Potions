package me.tokyojack.bukkit.custompotion.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import lombok.Getter;

@Getter
public abstract class CustomPotion {

	private String name;

	public CustomPotion(String name) {
		this.name = ChatColor.translateAlternateColorCodes('&', name + " &fElixir");
	}

	public abstract List<PotionEffect> getPotionEffects(int level);

	protected List<PotionEffect> potionEffectsToList(PotionEffect... potionEffects) {
		return Arrays.asList(potionEffects);
	}

	protected PotionEffect createPotionEffect(PotionEffectType potionEffectType, int duration, int level) {
		return new PotionEffect(potionEffectType, duration * 20, level - 1);
	}

	@SuppressWarnings("deprecation")
	public ItemStack getItem(int level) {
		ItemStack potion = new ItemStack(Material.POTION);
		PotionMeta meta = (PotionMeta) potion.getItemMeta();
		meta.addItemFlags(ItemFlag.HIDE_POTION_EFFECTS);
		meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', this.name));
		List<String> lore = new ArrayList<String>();

		for (PotionEffect potionEffect : this.getPotionEffects(level)) {
			int totalSeconds = (potionEffect.getDuration() / 20);
			int minutes = (totalSeconds % 3600) / 60;
			int seconds = totalSeconds % 60;

			meta.addCustomEffect(potionEffect, true);
			lore.add(ChatColor.GRAY
					+ StringUtils.capitaliseAllWords(fixPotionName(potionEffect.getType()).toLowerCase().replace("_", " "))
					+ " " + translateIntToRomanNumeral(potionEffect.getAmplifier() + 1) + "("
					+ String.format("%d:%02d", minutes, seconds) + ")");
		}
		meta.setLore(lore);
		potion.setItemMeta(meta);
		return potion;
	}

	private String fixPotionName(PotionEffectType potionEffectType) {
		if (potionEffectType == PotionEffectType.INCREASE_DAMAGE)
			return "Strength";

		if (potionEffectType == PotionEffectType.DAMAGE_RESISTANCE)
			return "Resistance";

		if (potionEffectType == PotionEffectType.SLOW)
			return "Slowness";

		if (potionEffectType == PotionEffectType.JUMP)
			return "Jump Boost";

		return potionEffectType.getName();
	}

	private String translateIntToRomanNumeral(int romanNumerals) {
		switch (romanNumerals) {
		case 1:
			return "I ";
		case 2:
			return "II ";
		case 3:
			return "III ";
		case 4:
			return "IV ";
		case 5:
			return "V ";
		case 6:
			return "VI ";
		case 7:
			return "VII ";
		case 8:
			return "VIII ";
		case 9:
			return "IX ";
		case 10:
			return "X ";
		}
		return "";
	}

}
