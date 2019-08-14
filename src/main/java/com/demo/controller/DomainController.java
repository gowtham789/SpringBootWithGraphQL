package com.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.model.domain.Product;
import com.demo.model.domain.ProductInventory;
import com.demo.model.domain.ProductPrice;
import com.demo.service.ProductService;

@RestController
public class DomainController {

	private static final Logger logger = LoggerFactory.getLogger(DomainController.class);

	@Autowired
	private ProductService productService;
	
	@RequestMapping("/allProductService")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@RequestMapping("/productService/{id}")
	public Product getProductDetails(@PathVariable String id) {
		return productService.getProductDetails(id);
	}

	@RequestMapping("/productInventoryService/{id}")
	public ProductInventory getProductInventory(@PathVariable String id) {
		ProductInventory productInventory = productService.getProductInventory(id);
		return productInventory;
	}

	@RequestMapping("/productPriceService/{id}")
	public ProductPrice getProductPrice(@PathVariable String id) {
		ProductPrice productPrice = productService.getPricebyId(id);
		return productPrice;
	}

}
