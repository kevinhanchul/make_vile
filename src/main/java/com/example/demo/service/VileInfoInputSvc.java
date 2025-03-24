package com.example.demo.service;
import com.example.demo.dao.BuyVileInfoDao;
import com.example.demo.dao.VileInfoInputDao;
import org.springframework.stereotype.Service;

@Service
public class VileInfoInputSvc {
    private VileInfoInputDao vileInfoInputDao;
    public void vileInfoInput(){
        vileInfoInputDao.vileInfoInput();
    }
}
