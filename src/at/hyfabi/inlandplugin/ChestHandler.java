package at.hyfabi.inlandplugin;

import java.sql.Timestamp;
import java.util.Date;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;

public class ChestHandler implements Listener{
	
	@EventHandler
    public void chestOpen(InventoryOpenEvent event){
		Timestamp t = new Timestamp(new Date().getTime());
		String s = "";
		s += event.getPlayer().getName() + ", " + event.getInventory().getType();
		s += ", " + event.getInventory().getLocation().getBlockX() + ", " + event.getInventory().getLocation().getBlockY() + ", " + event.getInventory().getLocation().getBlockZ();
		s += ", " + t.getTime();
		
		Bukkit.broadcastMessage(s);
    }
}
