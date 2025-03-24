package com.example.demo.controller;

import com.example.demo.service.BuyVileSvc;
import com.example.demo.service.UserInfoInputSvc;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class UserInfoInputCtr {
    private UserInfoInputSvc userInfoInputsvc;
    @PostMapping("userInfoInputCtr")
    public void userInfoInput(){
        userInfoInputsvc.userInfoInput();
    }
}
