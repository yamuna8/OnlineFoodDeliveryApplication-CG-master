package com.delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.entities.Customer;
import com.delivery.entities.Restaurant;
import com.delivery.services.ICustomerServiceimpl;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
@RestController
@RequestMapping("/Customers")
public class ICustomerController {
	
	@Autowired
	ICustomerServiceimpl iservice;
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Customer addCustomer(@RequestBody Customer customer)
	{
	return	iservice.addCustomer(customer);
	}
	@GetMapping
	public Customer viewCustomer(Customer customer)
	{
		return iservice.viewCustomer(customer);
		
	}
	@PutMapping
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		 return iservice.updateCustomer(customer);
	}
	@DeleteMapping
	public Customer removeCustomer(Customer customer)
	{
		return iservice.removeCustomer(customer);
	}
	
	@GetMapping("/all")
	public List<Customer> viewAllCustomers(Restaurant res)
	{
		return iservice.viewAllCustomers(res);
		
	}
}