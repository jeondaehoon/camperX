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
}
