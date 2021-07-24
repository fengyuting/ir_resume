package com.nlc.ir.resume.service.impl;

import com.nlc.ir.resume.service.ExperienceService;
import com.nlc.ir.resume.service.bo.AuthenticationBo;
import com.nlc.ir.resume.service.bo.AwardBo;
import com.nlc.ir.resume.service.bo.EducationBo;
import com.nlc.ir.resume.service.bo.JobBo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceServiceImpl implements ExperienceService {


    @Override
    public List<EducationBo> getEducationBos(String userId) {
        return null;
    }

    @Override
    public List<JobBo> getJobBos(String userId) {
        return null;
    }

    @Override
    public List<AuthenticationBo> getAuthenticationBos(String userId) {
        return null;
    }

    @Override
    public List<AwardBo> getAwardBos(String userId) {
        return null;
    }

    @Override
    public void saveAndModifyEd(EducationBo educationBo) {

    }

    @Override
    public void saveAndModifyJb(JobBo jobBo) {

    }

    @Override
    public void saveAndModifyAt(AuthenticationBo authenticationBo) {

    }

    @Override
    public void saveAndModifyAd(AwardBo awardBo) {

    }
}
