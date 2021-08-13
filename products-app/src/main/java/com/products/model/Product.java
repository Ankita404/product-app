package com.products.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class Product {
	
	private String productname;
	@Id
	private Integer productId;
	private Double price;

}
