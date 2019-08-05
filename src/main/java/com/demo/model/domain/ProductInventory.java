package com.demo.model.domain;

public class ProductInventory {

	private String productID;
	private Integer inventory;

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public Integer getInventory() {
		return inventory;
	}

	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}

	public ProductInventory(String productID, Integer inventory) {
		//super();
		this.productID = productID;
		this.inventory = inventory;
	}

	public ProductInventory() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
