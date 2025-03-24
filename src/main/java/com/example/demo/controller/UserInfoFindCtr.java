package com.example.demo.controller;

import com.example.demo.service.BuyVileSvc;
import com.example.demo.service.UserInfoFindSvc;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class UserInfoFindCtr {
    private UserInfoFindSvc userInfoFindsvc;
    @PostMapping("userInfoFindCtr")
    public void userInfoFind(){
        userInfoFindsvc.userInfoFind();
    }
}
