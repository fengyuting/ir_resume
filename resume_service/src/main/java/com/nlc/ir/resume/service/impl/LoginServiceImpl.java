package com.nlc.ir.resume.service.impl;

import com.alibaba.fastjson.JSON;
import com.nlc.ir.resume.domain.httpUtils.HttpResult;
import com.nlc.ir.resume.domain.login.WechatAuthBean;
import com.nlc.ir.resume.service.LoginService;
import com.nlc.ir.resume.service.common.HttpExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * @Description: 登录逻辑
 * @Author fengyuting
 * @Date 2021/6/15
 **/
@Service("loginService")
public class LoginServiceImpl implements LoginService {
    private Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

    /**
     * 获取openId-Url
     */
    private static String LOGIN_URL="https://api.weixin.qq.com/sns/jscode2session?";
    /**
     * 小程序ID
     */
    private static String APP_ID="wxdb36ab47fde518ae";

    /**
     * 小程序密钥
     */
    private static String SECRET="";

    /**
     * 授权类型
     */
    private static String GRANT_TYPE="authorization_code";


    @Resource
    private HttpExecutor httpExecutor;


    @Override
    public WechatAuthBean login(String jsCode) {
        try{
            StringBuilder paramBuilder = new StringBuilder("appid=").append(APP_ID)
                    .append("&secret=").append(SECRET)
                    .append("&js_code=").append(jsCode)
                    .append("&grant_type=").append(GRANT_TYPE);
            HttpResult result =  httpExecutor.doGet(LOGIN_URL,paramBuilder.toString());
            logger.info("login-result:{}",result.toString());
            if (null != result) {
                String content = result.getContent();
                if(!StringUtils.hasLength(content)){
                    return null;
                }
              return  JSON.parseObject(result.getContent(), WechatAuthBean.class);
            }
        }catch (Exception e){
            logger.error("LoginService-login-exception",e);
        }
        return null;
    }
}
