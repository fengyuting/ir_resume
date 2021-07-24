package com.nlc.ir.resume.service.bo;

import lombok.Data;

import java.io.Serializable;

@Data
public class AwardBo implements Serializable {

    /**
     * id
     */
    private Integer id;

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
