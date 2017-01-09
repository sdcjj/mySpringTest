package com.xd.test.test1.controller;

import com.xd.test.test1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by xiaodong.li on 2017/1/6.
 */
@Controller
@RequestMapping("/yy/")
public class IndexController extends BaseController {

    @RequestMapping("index")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
//        Map<String, Object> map = orderService.getOrderById(2);
//        mv.addObject("data", map.get("data"));
        return mv;
    }
}
