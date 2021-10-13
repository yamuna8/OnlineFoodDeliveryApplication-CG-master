package com.delivery;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.delivery.dao.ICustomerRepository;
import com.delivery.entities.Customer;
import com.delivery.services.ICustomerServiceimpl;

@ExtendWith(MockitoExtension.class)
 class ICustomerServiceTest {
	@Mock
	private ICustomerRepository customerRepository;
	@InjectMocks
	private ICustomerServiceimpl customerService;
	
	@Test
	void getAllCustomerTest() {
		List<Customer> list = new ArrayList<Customer>();
		Customer customer1 = new Customer("Vijay","Ganesh","male","vjvijay1999@gmail.com","8056167317");
		list.add(customer1);
		
		when(customerRepository.findAll()).thenReturn(list);
		List<Customer> customerList = customerService.viewAllCustomers(customer1);
		assertEquals(1, customerList.size());
		
	}
	
	//add address
	@Test
	void saveCustomerTest() {
		Customer customer = new Customer("Vijay","Ganesh","male","vjvijay1999@gmail.com","8056167317");
		when(customerRepository.save(customer)).thenReturn(customer);
		Customer savedCustomer = customerService.addCustomer(customer);
		assertThat(savedCustomer).isNotNull();
		assertEquals("Vijay",savedCustomer.getFirstName());
	}
	

}