package com.nlc.ir.resume.domain.common;

import java.io.Serializable;

/**
 * @Description: 公共返回体
 * @Author fengyuting
 * @Date 2021/6/15
 **/
public class BaseResponse implements Serializable {

    /**
     * 返回码
     */
    private String code;

    /**
     * 返回信息
     */
    private String msg;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
