package com.nlc.ir.resume.web.res;

import com.nlc.ir.resume.service.bo.UserInfoBo;
import com.nlc.ir.resume.web.common.BaseResponse;
import com.nlc.ir.resume.web.common.ResCode;
import lombok.Data;

@Data
public class UserInfoResponse extends BaseResponse {
    /**
     * 用户信息
     */
    private UserInfoBo data;


    public static UserInfoResponse fail(ResCode resCode){
        UserInfoResponse res = new UserInfoResponse();
        res.setSuccess(false);
        res.setCode(resCode.getCode());
        res.setMsg(resCode.getMsg());
        return  res;
    }

    public static UserInfoResponse fail(String code,String msg){
        UserInfoResponse res = new UserInfoResponse();
        res.setSuccess(false);
        res.setCode(code);
        res.setMsg(msg);
        return  res;
    }


    public static UserInfoResponse success(){
        UserInfoResponse res = new UserInfoResponse();
        res.setSuccess(true);
        res.setCode(ResCode.SUCCESS.getCode());
        res.setMsg(ResCode.SUCCESS.getCode());
        return  res;
    }

    public static UserInfoResponse error(){
        UserInfoResponse res = new UserInfoResponse();
        res.setSuccess(false);
        res.setCode(ResCode.ERROR.getCode());
        res.setMsg(ResCode.ERROR.getCode());
        return  res;
    }
}
