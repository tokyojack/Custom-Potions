package me.tokyojack.bukkit.custompotion.potions;

import java.util.List;

import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.tokyojack.bukkit.custompotion.utils.CustomPotion;

public class Berzerk extends CustomPotion {

	public Berzerk() {
		super("&2Berzerk");
	}

	@Override
	public List<PotionEffect> getPotionEffects(int level) {
		return potionEffectsToList(
			createPotionEffect(PotionEffectType.INCREASE_DAMAGE, 240 - (60 * level), 2+level),
			createPotionEffect(PotionEffectType.SLOW, 240 - (60 * level), level)
		);
	}

}
