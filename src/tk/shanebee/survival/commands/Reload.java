package tk.shanebee.survival.commands;

import tk.shanebee.survival.Survival;
import tk.shanebee.survival.util.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Reload implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		String prefix = Survival.lang.prefix;

		Survival.instance.reloadConfig();
		Utils.sendColoredMsg(sender, prefix + "&7Config &aloaded");

		Survival.lang.loadLangFile(sender);
		Utils.sendColoredMsg(sender, prefix + "&aReload complete");
		return true;
	}

}