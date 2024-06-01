package com.wzbc;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    public String name;
    public List<File> files;
    public List<Directory> directories;

    public Directory(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.directories = new ArrayList<>();
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void removeFile(File file) {
        files.remove(file);
    }

    public List<File> listFiles() {
        return files;
    }

    public void addDirectory(Directory directory) {
        directories.add(directory);
    }

    public void removeDirectory(Directory directory) {
        directories.remove(directory);
    }

    public List<Directory> listDirectories() {
        return directories;
    }
}
