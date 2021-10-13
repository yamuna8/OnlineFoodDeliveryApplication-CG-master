package com.delivery.controller;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.entities.Bill;
import com.delivery.services.IBillServiceImpl;



@RestController

@RequestMapping("/Bills")

@Component
public class IBillController {

@Autowired(required=true)
IBillServiceImpl ibService;

@PostMapping
 
 @ResponseStatus(HttpStatus.CREATED)
 public Bill addBill(@RequestBody Bill bill)
 {
 return ibService.addBill(bill);
 }
 
 @GetMapping
 public Bill viewBill(Bill bill)
 { return ibService.viewBill(bill);
 
 }
 
 @PutMapping("/updateBill")
 public Bill updateBill(@RequestBody Bill bill)
 {
 return ibService.updateBill(bill);
 
 }
 @DeleteMapping
 public Bill removeBill(Bill bill) {
 return ibService.removeBill(bill);
 
 }
 @GetMapping("/sumOfTotalCost")
 public double CalaculateTotalCost(Bill bill)
 { return ibService.CalculateTotalCost(bill);
 
 }
 @GetMapping("/allBills")
 public List<Bill> viewBills(Bill bill)
 { return ibService.viewBills(bill);
 
 }
 
 @GetMapping("/findByDate")
 public List<Bill> viewBills(LocalDateTime date)
 { return ibService.viewBills(date);
 
 }

}