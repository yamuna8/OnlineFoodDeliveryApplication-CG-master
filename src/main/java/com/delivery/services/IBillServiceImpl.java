package com.delivery.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.delivery.dao.IBillRepository;
import com.delivery.entities.Bill;


@Service

@Transactional

@Component
public class IBillServiceImpl implements IBillService{

@Autowired
IBillRepository ibRep;
@Override
public Bill addBill(Bill bill) {

return ibRep.save(bill);
}

@Override
public Bill updateBill(Bill bill) {
	
return updateBill(bill);
}

@Override
public Bill removeBill(Bill bill) {
ibRep.delete(bill);
return null;
}

@Override
public Bill viewBill(Bill bill)  {
	
	return ibRep.findOne(bill);
	
}


  public List<Bill> viewBills(LocalDateTime date)
  { 
  
return ibRep.findBills(date); }

 public List<Bill> viewBills(Bill bill) { 
 
	 	return ibRep.viewBill(bill); }
 


public double CalculateTotalCost(Bill bill) {
	return ibRep.findTotalCost(bill);
}

@Override
public List<Bill> viewBills(String custid) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public double calculateTotalCost(Bill bill) {
	// TODO Auto-generated method stub
	return 0;
}




}