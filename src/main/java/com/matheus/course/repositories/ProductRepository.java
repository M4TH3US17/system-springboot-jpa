package com.matheus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
