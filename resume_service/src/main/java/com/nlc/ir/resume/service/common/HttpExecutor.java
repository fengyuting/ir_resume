package com.nlc.ir.resume.service.common;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: http执行器
 * @Author fengyuting
 * @Date 2021/6/16
 **/
@Service
public class HttpExecutor {

    @Autowired
    private CloseableHttpClient httpsClient;


    /**
     * http-get
     * @param url
     * @return
     */
    public String doGet(String url) {
        // 创建http GeT请求
        HttpGet httpGet = new HttpGet(url);
        httpGet.addHeader("Content-Type", "application/x-www-form-urlencoded");
        CloseableHttpResponse response = null;
        try {
            // 执行请求
            response = httpsClient.execute(httpGet);
            // 判断返回状态是否为200
            return EntityUtils.toString(response.getEntity(), "UTF-8");
        } catch (Exception e) {

        } finally {
            try {
                if (response != null) {
                    response.close();
                }
            } catch (Exception e) {

            }
        }
        return null;
    }

}
