package com.seecen.sc1709.hotel.dao;

import com.seecen.sc1709.hotel.entity.Order;

import java.util.List;

public interface OrderDao {
    /**增加订单*/
    public void add(Order order);
    /** 根据ID删除订单*/
    public boolean delete(int oid);
    /**更新订单信息**/
    public boolean update(Order order);
    /**根据ID查找订单**/
    public Order findOrderById(int oid);
}
