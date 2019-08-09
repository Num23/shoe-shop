package com.wd.shoeweb.handler;

import com.wd.shoeentity.common.pojo.ApiResult;
import com.wd.shoeweb.utils.ApiResultGenerator;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname ExceptionHandler
 * @Description TODO
 * @version:1.0
 * @Date 2019/8/9 14:12
 * @Created by lwd
 */
@ControllerAdvice(annotations = RestController.class)
@ResponseBody
public class ExceptionHandler {

    /**
     * controller层 result统一异常处理
     * 不需要trycatch异常捕获处理
     *
     * @param e
     * @return
     */
    @org.springframework.web.bind.annotation.ExceptionHandler
    @ResponseStatus
    public ApiResult runTimeExceptionHandler(Exception e) {
        return ApiResultGenerator.errorResult(e.getMessage(), e);
    }
}
