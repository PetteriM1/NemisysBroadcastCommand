package me.petterim1.nemisysbroadcast;

import org.itxtech.nemisys.Player;
import org.itxtech.nemisys.command.Command;
import org.itxtech.nemisys.command.CommandSender;
import org.itxtech.nemisys.plugin.PluginBase;

public class Main extends PluginBase {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("bcast")) {
            if (args.length == 0) {
                return false;
            }

            for (Player p : getServer().getOnlinePlayers().values()) {
                p.sendMessage(String.join(" ", args));
            }

            return true;
        }

        return true;
    }
}
