package me.tokyojack.bukkit.custompotion.command.subcommands;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang.WordUtils;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.tokyojack.bukkit.custompotion.Core;
import me.tokyojack.bukkit.custompotion.utils.CustomPotion;
import me.tokyojack.bukkit.custompotion.utils.subkommand.SubKommand;

public class Give extends SubKommand {

	public Give() {
		super("<type> <level> (player)");
	}

	@Override
	public boolean execute(CommandSender commandSender, String[] args) {
		Map<String, CustomPotion> customPotions = Core.getPlugin().getCustomPotions();

		if (args.length <= 0) {
			// Get's all the custom potions key's (name),
			// Runs toString on them (just in case),
			// Removes " Elixir" from the name, 
			// Joins them together with ", " between,
			// Removes "[" and "]" as it's a list
			
			String customPotionList = Arrays.asList(customPotions.keySet()).stream().map(Object::toString)
					.map(item -> item.replace(" Elixir", "")).collect(Collectors.joining(", ")).toString().replace("[", "")
					.replace("]", "");

			commandSender.sendMessage("Custom potion list: " + customPotionList);
			return false;
		}
		
		String customPotionType = WordUtils.capitalize(args[0]) + " Elixir";

		if (!customPotions.containsKey(customPotionType)) {
			commandSender.sendMessage("That is not a valid custom potion!");
			return false;
		}

		ItemStack customPotionItem = customPotions.get(customPotionType).getItem(Integer.parseInt(args[1]));

		if (args.length >= 3) {
			Player targetPlayer = Bukkit.getPlayer(args[2]);

			if (targetPlayer == null) {
				commandSender.sendMessage("That player isn't online!");
				return false;
			}

			targetPlayer.getInventory().addItem(customPotionItem);
			return true;
		}

		if (commandSender instanceof Player) {
			((Player) commandSender).getInventory().addItem(customPotionItem);
		}

		return true;
	}

}