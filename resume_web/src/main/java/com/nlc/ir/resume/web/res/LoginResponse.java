package com.nlc.ir.resume.web.res;


import com.nlc.ir.resume.web.common.BaseResponse;

public class LoginResponse extends BaseResponse {

    /**
     * 用户openId
     */
    private String openId;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
}
