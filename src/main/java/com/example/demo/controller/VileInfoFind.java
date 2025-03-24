package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VileInfoFind {
    @GetMapping("vileInfoFind")
    public String vileInfoFind(){
        return "vileInfoFind";
    }
}
