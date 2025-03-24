package com.example.demo.service;
import com.example.demo.dao.BuyVileInfoDao;
import com.example.demo.dao.VileInfoFindDao;
import org.springframework.stereotype.Service;

@Service
public class VileInfoFindSvc {
    private VileInfoFindDao vileInfoFindDao;
    public void vileInfoFind(){
        vileInfoFindDao.vileInfoFind();
    }
}
