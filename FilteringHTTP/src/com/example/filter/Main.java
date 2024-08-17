package com.example.filter;

public class Main {

	 public static void main(String[] args) {
	       
	        FilterChain filterChain = new FilterChain();
	        filterChain.addFilter(new AuthenticationFilter());
	        filterChain.addFilter(new AuthorizationFilter());
	        filterChain.addFilter(new LoggingFilter());

	        
	        HttpRequest request = new HttpRequest();
	        request.setUrl("/example");
	        request.addHeader("Authorization", "Bearer token");
	        request.addHeader("Role", "ADMIN");

	        HttpResponse response = new HttpResponse();

	     
	        filterChain.doFilter(request, response);

	       
	        System.out.println("Final Response Status Code: " + response.getStatusCode());
	        System.out.println("Final Response Body: " + response.getBody());
	    }
	}
