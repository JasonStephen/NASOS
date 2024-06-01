package com.wzbc;

/**
 * @author : Jason Stephen
 * @date :Created in 2024-05-31
 */

public class ConfigurationManager {
    private static ConfigurationManager instance;

    private ConfigurationManager() {}

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public void loadConfig(String file) {
        // Load configuration from file
    }

    public void saveConfig(String file) {
        // Save configuration to file
    }
}