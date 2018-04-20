package me.tokyojack.bukkit.custompotion.potions;

import java.util.List;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.tokyojack.bukkit.custompotion.utils.CustomPotion;

public class Boost extends CustomPotion {

	public Boost() {
		super("&2Boost");
	}

	@Override
	public List<PotionEffect> getPotionEffects(int level) {
		return potionEffectsToList(
			createPotionEffect(PotionEffectType.JUMP, 330 - (100 * level), level),
			createPotionEffect(PotionEffectType.SPEED, 330 - (100 * level), level)
		);
	}

}
