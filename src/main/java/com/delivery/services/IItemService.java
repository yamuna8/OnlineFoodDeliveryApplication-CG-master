package com.delivery.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.delivery.entities.Category;
import com.delivery.entities.Item;
import com.delivery.entities.Restaurant;

@Service
public interface IItemService {

public Item addItem(Item item);
public Item updateItem(Item item);
public Item viewItem(Item item);
public Item removeItem(Item item);
public List<Item> viewAllItems(Category cat);
public List<Item> viewAllItems(Restaurant res);
public List<Item> viewAllItemsByName(String name);
}
