package me.tokyojack.bukkit.custompotion.potions;

import java.util.List;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.tokyojack.bukkit.custompotion.utils.CustomPotion;

public class Decay extends CustomPotion {

	public Decay() {
		super("&0Decay");
	}

	@Override
	public List<PotionEffect> getPotionEffects(int level) {
		return potionEffectsToList(
			createPotionEffect(PotionEffectType.WITHER, 60 * level, level),
			createPotionEffect(PotionEffectType.POISON, 60 * level, level),
			createPotionEffect(PotionEffectType.BLINDNESS, 60 * level, level),
			createPotionEffect(PotionEffectType.CONFUSION, 60 * level, level)
		);
	}

}
