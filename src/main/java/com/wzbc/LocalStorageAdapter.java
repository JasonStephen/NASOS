package com.wzbc;

/**
 * @author : Jason Stephen
 * @date :Created in 2024-05-31
 */

public class LocalStorageAdapter implements StorageAdapter{
    @Override
    public void saveFile(String path, String content) {
        // Implementation for saving a file locally
    }

    @Override
    public String readFile(String path) {
        // Implementation for reading a local file
        return "";
    }

    @Override
    public void deleteFile(String path) {
        // Implementation for deleting a local file
    }
}
