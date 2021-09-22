package com.matheus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
