package com.nlc.ir.resume.dao;


import com.nlc.ir.resume.domain.resume.ResumeAnswer;

import java.util.List;

public interface ResumeAnswerDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ResumeAnswer record);

    int insertSelective(ResumeAnswer record);

    List<ResumeAnswer> selectAll();

    int updateByPrimaryKeySelective(ResumeAnswer record);

}