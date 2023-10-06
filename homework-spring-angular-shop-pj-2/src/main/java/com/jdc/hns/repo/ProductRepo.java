package com.jdc.hns.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.jdc.hns.entity.Product;

public interface ProductRepo extends JpaRepositoryImplementation<Product, Integer>{

}
