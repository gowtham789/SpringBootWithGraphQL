package com.demo.model.aggregator;

import com.demo.model.domain.Product;
import com.demo.model.domain.ProductInventory;

public class ProductInventoryDetails {
		// Product
		private String id;
		private Product product;

		public Product getProduct() {
			return product;
		}

		public void setProduct(Product product) {
			this.product = product;
		}

		// Inventory
		private ProductInventory productInventory;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}
		
		public ProductInventory getProductInventory() {
			return productInventory;
		}

		public void setProductInventory(ProductInventory productInventory) {
			this.productInventory = productInventory;
		}
}
