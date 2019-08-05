package com.demo.model.aggregator;

import com.demo.model.domain.Product;
import com.demo.model.domain.ProductPrice;

public class ProductPriceDetails {

	//Product
	private String id;	
	private Product product;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	//Price
	private ProductPrice productPrice;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ProductPrice getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(ProductPrice productPrice) {
		this.productPrice = productPrice;
	}
	
}
