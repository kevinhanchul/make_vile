package com.example.demo.service;
import com.example.demo.dao.BuyVileInfoDao;
import org.springframework.stereotype.Service;

@Service
public class UserInfoFindSvc {
    private BuyVileInfoDao buyVileInfoDao;
    public void buyVileInfo(){
        buyVileInfoDao.buyVileInfoDao();
    }
}
