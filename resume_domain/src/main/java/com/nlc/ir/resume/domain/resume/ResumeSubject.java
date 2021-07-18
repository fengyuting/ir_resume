package com.nlc.ir.resume.domain.resume;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * resume_subject
 * @author 
 */
@Data
public class ResumeSubject implements Serializable {
    private Integer id;

    /**
     * 题目编号
     */
    private Short num;

    /**
     * 题目内容
     */
    private String content;

    /**
     * 题目类型 1：单选 2：多选 3：多选+填空
     */
    private Short type;

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