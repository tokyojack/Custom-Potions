package me.tokyojack.bukkit.custompotion.potions;

import java.util.List;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.tokyojack.bukkit.custompotion.utils.CustomPotion;

public class Priest extends CustomPotion {

	public Priest() {
		super("&ePreist");
	}

	@Override
	public List<PotionEffect> getPotionEffects(int level) {
		return potionEffectsToList(
			createPotionEffect(PotionEffectType.HEALTH_BOOST, 30 - (10 * level), level),
			createPotionEffect(PotionEffectType.REGENERATION, 30 - (10 * level), level)
		);
	}

}
