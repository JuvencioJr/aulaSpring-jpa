package com.educandoweb.cousre.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.cousre.entities.User;
import com.educandoweb.cousre.repositories.UserRepository;
import com.educandoweb.cousre.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User>obj =repository.findById(id);
		
		//em vez de usar o get, usamos o orElseThrow para lançar uma exceçao em caso de o get retornar vazio
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User user) {
		return repository.save(user);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User user) {
		User entity= repository.getReferenceById(id);
		UpdateById(entity, user);
		
		return repository.save(entity);
	}

	private void UpdateById(User entity, User user) {
		
		entity.setName(user.getName());
		entity.setEmail(user.getEmail());
		entity.setPhone(user.getPhone());
		
	}
}
