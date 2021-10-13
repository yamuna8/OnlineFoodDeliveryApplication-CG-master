package com.delivery.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delivery.entities.Customer;

public interface ICustomerRepository extends JpaRepository<Customer,Integer>{



}