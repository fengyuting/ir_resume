package com.nlc.ir.resume.web.controller;

import com.nlc.ir.resume.service.SubjectService;
import com.nlc.ir.resume.web.common.ResCode;
import com.nlc.ir.resume.web.req.UserInfoReq;
import com.nlc.ir.resume.web.res.SubjectRes;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Slf4j
@RestController
public class SubjectController {


    @Resource
    private SubjectService subjectService;


    @RequestMapping("/subject")
    public SubjectRes subjectList(@RequestParam(value = "userId",defaultValue = "123") String userId){
        if(!StringUtils.hasLength(userId)){
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

