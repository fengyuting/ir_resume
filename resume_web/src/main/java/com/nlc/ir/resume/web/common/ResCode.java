package com.nlc.ir.resume.web.common;

public enum ResCode {

    SUCCESS("0000","成功"),
    ERROR("9999","失败"),
    NO_AUTH("0001","请登录"),
    DATA_ERROR("0002","数据错误"),
    ;


    private String code;

    private String msg;

    ResCode(String code,String msg){
        this.code = code;
        this.msg = msg;
    }

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
