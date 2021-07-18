package com.nlc.ir.resume.web.res;

import com.nlc.ir.resume.web.common.BaseResponse;
import lombok.Data;

@Data
public class ExperienceRes extends BaseResponse {


    //教育
    private Education education;

    //工作
    private Job job;

    //技能
    private Authentication authentication;

    //获奖
    private Award award;


}
