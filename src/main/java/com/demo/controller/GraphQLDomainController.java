package com.demo.controller;

import java.util.Map;
import java.util.concurrent.ExecutionException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.graphql.GraphQLProvider;
import com.demo.model.PostAndComments;
import com.demo.service.DemoService;

import graphql.ExecutionResult;

/**
 * Dilip Tadepalli
 */
@RequestMapping("/api")
@RestController
public class GraphQLDomainController {

	@Autowired
	public GraphQLProvider graphQLProvider;

	@Autowired
	public DemoService demoService;

	private static final Logger logger = LoggerFactory.getLogger(GraphQLDomainController.class);

	/*
	 * @RequestMapping(value = "/ping", method = RequestMethod.GET, produces = {
	 * MediaType.APPLICATION_JSON_VALUE }) public String ping() {
	 * logger.info("Request received to check the health of the demo Aplication");
	 * return "Up"; }
	 * 
	 * @RequestMapping(value = "/post", method = RequestMethod.GET, produces = {
	 * MediaType.APPLICATION_JSON_VALUE }) public PostAndComments getPosts() throws
	 * InterruptedException, ExecutionException {
	 * logger.info("Request received to get Post Details with comments"); return
	 * demoService.getPostAndComments(null); }
	 */

	@PostMapping("/graphql")
	public ResponseEntity<Object> getPost(@RequestBody String query) {
		logger.info("Request received to execute Query:[{}]", query);
		ExecutionResult execute = graphQLProvider.graphQL().execute(query);
		//Map<String, Object> specification = execute.toSpecification();
		//System.out.println("specification" +specification.toString() );
		return new ResponseEntity<>(execute, HttpStatus.OK);
	}
}
