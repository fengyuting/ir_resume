package com.nlc.ir.resume.web.common;

import com.nlc.ir.resume.web.res.ResumeBasicRes;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description: 公共返回体
 * @Author fengyuting
 * @Date 2021/6/15
 **/
@Data
public class BaseResponse implements Serializable {

    private boolean success;

    /**
     * 返回码
     */
    private String code;

    /**
     * 返回信息
     */
    private String msg;


    public static BaseResponse fail(ResCode resCode){
        ResumeBasicRes res = new ResumeBasicRes();
        res.setSuccess(false);
        res.setCode(resCode.getCode());
        res.setMsg(resCode.getMsg());
        return  res;
    }


    public static BaseResponse success(){
        ResumeBasicRes res = new ResumeBasicRes();
        res.setSuccess(true);
        res.setCode(ResCode.SUCCESS.getCode());
        res.setMsg(ResCode.SUCCESS.getCode());
        return  res;
    }

    public static BaseResponse error(){
        ResumeBasicRes res = new ResumeBasicRes();
        res.setSuccess(false);
        res.setCode(ResCode.ERROR.getCode());
        res.setMsg(ResCode.ERROR.getCode());
        return  res;
    }
}
