package com.camperxoffice.order.service;

import com.camperxoffice.order.dao.orderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class orderService {
    @Autowired
    orderDao dao;
}
