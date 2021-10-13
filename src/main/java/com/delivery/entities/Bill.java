package com.delivery.entities;

import java.time.LocalDateTime;
import java.util.Collection;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="bill1")
public class Bill {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="billId")
private int billId;
@Column
private LocalDateTime billDate;
@OneToOne(mappedBy="bill")
@JoinColumn(name="billId")
private OrderDetails order;
public int getBillId() {
return billId;
}
public void setBillId(int billId) {
this.billId = billId;
}
public LocalDateTime getBillDate() {
return billDate;
}
public void setBillDate(LocalDateTime billDate) {
this.billDate = billDate;
}

//@JsonIgnore
  public OrderDetails getOrder() { return order; }
  public void  setOrder(OrderDetails order) { this.order = order; }

public int getTotalItem() {
return totalItem;
}
public void setTotalItem(int totalItem) {
this.totalItem = totalItem;
}
public double getTotalCost() {
return totalCost;
}
public void setTotalCost(double totalCost) {
this.totalCost = totalCost;
}
@Column
private int totalItem;
@Column
private double totalCost;


}