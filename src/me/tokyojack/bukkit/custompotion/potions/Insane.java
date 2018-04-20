package me.tokyojack.bukkit.custompotion.potions;

import java.util.List;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.tokyojack.bukkit.custompotion.utils.CustomPotion;

public class Insane extends CustomPotion {

	public Insane() {
		super("&5Insane");
	}

	@Override
	public List<PotionEffect> getPotionEffects(int level) {
		return potionEffectsToList(
			createPotionEffect(PotionEffectType.INCREASE_DAMAGE, 120 - (30 * level), level),
			createPotionEffect(PotionEffectType.REGENERATION, 120 - (30 * level), level),
			createPotionEffect(PotionEffectType.SPEED, 120 - (30 * level), level+1),
			createPotionEffect(PotionEffectType.CONFUSION, 120 - (30 * level), level)
		);
	}

}
