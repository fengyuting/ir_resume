package com.nlc.ir.resume.dao;

import generate.ResumeEducation;

public interface ResumeEducationDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeEducation record);

    int insertSelective(ResumeEducation record);

    ResumeEducation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeEducation record);

    int updateByPrimaryKey(ResumeEducation record);
}