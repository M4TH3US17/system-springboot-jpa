package com.matheus.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheus.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
