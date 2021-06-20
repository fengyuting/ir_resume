package com.nlc.ir.resume.web.login;

import com.nlc.ir.resume.domain.common.BaseRequest;

/**
 * @Description: 登录请求体
 * @Author fengyuting
 * @Date 2021/6/15
 **/
public class LogInRequest extends BaseRequest {

    /**
     * 登录时获取的 code
     */
    private String js_code;


    public String getJs_code() {
        return js_code;
    }

    public void setJs_code(String js_code) {
        this.js_code = js_code;
    }
}
