package com.seecen.sc1709.hotel.entity;

import java.util.Date;

public class DinnerTable {
  private int did;//餐桌ID
  private String tableName;//餐桌名称
  private int tableState;//餐桌状态
  private Date orderDate;//预定时间

  @Override
  public String toString() {
    return "DinnerTable{" +
            "did=" + did +
            ", tableName='" + tableName + '\'' +
            ", tableState=" + tableState +
            ", orderDate=" + orderDate +
            '}';
  }

  public int getDid() {
    return did;
  }

  public void setDid(int did) {
    this.did = did;
  }

  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public int getTableState() {
    return tableState;
  }

  public void setTableState(int tableState) {
    this.tableState = tableState;
  }

  public Date getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
  }

  public DinnerTable(int did, String tableName, int tableState, Date orderDate) {
    this.did = did;
    this.tableName = tableName;
    this.tableState = tableState;
    this.orderDate = orderDate;
  }

  public DinnerTable() {
  }
}
