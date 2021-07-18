package com.nlc.ir.resume.domain.resume;

import java.io.Serializable;
import lombok.Data;

/**
 * user_info
 * @author 
 */
@Data
public class UserInfo implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 用户ID
     */
    private String userId;

    private String openId;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 用户手机号
     */
    private String phone;

    /**
     * 用户邮箱
     */
    private String mail;

    private static final long serialVersionUID = 1L;
}