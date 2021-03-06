package com.nlc.ir.resume.web.req;

import com.nlc.ir.resume.web.common.BaseRequest;
import lombok.Data;

@Data
public class UserInfoReq extends BaseRequest {

    /**
     * 是否用？
     */
    private String openId;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 头像
     */
    private String avatarUrl;

    /**
     * 性别
     */
    private Integer gender;

}
