package com.nlc.ir.resume.dao;

import generate.ResumeAward;

public interface ResumeAwardDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeAward record);

    int insertSelective(ResumeAward record);

    ResumeAward selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeAward record);

    int updateByPrimaryKey(ResumeAward record);
}