package mohaimendice.mdice

import org.bukkit.plugin.java.JavaPlugin

class Mdice : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        getCommand("mdice")?.setExecutor(mohadice)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}