package com.nlc.ir.resume.dao;


import com.nlc.ir.resume.domain.resume.ResumeAward;

import java.util.List;

public interface ResumeAwardDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeAward record);

    int insertSelective(ResumeAward record);

    List<ResumeAward> selectByUserId(String userId);

    int updateByPrimaryKeySelective(ResumeAward record);

    int updateByPrimaryKey(ResumeAward record);
}