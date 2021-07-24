package com.nlc.ir.resume.web.res;

import com.nlc.ir.resume.service.bo.ResumeBasicBo;
import com.nlc.ir.resume.web.common.BaseResponse;
import com.nlc.ir.resume.web.common.ResCode;
import lombok.Data;

/**
 * 基本信息返参对象
 */
@Data
public class ResumeBasicRes extends BaseResponse {

    /**
     * 用户基础信息
     */
    private ResumeBasicBo resumeBasic;

    public static ResumeBasicRes fail(ResCode resCode){
        ResumeBasicRes res = new ResumeBasicRes();
        res.setSuccess(false);
        res.setCode(resCode.getCode());
        res.setMsg(resCode.getMsg());
        return  res;
    }


    public static ResumeBasicRes success(){
        ResumeBasicRes res = new ResumeBasicRes();
        res.setSuccess(true);
        res.setCode(ResCode.SUCCESS.getCode());
        res.setMsg(ResCode.SUCCESS.getCode());
        return  res;
    }

    public static ResumeBasicRes error(){
        ResumeBasicRes res = new ResumeBasicRes();
        res.setSuccess(false);
        res.setCode(ResCode.ERROR.getCode());
        res.setMsg(ResCode.ERROR.getCode());
        return  res;
    }
}
