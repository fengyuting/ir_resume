package com.nlc.ir.resume.dao;

import generate.ResumeBasic;

public interface ResumeBasicDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeBasic record);

    int insertSelective(ResumeBasic record);

    ResumeBasic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeBasic record);

    int updateByPrimaryKey(ResumeBasic record);
}