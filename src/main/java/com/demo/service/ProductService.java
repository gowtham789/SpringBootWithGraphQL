package com.demo.service;

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
	
	
	
	 // List<ProductInventory> productInv; List<ProductPrice> productPrice;
	 
	
	/*@PostConstruct
	public void initializeProducts() {
		
		//initialize products
		products = new ArrayList<Product>();
		products.add(new Product("1", "Apple iPhone", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "iPhone, Apple iPhone, Apple, Equivalent to One kidney", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.add(new Product("2", "OnePlus", "Midnight Black", "6.00", "128GB", "Up to 250 hours", true, 2, "Oneplus Never Settle", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.add(new Product("3", "Samsung Galaxy S10", "Dark Matte Black", "6.30", "256 GB", "Up to 254 hours", true, 2, "Samsung ,Galaxy", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.add(new Product("4", "Apple iPhone", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "iPhone, Apple iPhone, Apple, Equivalent to One kidney", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.add(new Product("5", "Apple iPhone", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "iPhone, Apple iPhone, Apple, Equivalent to One kidney", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.add(new Product("6", "Apple iPhone", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "iPhone, Apple iPhone, Apple, Equivalent to One kidney", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		products.add(new Product("7", "Apple iPhone", "Midnight Black", "6.67", "128GB", "Up to 25hours", true, 2, "iPhone, Apple iPhone, Apple, Equivalent to One kidney", "The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"));
		
		//intialize inventory
		productInv = new ArrayList<ProductInventory>();
		productInv.add(new ProductInventory("1",789));
		productInv.add(new ProductInventory("2",58));
		productInv.add(new ProductInventory("3",752));
		productInv.add(new ProductInventory("4",789));
		productInv.add(new ProductInventory("5",34));
		productInv.add(new ProductInventory("6",26));
		productInv.add(new ProductInventory("7",785));
		
		//initialize Price
		productPrice.add(new ProductPrice("1", "65999", "INR"));
		productPrice.add(new ProductPrice("2", "55000", "INR"));
		productPrice.add(new ProductPrice("3", "75000", "INR"));
		productPrice.add(new ProductPrice("4", "25499", "INR"));
		productPrice.add(new ProductPrice("5", "35999", "INR"));
		productPrice.add(new ProductPrice("6", "75999", "INR"));
		productPrice.add(new ProductPrice("7", "85999", "INR"));
		
	}*/

	public Product getProductDetails(String id) {
		/*
		 * Product product = new Product(); product.setProductName("Apple iPhone");
		 * product.setAppleCertified(true); product.setColour("Midnight Black");
		 * product.setId(id); product.
		 * setDescription("The iPhone is a smartphone made by Apple that combines a computer, iPod, digital camera and cellular phone into one device with a touchscreen interface"
		 * ); product.setTags("iPhone, Apple iPhone, Apple, Equivalent to One kidney");
		 * product.setSize("Midnight Black"); product.setWarrentyPeriod(2);
		 * product.setBattery("Up to 25hours"); product.setCapacity("128GB");
		 */
		/*Optional<Product> pro = products.stream().filter(s -> s.getId().equals(id)).findFirst();
		return pro.get();*/
		
		
		return pro.getProductDetails(id);

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
		return pro.getProductInventory(id);
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
		return pro.getPricebyId(id);
		
	}

}
