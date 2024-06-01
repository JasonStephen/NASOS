package com.wzbc;

/**
 * @author : Jason Stephen
 * @date :Created in 2024-05-31 08:50:06
 * Github: https://github.com/JasonStephen
 */

public interface StorageAdapter {
    void saveFile(String path, String content);
    String readFile(String path);
    void deleteFile(String path);
}
