package com.nlc.ir.resume.dao;


import com.nlc.ir.resume.domain.resume.ResumeJob;

public interface ResumeJobDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeJob record);

    int insertSelective(ResumeJob record);

    ResumeJob selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeJob record);

    int updateByPrimaryKey(ResumeJob record);
}