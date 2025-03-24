package com.example.demo.controller;
import com.example.demo.service.UserInfoInputSvc;
import com.example.demo.service.VileInfoFindSvc;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class VileInfoFindCtr {
    private VileInfoFindSvc vileInfoFindSvc;
    @PostMapping("vileInfoFindCtr")
    public void vileInfoFind(){
        vileInfoFindSvc.vileInfoFind();
    }
}
