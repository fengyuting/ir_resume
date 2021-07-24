package com.nlc.ir.resume.service;

import com.nlc.ir.resume.service.bo.AuthenticationBo;
import com.nlc.ir.resume.service.bo.AwardBo;
import com.nlc.ir.resume.service.bo.EducationBo;
import com.nlc.ir.resume.service.bo.JobBo;

import java.util.List;

public interface ExperienceService {


    /**
     * 教育
     * @param userId
     * @return
     */
    List<EducationBo> getEducationBos(String userId);

    /**
     * 工作
     * @param userId
     * @return
     */
    List<JobBo> getJobBos(String userId);

    /**
     * 技能
     * @param userId
     * @return
     */
    List<AuthenticationBo> getAuthenticationBos(String userId);

    /**
     * 荣誉
     * @param userId
     * @return
     */
    List<AwardBo> getAwardBos(String userId);


    /**
     * 新增/修改教育信息
     * @param educationBo
     */
    void saveAndModifyEd(EducationBo educationBo);

    /**
     * 新增/修改工作信息
     * @param jobBo
     */
    void saveAndModifyJb(JobBo jobBo);

    /**
     * 新增/修改技能信息
     * @param authenticationBo
     */
    void saveAndModifyAt(AuthenticationBo authenticationBo);

    /**
     * 新增/修改荣誉信息
     * @param awardBo
     */
    void saveAndModifyAd(AwardBo awardBo);

}
