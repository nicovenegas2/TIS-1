package com.example.TingesoApp.Controllers;

import com.example.TingesoApp.Services.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping
public class HomeController {
    @Autowired
    private UploadService uploadService;

    @GetMapping("/")
    public String home(){
        System.out.println("index");
        return "index";
    }

    @PostMapping("/upload")
    public String upload(@RequestParam("tiempos")MultipartFile file){
        uploadService.save(file);
        return "";
    }

}
