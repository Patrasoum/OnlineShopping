package com.example.customerservicecs2.repository;

import com.example.customerservicecs2.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findByCstId(Long cstId);
}
