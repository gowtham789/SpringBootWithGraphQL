package com.demo.service;

import java.util.List;
import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.model.Comment;
import com.demo.model.Post;
import com.demo.model.domain.Product;
import com.demo.model.domain.ProductInventory;
import com.demo.model.domain.ProductPrice;

@Service
public class AsyncService {

	private static final Logger logger = LoggerFactory.getLogger(DemoService.class);
	
	@Autowired
	public RestTemplate restTemplate;

	@Async
	public Future<Post> getPost(String url) {
		logger.info("Reqest received to get Post:: URL: [{}]", url);
		ResponseEntity<Post> responseBody = restTemplate.exchange(url, HttpMethod.GET, null, Post.class);
		Post post = responseBody.getBody();
		return new AsyncResult<Post>(post);
	}

	@Async
	public Future<List<Comment>> getComments(String url) {
		String commentsUrl = url + "/comments";
		logger.info("Reqest received to get comments:: URL: [{}]", commentsUrl);
		ResponseEntity<List<Comment>> responseBody = restTemplate.exchange(commentsUrl, HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Comment>>() {
				});
		List<Comment> comments = responseBody.getBody();
		return new AsyncResult<List<Comment>>(comments);
	}

	
	//Domain Services
	@Async
	public Future<Product> getProduct(String url,String params) {
		logger.info("Reqest received to get Post:: URL: [{}]", url);
		String urlParam = params;
		ResponseEntity<Product> responseBody = restTemplate.exchange(url+ "/{id}", HttpMethod.GET, null, Product.class, urlParam);
		Product product = responseBody.getBody();
		return new AsyncResult<Product>(product);
	}
	
	@Async
	public Future<ProductInventory> getProductInventory(String url,String params) {
		logger.info("Reqest received to get Post:: URL: [{}]", url);
		String urlParam = params;
		ResponseEntity<ProductInventory> responseBody = restTemplate.exchange(url+"/{id}", HttpMethod.GET, null, ProductInventory.class,urlParam);
		ProductInventory product = responseBody.getBody();
		return new AsyncResult<ProductInventory>(product);
	}
	
	
	@Async
	public Future<ProductPrice> getPrice(String url,String params) {
		logger.info("Reqest received to get Post:: URL: [{}]", url);
		String urlParam = params;
		ResponseEntity<ProductPrice> responseBody = restTemplate.exchange(url+"/{id}", HttpMethod.GET, null, ProductPrice.class,urlParam);
		ProductPrice product = responseBody.getBody();
		return new AsyncResult<ProductPrice>(product);
	}

}
