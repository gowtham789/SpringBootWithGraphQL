package com.demo.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

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
		products = new HashMap<String,Product>();
		products.put("1",new Product("1", "Apple iPhone", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "iPhone, Apple iPhone, Apple, Equivalent to One kidney", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("3",new Product("3", "OnePlus", "Midnight Black", "6.00", "128GB", "Up to 250 hours", true, 2, "Oneplus Never Settle", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("4",new Product("4", "Samsung Galaxy S10", "Dark Matte Black", "6.30", "256 GB", "Up to 254 hours", true, 2, "Samsung ,Galaxy", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("5",new Product("5", "Redmi Note7", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("6",new Product("6", "Asus Zenfone", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.put("7",new Product("7", "Real Me 3", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		
		
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
		/*
		 * Product product = new Product(); product.setProductName("Apple iPhone");
		 * product.setAppleCertified(true); product.setColour("Midnight Black");
		 * product.setId(id); product.
		 * setDescription("The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"
		 * ); product.setTags("iPhone, Apple iPhone, Apple, Equivalent to One kidney");
		 * product.setSize("Midnight Black"); product.setWarrentyPeriod(2);
		 * product.setBattery("Up to 25hours"); product.setCapacity("128GB");
		 */
		Product p = products.get(productId);
		
		return p;

		
	//	Optional<Product> pro = products.stream().filter(s -> s.get("id").equals(productId)).findFirst();
		//return pro.get();

	}

	public ProductInventory getProductInventory(String id) {
		/*
		 * ProductInventory productInventory = new ProductInventory();
		 * productInventory.setProductID(id); productInventory.setInventory(100); return
		 * productInventory;
		 */
		/*
		 * Optional<ProductInventory> proInv = productInv.stream().filter(s ->
		 * s.getProductID().equals(id)).findFirst(); return proInv.get();
		 */
		return productInv.get(id);
	}

	public ProductPrice getPricebyId(String id) {
		/*
		 * ProductPrice productPrice = new ProductPrice();
		 * productPrice.setProductId(id); productPrice.setValue("59,900");
		 * productPrice.setCurrency("INR"); return productPrice;
		 */
		/*
		 * Optional<ProductPrice> proPrice = productPrice.stream().filter(s ->
		 * s.getProductId().equals(id)).findFirst(); return proPrice.get();
		 */
		return productPrice.get(id);
		
	}

}
