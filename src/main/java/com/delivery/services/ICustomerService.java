package com.delivery.services;

import java.util.List;

import com.delivery.entities.Customer;
import com.delivery.entities.Restaurant;

public interface ICustomerService {
	public Customer addCustomer(Customer customer); 
	public Customer updateCustomer(Customer customer);
	public Customer removeCustomer(Customer customer);
	public Customer viewCustomer(Customer customer);
	public List<Customer> viewAllCustomers(Customer customer);
	List<Customer> viewAllCustomers(Restaurant res);
}