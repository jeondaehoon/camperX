package com.camperxoffice.order.service;

import com.camperxoffice.order.dao.orderDao;
import com.vo.order.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class orderService {
    @Autowired
    orderDao dao;

    public List<OrderVO> setorderSearch(OrderVO vo) throws Exception {
        return dao.setorderSearch(vo);
    }

    public int orderShipped(OrderVO vo) throws Exception {
        return dao.orderShipped(vo);
    }

    public int orderDelivered(OrderVO vo) throws Exception {
        return dao.orderDelivered(vo);
    }

    public List<OrderVO> HistoryList(OrderVO vo) throws Exception {
        return dao.HistoryList(vo);
    }

    public List<OrderVO> ReturnList(OrderVO vo) throws Exception {
        return dao.ReturnList(vo);
    }
}
