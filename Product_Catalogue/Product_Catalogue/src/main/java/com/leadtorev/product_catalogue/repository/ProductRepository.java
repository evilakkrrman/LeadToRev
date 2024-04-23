package com.leadtorev.product_catalogue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leadtorev.product_catalogue.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
