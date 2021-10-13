package com.delivery.services;

import com.delivery.entities.FoodCart;
import com.delivery.entities.Item;

public interface ICartService {

	FoodCart addItemToCart(FoodCart cart, Item item);

	FoodCart increaseQuantity(FoodCart cart, Item item, Integer quantity);

	FoodCart reduceQuantity(FoodCart cart, Item item, int quantity);

	FoodCart removeItem(FoodCart cart, Item item);

	FoodCart clearCart(FoodCart cart);

}
