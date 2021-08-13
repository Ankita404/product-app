package com.products.service;

import java.util.List;

import com.products.model.Product;



public interface ProductsService {
	
	Product addProduct(Product product);
	void updateProduct(Product product);
	void deleteProduct(Integer productId);
	
	List<Product> getAllProduct();
	List<Product> getProductByName(String name);
	
	
	String ankita();
}
