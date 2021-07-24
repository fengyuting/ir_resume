package com.nlc.ir.resume.dao;


import com.nlc.ir.resume.domain.resume.ResumeEducation;

import java.util.List;

public interface ResumeEducationDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeEducation record);

    int insertSelective(ResumeEducation record);

    List<ResumeEducation> selectByUserId(String  userId);

    int updateByPrimaryKeySelective(ResumeEducation record);

    int updateByPrimaryKey(ResumeEducation record);
}