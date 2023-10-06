package com.jdc.hns;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jdc.hns.service.impl.CategoryServiceImpl;

@SpringBootTest
class HomeworkSpringAngularShopPj2ApplicationTests {

	@Autowired
	private  CategoryServiceImpl categoryServiceImpl;
	@Test
	void contextLoads() {
		var categories = categoryServiceImpl.getAllCategory();
		
		System.out.println(categories.size());
	}
	@Test
	public void countCategory() {
		
	}

}
