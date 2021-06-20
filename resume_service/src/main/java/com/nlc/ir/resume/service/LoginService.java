package com.nlc.ir.resume.service;

import com.nlc.ir.resume.domain.login.WechatAuthBean;

/**
 * @Description: TODO
 * @Author fengyuting
 * @Date 2021/6/15
 **/

public interface LoginService {


    /**
     * 登录逻辑处理
     * @param jsCode
     * @return
     */
    WechatAuthBean login(String jsCode);

}
