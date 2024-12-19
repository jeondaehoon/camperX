package com.camperxoffice.stock.service;

import com.camperxoffice.stock.dao.stockDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class stockService {
    @Autowired
    stockDao dao;
}
