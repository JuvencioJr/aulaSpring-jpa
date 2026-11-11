package com.educandoweb.cousre.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.cousre.entities.Category;
import com.educandoweb.cousre.services.CategoryService;

@RestController
@RequestMapping(value="/Category")
public class CategoryResources {
	
	@Autowired
	private CategoryService service;
	
	@GetMapping()
	public ResponseEntity<List<Category>>findAll(){
		List<Category>list=service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value ="/{id}")
	public ResponseEntity<Category>findById(@PathVariable Long id){
	
		Category category = service.findById(id);
		
		return ResponseEntity.ok().body(category);
	}
}
