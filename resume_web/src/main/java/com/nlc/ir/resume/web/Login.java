package com.nlc.ir.resume.web;

import com.nlc.ir.resume.domain.login.WechatAuthBean;
import com.nlc.ir.resume.service.LoginService;
import com.nlc.ir.resume.web.login.LoginResponse;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Description: 登录
 * @Author fengyuting
 * @Date 2021/6/15
 **/
@RestController
public class Login {

    /**
     * 登录逻辑
     */
    @Resource
    private LoginService loginService;

    @GetMapping("/login")
    public LoginResponse login(@RequestParam(value = "jsCode",defaultValue = "") String jsCode){
        LoginResponse response = new LoginResponse();
        if(!StringUtils.hasLength(jsCode)){
            response.setCode("9999");
            response.setMsg("入参错误");
            return response;
        }

        WechatAuthBean wechatMsg = loginService.login(jsCode);
        if(null == wechatMsg){
            response.setCode("9999");
            response.setMsg("获取信息失败");
            return response;
        }
        response.setCode(wechatMsg.getErrcode());
        response.setMsg(wechatMsg.getErrmsg());
        response.setOpenId(wechatMsg.getOpenid());
        return response;
    }

}
