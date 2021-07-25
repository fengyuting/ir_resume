package com.nlc.ir.resume.web.login;

import com.nlc.ir.resume.domain.login.WechatAuthBean;
import com.nlc.ir.resume.service.LoginService;
import com.nlc.ir.resume.service.UserInfoService;
import com.nlc.ir.resume.service.bo.UserInfoBo;
import com.nlc.ir.resume.web.common.ResCode;
import com.nlc.ir.resume.web.req.UserInfoReq;
import com.nlc.ir.resume.web.res.LoginResponse;
import com.nlc.ir.resume.web.res.UserInfoResponse;
import org.apache.catalina.User;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.util.UUID;

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

    /**
     * 记录用户信息
     */
    @Resource
    private UserInfoService userInfoService;

    @GetMapping("/login")
    public LoginResponse login(@RequestParam(value = "jsCode",defaultValue = "") String jsCode){

        if(!StringUtils.hasLength(jsCode)){
            return LoginResponse.fail(ResCode.DATA_ERROR);
        }
        WechatAuthBean wechatAuthBean = null;
        try{
            wechatAuthBean  = loginService.login(jsCode);
            if(null == wechatAuthBean){
                return LoginResponse.error();
            }
        }catch (Exception e){
            return LoginResponse.error();
        }

        LoginResponse response = LoginResponse.success();
        response.setCode(wechatAuthBean.getErrcode());
        response.setMsg(wechatAuthBean.getErrmsg());
        response.setOpenId(wechatAuthBean.getOpenid());
        return response;
    }

    @GetMapping("/user")
    public UserInfoResponse getUserInfo(@RequestParam(value = "openId",defaultValue = "") String openId){
        if(!StringUtils.hasLength(openId)){
            return UserInfoResponse.fail(ResCode.DATA_ERROR);
        }

        UserInfoBo userInfoBo =  userInfoService.getUserInfoByOpenId(openId);
        if(null == userInfoBo){
            return UserInfoResponse.fail(ResCode.SQ);
        }
        UserInfoResponse response = UserInfoResponse.success();
        response.setData(userInfoBo);
        return response;
    }

    @PostMapping("/create")
    public UserInfoResponse createdInfo(@RequestBody UserInfoReq userInfoReq){
        if(null == userInfoReq){
            return UserInfoResponse.fail(ResCode.DATA_ERROR);
        }
        UserInfoBo userInfoBo = null;
        try{
            userInfoBo = new UserInfoBo();
            userInfoBo.setUserId(UUID.randomUUID().toString());
            userInfoBo.setOpenId(userInfoReq.getOpenId());
            userInfoBo.setNickName(userInfoBo.getNickName());
            userInfoBo.setAvatarUrl(userInfoReq.getAvatarUrl());
            userInfoBo.setGender(userInfoReq.getGender());
            userInfoService.createNewUser(userInfoBo);
        }catch (Exception e){
            return UserInfoResponse.error();
        }
        UserInfoResponse userInfoResponse = UserInfoResponse.success();
        userInfoResponse.setData(userInfoBo);
        return userInfoResponse;
    }

}
