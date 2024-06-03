package com.wzbc;

/**
 * @author : Jason Stephen
 * @date :Created in 2024-05-31
 */

public class ConfigurationManager {
    private static ConfigurationManager instance;

    private ConfigurationManager() {}
    // 提供一个公共的静态方法来获取 ConfigurationManager 的实例
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
            // 如果 instance 为空，则创建一个新的 ConfigurationManager 实例

        }
        return instance;
    }
    //

    public void loadConfig(String file) {
        // 从文件系统中加载配置文件
    }

    public void saveConfig(String file) {
        // 将配置文件保存到文件系统中
    }
}