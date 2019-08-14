package com.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.demo.model.domain.Product;
import com.demo.model.domain.ProductInventory;
import com.demo.model.domain.ProductPrice;

@Component
public class InitService {
	
	private static final Logger logger = LoggerFactory.getLogger(InitService.class);
	
	Map<String,Product> products;
	Map<String,ProductInventory> productInv;
	Map<String,ProductPrice> productPrice;
	
	@PostConstruct
	public void initializeProducts() {	
		//initialize products
		products = new LinkedHashMap<String,Product>();
		products.put("1",new Product("1", "Apple iPhone", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "iPhone, Apple iPhone, Apple, Equivalent to One kidney", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("2",new Product("2", "LG G8", "Midnight Black", "6.00", "128GB", "Up to 250 hours", true, 2, "Oneplus Never Settle", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("3",new Product("3", "OnePlus", "Midnight Black", "6.00", "128GB", "Up to 250 hours", true, 2, "Oneplus Never Settle", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("4",new Product("4", "Samsung Galaxy S10", "Dark Matte Black", "6.30", "256 GB", "Up to 254 hours", true, 2, "Samsung ,Galaxy", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("5",new Product("5", "Redmi Note7", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("6",new Product("6", "Asus Zenfone", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("7",new Product("7", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("8",new Product("8", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("9",new Product("9", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("10",new Product("10", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("11",new Product("11", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("12",new Product("12", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("13",new Product("13", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("14",new Product("14", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("15",new Product("15", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("16",new Product("16", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("17",new Product("17", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("18",new Product("18", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("19",new Product("19", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("20",new Product("20", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("21",new Product("21", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("22",new Product("22", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("23",new Product("23", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("24",new Product("24", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("25",new Product("25", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("26",new Product("26", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("27",new Product("27", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("28",new Product("28", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("29",new Product("29", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("30",new Product("30", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));

		
		//intialize inventory
		productInv = new HashMap<String,ProductInventory>();
		productInv.put("1",new ProductInventory("1",789));
		productInv.put("2",new ProductInventory("2",58));
		productInv.put("3",new ProductInventory("3",752));
		productInv.put("4",new ProductInventory("4",789));
		productInv.put("5",new ProductInventory("5",34));
		productInv.put("6",new ProductInventory("6",26));
		productInv.put("7",new ProductInventory("7",785));
		
		//initialize Price
		productPrice = new HashMap<String,ProductPrice>();
		productPrice.put("1",new ProductPrice("1", "65999", "INR"));
		productPrice.put("2",new ProductPrice("2", "55000", "INR"));
		productPrice.put("3",new ProductPrice("3", "75000", "INR"));
		productPrice.put("4",new ProductPrice("4", "25499", "INR"));
		productPrice.put("5",new ProductPrice("5", "35999", "INR"));
		productPrice.put("6",new ProductPrice("6", "75999", "INR"));
		productPrice.put("7",new ProductPrice("7", "85999", "INR"));		
	}

	public Product getProductDetails(String productId) {
		Product p = products.get(productId);		
		return p;
	}
	
	public ProductInventory getProductInventory(String id) {	
		return productInv.get(id);
	}

	public ProductPrice getPricebyId(String id) {
		return productPrice.get(id);
	}
	
	public List<Product> getAllProducts() {
		return products.values().stream().collect(Collectors. 
                toCollection(ArrayList::new));
	}
}
