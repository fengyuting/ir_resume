package com.nlc.ir.resume.web.controller;

import com.nlc.ir.resume.service.SubjectService;
import com.nlc.ir.resume.web.common.BaseResponse;
import com.nlc.ir.resume.web.common.ResCode;
import com.nlc.ir.resume.web.req.UserInfoReq;
import com.nlc.ir.resume.web.res.SubjectRes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

@Slf4j
@Controller
public class SubjectController {


    @Resource
    private SubjectService subjectService;


    @PostMapping("resume/subjectList")
    public SubjectRes subjectList(@RequestParam UserInfoReq userInfoReq){
        if(null == userInfoReq || !StringUtils.hasLength(userInfoReq.getUserId())){
            return SubjectRes.fail(ResCode.NO_AUTH);
        }
        SubjectRes res = SubjectRes.success();
        try{
            res.setData(subjectService.getSubjectList());
            return res;
        }catch (Exception e){
            log.error("subjectList-exception",e);
            return SubjectRes.error();
        }
    }

}

