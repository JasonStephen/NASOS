package com.wzbc;

/**
 * @author : Jason Stephen
 * @date :Created in 2024-05-31
 */

public class NAS {
    private ConfigurationManager configManager;
    private LogManager logManager;
    private FileSystemManager fileSystemManager;

    public void start() {
        configManager = ConfigurationManager.getInstance();
        logManager = LogManager.getInstance();
        fileSystemManager = FileSystemManager.getInstance();
        logManager.log("NAS started.");
    }

    public void stop() {
        logManager.log("NAS stopped.");
    }
}