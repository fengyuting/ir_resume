package com.nlc.ir.resume.service.impl;

import com.nlc.ir.resume.dao.UserInfoDao;
import com.nlc.ir.resume.domain.resume.UserInfo;
import com.nlc.ir.resume.service.UserInfoService;
import com.nlc.ir.resume.service.bo.UserInfoBo;
import com.nlc.ir.resume.service.common.AppException;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserInfoDao userInfoDao;


    @Override
    public void createNewUser(UserInfoBo userInfoBo) {
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(userInfoBo,userInfo);
        int i =  userInfoDao.insertSelective(userInfo);
        if(i != 1){
            throw  new AppException("授权失败");
        }
    }

    @Override
    public UserInfoBo getUserInfoByOpenId(String openId) {
        UserInfo userInfo =   userInfoDao.selectByOpenId(openId);
        UserInfoBo userInfoBo = new UserInfoBo();
        BeanUtils.copyProperties(userInfo,userInfoBo);
        return userInfoBo;
    }
}
