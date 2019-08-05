package com.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.concurrent.ExecutionException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.model.aggregator.ProductDetails;
import com.demo.model.aggregator.ProductInventoryDetails;
import com.demo.model.aggregator.ProductPriceDetails;
import com.demo.service.DemoService;

import graphql.schema.DataFetchingEnvironment;

@RunWith(SpringRunner.class)
public class ProductDomainServiceTest {

	@Autowired
	private DemoService demoService;

	@Test
	public void getProductDetails(DataFetchingEnvironment dataFetchingEnvironment)
			throws InterruptedException, ExecutionException {
		ProductDetails productDetails = demoService.getProductDetails(dataFetchingEnvironment);
		assertThat(productDetails).isNotNull();
	}

	@Test
	public void getProductInventoryDetails(DataFetchingEnvironment dataFetchingEnvironment)
			throws InterruptedException, ExecutionException {
		ProductInventoryDetails productDetails = demoService.getProductInventoryDetails(dataFetchingEnvironment);
		assertThat(productDetails).isNotNull();
	}

	@Test
	public void getProductPriceDetails(DataFetchingEnvironment dataFetchingEnvironment)
			throws InterruptedException, ExecutionException {
		ProductPriceDetails productDetails = demoService.getProductPriceDetails(dataFetchingEnvironment);
		assertThat(productDetails).isNotNull();
	}
}
