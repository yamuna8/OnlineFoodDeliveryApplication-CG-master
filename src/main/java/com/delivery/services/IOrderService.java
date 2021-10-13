package com.delivery.services;

import java.util.List;

import com.delivery.entities.Customer;
import com.delivery.entities.OrderDetails;
import com.delivery.entities.Restaurant;

public interface IOrderService {
    
	public OrderDetails addOrder(OrderDetails order);
	public OrderDetails updateOrder(OrderDetails order);
	public OrderDetails deleteOrder(OrderDetails order);
	public OrderDetails viewOrder(OrderDetails order);
	public Restaurant viewRestaurantByLocation(String location);
	public List<OrderDetails> viewAllOrders(Restaurant res);
	public List<OrderDetails> viewAllOrders(Customer customer);
}