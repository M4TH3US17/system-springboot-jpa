package com.matheus.course.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheus.course.entities.User;

@RestController
@RequestMapping(value = "users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Matheus Dalvino", "matheusdalvino50@gmail.com", "matheus123", "(92) 9270-2070");
		return ResponseEntity.ok().body(u);
	}
}
