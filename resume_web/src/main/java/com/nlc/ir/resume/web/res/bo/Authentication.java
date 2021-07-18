package com.nlc.ir.resume.web.res.bo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Authentication implements Serializable {

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
