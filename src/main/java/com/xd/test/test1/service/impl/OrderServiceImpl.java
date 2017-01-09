package com.xd.test.test1.service.impl;

import com.xd.test.test1.service.OrderService;

import java.util.HashMap;
import java.util.Map;
/**
 * Created by xiaodong.li on 2017/1/6.
 */
public class OrderServiceImpl implements OrderService {
    public Map<String, Object> getOrderById(long salesOrderId) {
        Map<String, Object> result=new HashMap<String, Object>();
        result.put("data","我的请求");
        return result;
    }
}
