package com.camperxoffice.admin.service;

import com.camperxoffice.admin.dao.adminDao;
import com.vo.admin.AdminVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class adminService {
    @Autowired
    adminDao dao;

    public List<AdminVO> setAdminList(AdminVO vo) throws Exception {
        return dao.setAdminList(vo);
    }

    public int adminAdd(AdminVO vo) throws Exception {
        return dao.adminAdd(vo);
    }

    public int adminLeave(AdminVO vo) throws Exception {
        return dao.adminLeave(vo);
    }
}
