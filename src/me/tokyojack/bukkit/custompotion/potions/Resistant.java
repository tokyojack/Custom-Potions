package me.tokyojack.bukkit.custompotion.potions;

import java.util.List;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.tokyojack.bukkit.custompotion.utils.CustomPotion;

public class Resistant extends CustomPotion {

	public Resistant() {
		super("&8Resistant");
	}

	@Override
	public List<PotionEffect> getPotionEffects(int level) {
		return potionEffectsToList(
			createPotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 150 * level, level),
			createPotionEffect(PotionEffectType.FIRE_RESISTANCE, 300 * level, level)
		);
	}

}
