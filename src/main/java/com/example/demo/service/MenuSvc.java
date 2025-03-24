package com.example.demo.service;
import com.example.demo.dao.BuyVileInfoDao;
import com.example.demo.dao.MenuDao;
import org.springframework.stereotype.Service;

@Service
public class MenuSvc {
    private MenuDao menuDao;
    public void menu(){
        menuDao.menu();
    }
}
