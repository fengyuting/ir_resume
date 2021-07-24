package com.nlc.ir.resume.dao;


import com.nlc.ir.resume.domain.resume.ResumeEducation;

public interface ResumeEducationDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeEducation record);

    int insertSelective(ResumeEducation record);

    ResumeEducation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeEducation record);

    int updateByPrimaryKey(ResumeEducation record);
}