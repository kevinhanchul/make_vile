package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VileInfoInput {
    @GetMapping("vileInfoInput")
    public String vileInfoInput(){
        return "vileInfoInput";
    }
}
