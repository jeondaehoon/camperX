package com.vo.order;

import lombok.Data;

@Data
public class OrderVO {

    private String ordCode;
    private String userId;
    private String prdName;
    private String buyQty;
    private String returnStatus;
}
