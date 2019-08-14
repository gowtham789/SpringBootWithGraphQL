package com.demo.graphql;

import static graphql.schema.idl.TypeRuntimeWiring.newTypeWiring;

import java.io.IOException;
import java.net.URL;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import graphql.schema.idl.RuntimeWiring;
import graphql.schema.idl.SchemaGenerator;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;

@Component
public class GraphQLProvider {
	
	private static final Logger logger = LoggerFactory.getLogger(GraphQLProvider.class);

	@Autowired
	GraphQLDataFetchers graphQLDataFetchers;

	private GraphQL graphQL;

	@PostConstruct
	public void init() throws IOException {
		logger.info("Graphql Schemas Initialisation...");
		URL url = Resources.getResource("graphql/post.graphqls");
		String sdl = Resources.toString(url, Charsets.UTF_8);
		GraphQLSchema graphQLSchema = buildSchema(sdl);
		this.graphQL = GraphQL.newGraphQL(graphQLSchema).build();
	}

	private GraphQLSchema buildSchema(String sdl) {
		TypeDefinitionRegistry typeRegistry = new SchemaParser().parse(sdl);
		RuntimeWiring runtimeWiring = buildWiring();
		SchemaGenerator schemaGenerator = new SchemaGenerator();
		return schemaGenerator.makeExecutableSchema(typeRegistry, runtimeWiring);
	}

	private RuntimeWiring buildWiring() {
		return RuntimeWiring.newRuntimeWiring()
				.type(newTypeWiring("Query").dataFetcher("postById", graphQLDataFetchers.getPostDataFetcher()))
				.type(newTypeWiring("Query").dataFetcher("commentsByPostId", graphQLDataFetchers.getCommentDataFetcher()))
				.type(newTypeWiring("Query").dataFetcher("getAllProducts", graphQLDataFetchers.getAllProducts()))
				.type(newTypeWiring("Query").dataFetcher("productDetailsById", graphQLDataFetchers.getProductDetailsDataFetcher()))
				.type(newTypeWiring("Query").dataFetcher("productInventoryDetails", graphQLDataFetchers.getProductInventoryDetails()))
				.type(newTypeWiring("Query").dataFetcher("productPriceDetails", graphQLDataFetchers.getProductPriceDetails()))
				.type(newTypeWiring("Query").dataFetcher("products", graphQLDataFetchers.getProductsFilter()))
				.build();
	}

	@Bean
	public GraphQL graphQL() {
		return graphQL;
	}
}
