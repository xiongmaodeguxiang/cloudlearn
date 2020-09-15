package com.xdf.zl.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableFeignClients(basePackages = "com.xdf.zl")
@EnableEurekaClient
public class AccountApplication{
    public static void main( String[] args ){
        ApplicationContext ctx = SpringApplication.run(AccountApplication.class,args);
        while (true){
            String env = ctx.getEnvironment().getProperty("current.env");
            String userName = ctx.getEnvironment().getProperty("user.name");
            String age = ctx.getEnvironment().getProperty("user.age");
            System.out.println("===当前环境："+env + "，userName:"+userName + ",age:"+age);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
