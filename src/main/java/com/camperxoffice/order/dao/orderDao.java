package com.camperxoffice.order.dao;

import com.vo.order.OrderVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface orderDao {

    public List<OrderVO> setorderSearch(OrderVO vo) throws Exception;

    public int orderShipped(OrderVO vo) throws Exception;

    public int orderDelivered(OrderVO vo) throws Exception;

    public List<OrderVO> HistoryList(OrderVO vo) throws Exception;

    public List<OrderVO> ReturnList(OrderVO vo) throws Exception;
}
