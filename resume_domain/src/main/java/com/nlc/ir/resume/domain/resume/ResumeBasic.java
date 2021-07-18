package com.nlc.ir.resume.domain.resume;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * resume_basic
 * @author 
 */
@Data
public class ResumeBasic implements Serializable {
    private Integer id;

    private String userId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别 1:男 2:女
     */
    private Short gender;

    /**
     * 出生日期
     */
    private String birthday;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 电子邮箱
     */
    private String mail;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String area;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 职业方向
     */
    private String jobDirection;

    /**
     * 最后学历 1:博士后 2:博士 3:硕士 4:MBA 5:本科 6:大专 7:中专 8: 高中
     */
    private Short education;

    /**
     * 政治面貌
     */
    private Short political;

    /**
     * 创建时间
     */
    private Date createdTime;

    /**
     * 修改时间
     */
    private Date modifyTime;

    private static final long serialVersionUID = 1L;
}