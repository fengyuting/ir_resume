package com.nlc.ir.resume.dao;


import com.nlc.ir.resume.domain.resume.ResumeBasic;

public interface ResumeBasicDao {

    int insert(ResumeBasic record);

    int insertSelective(ResumeBasic record);

    ResumeBasic selectByUserId(String userId);

    int updateByPrimaryKeySelective(ResumeBasic record);

}