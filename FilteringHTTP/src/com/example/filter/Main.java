package com.example.filter;

public class Main {

	 public static void main(String[] args) {
	        // Create the filter chain
	        FilterChain filterChain = new FilterChain();
	        filterChain.addFilter(new AuthenticationFilter());
	        filterChain.addFilter(new AuthorizationFilter());
	        filterChain.addFilter(new LoggingFilter());

	        // Create a request and response
	        HttpRequest request = new HttpRequest();
	        request.setUrl("/example");
	        request.addHeader("Authorization", "Bearer token");
	        request.addHeader("Role", "ADMIN");

	        HttpResponse response = new HttpResponse();

	        // Execute the filter chain
	        filterChain.doFilter(request, response);

	        // Print the final response
	        System.out.println("Final Response Status Code: " + response.getStatusCode());
	        System.out.println("Final Response Body: " + response.getBody());
	    }
	}