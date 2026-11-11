package com.educandoweb.cousre.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.cousre.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
