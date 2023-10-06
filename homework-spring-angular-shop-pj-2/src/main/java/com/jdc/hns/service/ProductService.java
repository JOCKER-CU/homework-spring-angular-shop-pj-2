package com.jdc.hns.service;

import java.util.List;
import java.util.Optional;

import com.jdc.hns.entity.Product;

public interface ProductService {

	
	public Product addProduct(Product product) ;
	
	public  Product editProduct(Product product);
	
	public void removeProduct(int idProduct);
	
	public List<Product> getAllProduct();
	
	public Optional<Product> findProductById(int id);
}
