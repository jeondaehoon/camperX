package com.camperxoffice.stock.controller;

import com.camperxoffice.common.service.FileService;
import com.camperxoffice.stock.service.stockService;
import com.camperxoffice.util.Constant;
import com.vo.category.CatVO;
import com.vo.common.FileVO;
import com.vo.product.PrdVO;

import com.vo.stock.StockVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class stockController {
    @Autowired
    stockService service;

    @Autowired
    FileService fileservice;

    @RequestMapping("/camperX_stockInfo")
    public String camperX_stockInfo() throws Exception {
        return "stock/stockInfo";
    }

    @RequestMapping("/camperX_stockLog")
    public String camperX_stockLog() throws Exception {
        return "stock/stockLog";
    }

    @RequestMapping("/cat/search")
    @ResponseBody
    public List<CatVO> catsearch(@ModelAttribute CatVO vo)
        throws Exception {
        if(vo.getCatLv()==null || "".equals(vo.getCatLv())) {
            vo.setCatLv("1");
        }
        List<CatVO> list = service.selectCatList(vo);
        return list;
    }


    @RequestMapping("stock/prdadd")
    @ResponseBody
    public boolean SavePrd(@ModelAttribute PrdVO vo) throws Exception{
        //file Upload
        if(vo.getPrdImgFile() != null) {
            FileVO fvo = new FileVO();
            fvo.setFile(vo.getPrdImgFile());
            fvo.setOriginPath(Constant.UPLOAD_PATH);
            fvo = fileservice.createFile(fvo);
            vo.setPrdImg(Constant.IMAGE_PATH + "/"+ fvo.getFileNm());
        }else {
            vo.setPrdImg("");
        }
        if(vo.getSubCode()!=null && !"".equals(vo.getSubCode())){
            vo.setCatCode(vo.getSubCode());
        }else if(vo.getMainCode()!=null && !"".equals(vo.getMainCode())) {
            vo.setCatCode(vo.getMainCode());
        }
        int save = service.SavePrdInfo(vo);
        if(save>0) {
            return true;
        }else {
            return false;
        }
    }

    @RequestMapping("/stock/search")
    @ResponseBody
    public List<PrdVO> setStockList(@ModelAttribute PrdVO vo) throws Exception {
        List<PrdVO> list = service.setStockList(vo);
        System.out.println(list.size());
        return list;
    }

    @RequestMapping("/stock/stocklist")
    @ResponseBody
    public List<StockVO> setStockListinfo(@ModelAttribute StockVO vo) throws Exception {
        List<StockVO> list = service.setStockListinfo(vo);
        System.out.println(list.size());
        return list;
    }

    @RequestMapping("/stock/DateLog")
    @ResponseBody
    public List<StockVO> setStockDateLog(@ModelAttribute StockVO vo) throws Exception {
        List<StockVO> list = service.setStockDateLog(vo);
        System.out.println(list.size());
        return list;
    }

}

