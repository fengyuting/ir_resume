package com.nlc.ir.resume.domain.resume;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * user_subject_answer
 * @author 
 */
@Data
public class UserSubjectAnswer implements Serializable {
    private Integer id;

    /**
     * 用户ID
     */
    private String userId;

    private Short subjectNum;

    /**
     * 用户选择的答案编号
     */
    private String subjectAnswerNum;

    /**
     * 填空
     */
    private String subjectAnswerContent;

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