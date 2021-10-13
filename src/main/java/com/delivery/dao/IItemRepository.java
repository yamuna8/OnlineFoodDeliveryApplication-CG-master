package com.delivery.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.delivery.entities.Category;
import com.delivery.entities.Item;
import com.delivery.entities.Restaurant;

public interface IItemRepository extends JpaRepository<Item,Integer>{
@Query("Select c From Category c")
	List<Item> findAllItems(Category cat);
@Query("Select r From Restaurant r")
	List<Item> findAllItem(Restaurant res);
@Query("Select i From Item i where item_name=?1")
	List<Item> find(String name);

}