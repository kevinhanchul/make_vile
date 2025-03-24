package com.example.demo.controller;

import com.example.demo.service.BuyVileInfoSvc;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class BuyVileInfoCtr {
    private BuyVileInfoSvc buyVileInfosvc;
    @PostMapping("buyVileInfoCtr")
    public void buyVileInfo(){
        buyVileInfosvc.buyVileInfo();
    }
}
