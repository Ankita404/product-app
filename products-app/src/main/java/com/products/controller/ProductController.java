package com.products.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.model.Product;
import com.products.service.ProductsService;

@RestController
@RequestMapping("product/api")
public class ProductController {
	
	@Autowired
	ProductsService productService;
	
	@PostMapping("/product/add-product")
	ResponseEntity<Product> addNewProduct(@RequestBody Product productDetails){
		Product newProduct = productService.addProduct(productDetails);
		HttpHeaders header = new HttpHeaders();
		header.add("desc", "Product Added");
		return ResponseEntity.ok().headers(header).body(newProduct);
	}

}
