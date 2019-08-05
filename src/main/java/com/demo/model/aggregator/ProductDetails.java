package com.demo.model.aggregator;

import com.demo.model.domain.Product;
import com.demo.model.domain.ProductInventory;
import com.demo.model.domain.ProductPrice;

public class ProductDetails {

	// Product
	/*
	 * private String id; private String productName; private String colour; private
	 * String size; private String capacity; private String battery; private boolean
	 * isAppleCertified; private int warrentyPeriod; private String tags; private
	 * String description;
	 */
	private String id;
	
	private Product product;

	// Inventory
	private ProductInventory productInventory;

	// Price
	private ProductPrice productPrice;

	/*
	 * public String getId() { return id; }
	 * 
	 * public void setId(String id) { this.id = id; }
	 * 
	 * public String getProductName() { return productName; }
	 * 
	 * public void setProductName(String productName) { this.productName =
	 * productName; }
	 * 
	 * public String getColour() { return colour; }
	 * 
	 * public void setColour(String colour) { this.colour = colour; }
	 * 
	 * public String getSize() { return size; }
	 * 
	 * public void setSize(String size) { this.size = size; }
	 * 
	 * public String getCapacity() { return capacity; }
	 * 
	 * public void setCapacity(String capacity) { this.capacity = capacity; }
	 * 
	 * public String getBattery() { return battery; }
	 * 
	 * public void setBattery(String battery) { this.battery = battery; }
	 * 
	 * public boolean isAppleCertified() { return isAppleCertified; }
	 * 
	 * public void setAppleCertified(boolean isAppleCertified) {
	 * this.isAppleCertified = isAppleCertified; }
	 * 
	 * public int getWarrentyPeriod() { return warrentyPeriod; }
	 * 
	 * public void setWarrentyPeriod(int warrentyPeriod) { this.warrentyPeriod =
	 * warrentyPeriod; }
	 * 
	 * public String getTags() { return tags; }
	 * 
	 * public void setTags(String tags) { this.tags = tags; }
	 * 
	 * public String getDescription() { return description; }
	 * 
	 * public void setDescription(String description) { this.description =
	 * description; }
	 */

	public ProductInventory getProductInventory() {
		return productInventory;
	}

	public void setProductInventory(ProductInventory productInventory) {
		this.productInventory = productInventory;
	}

	public ProductPrice getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(ProductPrice productPrice) {
		this.productPrice = productPrice;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ProductDetails(Product product, ProductInventory productInventory, ProductPrice productPrice) {
		super();
		this.product = product;
		this.productInventory = productInventory;
		this.productPrice = productPrice;
	}

	public ProductDetails() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
	

	/*
	 * public static ProductDetails getProductDetails(Product product) {
	 * ProductDetails productDetails = new ProductDetails();
	 * productDetails.setId(product.getId());
	 * productDetails.setAppleCertified((true));
	 * productDetails.setBattery(product.getBattery());
	 * productDetails.setCapacity(product.getCapacity());
	 * productDetails.setColour(product.getColour());
	 * productDetails.setDescription(product.getDescription());
	 * productDetails.setProductName(product.getProductName());
	 * 
	 * productDetails.setSize(product.getSize());
	 * productDetails.setTags(product.getTags());
	 * productDetails.setWarrentyPeriod(product.getWarrentyPeriod());
	 * 
	 * return productDetails;
	 * 
	 * }
	 */
}
