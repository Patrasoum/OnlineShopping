package com.example.orderservicecs2.repository;

import com.example.orderservicecs2.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    Order findByOdrId(Long odrId);

}
