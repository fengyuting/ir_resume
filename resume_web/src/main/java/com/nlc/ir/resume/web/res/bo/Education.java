package com.nlc.ir.resume.web.res.bo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Education implements Serializable {


    /**
     * 学校名称
     */
    private String schoolName;

    /**
     * 专业名称
     */
    private String professionalName;

    /**
     * 开始时间YYYY-MM-DD
     */
    private String beginTime;

    /**
     * 结束时间YYYY-MM-DD
     */
    private String endTime;
}
