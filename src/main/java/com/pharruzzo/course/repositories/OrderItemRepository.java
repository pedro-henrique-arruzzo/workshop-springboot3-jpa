package com.pharruzzo.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.pharruzzo.course.entities.OrderItem;
import com.pharruzzo.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
