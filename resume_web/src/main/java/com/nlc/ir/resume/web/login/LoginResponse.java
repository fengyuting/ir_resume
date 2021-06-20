package com.nlc.ir.resume.web.login;

import com.nlc.ir.resume.domain.common.BaseResponse;

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
