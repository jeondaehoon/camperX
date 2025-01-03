package com.camperxoffice.order.controller;

import com.camperxoffice.order.service.orderService;
import com.vo.order.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class orderController {
    @Autowired
    orderService service;

    @RequestMapping("/camperX_orderProcess")
    public String camperX_orderProcess() throws Exception {
        return "order/orderProcess";
    }

    @RequestMapping("/camperX_orderHistory")
    public String capmerX_orderHistory() throws Exception {
        return "order/orderHistory";
    }

    @RequestMapping("/camperX_orderCancel")
    public String camperX_orderCancel() throws Exception {
        return "order/orderCancel";
    }

    @RequestMapping("/order/search")
    @ResponseBody
    public List<OrderVO> setorderSearch(@ModelAttribute OrderVO vo) throws Exception {
        List<OrderVO> list = service.setorderSearch(vo);
        System.out.println(list.size());
        return list;
    }
}
