package com.matheus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
