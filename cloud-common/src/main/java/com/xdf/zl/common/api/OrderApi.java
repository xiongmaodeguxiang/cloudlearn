package com.xdf.zl.common.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author:zhanglin
 * @Description:
 * @Date： 2020/7/23 10:52
 */
@FeignClient(value = "order-service" ,path = "/order")
public interface OrderApi {
    @PostMapping("/doOrder")
    String doOrder(@RequestParam("name") String name, @RequestParam("price")Integer price);
}
