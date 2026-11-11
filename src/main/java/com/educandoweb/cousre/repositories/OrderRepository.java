package com.educandoweb.cousre.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.cousre.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
