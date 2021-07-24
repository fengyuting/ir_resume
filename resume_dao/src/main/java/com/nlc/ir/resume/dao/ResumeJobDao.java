package com.nlc.ir.resume.dao;


import com.nlc.ir.resume.domain.resume.ResumeJob;

import java.util.List;

public interface ResumeJobDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeJob record);

    int insertSelective(ResumeJob record);

    List<ResumeJob> selectByUserId(String userId);

    int updateByPrimaryKeySelective(ResumeJob record);

    int updateByPrimaryKey(ResumeJob record);
}