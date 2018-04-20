package me.tokyojack.bukkit.custompotion.potions;

import java.util.List;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.tokyojack.bukkit.custompotion.utils.CustomPotion;

public class Ninja extends CustomPotion {

	public Ninja() {
		super("&2Ninja");
	}

	@Override
	public List<PotionEffect> getPotionEffects(int level) {
		return potionEffectsToList(
			createPotionEffect(PotionEffectType.INVISIBILITY, 400 - (100 * level), 0),
			createPotionEffect(PotionEffectType.SPEED, 400 - (100 * level), level + 1)
		);
	}

}
