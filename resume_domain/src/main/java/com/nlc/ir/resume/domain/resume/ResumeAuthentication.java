package com.nlc.ir.resume.domain.resume;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * resume_authentication
 * @author 
 */
@Data
public class ResumeAuthentication implements Serializable {
    private Integer id;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 技能类型
     */
    private String type;

    /**
     * 认证级别
     */
    private String level;

    /**
     * 认证名称
     */
    private String name;

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