package com.educandoweb.cousre.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.servlet.context.ServletComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.educandoweb.cousre.entities.User;
import com.educandoweb.cousre.services.UserService;

@RestController
@RequestMapping(value = "/Users")
public class UserResouces {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User>list=service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj =service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public ResponseEntity<User>insert(@RequestBody User obj){
	User Obj= service.insert(obj);
	//devemos criar uma instruçao para que o http retorne o codigo 201 created em vez de 200 ok
	URI uri= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(Obj.getId()).toUri();
	
		return ResponseEntity.created(uri).body(Obj);
				
	}
	
	@DeleteMapping(value="/{id}")
	public ResponseEntity<Void>deleteById(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}
	

