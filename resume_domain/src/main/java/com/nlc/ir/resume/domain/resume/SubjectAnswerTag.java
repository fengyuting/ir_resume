package com.nlc.ir.resume.domain.resume;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * subject_answer_tag
 * @author 
 */
@Data
public class SubjectAnswerTag implements Serializable {
    private Integer id;

    /**
     * 标签归类
     */
    private String tagName;

    /**
     * 题目编号
     */
    private Short subjectNum;

    /**
     * 选项编号
     */
    private Short answerNum;

    /**
     * 分值=题目+题目答案
     */
    private String tagValue;

    /**
     * 标签分类 1：综合评价 2：五熵评价 3：七力评价
     */
    private Byte tagType;

    private Date createdTime;

    private Date modifyTime;

    private static final long serialVersionUID = 1L;
}