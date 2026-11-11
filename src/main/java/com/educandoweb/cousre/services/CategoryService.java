package com.educandoweb.cousre.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.cousre.entities.Category;
import com.educandoweb.cousre.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoreRepository;
	
	public List<Category>findAll(){
		return categoreRepository.findAll();
	}
	
	public Category findById(Long ID) {
		Optional<Category>obj=categoreRepository.findById(ID);
		return obj.get();
	}
}
