package com.wzbc;

/**
 * @author : Jason Stephen
 * @date :Created in 2024-05-31
 */

public class NAS {
    private ConfigurationManager configManager;
    private LogManager logManager;
    private FileSystemManager fileSystemManager;

    public NAS() {
        this.configManager = ConfigurationManager.getInstance();
        this.logManager = LogManager.getInstance();
        this.fileSystemManager = FileSystemManager.getInstance();
    }

    public void start() {
        // Implementation for starting the NAS
        logManager.log("NAS started.");
    }

    public void stop() {
        // Implementation for stopping the NAS
        logManager.log("NAS stopped.");
    }
}
