package com.example.demo.controller;

import com.example.demo.service.BuyVileSvc;
import com.example.demo.service.MenuSvc;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class MenuCtr {
    private MenuSvc menuSvc;
    @PostMapping("menuCtr")
    public void menu(){
        menuSvc.menu();
    }
}
