package com.nlc.ir.resume.service.bo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 题目对象
 */
@Data
public class SubjectBo implements Serializable {

    /**
     * 题目编号
     */
    private String num;

    /**
     * 题目内容
     */
    private String content;

    /**
     * 题目类型
     */
    private String type;

    /**
     * 选项
     */
    List<AnswerBo> answer;
}
