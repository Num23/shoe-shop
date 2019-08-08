package com.wd.shoeservice;

import com.wd.shoedao.DaoTest;

public class ServiceTest {
    public String showService(){
        DaoTest daoTest = new DaoTest();
        return daoTest.showDao();
    }
}
