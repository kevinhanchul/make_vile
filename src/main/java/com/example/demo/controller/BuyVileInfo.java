package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BuyVileInfo {
    @GetMapping("buyVileInfo")
    public String buyVileInfo(){
        return "buyVileInfo";
    }
}
