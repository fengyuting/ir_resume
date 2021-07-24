package com.nlc.ir.resume.dao;

import com.nlc.ir.resume.domain.resume.ResumeAuthentication;

import java.util.List;

public interface ResumeAuthenticationDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeAuthentication record);

    int insertSelective(ResumeAuthentication record);

    List<ResumeAuthentication> selectByUserId(String userId);

    int updateByPrimaryKeySelective(ResumeAuthentication record);

    int updateByPrimaryKey(ResumeAuthentication record);
}