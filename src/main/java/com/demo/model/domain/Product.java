package com.demo.model.domain;

public class Product {

	private String id;
	private String productName;
	private String colour;
	private String size;
	private String capacity;
	private String battery;
	private boolean isAppleCertified;
	private int warrentyPeriod;
	private String tags;
	private String description;
	
	

	public Product(String id, String productName, String colour, String size, String capacity, String battery,
			boolean isAppleCertified, int warrentyPeriod, String tags, String description) {
		//super();
		this.id = id;
		this.productName = productName;
		this.colour = colour;
		this.size = size;
		this.capacity = capacity;
		this.battery = battery;
		this.isAppleCertified = isAppleCertified;
		this.warrentyPeriod = warrentyPeriod;
		this.tags = tags;
		this.description = description;
	}

	public Product() {
		
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public boolean isAppleCertified() {
		return isAppleCertified;
	}

	public void setAppleCertified(boolean isAppleCertified) {
		this.isAppleCertified = isAppleCertified;
	}

	public int getWarrentyPeriod() {
		return warrentyPeriod;
	}

	public void setWarrentyPeriod(int warrentyPeriod) {
		this.warrentyPeriod = warrentyPeriod;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

}
