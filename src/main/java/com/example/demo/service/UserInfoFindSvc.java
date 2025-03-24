package com.example.demo.service;
import com.example.demo.dao.BuyVileInfoDao;
import com.example.demo.dao.UserInfoFindDao;
import org.springframework.stereotype.Service;

@Service
public class UserInfoFindSvc {
    private UserInfoFindDao userInfoFindDao;
    public void userInfoFind(){
        userInfoFindDao.userInfoFind();
    }
}
