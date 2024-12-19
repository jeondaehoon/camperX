package com.camperxoffice.admin.service;

import com.camperxoffice.admin.dao.adminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class adminService {
    @Autowired
    adminDao dao;
}
