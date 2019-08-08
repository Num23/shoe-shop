package com.wd.shoeweb.controller;

import com.wd.shoeservice.ServiceTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping("showAll")
    public String showAll() {
        ServiceTest serviceTest = new ServiceTest();
        return serviceTest.showService() + "i am web";
    }
}
