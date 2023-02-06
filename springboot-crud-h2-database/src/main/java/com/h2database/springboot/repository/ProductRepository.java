package com.h2database.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.h2database.springboot.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
