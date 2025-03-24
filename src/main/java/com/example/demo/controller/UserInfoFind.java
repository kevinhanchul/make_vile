package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserInfoFind {
    @GetMapping("userInfoFind")
    public String userInfoFind(){
        return "userInfoFind";
    }
}
