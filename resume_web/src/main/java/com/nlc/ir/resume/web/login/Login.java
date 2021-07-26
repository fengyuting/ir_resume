package com.nlc.ir.resume.web.login;

import com.nlc.ir.resume.domain.login.WechatAuthBean;
import com.nlc.ir.resume.service.LoginService;
import com.nlc.ir.resume.service.UserInfoService;
import com.nlc.ir.resume.service.bo.UserInfoBo;
import com.nlc.ir.resume.web.common.BaseRequest;
import com.nlc.ir.resume.web.common.ResCode;
import com.nlc.ir.resume.web.req.UserInfoReq;
import com.nlc.ir.resume.web.res.LoginResponse;
import com.nlc.ir.resume.web.res.UserInfoResponse;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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

    @PostMapping("resume/login")
    public LoginResponse login(@RequestBody BaseRequest req, HttpServletRequest request){

        if(null == req || !StringUtils.hasLength(req.getJsCode())){
            return LoginResponse.fail(ResCode.DATA_ERROR);
        }
        WechatAuthBean wechatAuthBean = null;
        try{
            wechatAuthBean  = loginService.login(req.getJsCode());
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

    @PostMapping("resume/user")
    public UserInfoResponse getUserInfo(@RequestBody BaseRequest req, HttpServletRequest request){
        if(null == req || !StringUtils.hasLength(req.getOpenId())){
            return UserInfoResponse.fail(ResCode.DATA_ERROR);
        }

        UserInfoBo userInfoBo =  userInfoService.getUserInfoByOpenId(req.getOpenId());
        if(null == userInfoBo){
            return UserInfoResponse.fail(ResCode.SQ);
        }
        UserInfoResponse response = UserInfoResponse.success();
        response.setData(userInfoBo);
        return response;
    }

    @PostMapping("resume/authorize")
    public UserInfoResponse createdInfo(@RequestBody UserInfoReq userInfoReq, HttpServletRequest request){
        if(null == userInfoReq){
            return UserInfoResponse.fail(ResCode.DATA_ERROR);
        }
        UserInfoBo userInfoBo = null;
        try{
            userInfoBo = new UserInfoBo();
            userInfoBo.setUserId(UUID.randomUUID().toString());
            userInfoBo.setOpenId(userInfoReq.getOpenId());
            userInfoBo.setNickName(userInfoReq.getNickName());
            userInfoBo.setAvatarUrl(userInfoReq.getAvatarUrl());
            userInfoBo.setGender(userInfoReq.getGender());
            userInfoService.createNewUser(userInfoBo);
        }catch (Exception e){
            return UserInfoResponse.fail(ResCode.ERROR.getCode(),e.getMessage());
        }
        UserInfoResponse userInfoResponse = UserInfoResponse.success();
        userInfoResponse.setData(userInfoBo);
        return userInfoResponse;
    }
}
