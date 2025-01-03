package com.vo.product;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.multipart.MultipartFile;

@Data
public class PrdVO {

    private String prdCode;
    private String prdName;
    private String prdColor;
    private String price;
    private String prdDesc;
    private String prdImg;
    private String safetyStock;
    private String prdQty;
    private String catName;
    private String prdStatus;

    private String catCode;
    private String mainCode;
    private String subCode;

    @JsonIgnore
    private MultipartFile prdImgFile;

    private String[] stockArry;
}
