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

import com.delivery.entities.Restaurant;
import com.delivery.services.IRestaurantServiceImpl;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/Restaurants")
public class IRestaurantController {
	
	@Autowired
	IRestaurantServiceImpl irservice;
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Restaurant addRestaurant(@RequestBody Restaurant res)
	{
	return	irservice.addRestaurant(res);
	}
	@GetMapping
	public Restaurant viewRestaurant(Restaurant res)
	{
		return irservice.viewRestaurant(res);
		
	}
	@PutMapping
	public Restaurant updateRestaurant(@RequestBody Restaurant res)
	{
		return irservice.updateRestaurant(res);
	}
	@DeleteMapping
	public Restaurant removeRestaurant(Restaurant res)
	{
		return irservice.removeRestaurant(res);
	}

}