package com.camperxoffice.stock.service;

import com.camperxoffice.stock.dao.stockDao;
import com.vo.category.CatVO;
import com.vo.product.PrdVO;
import com.vo.stock.StockVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Service
public class stockService {
    @Autowired
    stockDao dao;

    public List<CatVO> selectCatList(CatVO vo) throws Exception {
        return dao.selectCatList(vo);
    }

    public int SavePrdInfo(@ModelAttribute PrdVO vo) throws Exception {
        return dao.SavePrdInfo(vo);
    }

    public List<PrdVO> setStockList(PrdVO vo) throws Exception {
        return dao.setStockList(vo);
    }

    public List<StockVO> setStockListinfo(StockVO vo) throws Exception {
        return dao.setStockListinfo(vo);
    }

    public List<StockVO> setStockDateLog(StockVO vo) throws Exception {
        return dao.setStockDateLog(vo);
    }

}

