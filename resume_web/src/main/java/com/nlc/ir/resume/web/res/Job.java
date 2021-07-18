package com.nlc.ir.resume.web.res;

import lombok.Data;

import java.io.Serializable;

@Data
public class Job implements Serializable {

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 职位
     */
    private String position;

    /**
     * 工作内容
     */
    private String jobContent;

    /**
     * 开始时间
     */
    private String beginTime;

    /**
     * 结束时间
     */
    private String endTime;

}
