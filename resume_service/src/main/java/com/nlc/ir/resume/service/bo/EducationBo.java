package com.nlc.ir.resume.service.bo;

import lombok.Data;

import java.io.Serializable;

@Data
public class EducationBo implements Serializable {

    /**
     * id
     */
    private Integer id;

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
