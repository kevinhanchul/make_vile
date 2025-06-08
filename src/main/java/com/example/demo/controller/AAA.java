package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AAA {

    @GetMapping("aaa")
    public String hello(Model model) {
        model.addAttribute("data1", "1");
        model.addAttribute("data2", "2");
        return "aaa";
    }

}
