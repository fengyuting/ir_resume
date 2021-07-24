package com.nlc.ir.resume.web.controller;

import com.nlc.ir.resume.service.ExperienceService;
import com.nlc.ir.resume.service.bo.AuthenticationBo;
import com.nlc.ir.resume.service.bo.AwardBo;
import com.nlc.ir.resume.service.bo.EducationBo;
import com.nlc.ir.resume.service.bo.JobBo;
import com.nlc.ir.resume.web.common.BaseResponse;
import com.nlc.ir.resume.web.common.ResCode;
import com.nlc.ir.resume.web.req.UserInfoReq;
import com.nlc.ir.resume.web.res.ExperienceRes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Slf4j
@Controller
public class ExperienceController {


    @Resource
    private ExperienceService experienceService;

    @PostMapping("resume/experience")
    public ExperienceRes experience(@RequestParam UserInfoReq userInfoReq){
        if(null == userInfoReq || !StringUtils.hasLength(userInfoReq.getUserId())){
            return ExperienceRes.fail(ResCode.NO_AUTH);
        }
        ExperienceRes res = ExperienceRes.success();
        //教育
        try{
          res.setEducation(experienceService.getEducationBos(userInfoReq.getUserId()));
        }catch (Exception e){
            log.error("experience-getEducationBos-exception",e);
        }
        //工作
        try{
            res.setJob(experienceService.getJobBos(userInfoReq.getUserId()));
        }catch (Exception e){
            log.error("experience-getJobBos-exception",e);
        }
        //技能
        try{
            res.setAuthentication(experienceService.getAuthenticationBos(userInfoReq.getUserId()));
        }catch (Exception e){
            log.error("experience-getAuthenticationBos-exception",e);
        }
        //荣誉
        try{
            res.setAward(experienceService.getAwardBos(userInfoReq.getUserId()));
        }catch (Exception e){
            log.error("experience-getEducationBos-getAwardBos",e);
        }
        return res;
    }

    @PostMapping("resume/experience/saveEd")
    public BaseResponse experienceSaveEd(EducationBo education){
        if(null == education){
            return ExperienceRes.fail(ResCode.DATA_ERROR);
        }
        try{
            experienceService.saveAndModifyEd(education);
        }catch (Exception e){
            return  BaseResponse.error();
        }
        return BaseResponse.success();
    }

    @PostMapping("resume/experience/saveJb")
    public BaseResponse experienceSaveJob(JobBo job){
        if(null == job){
            return ExperienceRes.fail(ResCode.DATA_ERROR);
        }
        try{
            experienceService.saveAndModifyJb(job);
        }catch (Exception e){
            return  BaseResponse.error();
        }
        return BaseResponse.success();
    }
    @PostMapping("resume/experience/saveAt")
    public BaseResponse experienceSaveAt(AuthenticationBo authentication){
        if(null == authentication){
            return ExperienceRes.fail(ResCode.DATA_ERROR);
        }
        try{
            experienceService.saveAndModifyAt(authentication);
        }catch (Exception e){
            return  BaseResponse.error();
        }
        return BaseResponse.success();
    }

    @PostMapping("resume/experience/saveAw")
    public BaseResponse experienceSaveAw(AwardBo award){
        if(null == award){
            return ExperienceRes.fail(ResCode.DATA_ERROR);
        }
        try{
            experienceService.saveAndModifyAd(award);
        }catch (Exception e){
            return  BaseResponse.error();
        }
        return BaseResponse.success();
    }

}
