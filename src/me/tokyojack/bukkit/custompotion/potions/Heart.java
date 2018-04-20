package me.tokyojack.bukkit.custompotion.potions;

import java.util.List;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.tokyojack.bukkit.custompotion.utils.CustomPotion;

public class Heart extends CustomPotion {

	public Heart() {
		super("&3Heart");
	}

	@Override
	public List<PotionEffect> getPotionEffects(int level) {
		return potionEffectsToList(
			createPotionEffect(PotionEffectType.ABSORPTION, 75 - (15 * level), level + 1),
			createPotionEffect(PotionEffectType.HEALTH_BOOST, 75 - (15 * level), level + 1)
		);
	}

}