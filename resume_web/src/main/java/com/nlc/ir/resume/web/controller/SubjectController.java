package com.nlc.ir.resume.web.controller;

import com.nlc.ir.resume.web.common.BaseResponse;
import com.nlc.ir.resume.web.req.UserInfoReq;
import com.nlc.ir.resume.web.res.SubjectRes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class SubjectController {

    @PostMapping("resume/subjectInfo")
    public SubjectRes subjectInfo(@RequestParam UserInfoReq userInfoReq){
        return null;
    }


    @PostMapping("resume/subjectInfo/save")
    public BaseResponse userSubjectInfoSave(@RequestParam UserInfoReq userInfoReq){
        return null;
    }
}

