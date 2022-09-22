package com.example.TingesoApp.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@Service
public class UploadService {
    private String folder="files//";

    public String save(MultipartFile file) {
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                Path path = Paths.get(folder + file.getOriginalFilename());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "";
    }
}
