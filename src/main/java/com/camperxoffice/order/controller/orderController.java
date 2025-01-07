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
        return list;
    }

    @RequestMapping("/order/Shipped")
    @ResponseBody
    public boolean orderShipped(@ModelAttribute OrderVO vo) throws Exception{
        if (vo.getOrderArry() == null || vo.getOrderArry().length == 0) {
            return false;
        }
        int c = 0;
        for (int i = 0; i < vo.getOrderArry().length; i++) {
            if (vo.getOrderArry()[i] != null && !"".equals(vo.getOrderArry()[i])) {
                OrderVO newVo = new OrderVO();
                newVo.setOrdCode(vo.getOrderArry()[i]);
                c += service.orderShipped(newVo);
            }
        }
        return c > 0;
    }

    @RequestMapping("/order/Delivered")
    @ResponseBody
    public boolean orderDelivered(@ModelAttribute OrderVO vo) throws Exception{
        if (vo.getOrderArry() == null || vo.getOrderArry().length == 0) {
            return false;
        }
        int c = 0;
        for (int i = 0; i < vo.getOrderArry().length; i++) {
            if (vo.getOrderArry()[i] != null && !"".equals(vo.getOrderArry()[i])) {
                OrderVO newVo = new OrderVO();
                newVo.setOrdCode(vo.getOrderArry()[i]);
                c += service.orderDelivered(newVo);
            }
        }
        return c > 0;
    }

    @RequestMapping("/order/history")
    @ResponseBody
    public List<OrderVO> HistoryList(@ModelAttribute OrderVO vo) throws Exception {
        List<OrderVO> list = service.HistoryList(vo);
        return list;
    }

    @RequestMapping("/order/Return")
    @ResponseBody
    public List<OrderVO> ReturnList(@ModelAttribute OrderVO vo) throws Exception {
        List<OrderVO> list = service.ReturnList(vo);
        return list;
    }
}

