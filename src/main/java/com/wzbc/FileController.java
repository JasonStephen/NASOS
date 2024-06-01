package com.wzbc;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class FileController {

    private final FileSystemManager fileSystemManager = FileSystemManager.getInstance();

    @PostMapping("/files")
    public Map<String, String> createFile(@RequestBody Map<String, String> request) {
        String path = request.get("path");
        String content = request.get("content");
        fileSystemManager.createFile(path, content);
        Map<String, String> response = new HashMap<>();
        response.put("status", "File created");
        return response;
    }

    @GetMapping("/files")
    public Map<String, String> readFile(@RequestParam String path) {
        String content = fileSystemManager.readFile(path);
        Map<String, String> response = new HashMap<>();
        response.put("content", content);
        return response;
    }

    @DeleteMapping("/files")
    public Map<String, String> deleteFile(@RequestParam String path) {
        fileSystemManager.deleteFile(path);
        Map<String, String> response = new HashMap<>();
        response.put("status", "File deleted");
        return response;
    }

    @PostMapping("/directories")
    public Map<String, String> createDirectory(@RequestBody Map<String, String> request) {
        String path = request.get("path");
        fileSystemManager.createDirectory(path);
        Map<String, String> response = new HashMap<>();
        response.put("status", "Directory created");
        return response;
    }

    @DeleteMapping("/directories")
    public Map<String, String> deleteDirectory(@RequestParam String path) {
        fileSystemManager.deleteDirectory(path);
        Map<String, String> response = new HashMap<>();
        response.put("status", "Directory deleted");
        return response;
    }
}
