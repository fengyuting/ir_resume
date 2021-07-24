package com.nlc.ir.resume.service.impl;

import com.nlc.ir.resume.dao.ResumeBasicDao;
import com.nlc.ir.resume.domain.resume.ResumeBasic;
import com.nlc.ir.resume.service.ResumeBasicService;
import com.nlc.ir.resume.service.bo.ResumeBasicBo;
import com.nlc.ir.resume.service.common.AppException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Slf4j
@Service
public class ResumeBasicServiceImpl implements ResumeBasicService {
    @Resource
    private ResumeBasicDao resumeBasicDao;

    @Override
    public ResumeBasicBo getResumeBasicByUserId(String userId) {
        ResumeBasic resumeBasic = resumeBasicDao.selectByUserId(userId);
        if (null == resumeBasic) {
            return null;
        }
        ResumeBasicBo bo = new ResumeBasicBo();
        BeanUtils.copyProperties(resumeBasic, bo);
        return bo;
    }

    @Override
    public void saveAndUpdateResumeBasic(ResumeBasicBo resumeBasic) {
        ResumeBasic resume = new ResumeBasic();
        BeanUtils.copyProperties(resumeBasic,resume);
        int i = 0;
        if(null == resumeBasic.getId()){
          i =  resumeBasicDao.updateByPrimaryKeySelective(resume);
        }else {
          i = resumeBasicDao.insert(resume);
        }
        if(i != 1){
            throw new AppException("saveAndUpdateResumeBasic-操作失败");
        }
    }

}
