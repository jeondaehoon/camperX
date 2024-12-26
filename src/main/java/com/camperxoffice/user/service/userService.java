package com.camperxoffice.user.service;

import com.camperxoffice.user.dao.userDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class userService {
    @Autowired
    userDao dao;
}
