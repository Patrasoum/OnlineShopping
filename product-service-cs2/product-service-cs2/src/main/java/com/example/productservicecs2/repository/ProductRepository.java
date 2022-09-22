package com.example.productservicecs2.repository;

import com.example.productservicecs2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    Product findByProdId(Long prodId);

}
