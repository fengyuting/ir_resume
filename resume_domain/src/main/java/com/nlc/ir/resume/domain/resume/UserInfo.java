package com.nlc.ir.resume.domain.resume;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * user_info
 * @author 
 */
@Data
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * openId
     */
    private String openId;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 头像
     */
    private String avatarUrl;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 创建
     */
    private Date createdTime;

    /**
     * 修改
     */
    private Date modifyTime;
}