package com.camperxoffice.order.controller;

import com.camperxoffice.order.service.orderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class orderController {
    @Autowired
    orderService service;

    @RequestMapping("/capmerX_orderProcess")
    public String capmerX_orderProcess() throws Exception {
        return "order/orderProcess";
    }

    @RequestMapping("/capmerX_orderHistory")
    public String capmerX_orderHistory() throws Exception {
        return "order/orderHistory";
    }

    @RequestMapping("/capmerX_orderCancel")
    public String capmerX_orderCancel() throws Exception {
        return "order/orderCancel";
    }

}
