package com.pharruzzo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharruzzo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
