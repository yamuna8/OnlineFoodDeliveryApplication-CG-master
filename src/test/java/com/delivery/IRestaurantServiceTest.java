package com.delivery;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.delivery.dao.IRestaurantRepository;
import com.delivery.entities.Restaurant;
import com.delivery.services.IRestaurantServiceImpl;

@ExtendWith(MockitoExtension.class)
 class IRestaurantServiceTest {
	@Mock
	private IRestaurantRepository restaurantRepository;
	@InjectMocks
	private IRestaurantServiceImpl restaurantService;
	
	@Test
	void getAllRestaurantsTest() {
		List<Restaurant> list = new ArrayList<Restaurant>();
		Restaurant restaurant1 = new Restaurant(1,"springrestaurant", "Vijay","8838191801");
		list.add(restaurant1);
		
		when(restaurantRepository.findAll()).thenReturn(list);
		List<Restaurant> restList = restaurantService.viewAllRestaurants(restaurant1);
		assertEquals(1, restList.size());
		
	}
	
	//add address
	@Test
	void saveRestaurantTest() {
		Restaurant restauarnt = new Restaurant(1,"springrestaurant", "Vijay","8838191801");
		when(restaurantRepository.save(restauarnt)).thenReturn(restauarnt);
		Restaurant savedRestaurant = restaurantService.addRestaurant(restauarnt);
		assertThat(savedRestaurant).isNotNull();
		assertEquals("Vijay",savedRestaurant.getManagerName());
	}
	

}
