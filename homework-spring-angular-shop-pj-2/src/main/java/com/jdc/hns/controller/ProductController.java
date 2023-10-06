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

import com.jdc.hns.entity.Product;
import com.jdc.hns.service.impl.ProductServiceImpl;

import lombok.NoArgsConstructor;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/product")
@NoArgsConstructor
public class ProductController {

	@Autowired
	private ProductServiceImpl productServiceImpl;
	

	public ProductController(ProductServiceImpl categoryService) {
		this.productServiceImpl = categoryService;
	}

	@GetMapping("/all")
	public ResponseEntity<List<Product>> getAllCategories() {
		List<Product> products = productServiceImpl.getAllProduct();
		return new ResponseEntity<>(products, HttpStatus.OK);

	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable("id") int id) {
		// style 1
//		Optional<Category> category = categoryService.findCategoryById(id);
//		if(category.isPresent()) {
//			return ResponseEntity.ok(category);
//		}else {
//			return new ResponseEntity(HttpStatus.NO_CONTENT);
//		}
		// style 2
//		return ResponseEntity.of(categoryService.findCategoryById(id));
		return productServiceImpl.findProductById(id).map(ResponseEntity::ok)
				.orElseGet(() -> ResponseEntity.noContent().build());

	}
	
	@PostMapping("/add")
	public ResponseEntity<Product> addProduct(@RequestBody Product product){
		Product newProduct = productServiceImpl.addProduct(product);
		return new ResponseEntity<>(newProduct, HttpStatus.CREATED); 
	}

	@PutMapping("/edit")
	public ResponseEntity<Product> editProduct(@RequestBody Product product){
		Product editProduct = productServiceImpl.editProduct(product);
		return new ResponseEntity<>(editProduct, HttpStatus.OK); 
	}
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<?> removeProduct(@PathVariable("id")  int id){
		 productServiceImpl.removeProduct(id);
		return new ResponseEntity<>( HttpStatus.OK); 
	}
	
	
	
	
	
}
