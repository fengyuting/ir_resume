package com.nlc.ir.resume.web.user;

import com.nlc.ir.resume.web.common.BaseResponse;
import com.nlc.ir.resume.web.res.bo.ExperienceRes;
import com.nlc.ir.resume.web.res.ResumeBasicRes;
import com.nlc.ir.resume.web.req.UserInfoReq;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserResumeController {


    @PostMapping("resume/resumeBasic")
    public ResumeBasicRes resumeBasic(@RequestParam  UserInfoReq userInfoReq){
        return null;
    }


    @PostMapping("resume/resumeBasic/save")
    public BaseResponse resumeBasicSave(){
        return null;
    }


    @PostMapping("resume/resumeBasic")
    public ExperienceRes experience(@RequestParam  UserInfoReq userInfoReq){
        return null;
    }


    @PostMapping("resume/resumeBasic/save")
    public BaseResponse experienceSave(){
        return null;
    }

    @PostMapping("resume/userSubjectInfo")
    public void userSubjectInfo(@RequestParam  UserInfoReq userInfoReq){

    }
}
