package com.wd.shoeentity.common.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Classname ApiResult
 * @Description TODO
 * @version:1.0
 * @Date 2019/8/9 14:18
 * @Created by lwd
 */
@Getter
@Setter
public class ApiResult implements Serializable {

    private static final long serialVersionUID = -3111166458322873801L;

    private ApiResult(){

    }

    /**
     * 单利模式统一创建pojo对象
     * 方便后期扩展
     * @return
     */
    public static ApiResult newInstance(){
       return new ApiResult();
    }

    //消息提示
    private String msg;
    //状态信息
    private boolean flag = true;
    //返回结构
    private Object result;
    //结果总数
    private int resTotal;
    //需要跳转的页面
    private String jumpUrl;
    //接口相应时间
    private long time;
}
