package com.nlc.ir.resume.service;

import com.nlc.ir.resume.service.bo.ResumeBasicBo;

public interface ResumeBasicService {


    /**
     * 获取用户基础信息
     * @param userId
     * @return
     */
    ResumeBasicBo getResumeBasicByUserId(String userId);

    /**
     * 新增/修改用户基本信息
     * @param resumeBasic
     * @return
     */
    void saveAndUpdateResumeBasic(ResumeBasicBo resumeBasic);

}
