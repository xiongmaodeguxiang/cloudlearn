package com.xdf.zl.account.controller;

import com.netflix.discovery.converters.Auto;
import com.xdf.zl.common.api.OrderApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:zhanglin
 * @Description:
 * @Date： 2020/7/23 11:07
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderApi orderApi;
    @RequestMapping("/doOrder")
    public String doOrder(){
        return orderApi.doOrder("苹果电脑",7200);
    }
}
