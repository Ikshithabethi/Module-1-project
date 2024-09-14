package com.example.filter;

public interface Filter {
	void doFilter(HttpRequest request, HttpResponse response, FilterChain chain);

	void execute(HttpRequest request, HttpResponse response, FilterChain chain);
}
