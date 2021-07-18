package com.nlc.ir.resume.web.res;

import lombok.Data;

import java.io.Serializable;

@Data
public class Award implements Serializable {

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
}
