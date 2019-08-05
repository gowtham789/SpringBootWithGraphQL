package com.demo.graphql.exceptions;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

public class ProductInventoryNotFoundException extends RuntimeException implements GraphQLError {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String productID;

    public ProductInventoryNotFoundException(String productID) {
        this.productID = productID;
    }

    @Override
    public String getMessage() {
        return "Product Inventory Details with ID " + productID + " could not be found";
    }
    
    @Override
    @JsonIgnore
    public StackTraceElement[] getStackTrace() {
        return super.getStackTrace();
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.ValidationError;
    }

    @Override
    public Map<String, Object> getExtensions() {
        return Collections.singletonMap("productID", productID);
    }
}