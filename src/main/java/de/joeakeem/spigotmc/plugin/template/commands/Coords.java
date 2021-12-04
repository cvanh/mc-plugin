package de.joeakeem.spigotmc.plugin.template.commands;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

// dear reader please be warned of this shitty java code, may god have mercy on your soul

/*testing
 Location
    {
    world=CraftWorld
    {name=world},
    x=8.493672984900162,
    y=63.0,
    z=57.50672494525866,
    pitch=20.54992,
    yaw=121.44055
    }
*/

public class Coords implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        Player player = (Player) sender;
        // Object loc = player.getLocation().getBlock().getLocation();
        // System.out.println(loc.)
        player.sendMessage("Coords: " + player.getLocation().getBlock().getLocation().getX());


        // string ass = "coords: x = " + location.x + "y = " + location.y + "z = " + location.z;   
        // String ass = new StringBuilder()
        // .append("coords: x = ")
        // .append(loc.x)
        // .build();

        player.sendMessage("kaas");
        return true;
    }

}