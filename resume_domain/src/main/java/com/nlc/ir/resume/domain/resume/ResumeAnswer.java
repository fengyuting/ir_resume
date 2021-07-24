package com.nlc.ir.resume.domain.resume;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * resume_answer
 * @author 
 */
@Data
public class ResumeAnswer implements Serializable {
    private Integer id;

    /**
     * 答案编号
     */
    private String num;

    /**
     * 答案内容
     */
    private String content;

    /**
     * 题目编号
     */
    private Short subjectNum;

    /**
     * 标签编号
     */
    private Short tagNum;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    private static final long serialVersionUID = 1L;

}