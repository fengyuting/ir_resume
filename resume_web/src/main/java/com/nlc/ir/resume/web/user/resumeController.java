package com.nlc.ir.resume.web.user;

import com.nlc.ir.resume.web.req.UserInfoReq;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class resumeController {

    @PostMapping("resume/subjectList")
    public void  subjectList(@RequestParam UserInfoReq userInfoReq){

    }

}
