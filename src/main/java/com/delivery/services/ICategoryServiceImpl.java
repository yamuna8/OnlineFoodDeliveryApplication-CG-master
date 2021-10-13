package com.delivery.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.delivery.dao.ICategoryRepository;
import com.delivery.entities.Category;
@Service
@Transactional

@Component public class ICategoryServiceImpl implements  ICategoryService{
	@Autowired ICategoryRepository caRep;

	public Category addCategory(Category cat) {
		return caRep.save(cat);
	}
	
	public Category updateCategory(Category cat) {
		return updateCategory(cat);
	}
	
	public Category removeCategory(Category cat) {
		 caRep.delete(cat);
		return cat;
	}
	
	public Category viewCategory(Category cat) {
		return null;
	}
	
	public List<Category> viewAllCategory() {
		return caRep.findAll();
	}
}
