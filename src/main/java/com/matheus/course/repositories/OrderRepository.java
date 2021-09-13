package com.matheus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
