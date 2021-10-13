package com.delivery.services;

import java.util.List;

import com.delivery.entities.Category;
public interface ICategoryService {


public Category addCategory(Category cat);
public  Category updateCategory( Category cat);
public  Category removeCategory( Category cat);
public  Category viewCategory( Category cat);

public List<Category> viewAllCategory();

}