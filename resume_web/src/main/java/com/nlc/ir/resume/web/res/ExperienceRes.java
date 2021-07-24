package com.nlc.ir.resume.web.res;


import com.nlc.ir.resume.service.bo.AuthenticationBo;
import com.nlc.ir.resume.service.bo.AwardBo;
import com.nlc.ir.resume.service.bo.EducationBo;
import com.nlc.ir.resume.service.bo.JobBo;
import com.nlc.ir.resume.web.common.BaseResponse;
import com.nlc.ir.resume.web.common.ResCode;
import lombok.Data;

import java.util.List;

@Data
public class ExperienceRes extends BaseResponse {

    //教育
    private List<EducationBo> education;

    //工作
    private List<JobBo> job;

    //技能
    private List<AuthenticationBo> authentication;

    //获奖
    private List<AwardBo> award;


    public static ExperienceRes fail(ResCode resCode){
        ExperienceRes res = new ExperienceRes();
        res.setSuccess(false);
        res.setCode(resCode.getCode());
        res.setMsg(resCode.getMsg());
        return  res;
    }


    public static ExperienceRes success(){
        ExperienceRes res = new ExperienceRes();
        res.setSuccess(true);
        res.setCode(ResCode.SUCCESS.getCode());
        res.setMsg(ResCode.SUCCESS.getCode());
        return  res;
    }

    public static ExperienceRes error(){
        ExperienceRes res = new ExperienceRes();
        res.setSuccess(false);
        res.setCode(ResCode.ERROR.getCode());
        res.setMsg(ResCode.ERROR.getCode());
        return  res;
    }
}
