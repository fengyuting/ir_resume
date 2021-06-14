package com.nlc.ir.resume.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
    }

}
