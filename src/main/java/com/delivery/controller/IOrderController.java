package com.delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.delivery.entities.OrderDetails;
import com.delivery.services.IOrderServiceImpl;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
@RestController
@RequestMapping("/Orders")
public class IOrderController {
	
	@Autowired
	IOrderServiceImpl iservice;
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public OrderDetails addOrder(@RequestBody OrderDetails order)
	{
	return	iservice.addOrder(order);
	}
	@GetMapping
	public OrderDetails viewOrder(OrderDetails order)
	{
		return iservice.viewOrder(order);
		
	}
	@PutMapping
	public OrderDetails updateOrder(@RequestBody OrderDetails order)
	{
		return iservice.updateOrder(order);
	}
	@DeleteMapping
	public OrderDetails removeOrder(OrderDetails order)
	{
		return iservice.deleteOrder(order);
	}

}