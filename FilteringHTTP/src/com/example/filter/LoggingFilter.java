package com.example.filter;

public class LoggingFilter implements Filter {
    @Override
    public void execute(HttpRequest request, HttpResponse response, FilterChain chain) {
        System.out.println("Logging Filter: Logging request...");
     
        System.out.println("Request URL: " + request.getUrl());
        chain.doFilter(request, response);
    }

	@Override
	public void doFilter(HttpRequest request, HttpResponse response, FilterChain chain) {
	
		
	}
}
