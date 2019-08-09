package com.wd.shoeweb.controller;

import com.wd.shoeentity.ITest;
import com.wd.shoeservice.ServiceTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private ITest iTest;

    @RequestMapping("/showAll")
    public String showAll() {
        ServiceTest serviceTest = new ServiceTest();
        return serviceTest.showService() + "i am web";
    }

    @RequestMapping("/exception/{number}")
    public String exception(@PathVariable int number) {
        System.out.println(20 / number);
        return "function exception no exception";
    }

    @RequestMapping("/testInterface")
    public String testInterface() {
        return iTest.sayTest();
    }
}
