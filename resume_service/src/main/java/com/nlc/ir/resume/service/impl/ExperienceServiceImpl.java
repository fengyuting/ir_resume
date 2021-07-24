package com.nlc.ir.resume.service.impl;

import com.nlc.ir.resume.dao.ResumeAuthenticationDao;
import com.nlc.ir.resume.dao.ResumeAwardDao;
import com.nlc.ir.resume.dao.ResumeEducationDao;
import com.nlc.ir.resume.dao.ResumeJobDao;
import com.nlc.ir.resume.domain.resume.*;
import com.nlc.ir.resume.service.ExperienceService;
import com.nlc.ir.resume.service.bo.AuthenticationBo;
import com.nlc.ir.resume.service.bo.AwardBo;
import com.nlc.ir.resume.service.bo.EducationBo;
import com.nlc.ir.resume.service.bo.JobBo;
import com.nlc.ir.resume.service.common.AppException;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExperienceServiceImpl implements ExperienceService {

    @Resource
    private ResumeEducationDao resumeEducationDao;

    @Resource
    private ResumeJobDao resumeJobDao;

    @Resource
    private ResumeAuthenticationDao resumeAuthenticationDao;

    @Resource
    private ResumeAwardDao resumeAwardDao;

    @Override
    public List<EducationBo> getEducationBos(String userId) {
        List<ResumeEducation>  resumeEducations = resumeEducationDao.selectByUserId(userId);
        if(CollectionUtils.isEmpty(resumeEducations)){
            return null;
        }
        List<EducationBo> educationBos = new ArrayList<>();
        for(ResumeEducation re : resumeEducations){
            EducationBo bo = new EducationBo();
            BeanUtils.copyProperties(re,bo);
            educationBos.add(bo);
        }
        return educationBos;
    }

    @Override
    public List<JobBo> getJobBos(String userId) {
        List<ResumeJob> resumeJobs = resumeJobDao.selectByUserId(userId);
        if(CollectionUtils.isEmpty(resumeJobs)){
            return null;
        }
        List<JobBo> jobs = new ArrayList<>();
        for(ResumeJob jb : resumeJobs){
            JobBo bo = new JobBo();
            BeanUtils.copyProperties(jb,bo);
            jobs.add(bo);
        }
        return jobs;
    }

    @Override
    public List<AuthenticationBo> getAuthenticationBos(String userId) {
       List<ResumeAuthentication>  resumeAuthentications = resumeAuthenticationDao.selectByUserId(userId);
        if(CollectionUtils.isEmpty(resumeAuthentications)){
            return null;
        }
        List<AuthenticationBo> authenticationBos = new ArrayList<>();
        for(ResumeAuthentication jb : resumeAuthentications){
            AuthenticationBo bo = new AuthenticationBo();
            BeanUtils.copyProperties(jb,bo);
            authenticationBos.add(bo);
        }
        return authenticationBos;
    }

    @Override
    public List<AwardBo> getAwardBos(String userId) {
        List<ResumeAward> resumeAwards =  resumeAwardDao.selectByUserId(userId);
        if(CollectionUtils.isEmpty(resumeAwards)){
            return null;
        }
        List<AwardBo> awardBos = new ArrayList<>();
        for(ResumeAward at : resumeAwards){
            AwardBo bo = new AwardBo();
            BeanUtils.copyProperties(at,bo);
            awardBos.add(bo);
        }
        return awardBos;
    }

    @Override
    public void saveAndModifyEd(EducationBo educationBo) {
        ResumeEducation education = new ResumeEducation();
        BeanUtils.copyProperties(educationBo,education);
        int i = 0;
        if(null == education.getId()){
            i =  resumeEducationDao.updateByPrimaryKeySelective(education);
        }else {
            i = resumeEducationDao.insert(education);
        }
        if(i != 1){
            throw new AppException("saveAndModifyEd-操作失败");
        }
    }

    @Override
    public void saveAndModifyJb(JobBo jobBo) {
        ResumeJob job = new ResumeJob();
        BeanUtils.copyProperties(jobBo,job);
        int i = 0;
        if(null == job.getId()){
            i =  resumeJobDao.updateByPrimaryKeySelective(job);
        }else {
            i = resumeJobDao.insert(job);
        }
        if(i != 1){
            throw new AppException("saveAndModifyJb-操作失败");
        }
    }

    @Override
    public void saveAndModifyAt(AuthenticationBo authenticationBo) {
        ResumeAuthentication authentication = new ResumeAuthentication();
        BeanUtils.copyProperties(authenticationBo,authentication);
        int i = 0;
        if(null == authentication.getId()){
            i =  resumeAuthenticationDao.updateByPrimaryKeySelective(authentication);
        }else {
            i = resumeAuthenticationDao.insert(authentication);
        }
        if(i != 1){
            throw new AppException("saveAndModifyAt-操作失败");
        }
    }

    @Override
    public void saveAndModifyAd(AwardBo awardBo) {
        ResumeAward award = new ResumeAward();
        BeanUtils.copyProperties(awardBo,award);
        int i = 0;
        if(null == award.getId()){
            i =  resumeAwardDao.updateByPrimaryKeySelective(award);
        }else {
            i = resumeAwardDao.insert(award);
        }
        if(i != 1){
            throw new AppException("saveAndModifyAd-操作失败");
        }
    }
}
