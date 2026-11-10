package com.educandoweb.cousre.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.cousre.entities.User;

@RestController
@RequestMapping(value = "/Users")
public class UserResouces {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Maria", "maria@gmail.", "pppp", "jjjjj");
		return ResponseEntity.ok().body(u);
	}
}
