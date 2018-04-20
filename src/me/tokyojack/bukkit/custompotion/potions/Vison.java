package me.tokyojack.bukkit.custompotion.potions;

import java.util.List;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.tokyojack.bukkit.custompotion.utils.CustomPotion;

public class Vison extends CustomPotion {

	public Vison() {
		super("&8Vison");
	}

	@Override
	public List<PotionEffect> getPotionEffects(int level) {
		return potionEffectsToList(
			createPotionEffect(PotionEffectType.NIGHT_VISION, 600, 1),
			createPotionEffect(PotionEffectType.WATER_BREATHING, 600, 3)
		);
	}

}
