package me.tokyojack.bukkit.custompotion.potions;

import java.util.List;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.tokyojack.bukkit.custompotion.utils.CustomPotion;

public class Angels extends CustomPotion {

	public Angels() {
		super("&2Angels");
	}

	@Override
	public List<PotionEffect> getPotionEffects(int level) {
		return potionEffectsToList(
			createPotionEffect(PotionEffectType.REGENERATION, 5 * level, 4),
			createPotionEffect(PotionEffectType.HEALTH_BOOST, 5 * level, 4),
			createPotionEffect(PotionEffectType.ABSORPTION, 5 * level, 4),
			createPotionEffect(PotionEffectType.FIRE_RESISTANCE, 5 * level, 0)
		);
	}

}
