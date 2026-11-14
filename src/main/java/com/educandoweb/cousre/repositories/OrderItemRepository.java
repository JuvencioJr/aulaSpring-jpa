package com.educandoweb.cousre.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.cousre.entities.OrderItem;
import com.educandoweb.cousre.entities.pk.OrderItemPk;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{

}
