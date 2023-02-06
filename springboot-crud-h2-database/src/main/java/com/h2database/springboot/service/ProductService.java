package com.h2database.springboot.service;

import java.util.List;

import com.h2database.springboot.exception.ResourceNotFoundException;
import com.h2database.springboot.model.Product;


public interface ProductService {
	Product createProduct(Product product);

	Product updateProduct(Product product);

	List<Product> getAllProduct();

	Product getProductById(long productId);

	void deleteProduct(long id);
}