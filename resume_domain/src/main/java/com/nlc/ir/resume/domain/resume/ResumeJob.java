package com.nlc.ir.resume.domain.resume;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * resume_job
 * @author 
 */
@Data
public class ResumeJob implements Serializable {
    private Integer id;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 职位
     */
    private String position;

    /**
     * 工作内容
     */
    private String jobContent;

    /**
     * 开始时间
     */
    private String beginTime;

    /**
     * 结束时间
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