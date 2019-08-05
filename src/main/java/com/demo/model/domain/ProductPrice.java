package com.demo.model.domain;

public class ProductPrice {

	private String productId;
	private String value;
	private String currency;
	

	public ProductPrice(String productId, String value, String currency) {
		//super();
		this.productId = productId;
		this.value = value;
		this.currency = currency;
	}
	
	public ProductPrice() {
		super();
	}



	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
