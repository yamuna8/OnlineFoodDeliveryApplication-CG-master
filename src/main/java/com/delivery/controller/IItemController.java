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

import com.delivery.entities.Item;
import com.delivery.services.IItemServiceImpl;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/Items")
public class IItemController {
	
	
	@Autowired
	IItemServiceImpl itservice;
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Item addItem (@RequestBody Item  item)
	{
	return	itservice.addItem ( item);
	}
	@GetMapping
	public Item  viewItem (Item  item)
	{
		return itservice.viewItem ( item);
		
	}
	@PutMapping
	public Item  updateItem (@RequestBody Item  item)
	{
		return itservice.updateItem ( item);
	}
	@DeleteMapping
	public Item  removeCustomer(Item  item)
	{
		return itservice.removeItem ( item);
	}

}