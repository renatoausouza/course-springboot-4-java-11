package com.renatosouza.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renatosouza.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
