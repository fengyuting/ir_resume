package com.nlc.ir.resume.dao;

import com.nlc.ir.resume.domain.resume.ResumeAuthentication;

public interface ResumeAuthenticationDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeAuthentication record);

    int insertSelective(ResumeAuthentication record);

    ResumeAuthentication selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ResumeAuthentication record);

    int updateByPrimaryKey(ResumeAuthentication record);
}