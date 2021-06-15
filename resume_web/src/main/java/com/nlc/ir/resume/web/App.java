package com.nlc.ir.resume.web;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

/**
 * @Description: web入口
 * @Author fengyuting
 * @Date 2021/6/14
 **/

@SpringBootApplication
public class App {



    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication(App.class);
        springApplication.run(args);
        System.out.println("welcome to nlc ir resume");

        String url = "https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code";

        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = null;
        try {
            try {

                response = httpClient.execute(httpGet);
                HttpEntity entity = response.getEntity();

            } catch (IOException e) {


            } finally {

                if (response != null) {
                    response.close();
                }
            }
        } catch (Exception e) {

        }


    }

}
