package com.delivery.services;

import java.time.LocalDate;
import java.util.List;

import com.delivery.entities.Bill;

public interface IBillService {
	public Bill addBill(Bill bill);
	public Bill updateBill(Bill bill);
	public Bill removeBill(Bill bill);
	public Bill viewBill(Bill bill);
	
	public List<Bill> viewBills(String custid);
	public double calculateTotalCost(Bill bill);
}