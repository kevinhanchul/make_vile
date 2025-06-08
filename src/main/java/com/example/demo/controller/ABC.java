package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("")
public class ABC {
    @PostMapping("abc")
    public void flagJump(@RequestBody Map<String, Object> paraMap){

//        return flagJumpSvc.flagJump(paraMap);
    }
}
