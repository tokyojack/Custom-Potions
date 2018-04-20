package me.tokyojack.bukkit.custompotion.potions;

import java.util.List;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.tokyojack.bukkit.custompotion.utils.CustomPotion;

public class Ferosity extends CustomPotion {

	public Ferosity() {
		super("&6Ferosity");
	}

	@Override
	public List<PotionEffect> getPotionEffects(int level) {
		return potionEffectsToList(
			createPotionEffect(PotionEffectType.INCREASE_DAMAGE, 240 - (60 * level), level + 1),
			createPotionEffect(PotionEffectType.REGENERATION, 240 - (60 * level), level)
		);
	}

}
