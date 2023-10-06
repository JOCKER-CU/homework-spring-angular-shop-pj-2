package com.jdc.hns.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jdc.hns.entity.Product;
import com.jdc.hns.repo.ProductRepo;
import com.jdc.hns.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepo productRepo;
	
//	@Autowired
//	private Category category;
		
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		//var cate = product.getProduct();
	//	List<Category> cat = new ArrayList<Category>();
		
		return productRepo.save(product);
	}

	@Override
	public Product editProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productRepo.findAll();
	}

	@Override
	public Optional<Product> findProductById(int id) {
		Optional<Product> product = productRepo.findById(id);
		return product;
	}
	
	@Override
	public void removeProduct(int idProduct) {
		// TODO Auto-generated method stub
		Optional<Product> product = findProductById(idProduct);
		product.ifPresent(p -> {
			productRepo.delete(p);
		});
		
	}

}
