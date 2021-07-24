package com.nlc.ir.resume.dao;


import com.nlc.ir.resume.domain.resume.SubjectAnswerTag;

public interface SubjectAnswerTagDao {
    int deleteByPrimaryKey(Integer id);

    int insert(SubjectAnswerTag record);

    int insertSelective(SubjectAnswerTag record);

    SubjectAnswerTag selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SubjectAnswerTag record);

    int updateByPrimaryKey(SubjectAnswerTag record);
}