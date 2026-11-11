package com.educandoweb.cousre.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.cousre.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
