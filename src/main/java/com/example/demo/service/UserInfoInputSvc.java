package com.example.demo.service;
import com.example.demo.dao.BuyVileInfoDao;
import com.example.demo.dao.UserInfoInputDao;
import org.springframework.stereotype.Service;

@Service
public class UserInfoInputSvc {
    private UserInfoInputDao userInfoInputDao;
    public void userInfoInput(){
        userInfoInputDao.userInfoInput();
    }
}
