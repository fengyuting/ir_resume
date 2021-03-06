package com.nlc.ir.resume.web.res;


import com.nlc.ir.resume.web.common.BaseResponse;
import com.nlc.ir.resume.web.common.ResCode;
import lombok.Data;

@Data
public class LoginResponse extends BaseResponse {

    /**
     * openId
     */
    private String openId;

    public static LoginResponse fail(ResCode resCode){
        LoginResponse res = new LoginResponse();
        res.setSuccess(false);
        res.setCode(resCode.getCode());
        res.setMsg(resCode.getMsg());
        return  res;
    }


    public static LoginResponse success(){
        LoginResponse res = new LoginResponse();
        res.setSuccess(true);
        res.setCode(ResCode.SUCCESS.getCode());
        res.setMsg(ResCode.SUCCESS.getCode());
        return  res;
    }

    public static LoginResponse error(){
        LoginResponse res = new LoginResponse();
        res.setSuccess(false);
        res.setCode(ResCode.ERROR.getCode());
        res.setMsg(ResCode.ERROR.getCode());
        return  res;
    }
}
