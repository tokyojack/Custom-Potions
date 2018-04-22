package me.tokyojack.bukkit.custompotion;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import lombok.Getter;
import me.tokyojack.bukkit.custompotion.command.CustomPotionCommand;
import me.tokyojack.bukkit.custompotion.command.subcommands.Give;
import me.tokyojack.bukkit.custompotion.utils.CustomPotion;
import me.tokyojack.bukkit.custompotion.utils.subkommand.SubKommandManager;

@Getter
public class Core extends JavaPlugin {

	@Getter
	private static Core plugin;

	private Map<String, CustomPotion> customPotions = new HashMap<String, CustomPotion>();

	public void onEnable() {
		plugin = this;

		new SubKommandManager(new CustomPotionCommand(), true).addSubCommand(new Give()).build();

		Arrays.asList(CustomPotions.values()).forEach(customPotion -> customPotions
				.put(ChatColor.stripColor(customPotion.getCustomPotion().getName()), customPotion.getCustomPotion()));

	}

}