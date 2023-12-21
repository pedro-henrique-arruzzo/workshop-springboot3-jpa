package com.pharruzzo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharruzzo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
