package me.tokyojack.bukkit.custompotion.potions;

import java.util.List;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.tokyojack.bukkit.custompotion.utils.CustomPotion;

public class Warlord extends CustomPotion {

	public Warlord() {
		super("&cWarlord");
	}

	@Override
	public List<PotionEffect> getPotionEffects(int level) {
		return potionEffectsToList(
			createPotionEffect(PotionEffectType.INCREASE_DAMAGE, 9 - (3 * level), level),
			createPotionEffect(PotionEffectType.SPEED, 9 - (3 * level), level)
		);
	}

}
