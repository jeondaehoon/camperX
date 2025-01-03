package com.camperxoffice.user.controller;

import com.camperxoffice.user.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class userController {
    @Autowired
    userService service;

    @RequestMapping("/camperX_userInfo")
    public String capmerX_userInfo() throws Exception {
        return "user/userInfo";
    }

    @RequestMapping("/camperX_userService")
    public String capmerX_userService() throws Exception {
        return "user/userService";
    }
}
