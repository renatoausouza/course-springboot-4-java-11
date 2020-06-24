package com.renatosouza.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.renatosouza.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
