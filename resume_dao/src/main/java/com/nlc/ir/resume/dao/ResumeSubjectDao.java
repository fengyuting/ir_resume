package com.nlc.ir.resume.dao;


import com.nlc.ir.resume.domain.resume.ResumeSubject;

public interface ResumeSubjectDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeSubject record);

    int insertSelective(ResumeSubject record);

    ResumeSubject selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeSubject record);

    int updateByPrimaryKey(ResumeSubject record);
}