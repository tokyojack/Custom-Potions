package me.tokyojack.bukkit.custompotion.potions;

import java.util.List;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.tokyojack.bukkit.custompotion.utils.CustomPotion;

public class MadMan extends CustomPotion {

	public MadMan() {
		super("&5MadMan");
	}

	@Override
	public List<PotionEffect> getPotionEffects(int level) {
		return potionEffectsToList(
			createPotionEffect(PotionEffectType.SPEED, 120 - (35 * level), level+2),
			createPotionEffect(PotionEffectType.INCREASE_DAMAGE, 120 - (35 * level), level+1),
			createPotionEffect(PotionEffectType.CONFUSION, 120 - (35 * level), level)
		);
	}

}
