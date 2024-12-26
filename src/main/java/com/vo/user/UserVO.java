package com.vo.user;

import lombok.Data;

@Data
public class UserVO {

    private String userId;
    private String userName;
    private String userPwd;
    private String userEmail;
    private String userPhone;
    private String userBasic;
    private String joinDate;
    private String userStatus;
}
