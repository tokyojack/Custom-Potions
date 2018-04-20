package me.tokyojack.bukkit.custompotion;

import lombok.Getter;
import me.tokyojack.bukkit.custompotion.potions.Angels;
import me.tokyojack.bukkit.custompotion.potions.Berzerk;
import me.tokyojack.bukkit.custompotion.potions.Boost;
import me.tokyojack.bukkit.custompotion.potions.Decay;
import me.tokyojack.bukkit.custompotion.potions.Ferosity;
import me.tokyojack.bukkit.custompotion.potions.Heart;
import me.tokyojack.bukkit.custompotion.potions.Insane;
import me.tokyojack.bukkit.custompotion.potions.MadMan;
import me.tokyojack.bukkit.custompotion.potions.Ninja;
import me.tokyojack.bukkit.custompotion.potions.Priest;
import me.tokyojack.bukkit.custompotion.potions.Resistant;
import me.tokyojack.bukkit.custompotion.potions.Vison;
import me.tokyojack.bukkit.custompotion.potions.Warlord;
import me.tokyojack.bukkit.custompotion.utils.CustomPotion;

@Getter
public enum CustomPotions {
	ANGELS(new Angels()),
	BERZERK(new Berzerk()),
	BOOST(new Boost()),
	DECAY(new Decay()),
	FEROSITY(new Ferosity()),
	HEART(new Heart()),
	INSANE(new Insane()),
	MADMAN(new MadMan()),
	NINJA(new Ninja()),
	PRIEST(new Priest()),
	RESISTANT(new Resistant()),
	VISON(new Vison()),
	WARLORD(new Warlord());

	private CustomPotion customPotion;

	private CustomPotions(CustomPotion customPotion) {
		this.customPotion = customPotion;
	}

}
