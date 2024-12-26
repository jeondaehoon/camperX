package com.vo.stock;

import lombok.Data;

@Data
public class StockVO {

    private String prdCode;
    private String stockSeq;
    private String stockDate;
    private String price;
    private String currentStock;
    private String stockStatus;
}
