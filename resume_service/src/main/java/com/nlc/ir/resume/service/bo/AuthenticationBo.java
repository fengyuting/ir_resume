package com.nlc.ir.resume.service.bo;

import lombok.Data;

import java.io.Serializable;

@Data
public class AuthenticationBo implements Serializable {

    /**
     * id
     */
    private Integer id;

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
}
