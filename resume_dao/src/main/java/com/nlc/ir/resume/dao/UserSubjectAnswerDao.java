package com.nlc.ir.resume.dao;


import com.nlc.ir.resume.domain.resume.UserSubjectAnswer;

public interface UserSubjectAnswerDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserSubjectAnswer record);

    int insertSelective(UserSubjectAnswer record);

    UserSubjectAnswer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserSubjectAnswer record);

    int updateByPrimaryKey(UserSubjectAnswer record);
}