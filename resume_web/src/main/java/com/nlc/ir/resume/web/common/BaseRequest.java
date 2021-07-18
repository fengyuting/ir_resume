package com.nlc.ir.resume.web.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description: 公共请求体
 * @Author fengyuting
 * @Date 2021/6/15
 **/
@Data
public class BaseRequest implements Serializable {

    /**
     * 用户标识
     */
    private String userId;
}
