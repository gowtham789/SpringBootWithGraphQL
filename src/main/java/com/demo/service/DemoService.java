package com.demo.service;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import com.demo.graphql.exceptions.ProductInventoryNotFoundException;
import com.demo.graphql.exceptions.ProductNotFoundException;
import com.demo.graphql.exceptions.ProductPriceNotFoundException;
import com.demo.model.Comment;
import com.demo.model.Post;
import com.demo.model.PostAndComments;
import com.demo.model.aggregator.ProductDetails;
import com.demo.model.aggregator.ProductInventoryDetails;
import com.demo.model.aggregator.ProductPriceDetails;
import com.demo.model.domain.Product;
import com.demo.model.domain.ProductInventory;
import com.demo.model.domain.ProductPrice;

import graphql.schema.DataFetchingEnvironment;

@Service
public class DemoService {

	@Value(value = "${allProduct.base.url}")
	private String allProductsUrl;
	
	@Value(value = "${product.base.url}")
	private String productBaseUrl;

	@Value(value = "${product.inv.base.url}")
	private String productInvBaseUrl;

	@Value(value = "${prod.price.base.url}")
	private String productPriceBaseUrl;

	@Autowired
	public AsyncService asyncService;

	private static final Logger logger = LoggerFactory.getLogger(DemoService.class);

	private final String BASE_URL = "https://jsonplaceholder.typicode.com";

	public PostAndComments getPostAndComments(DataFetchingEnvironment dataFetchingEnvironment)
			throws InterruptedException, ExecutionException {
		logger.info("Request received to get all posts");
		logger.info("dataFetchingEnvironment:Id:[{}]", dataFetchingEnvironment.getArgument("id").toString());
		PostAndComments post = new PostAndComments();
		Future<Post> futurePosts = null;
		Future<List<Comment>> futureComments = null;

		String url = BASE_URL + "/posts/1";
		// Async
		futurePosts = asyncService.getPost(url);
		futureComments = asyncService.getComments(url);

		post.setId(futurePosts.get().getId());
		post.setTitle(futurePosts.get().getTitle());
		post.setUserId(futurePosts.get().getUserId());
		post.setBody(futurePosts.get().getBody());
		post.setComments(futureComments.get());

		return post;
	}

	public List<Comment> getComments(DataFetchingEnvironment dataFetchingEnvironment)
			throws InterruptedException, ExecutionException {
		
		
		logger.info("Request received to get all Comments");
		logger.info("dataFetchingEnvironment:Id:[{}]", dataFetchingEnvironment.getArgument("id").toString());

		Future<List<Comment>> futureComments = null;
		String url = BASE_URL + "/posts/1";

		// Async
		futureComments = asyncService.getComments(url);
		return futureComments.get();
	}

	// Domain Service Aggregation

	/**
	 * 
	 * @param dataFetchingEnvironment
	 * @return Product Details
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public ProductDetails getProductDetails(DataFetchingEnvironment dataFetchingEnvironment)
			throws InterruptedException, ExecutionException {
		
		String params = dataFetchingEnvironment.getArgument("id");

		Future<Product> product = asyncService.getProduct(productBaseUrl,params);
		if(product.get()==null) {
			throw new ProductNotFoundException(params);
		}	
		Future<ProductInventory> productInventory = asyncService.getProductInventory(productInvBaseUrl,params);
		if(productInventory.get()==null) {
			throw new ProductInventoryNotFoundException(params);
		}
		Future<ProductPrice> productPrice = asyncService.getPrice(productPriceBaseUrl,params);
		if(productPrice.get()==null) {
			throw new ProductPriceNotFoundException(params);
		}
		
		ProductDetails productDetails = new ProductDetails();
		/*
		 * productDetails = ProductDetails.getProductDetails(product.get());
		 * 
		 * // Product Inventory
		 * productDetails.setProductInventory(productInventory.get()); // Product Price
		 * productDetails.setProductPrice(productPrice.get());
		 */
		
		productDetails.setProduct(product.get());
		productDetails.setProductInventory(productInventory.get());
		productDetails.setProductPrice(productPrice.get());
		
		return productDetails;
	}

	/**'
	 * 
	 * @param dataFetchingEnvironment
	 * @return Product Inventory Detals
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public ProductInventoryDetails getProductInventoryDetails(DataFetchingEnvironment dataFetchingEnvironment)
			throws InterruptedException, ExecutionException {
		
		String params = dataFetchingEnvironment.getArgument("id");
		Future<Product> product = asyncService.getProduct(productBaseUrl,params);
		if(product.get()==null) {
			throw new ProductNotFoundException(params);
		}
		Future<ProductInventory> productInventory = asyncService.getProductInventory(productInvBaseUrl,params);
		if(productInventory.get()==null) {
			throw new ProductInventoryNotFoundException(params);
		}
		ProductInventoryDetails productInvDetails = new ProductInventoryDetails();		
		
		// Product Inventory
		productInvDetails.setProduct(product.get());
		productInvDetails.setProductInventory(productInventory.get());

		return productInvDetails;

	}

	/**
	 * 
	 * @param dataFetchingEnvironment
	 * @return Product Price Details
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public ProductPriceDetails getProductPriceDetails(DataFetchingEnvironment dataFetchingEnvironment)
			throws InterruptedException, ExecutionException {
		
		String params = dataFetchingEnvironment.getArgument("id");

		Future<Product> product = asyncService.getProduct(productBaseUrl,params);
		if(product.get()==null) {
			throw new ProductNotFoundException(params);
		}
		Future<ProductPrice> productPrice = asyncService.getPrice(productPriceBaseUrl,params);
		if(productPrice.get()==null) {
			throw new ProductPriceNotFoundException(params);
		}
		ProductPriceDetails productDetails = new ProductPriceDetails();
		
		// Product Price
		productDetails.setProduct(product.get());
		productDetails.setProductPrice(productPrice.get());
		return productDetails;
	}

	public List<Product> getAllProducts(DataFetchingEnvironment dataFetchingEnvironment) throws InterruptedException, ExecutionException {
		
		Future<List<Product>> product = asyncService.getProducts(allProductsUrl);
		return  product.get();
	}

	public Object getProductsFilter(DataFetchingEnvironment dataFetchingEnvironment) {

		String params = dataFetchingEnvironment.getArgument("where");
		System.out.println("filter params " + params);
		return null;
	}
}
