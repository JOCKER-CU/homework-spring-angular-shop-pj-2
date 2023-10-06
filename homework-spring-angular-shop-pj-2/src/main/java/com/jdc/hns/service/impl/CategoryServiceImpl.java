package com.jdc.hns.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jdc.hns.entity.Category;
import com.jdc.hns.repo.CategoryRepo;
import com.jdc.hns.service.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private  CategoryRepo categoryRepo;
	
	

	@Override
	public Category addCategory(Category category) {
		return categoryRepo.save(category);
	}
	@Override
	public Category editCategory(Category category) {
		return categoryRepo.save(category);
	}
	
	@Override
	public List<Category> getAllCategory() {
		return categoryRepo.findAll();
	}

	@Override
	public Optional<Category> findCategoryById(int id) {	
		Optional<Category> category = categoryRepo.findById(id);
		return category;
	}
				

	@Override
	public void removeCategory(int idCategory) {
		Optional<Category> category = findCategoryById(idCategory);
		category.ifPresent(cat -> {
			categoryRepo.delete(cat);
		});
		
	}
}
