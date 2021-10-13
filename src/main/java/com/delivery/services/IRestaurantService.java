package com.delivery.services;

import java.util.List;

import com.delivery.entities.Restaurant;

public interface IRestaurantService {
	
	public Restaurant addRestaurant(Restaurant res);
	public Restaurant updateRestaurant(Restaurant res);
	public Restaurant removeRestaurant(Restaurant res);
	public Restaurant viewRestaurant(Restaurant res);
	public List<Restaurant> getAllRestaurantByLocation(String location);
	public List<Restaurant> viewRestaurantByItemName(String name);
	

}
