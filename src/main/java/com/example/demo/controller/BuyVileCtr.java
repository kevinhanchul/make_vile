package com.example.demo.controller;

import com.example.demo.service.BuyVileSvc;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class BuyVileCtr {
    private BuyVileSvc buyVilesvc;
    @PostMapping("buyVileCtr")
    public void buyVile(){
        buyVilesvc.buyVile();
    }
}
