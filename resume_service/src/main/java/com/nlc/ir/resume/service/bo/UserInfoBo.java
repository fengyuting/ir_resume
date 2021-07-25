package com.nlc.ir.resume.service.bo;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserInfoBo implements Serializable {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 是否用？
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
}
