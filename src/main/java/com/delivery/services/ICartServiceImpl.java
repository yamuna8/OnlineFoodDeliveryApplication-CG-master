package com.delivery.services;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.delivery.dao.ICartRepository;
import com.delivery.entities.Customer;
import com.delivery.entities.FoodCart;
import com.delivery.entities.Item;
@Service

@Transactional

@Component
public class ICartServiceImpl implements ICartService {
	@Autowired
	ICartRepository icrRep;
	
	public FoodCart addItemToCart(FoodCart cart, Item item) {
		return icrRep.save(cart);
		
		
	}


	public FoodCart increaseQuantity(FoodCart cart, Item item, Integer quantity) {
		//quantity+=quantity;
		//quantity+=item.getQuantity();
		
		
		FoodCart cart1=icrRep.findById(cart.getCartId()).orElseThrow(()-> new EntityNotFoundException("No data found!"));
		quantity+=item.getQuantity();
		item.setQuantity(quantity);
					//return icrRep.update(cart,item,quantity);
		//item.setQuantity(item.getQuantity());
		return icrRep.save(cart);
	}

	public FoodCart reduceQuantity(FoodCart cart, Item item, int quantity) {

		FoodCart cart1=icrRep.findById(cart.getCartId()).orElseThrow(()-> new EntityNotFoundException("No data found!"));
		quantity-=item.getQuantity();
		item.setQuantity(quantity);
		return icrRep.save(cart);
	}

	public FoodCart removeItem(FoodCart cart, Item item) {
		icrRep.deleteById(item.getItemId());
		return null;
	}


	public FoodCart clearCart(FoodCart cart) {
		icrRep.delete(cart);
		return null;
	}

}
