package com.camperxoffice.order.dao;

import com.vo.order.OrderVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface orderDao {

    public List<OrderVO> setorderSearch(OrderVO vo) throws Exception;
}
