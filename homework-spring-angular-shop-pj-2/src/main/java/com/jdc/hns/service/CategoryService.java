package com.jdc.hns.service;

import java.util.List;
import java.util.Optional;

import com.jdc.hns.entity.Category;

public interface CategoryService {

	
	public Category addCategory(Category category) ;
	
	public  Category editCategory(Category category);
	
	public void removeCategory(int idCategory);
	
	public List<Category> getAllCategory();
	
	public Optional<Category> findCategoryById(int id);
}
