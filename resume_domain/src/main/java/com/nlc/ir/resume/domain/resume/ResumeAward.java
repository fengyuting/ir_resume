package com.nlc.ir.resume.domain.resume;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * resume_award
 * @author 
 */
@Data
public class ResumeAward implements Serializable {
    private Integer id;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 获奖级别
     */
    private String level;

    /**
     * 获奖类型
     */
    private String type;

    /**
     * 获奖描述
     */
    private String desc;

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