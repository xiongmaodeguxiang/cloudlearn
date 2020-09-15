package com.xdf.zl.order.apiimpl;

import com.xdf.zl.common.api.OrderApi;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Author:zhanglin
 * @Description:
 * @Date： 2020/7/23 11:05
 */
@Service
@RestController
@RequestMapping("/order")
public class OrderApiImpl implements OrderApi {

    @Override
    @RequestMapping("/doOrder")
    public String doOrder(@RequestParam("name") String name, @RequestParam("price")Integer price) {
        return "商品："+name + "，价格：" + price +"下单成功";
    }
}
