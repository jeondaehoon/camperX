package com.camperxoffice.admin.controller;

import com.camperxoffice.admin.service.adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class adminController {
    @Autowired
    adminService service;

    @RequestMapping("/capmerX_adminadd")
    public String capmerX_adminadd() throws Exception {
        return "admin/adminadd";
    }

    @RequestMapping("/capmerX_adminRoles")
    public String capmerX_adminRoles() throws Exception {
        return "admin/adminRoles";
    }
}
