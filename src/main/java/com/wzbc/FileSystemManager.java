package com.wzbc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileSystemManager {
    private static FileSystemManager instance;

    private FileSystemManager() {}

    public static FileSystemManager getInstance() {
        if (instance == null) {
            instance = new FileSystemManager();
        }
        return instance;
    }

    public void createFile(String path, String content) {
        try {
            java.io.File file = new java.io.File(path);
            if (file.createNewFile()) {
                Files.write(Paths.get(path), content.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readFile(String path) {
        try {
            return new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public void deleteFile(String path) {
        java.io.File file = new java.io.File(path);
        if (file.exists()) {
            file.delete();
        }
    }

    public void createDirectory(String path) {
        java.io.File dir = new java.io.File(path);
        if (!dir.exists()) {
            dir.mkdirs();
        }
    }

    public void deleteDirectory(String path) {
        java.io.File dir = new java.io.File(path);
        if (dir.exists()) {
            for (java.io.File file : dir.listFiles()) {
                file.delete();
            }
            dir.delete();
        }
    }

    public Directory getDirectory(String path) {
        java.io.File dir = new java.io.File(path);
        Directory directory = new Directory(dir.getName());
        for (java.io.File file : dir.listFiles()) {
            if (file.isFile()) {
                directory.addFile(new File(file.getName(), (int) file.length()));
            } else if (file.isDirectory()) {
                directory.addDirectory(getDirectory(file.getPath()));
            }
        }
        return directory;
    }

    public File getFile(String path) {
        java.io.File file = new java.io.File(path);
        if (file.exists()) {
            return new File(file.getName(), (int) file.length());
        }
        return null;
    }
}