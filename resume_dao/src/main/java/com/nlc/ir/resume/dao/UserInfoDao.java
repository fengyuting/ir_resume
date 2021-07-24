package com.nlc.ir.resume.dao;


import com.nlc.ir.resume.domain.resume.UserInfo;

public interface UserInfoDao {
    int deleteByPrimaryKey(Long id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}