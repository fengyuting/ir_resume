package com.nlc.ir.resume.dao;


import com.nlc.ir.resume.domain.resume.ResumeSubject;

import java.util.List;

public interface ResumeSubjectDao {

    int deleteByPrimaryKey(Integer id);

    int insert(ResumeSubject record);

    int insertSelective(ResumeSubject record);

    List<ResumeSubject> selectAll();

    int updateByPrimaryKeySelective(ResumeSubject record);

}