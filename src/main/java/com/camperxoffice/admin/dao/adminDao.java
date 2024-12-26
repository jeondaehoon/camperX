package com.camperxoffice.admin.dao;

import com.vo.admin.AdminVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface adminDao {

    public List<AdminVO> setAdminList(AdminVO vo) throws Exception;

    public int adminAdd(AdminVO vo) throws Exception;

    public int adminLeave(AdminVO vo) throws Exception;
}
