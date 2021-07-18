package com.nlc.ir.resume.dao;

import generate.ResumeJob;

public interface ResumeJobDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeJob record);

    int insertSelective(ResumeJob record);

    ResumeJob selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeJob record);

    int updateByPrimaryKey(ResumeJob record);
}