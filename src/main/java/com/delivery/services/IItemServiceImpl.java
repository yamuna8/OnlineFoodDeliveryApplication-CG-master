package com.delivery.services;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component; 
import org.springframework.stereotype.Service;

import com.delivery.dao.IItemRepository;
import com.delivery.entities.Category;
import com.delivery.entities.Item; 
import com.delivery.entities.Restaurant;

@Service
@Transactional
@Component public class IItemServiceImpl implements IItemService {

@Autowired IItemRepository itRep;

public Item addItem(Item item) {

return itRep.save(item); }


public Item updateItem(Item item) {

return updateItem(item); }


public Item viewItem(Item item) {

return (Item) itRep.findAll(); }


public Item removeItem(Item item) { //return null;

itRep.delete(item); return null;

}


public List<Item> viewAllItems(Category cat) {
return null;

//return itRep.findAll(cat);
}


public List<Item> viewAllItems(Restaurant res) {
return null;

// return itRep.findAll(res);
}


public List<Item> viewAllItemsByName(String name) {
return null;

//return itRep.findAllByName(name);
}


}