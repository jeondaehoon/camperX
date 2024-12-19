package com.camperxoffice.login.service;

import com.camperxoffice.login.dao.loginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class loginService {
    @Autowired
    loginDao dao;
}
