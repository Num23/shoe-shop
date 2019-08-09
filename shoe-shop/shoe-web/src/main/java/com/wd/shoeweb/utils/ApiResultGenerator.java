package com.wd.shoeweb.utils;

import com.wd.shoeentity.common.pojo.ApiResult;

import java.util.List;

/**
 * @Classname ApiResultGenerator 工具类
 * @Description TODO
 * @version:1.0
 * @Date 2019/8/9 14:26
 * @Created by lwd
 */

public final class ApiResultGenerator {

    /**
     * 创建消息对象
     *
     * @param flag
     * @param msg
     * @param result
     * @param jumpUrl
     * @param resTotal
     * @param spentTime
     * @param throwable
     * @return
     */
    public static ApiResult result(boolean flag, String msg, Object result, String jumpUrl, int resTotal, Throwable throwable) {
        ApiResult apiResult = ApiResult.newInstance();
        apiResult.setFlag(flag);
        apiResult.setJumpUrl(jumpUrl);
        apiResult.setMsg(msg);
        apiResult.setResTotal(resTotal);
        apiResult.setResult(result);
        return apiResult;
    }

    public static ApiResult succestResult(Object result) {
        int resTotal = 0;
        if (result instanceof List) {
            resTotal = ((List) result).size();
        }
        return result(true, "success", result, "", resTotal, null);
    }

    public static ApiResult errorResult(String msg, Throwable throwable) {
        return result(false, msg, "", "", 0, throwable);
    }

}
