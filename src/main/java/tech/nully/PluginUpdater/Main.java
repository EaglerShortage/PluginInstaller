package tech.nully.PluginUpdater;

import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public class Main extends JavaPlugin {
    private static Plugin instance = null;
    public static Plugin getInstance() {
        return instance;
    }
    @Override
    public void onEnable() {
        instance = this;
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage(
                ChatColor.GREEN + "[EaglerPluginInstaller]" + ChatColor.AQUA + " EaglerPluginInstaller V1.0.8 is now Enabled! :D");
        getServer().getConsoleSender().sendMessage("To use PluginInstaller, run the command \"/install <pluginname>\" (\"install <pluginname>\" in console) to install a plugin");
        getServer().getConsoleSender().sendMessage("To get a list of installable plugins, use the command \"/plist\" or \"plist\" in console");
        getServer().getConsoleSender().sendMessage("You can request to add a new plugin to the database by going to https://github.com/darverdevs/PluginInstallerRepo/tree/main");
        getServer().getConsoleSender().sendMessage("and creating an issue or pull request of the plugin you want to add");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage(
                ChatColor.GREEN + "[EaglerPluginInstaller]" + ChatColor.AQUA + " PluginInstaller V1.0.8 is now Disabled! D:");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
        getServer().getConsoleSender().sendMessage("--------------------------------------------");
    }
}
