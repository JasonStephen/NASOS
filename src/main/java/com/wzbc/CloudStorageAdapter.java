package com.wzbc;

/**
 * @author : Jason Stephen
 * @date :Created in 2024-05-31
 */

public class CloudStorageAdapter implements StorageAdapter{
    @Override
    public void saveFile(String path, String content) {
        // 将文件保存到云端
    }

    @Override
    public String readFile(String path) {
        // 将云端读取文件
        return "";
    }

    @Override
    public void deleteFile(String path) {
        // 将文件从云端删除
    }
}
