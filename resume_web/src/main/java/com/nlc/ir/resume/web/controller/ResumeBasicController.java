package com.nlc.ir.resume.web.controller;

import com.nlc.ir.resume.service.ResumeBasicService;
import com.nlc.ir.resume.service.bo.ResumeBasicBo;
import com.nlc.ir.resume.web.common.BaseResponse;
import com.nlc.ir.resume.web.common.ResCode;
import com.nlc.ir.resume.web.req.UserInfoReq;
import com.nlc.ir.resume.web.res.ResumeBasicRes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Slf4j
@Controller
public class ResumeBasicController {

    @Resource
    private ResumeBasicService resumeBasicService;

    @PostMapping("resume/resumeBasic")
    public ResumeBasicRes resumeBasic(@RequestParam  UserInfoReq userInfoReq){
        if(null == userInfoReq || !StringUtils.hasLength(userInfoReq.getUserId())){
            log.info("用户未登录userId:{},openId:{}");
            return ResumeBasicRes.fail(ResCode.NO_AUTH);
        }
        ResumeBasicBo resumeBasic = resumeBasicService.getResumeBasicByUserId(userInfoReq.getUserId());
        ResumeBasicRes res = ResumeBasicRes.success();
        res.setData(resumeBasic);
        return res;
    }


    @PostMapping("resume/resumeBasic/save")
    public BaseResponse resumeBasicSave(ResumeBasicBo bo){
        if(null == bo){
            return BaseResponse.error();
        }
        try {
            resumeBasicService.saveAndUpdateResumeBasic(bo);
        }catch (Exception e){
            log.error("resumeBasicSave-exception:",e);
        }
        return BaseResponse.success();
    }


}
