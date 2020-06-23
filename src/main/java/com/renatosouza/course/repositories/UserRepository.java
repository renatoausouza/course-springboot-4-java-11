package com.renatosouza.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renatosouza.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
