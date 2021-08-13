package com.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.model.Product;
import com.products.repository.ProductsRepo;

@Service
public class ProdctsServiceImpl implements ProductsService {
	
	@Autowired
	ProductsRepo productsRepo;

	@Override
	public Product addProduct(Product product) {
		return productsRepo.save(product);
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProduct(Integer productId) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getProductByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String ankita() {
		// TODO Auto-generated method stub
		return null;
	}

}
