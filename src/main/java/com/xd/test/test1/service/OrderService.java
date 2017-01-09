package com.xd.test.test1.service;

import java.util.Map;
import java.util.logging.StreamHandler;

/**
 * Created by xiaodong.li on 2017/1/6.
 */
public interface OrderService {
    Map<String,Object> getOrderById(long salesOrderId);
}
