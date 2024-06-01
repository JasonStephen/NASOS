package com.wzbc;

/**
 * @author : Jason Stephen
 * @date :Created in 2024-05-31
 */

public class NASTest {
    public static void main(String[] args) {
        // 创建 NAS 实例
        NAS nas = new NAS();

        // 启动 NAS
        nas.start();

        // 获取 FileSystemManager 实例
        FileSystemManager fileSystemManager = FileSystemManager.getInstance();

        // 创建文件和目录
        String dirPath = "./testDir";
        String filePath = dirPath + "/testFile.txt";

        fileSystemManager.createDirectory(dirPath);
        fileSystemManager.createFile(filePath, "This is a test file content.");

        // 读取文件内容
        String content = fileSystemManager.readFile(filePath);
        System.out.println("Read file content: " + content);

        // 列出目录中的文件
        Directory dir = fileSystemManager.getDirectory(dirPath);
        System.out.println("Files in " + dirPath + ":");
        for (File file : dir.listFiles()) {
            System.out.println("- " + file.name);
        }

//        // 删除文件和目录
//        fileSystemManager.deleteFile(filePath);
//        fileSystemManager.deleteDirectory(dirPath);

        // 停止 NAS
        nas.stop();
    }
}
