package com.vo.admin;

import lombok.Data;

@Data
public class AdminVO {

    private String adminId;
    private String adminName;
    private String posDept;
    private String adminEmail;
    private String adminPhone;
    private String adminPwd;
    private String adminStatus;
    private String adminJdt;

    private String[] adminArry;
}
