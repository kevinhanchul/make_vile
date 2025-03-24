package com.example.demo.controller;
import com.example.demo.service.VileInfoFindSvc;
import com.example.demo.service.VileInfoInputSvc;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class VileInfoInputCtr {
    private VileInfoInputSvc vileInfoInputSvc;
    @PostMapping("vileInfoInputCtr")
    public void vileInfoInput(){
        vileInfoInputSvc.vileInfoInput();
    }
}
