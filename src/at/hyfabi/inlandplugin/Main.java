package at.hyfabi.inlandplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	@Override
    public void onEnable() {
		getServer().getPluginManager().registerEvents(new ChestHandler(), this);
    }
	
    @Override
    public void onDisable() {
    	
    }
}
