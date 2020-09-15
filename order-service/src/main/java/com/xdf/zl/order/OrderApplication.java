package com.xdf.zl.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class OrderApplication{
    public static void main( String[] args ){
        ApplicationContext ctx = SpringApplication.run(OrderApplication.class,args);
        while (true){
            String env = ctx.getEnvironment().getProperty("current.env");
            String userName = ctx.getEnvironment().getProperty("ur.name");
            String age = ctx.getEnvironment().getProperty("ur.age");
            String single = ctx.getEnvironment().getProperty("singe");
            System.out.println("===当前环境："+env + "，userName:"+userName + ",age:"+age+",single:"+single);
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
