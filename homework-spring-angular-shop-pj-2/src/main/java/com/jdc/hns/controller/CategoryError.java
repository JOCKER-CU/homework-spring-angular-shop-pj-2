package com.jdc.hns.controller;

public class CategoryError {

//	@GetMapping("/all")
//	public ResponseEntity<List<Category>> getAllCategories() {
//		List<Category> categories = categoryService.getAllCategory();
//		return new ResponseEntity<>(categories, HttpStatus.OK);
//
//	}
//
//	@GetMapping("/find/{id}")
//	public ResponseEntity<Category> getCategoryById(@PathVariable("id") int id) {
//		// style 1
////		Optional<Category> category = categoryService.findCategoryById(id);
////		if(category.isPresent()) {
////			return ResponseEntity.ok(category);
////		}else {
////			return new ResponseEntity(HttpStatus.NO_CONTENT);
////		}
//		// style 2
////		return ResponseEntity.of(categoryService.findCategoryById(id));
//		return categoryService.findCategoryById(id).map(ResponseEntity::ok)
//				.orElseGet(() -> ResponseEntity.noContent().build());
//
//	}
//	
//	@PostMapping("/add")
//	public ResponseEntity<Category> addCategory(@RequestBody Category category){
//		Category newCategory = categoryService.addCategory(category);
//		return new ResponseEntity<>(newCategory, HttpStatus.CREATED); 
//	}
//
//	@PutMapping("/edit")
//	public ResponseEntity<Category> editCategory(@RequestBody Category category){
//		Category editCategory = categoryService.editCategory(category);
//		return new ResponseEntity<>(editCategory, HttpStatus.OK); 
//	}
//	
//	@PutMapping("/remove")
//	public ResponseEntity<?> removeCategory(@PathVariable("id")  int id){
//		 categoryService.removeCategory(id);
//		return new ResponseEntity<>( HttpStatus.OK); 
//	}
	
	
//	style 2
//	@GetMapping("/all")
//	public List<Category> getAllCategories() {
//		List<Category> categories = categoryService.getAllCategory();
//		return categories;
//
//	}
//
//	@GetMapping("/find/{id}")
//	public Category getCategoryById(@PathVariable("id") int id) {
//		// style 1
//		return categoryService.findCategoryById(id).get();
//		
//		if(category.isPresent()) {
//			return ResponseEntity.ok(category);
//		}else {
//			return new ResponseEntity(HttpStatus.NO_CONTENT);
//		}
	
	
	
	
		// style 2
//		return ResponseEntity.of(categoryService.findCategoryById(id));
//		return categoryService.findCategoryById(id).map(ResponseEntity::ok)
//				.orElseGet(() -> ResponseEntity.noContent().build());

//	}

//	@PostMapping("/add")
//	public Category addCategory(@RequestBody Category category) {
//		Category newCategory = categoryService.addCategory(category);
//		return newCategory;
//	}
//
//	@PutMapping("/edit")
//	public Category editCategory(@RequestBody Category category) {
//		Category editCategory = categoryService.editCategory(category);
//		return editCategory;
//	}
//
//	@PutMapping("/remove")
//	public void removeCategory(@PathVariable("id") int id) {
//		categoryService.removeCategory(id);
//
//	}
}
