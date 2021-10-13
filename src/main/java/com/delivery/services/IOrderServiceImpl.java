package com.delivery.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delivery.dao.IOrderRepository;
import com.delivery.entities.Customer;
import com.delivery.entities.OrderDetails;
import com.delivery.entities.Restaurant;
@Service
@Transactional
public class IOrderServiceImpl implements IOrderService{
	@Autowired
	IOrderRepository ioRep;
	@Override
	public OrderDetails addOrder(OrderDetails order) {
		
		return ioRep.save(order);
	}

	@Override
	public OrderDetails viewOrder(OrderDetails order) {
		
		return ioRep.findById(order.getOrderId()).orElseThrow(()->new EntityNotFoundException("No details!"));
	}

	@Override
	public OrderDetails updateOrder(OrderDetails order) {
		OrderDetails od=ioRep.findById(order.getOrderId()).orElseThrow(()->new EntityNotFoundException("No details!"));
		return null;
	}

	public OrderDetails deleteOrder(OrderDetails order) {
		ioRep.delete(order);
		return null;
	}



	@Override
	public Restaurant viewRestaurantByLocation(String location) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDetails> viewAllOrders(Restaurant res) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderDetails> viewAllOrders(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
