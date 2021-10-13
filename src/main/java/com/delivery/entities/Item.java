package com.delivery.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="item_master")
public class Item {

	@Id
	@Column(name="itemid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int itemId;
	@Column
	private String itemName;
	@Column
	public Integer quantity;
	@Column
	private double cost;
	@ManyToOne(targetEntity=FoodCart.class)
	private FoodCart foodcart;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@JsonIgnore
	public FoodCart getFoodcart() {
		return foodcart;
	}
	public void setFoodcart(FoodCart foodcart) {
		this.foodcart = foodcart;
	}
	@OneToOne(mappedBy="item",cascade=CascadeType.ALL)
	
	private Category category;
	@ManyToMany(mappedBy="itemList",cascade=CascadeType.ALL,fetch=FetchType.EAGER)//(targetEntity=Item.class)
										//@JoinColumn(name="itemId")
	private List<Restaurant> restaurants; 
	@JsonIgnore
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
}



