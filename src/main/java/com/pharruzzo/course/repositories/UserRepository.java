package com.pharruzzo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharruzzo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
