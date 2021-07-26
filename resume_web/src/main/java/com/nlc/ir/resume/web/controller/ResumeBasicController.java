package com.nlc.ir.resume.web.controller;

import com.nlc.ir.resume.service.ResumeBasicService;
import com.nlc.ir.resume.service.bo.ResumeBasicBo;
import com.nlc.ir.resume.web.common.BaseRequest;
import com.nlc.ir.resume.web.common.BaseResponse;
import com.nlc.ir.resume.web.common.ResCode;
import com.nlc.ir.resume.web.res.ResumeBasicRes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
public class ResumeBasicController {

    @Resource
    private ResumeBasicService resumeBasicService;

    @PostMapping("resume/resumeBasic")
    public ResumeBasicRes resumeBasic(@RequestBody BaseRequest req, HttpServletRequest request){
        if(null == req  || !StringUtils.hasLength(req.getUserId())){
            log.info("用户未登录userId:{}");
            return ResumeBasicRes.fail(ResCode.NO_AUTH);
        }
        ResumeBasicBo resumeBasic = resumeBasicService.getResumeBasicByUserId(req.getUserId());
        ResumeBasicRes res = ResumeBasicRes.success();
        res.setData(resumeBasic);
        return res;
    }


    @PostMapping("resume/resumeBasic/save")
    public BaseResponse resumeBasicSave(@RequestBody ResumeBasicBo bo,HttpServletRequest request){
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
