package com.nlc.ir.resume.service;

import com.nlc.ir.resume.service.bo.UserInfoBo;

public interface UserInfoService {

    /**
     * 生成用户信息
     */
    void createNewUser(UserInfoBo userInfoBo);

    /**
     * 获取用户信息
     * @param openId
     * @return
     */
    UserInfoBo getUserInfoByOpenId(String openId);
}
