package com.delivery.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delivery.entities.Category;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {


}
