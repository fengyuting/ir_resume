package com.nlc.ir.resume.dao;


import com.nlc.ir.resume.domain.resume.ResumeAnswer;

public interface ResumeAnswerDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeAnswer record);

    int insertSelective(ResumeAnswer record);

    ResumeAnswer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeAnswer record);

    int updateByPrimaryKey(ResumeAnswer record);
}