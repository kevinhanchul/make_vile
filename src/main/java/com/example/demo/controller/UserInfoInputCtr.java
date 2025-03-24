package com.example.demo.controller;

import com.example.demo.service.BuyVileSvc;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class UserInfoInputCtr {
    private BuyVileSvc buyVilesvc;
    @PostMapping("buyVile")
    public void buyVile(){
        buyVilesvc.buyVile();
    }
}
