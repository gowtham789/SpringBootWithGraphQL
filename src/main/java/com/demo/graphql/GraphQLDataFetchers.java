package com.demo.graphql;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.service.DemoService;

import graphql.schema.DataFetcher;

@Component
public class GraphQLDataFetchers {

	@Autowired
	public DemoService demoService;

	public DataFetcher getPostDataFetcher() {
		return dataFetchingEnvironment -> {
			try {
				return demoService.getPostAndComments(dataFetchingEnvironment);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		};
	}
	
	public DataFetcher getCommentDataFetcher() {
		return dataFetchingEnvironment -> {
			try {
				return demoService.getComments(dataFetchingEnvironment);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		};
	}
	
	//DOmain services Aggregation Data Fetching layer
	
	//Product Aggregator
	public DataFetcher getProductDetailsDataFetcher()  {
		return dataFetchingEnvironment -> {
			try {
				return demoService.getProductDetails(dataFetchingEnvironment);
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		};
	}
	
	//Inventory + Price
	public DataFetcher getInventoryAndPriceDataFetcher() {
		return dataFetchingEnvironment -> {
			try {
				return demoService.getComments(dataFetchingEnvironment);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		};
	}
	
	//Product + Price
	public DataFetcher getPriceDataFetcher() {
		return dataFetchingEnvironment -> {
			try {
				return demoService.getComments(dataFetchingEnvironment);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		};
	}

	public DataFetcher getProductInventoryDetails() {
		return dataFetchingEnvironment -> {
			try {
				return demoService.getProductInventoryDetails(dataFetchingEnvironment);
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		};
	}

	public DataFetcher getProductPriceDetails() {
		return dataFetchingEnvironment -> {
			try {
				return demoService.getProductPriceDetails(dataFetchingEnvironment);
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		};
	}
	
	

}
