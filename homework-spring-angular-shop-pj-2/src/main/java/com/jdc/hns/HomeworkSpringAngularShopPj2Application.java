package com.jdc.hns;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.jdc.hns.entity.Category;
import com.jdc.hns.service.impl.CategoryServiceImpl;

@SpringBootApplication
//@ComponentScan(basePackageClasses = CategoryController.class)
//@EnableJpaRepositories(basePackages = "com.jdc.hns.repo")
//@EntityScan(basePackages = "com.jdc.hns.entity")
public class HomeworkSpringAngularShopPj2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HomeworkSpringAngularShopPj2Application.class, args);
	}
	
	@Autowired
	private CategoryServiceImpl categoryServiceImpl;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Category c1 = new Category();
		c1.setName("Mobile Phone");
		categoryServiceImpl.addCategory(c1);
		
	}
	
	@Bean
	public CorsFilter corsFilter() {
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
				"Accept", "Authorization", "Origin, Accept", "X-Requested-With",
				"Access-Control-Request-Method", "Access-Control-Request-Headers"));
		corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
				"Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(urlBasedCorsConfigurationSource);
	}

}
