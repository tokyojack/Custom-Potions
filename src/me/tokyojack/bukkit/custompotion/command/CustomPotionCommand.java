package me.tokyojack.bukkit.custompotion.command;

import java.util.Arrays;

import org.bukkit.command.CommandSender;

import me.tokyojack.bukkit.custompotion.utils.kommand.Kommand;

public class CustomPotionCommand extends Kommand {

	public CustomPotionCommand() {
		super("custompotion", "Custom potion command", Arrays.asList("custompotions", "cp"));
	}

	@Override
	public boolean execute(CommandSender commandSender, String label, String[] args) {
		return true;
	}

}
