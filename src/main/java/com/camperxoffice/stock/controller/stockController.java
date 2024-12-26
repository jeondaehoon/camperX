package com.camperxoffice.stock.controller;

import com.camperxoffice.stock.service.stockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class stockController {
    @Autowired
    stockService service;

    @RequestMapping("/capmerX_stockInfo")
    public String capmerX_stockInfo() throws Exception {
        return "stock/stockInfo";
    }

    @RequestMapping("/capmerX_stockLog")
    public String capmerX_stockLog() throws Exception {
        return "stock/stockLog";
    }

    @RequestMapping("/capmerX_stockAlert")
    public String capmerX_stockAlert() throws Exception {
        return "stock/stockAlert";
    }
}
