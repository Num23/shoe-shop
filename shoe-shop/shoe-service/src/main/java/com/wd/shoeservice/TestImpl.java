package com.wd.shoeservice;

import com.wd.shoeentity.ITest;
import org.springframework.stereotype.Service;

/**
 * @Classname TestImpl
 * @Description TODO
 * @version:1.0
 * @Date 2019/8/9 14:53
 * @Created by lwd
 */
@Service
public class TestImpl implements ITest {
    @Override
    public String sayTest() {
        return "测试的是接口";
    }
}
