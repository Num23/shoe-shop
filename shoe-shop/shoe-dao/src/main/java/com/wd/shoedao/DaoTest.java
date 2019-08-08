package com.wd.shoedao;

import com.wd.shoeentity.EntityTest;

public class DaoTest {

    public String showDao(){
        EntityTest entityTest = new EntityTest();
        return entityTest.showEntity();
    }
}
