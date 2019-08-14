package com.demo.graphql.filters;

public class ProductType {
	
	private IntOperators id;
	private PriceType price;
	
	public IntOperators getId() {
		return id;
	}
	public void setId(IntOperators id) {
		this.id = id;
	}
	public PriceType getPrice() {
		return price;
	}
	public void setPrice(PriceType price) {
		this.price = price;
	}

	
}
