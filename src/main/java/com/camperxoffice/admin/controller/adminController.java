package com.camperxoffice.admin.controller;

import com.camperxoffice.admin.service.adminService;
import com.camperxoffice.util.Constant;
import com.vo.admin.AdminVO;
import com.vo.common.FileVO;
import com.vo.product.PrdVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class adminController {
    @Autowired
    adminService service;

    @RequestMapping("/camperX_adminadd")
    public String camperX_adminadd() throws Exception {
        return "admin/adminadd";
    }

    @RequestMapping("/camperX_adminRoles")
    public String camperX_adminRoles() throws Exception {
        return "admin/adminRoles";
    }

    @RequestMapping("/admin/search")
    @ResponseBody
    public List<AdminVO> adminsearch(@ModelAttribute AdminVO vo) throws Exception {
        List<AdminVO> list = service.setAdminList(vo);
        System.out.println(list.size());
            return list;
    }

    @RequestMapping("/admin/add")
    @ResponseBody
    public boolean adminAdd(@ModelAttribute AdminVO vo) throws Exception{
        int save = service.adminAdd(vo);
        if(save>0) {
            return true;
        }else {
            return false;
        }
    }

    @RequestMapping("/admin/leave")
    @ResponseBody
    public boolean adminLeave(@ModelAttribute AdminVO vo) throws Exception{
        int c = 0;
        for(int i=0;i<vo.getAdminArry().length;i++) {
            if(vo.getAdminArry()[i]!=null && !"".equals(vo.getAdminArry()[i])) {
                vo.setAdminId(vo.getAdminArry()[i]);
                c+=service.adminLeave(vo);
            }
        }
        if(c>0) {
            return true;
        }else {
            return false;
        }
    }

}
