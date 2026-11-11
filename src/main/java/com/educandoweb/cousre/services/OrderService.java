package com.educandoweb.cousre.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.cousre.entities.Order;
import com.educandoweb.cousre.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order>findAll(){
		return orderRepository.findAll();
	}
	
	public Order findById(Long ID) {
		Optional<Order>obj=orderRepository.findById(ID);
		return obj.get();
	}
}
