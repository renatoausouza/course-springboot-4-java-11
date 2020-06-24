package com.renatosouza.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renatosouza.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
