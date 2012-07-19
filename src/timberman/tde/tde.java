package timberman.tde;

import java.util.logging.Logger;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;


public class tde extends JavaPlugin {
	
	public final Logger logger = Logger.getLogger("Minecraft");

	@Override
	public void onEnable() {
		// Pluginbeschreibung aus der plugin.yml lesen
		PluginDescriptionFile pdfFile = this.getDescription();
		// Meldung an die Konsole, dass das Plugin geladen ist.
		this.logger.info(pdfFile.getName() + " is enabled!");		

	}
	
	@Override
	public void onDisable() {
		// Pluginbeschreibung aus der plugin.yml lesen
		PluginDescriptionFile pdfFile = this.getDescription();
		// Meldung an die Konsole, dass das Plugin entladen wurde.
		this.logger.info(pdfFile.getName() + " is now disabled.");
	}
}
