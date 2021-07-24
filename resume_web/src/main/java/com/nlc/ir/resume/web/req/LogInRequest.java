package com.nlc.ir.resume.web.req;

import com.nlc.ir.resume.web.common.BaseRequest;
import lombok.Data;

/**
 * @Description: 登录请求体
 * @Author fengyuting
 * @Date 2021/6/15
 **/
@Data
public class LogInRequest extends BaseRequest {

    /**
     * 登录时获取的 code
     */
    private String js_code;

}
