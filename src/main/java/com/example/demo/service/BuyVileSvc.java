package com.example.demo.service;
import com.example.demo.dao.BuyVileDao;
import com.example.demo.dao.BuyVileInfoDao;
import org.springframework.stereotype.Service;

@Service
public class BuyVileSvc {
    private BuyVileDao buyVileDao;
    public void buyVile(){
        buyVileDao.buyVile();
    }
}
