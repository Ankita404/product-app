package com.products.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.products.model.Product;

@Repository
public interface ProductsRepo extends JpaRepository<Product, Integer> {
	List<Product> findByProductname(String name);
}
