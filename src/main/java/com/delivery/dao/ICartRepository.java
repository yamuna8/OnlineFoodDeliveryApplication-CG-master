package com.delivery.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delivery.entities.FoodCart;
import com.delivery.entities.Item;

public interface ICartRepository extends JpaRepository<FoodCart, Integer>{



}
