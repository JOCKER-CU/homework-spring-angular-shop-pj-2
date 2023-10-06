package com.jdc.hns.repo;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.jdc.hns.entity.Category;

public interface CategoryRepo extends JpaRepositoryImplementation<Category, Integer> {


}
