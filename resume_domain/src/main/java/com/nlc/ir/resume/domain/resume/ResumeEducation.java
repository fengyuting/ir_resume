package com.nlc.ir.resume.domain.resume;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * resume_education
 * @author 
 */
@Data
public class ResumeEducation implements Serializable {
    private Integer id;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 学校名称
     */
    private String schoolName;

    /**
     * 专业名称
     */
    private String professionalName;

    /**
     * 开始时间YYYY-MM-DD
     */
    private String beginTime;

    /**
     * 结束时间YYYY-MM-DD
     */
    private String endTime;

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