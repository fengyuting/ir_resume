package com.nlc.ir.resume.service.common;

import com.nlc.ir.resume.domain.httpUtils.HttpResult;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @Description: http执行器
 * @Author fengyuting
 * @Date 2021/6/16
 **/
@Service
public class HttpExecutor {
    private Logger logger = LoggerFactory.getLogger(HttpExecutor.class);

    /**
     * http-get
     * @param url
     * @return
     */
    public HttpResult doGet(String url, String paramStr) {
        // 创建http GeT请求
        if(!StringUtils.hasLength(url)){
            return null;
        }

        StringBuilder httpUrl = new StringBuilder(url).append("&").append(paramStr);
        HttpGet httpGet = new HttpGet(httpUrl.toString());
        httpGet.addHeader("Content-Type", "application/x-www-form-urlencoded");
        CloseableHttpResponse response = null;

        try {
            CloseableHttpClient httpclient = HttpClients.createDefault();
            // 执行请求
            response = httpclient.execute(httpGet);
            // 判断返回状态是否为200
            return new HttpResult(response.getStatusLine().getStatusCode(),
                    EntityUtils.toString(response.getEntity(), "UTF-8"));
        } catch (Exception e) {
            logger.error("HttpExecutor-doGet,exception",e);
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
            } catch (Exception e) {
                logger.error("HttpExecutor-doGet-closed-exception",e);
            }
        }
        return null;
    }

}
