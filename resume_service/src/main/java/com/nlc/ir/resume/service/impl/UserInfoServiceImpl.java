package com.nlc.ir.resume.service.impl;

import com.nlc.ir.resume.dao.UserInfoDao;
import com.nlc.ir.resume.service.UserInfoService;
import com.nlc.ir.resume.service.bo.UserInfoBo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoDao userInfoDao;


    @Override
    public void createNewUser(UserInfoBo userInfoBo) {

    }

    @Override
    public UserInfoBo getUserInfoByOpenId(String openId) {

        return null;
    }
}
