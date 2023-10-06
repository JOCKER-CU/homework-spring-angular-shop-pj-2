package com.jdc.hns.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jdc.hns.entity.Category;
import com.jdc.hns.service.impl.CategoryServiceImpl;

import lombok.NoArgsConstructor;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/category")
@NoArgsConstructor
public class CategoryController {

	@Autowired
	private CategoryServiceImpl categoryService;
	

	public CategoryController(CategoryServiceImpl categoryService) {
		this.categoryService = categoryService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Category>> getProductSize() {
		List<Category> categories = categoryService.getAllCategory();
		return new ResponseEntity<>(categories, HttpStatus.OK);

	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Category> getCategoryById(@PathVariable("id") int id) {
		// style 1
//		Optional<Category> category = categoryService.findCategoryById(id);
//		if(category.isPresent()) {
//			return ResponseEntity.ok(category);
//		}else {
//			return new ResponseEntity(HttpStatus.NO_CONTENT);
//		}
		// style 2
//		return ResponseEntity.of(categoryService.findCategoryById(id));
		return categoryService.findCategoryById(id).map(ResponseEntity::ok)
				.orElseGet(() -> ResponseEntity.noContent().build());

	}
	
	@PostMapping("/add")
	public ResponseEntity<Category> addCategory(@RequestBody Category category){
		Category newCategory = categoryService.addCategory(category);
		return new ResponseEntity<>(newCategory, HttpStatus.CREATED); 
	}

	@PutMapping("/edit")
	public ResponseEntity<Category> editCategory(@RequestBody Category category){
		Category editCategory = categoryService.editCategory(category);
		return new ResponseEntity<>(editCategory, HttpStatus.OK); 
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<?> removeCategory(@PathVariable("id")  int id){
		 categoryService.removeCategory(id);
		return new ResponseEntity<>( HttpStatus.OK); 
	}
}
