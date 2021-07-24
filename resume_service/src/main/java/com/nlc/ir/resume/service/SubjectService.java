package com.nlc.ir.resume.service;

import com.nlc.ir.resume.service.bo.SubjectBo;

import java.util.List;

public interface SubjectService {

    /**
     * 获取答题列表
     * @return
     */
    List<SubjectBo> getSubjectList();
}
