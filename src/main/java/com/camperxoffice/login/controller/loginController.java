package com.camperxoffice.login.controller;

import com.camperxoffice.login.service.loginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {
    @Autowired
    loginService service;

    @RequestMapping("/capmerX_adminloginId")
    public String capmerX_adminloginId() throws Exception {
        return "login/loginId";
    }

    @RequestMapping("/capmerX_adminloginPwd")
    public String capmerX_adminloginPwd() throws Exception {
        return "login/loginPwd";
    }
}
