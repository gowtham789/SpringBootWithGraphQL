package com.demo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.domain.Product;
import com.demo.model.domain.ProductInventory;
import com.demo.model.domain.ProductPrice;


@Service
public class ProductService {
	
	private static final Logger logger = LoggerFactory.getLogger(ProductService.class);
	
	@Autowired
	InitService pro;

	public Product getProductDetails(String id) {
		return pro.getProductDetails(id);
	}

	public ProductInventory getProductInventory(String id) {	
		return pro.getProductInventory(id);
	}

	public ProductPrice getPricebyId(String id) {
		return pro.getPricebyId(id);	
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return pro.getAllProducts();
	}

}
